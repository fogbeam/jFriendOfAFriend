package org.fogbeam.foaf.factory;

import org.fogbeam.foaf.api.FoafModel;
import org.fogbeam.foaf.spi.ModelProvider;
import org.fogbeam.foaf.spi.jena25.JenaFoafModel;

public class FoafModelFactory
{
	private static final String DEFAULT_MODEL_PROVIDER = "JENA_25";
	
	public static FoafModel createModel()
	{
		// check for system property for SPI name, if not
		// found, use the default
		String spiName = System.getProperty( "" );
		if( null == spiName )
		{
			spiName = DEFAULT_MODEL_PROVIDER;
		}
	
		return( FoafModelFactory.createModel( spiName ));
	}

	public static FoafModel createModel( String spiName )
	{
		return( FoafModelFactory.createModel( ModelProvider.valueOf( spiName)));
	}

	public static FoafModel createModel( ModelProvider spiProvider )
	{
		switch( spiProvider )
		{
			case JENA_25:
				return( new JenaFoafModel() );
			default:
				throw new RuntimeException( "unknown Service Provider: " + spiProvider.toString() );
		}
	}
	
}

package org.fogbeam.foaf.api;

import java.io.InputStream;
import java.io.OutputStream;


public interface FoafModel
{
	public void addPerson( FoafPerson person );
	
	public FoafPerson newPerson();

	public void clear();
	public void read( InputStream in );
	public void write( OutputStream out );
}

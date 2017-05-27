package org.fogbeam.foaf.api;

public interface FoafOnlineAccount
{

	/****************************
	 * Standard FOAF Properties *
	 ****************************/
	public String getAccountServiceHomepage();
	public void setAccountServiceHomepage( final String accountServiceHomepage );
	
	public String getAccountName();
	public void setAccountName( final String accountName );


	/*******************************
	 * Extensions to standard FOAF *
	 *******************************/
	
	// dc:type from Dublin Core
	public String getType();
	public void setType( final String type );
	
	// dc:identifier from Dublin Core
	public String getIdentifier();
	public void setIdentifier( final String identifier );
	

}

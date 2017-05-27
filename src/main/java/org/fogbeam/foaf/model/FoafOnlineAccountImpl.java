package org.fogbeam.foaf.model;

import org.fogbeam.foaf.api.FoafOnlineAccount;

public class FoafOnlineAccountImpl implements FoafOnlineAccount
{
	/* standard FOAF properties */
	private String accountName;
	private String accountServiceHomepage;
	
	/* extensions to standard FOAF */
	private String type; 		// dc:type from Dublin Core
	private String identifier; 	// dc:identifier from Dublin Core
	
	
	public String getAccountName()
	{
		return accountName;
	}
	
	public void setAccountName( String accountName )
	{
		this.accountName = accountName;
	}
	
	public String getAccountServiceHomepage()
	{
		return accountServiceHomepage;
	}
	
	public void setAccountServiceHomepage( String accountServiceHomepage )
	{
		this.accountServiceHomepage = accountServiceHomepage;
	}

	public String getType()
	{
		return type;
	}

	public void setType( String type )
	{
		this.type = type;
	}

	public String getIdentifier()
	{
		return identifier;
	}

	public void setIdentifier( String identifier )
	{
		this.identifier = identifier;
	}
	
}


package org.fogbeam.foaf.model;


import org.fogbeam.foaf.api.FoafAgent;


public class FoafAgentImpl implements FoafAgent
{
	private String aimChatID;
	private String birthday;
	private String gender;
	private String holdsAccount;
	private String icqChatID;
	private String jabberID;
	private String made;
	private String mbox;
	private String mbox_sha1sum;
	private String msnChatID;
	private String openid;
	private String tipjar;
	private String yahooChatID;

	public String getAimChatID()
	{
		return( this.aimChatID );
	}

	public void setAimChatID( String aimChatID )
	{
		this.aimChatID = aimChatID;
	}

	public String getBirthday()
	{
		return( this.birthday );
	}

	public void setBirthday( String birthday )
	{
		this.birthday = birthday;
	}

	public String getGender()
	{
		return( this.gender );
	}

	public void setGender( String gender )
	{
		this.gender = gender;
	}

	public String getHoldsAccount()
	{
		return( this.holdsAccount );
	}

	public void setHoldsAccount( String holdsAccount )
	{
		this.holdsAccount = holdsAccount;
	}

	public String getIcqChatID()
	{
		return( this.icqChatID );
	}

	public void setIcqChatID( String icqChatID )
	{
		this.icqChatID = icqChatID;
	}

	public String getJabberID()
	{
		return( this.jabberID );
	}

	public void setJabberID( String jabberID )
	{
		this.jabberID = jabberID;
	}

	public String getMade()
	{
		return( this.made );
	}

	public void setMade( String made )
	{
		this.made = made;
	}

	public String getMbox()
	{
		return( this.mbox );
	}

	public void setMbox( String mbox )
	{
		this.mbox = mbox;
	}

	public String getMbox_sha1sum()
	{
		return( this.mbox_sha1sum );
	}

	public void setMbox_sha1sum( String mbox_sha1sum )
	{
		this.mbox_sha1sum = mbox_sha1sum;
	}

	public String getMsnChatID()
	{
		return( this.msnChatID );
	}

	public void setMsnChatID( String msnChatID )
	{
		this.msnChatID = msnChatID;
	}

	public String getOpenid()
	{
		return( this.openid );
	}

	public void setOpenid( String openid )
	{
		this.openid = openid;
	}

	public String getTipjar()
	{
		return( this.tipjar );
	}

	public void setTipjar( String tipjar )
	{
		this.tipjar = tipjar;
	}

	public String getYahooChatID()
	{
		return( this.yahooChatID );
	}

	public void setYahooChatID( String yahooChatID )
	{
		this.yahooChatID = yahooChatID;
	}
}

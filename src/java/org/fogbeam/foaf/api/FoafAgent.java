package org.fogbeam.foaf.api;


/**
 * 
 *  Class: foaf:Agent
	Agent - An agent (eg. person, group, software or physical artifact).
	Status: 	stable
	in-range-of:	foaf:maker foaf:member
	in-domain-of:	foaf:mbox foaf:mbox_sha1sum foaf:gender foaf:jabberID 
					foaf:aimChatID foaf:icqChatID foaf:yahooChatID 
					foaf:msnChatID foaf:weblog foaf:openid foaf:tipjar 
					foaf:made foaf:holdsAccount foaf:birthday

	The foaf:Agent class is the class of agents; things that do stuff. A well known sub-class 
	is foaf:Person, representing people. 
	Other kinds of agents include foaf:Organization and foaf:Group.

	The foaf:Agent class is useful in a few places in FOAF where foaf:Person would have been 
	overly specific. For example, the  IM chat ID properties such as jabberID are typically 
	associated with people, but sometimes belong to software bots. 
 * 
 * 
 * 
 */

public interface FoafAgent
{
	
	public String getName();
	public void setName( String name );
	
	public String getMbox();
	public void setMbox( String mbox );
	
	public String getMbox_sha1sum();
	public void setMbox_sha1sum( String mbox_sha1sum );
	
	public String getGender();
	public void setGender( String gender );
	
	public String getJabberID();
	public void setJabberID( String jabberID );
	
	public String getAimChatID();
	public void setAimChatID( String aimChatID );

	public String getIcqChatID();
	public void setIcqChatID( String icqChatID );
	
	public String getYahooChatID();
	public void setYahooChatID( String yahooChatID );
	
	public String getMsnChatID();
	public void setMsnChatID( String msnChatID );
	
	public String getOpenid();
	public void setOpenid( String openid );
	
	public String getTipjar();
	public void setTipjar( String tipjar );

	public String getMade();
	public void setMade( String made );
	
	public String getBirthday();
	public void setBirthday( String birthday );
	
	public String getHoldsAccount();
	public void setHoldsAccount( String holdsAccount );
	
}

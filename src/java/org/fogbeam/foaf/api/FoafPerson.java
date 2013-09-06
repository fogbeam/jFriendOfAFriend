package org.fogbeam.foaf.api;

/**
 * 
 * 	Class: foaf:Person
	Person - A person.
	Status: 	stable
	in-range-of:	foaf:knows
	in-domain-of:	foaf:geekcode foaf:firstName foaf:surname foaf:family_name 
					foaf:plan foaf:img foaf:myersBriggs foaf:workplaceHomepage 
					foaf:workInfoHomepage foaf:schoolHomepage foaf:knows foaf:interest 
					foaf:topic_interest foaf:publications foaf:currentProject foaf:pastProject

	The foaf:Person class represents people. Something is a foaf:Person if it is a person. 
	We don't nitpic about whether they're alive, dead, real, or imaginary. The foaf:Person class 
	is a sub-class of the foaf:Agent class, since all people are considered 'agents' in FOAF. 
 * 
 * 
 */

public interface FoafPerson extends FoafAgent
{

	public String getGeekcode();
	public void setGeekcode( String geekcode );
	
	public String getFirstName();
	public void setFirstName( String firstName );
	
	public String getSurname();
	public void setSurname( String surname );
	
	public String getFamily_name();
	public void setFamily_name( String family_name );
	
	public String getPlan();
	public void setPlan( String plan );
	
	public String getImg();
	public void setImg( String img );
	
	public String getMyersBriggs();
	public void setMyersBriggs( String myersBriggs );
	
	public String getWorkplaceHomepage();
	public void setWorkplaceHomepage( String workplaceHomepage );
	
	public String getSchoolHomepage();
	public void setSchoolHomepage( String schoolHomepage );
	
	public String getKnows();
	public void setKnows( String knows );
	
	public String getInterest();
	public void setInterest( String interest );
	
	// foaf:topic_interest foaf:publications foaf:currentProject foaf:pastProject
	public String getTopic_interest();
	public void setTopic_interest( String topic_interest );
	
	public String getPublications();
	public void setPublications( String publications );
	
	public String getCurrentProject();
	public void setCurrentProject( String currentProject );
	
	public String getPastProject();
	public void setPastProject( String pastProject );
	
	
}

package org.fogbeam.foaf.api;

import java.util.List;

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
	
	public List<FoafPerson> getKnows();
	public void setKnows( final List<FoafPerson> knows );
	public void addKnows( final FoafPerson knows );
	
	public List<FoafDocument> getInterests();
	public void setInterests( final List<FoafDocument> interests );
	public void addInterest( final FoafDocument interest );
	
	
	public List<String> getTopic_interests();
	public void setTopic_interests( final List<String> topic_interests );
	public void addTopic_interest( final String topic_interest );
	
	
	public List<FoafDocument> getPublications();
	public void setPublications( final List<FoafDocument> publications );
	public void addPublication( final FoafDocument publication );
	
	public FoafProject getCurrentProject();
	public void setCurrentProject( final FoafProject currentProject );
	
	public List<FoafProject> getPastProjects();
	public void setPastProjects( final List<FoafProject> pastProjects );
	public void addPastProject( final FoafProject pastProject );
	
	public List<FoafOnlineAccount> getAccounts();
	public void setAccounts( final List<FoafOnlineAccount> onlineAccounts );
	public void addAccount( final FoafOnlineAccount account );
	
	
}

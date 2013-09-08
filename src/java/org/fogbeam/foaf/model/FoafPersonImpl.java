
package org.fogbeam.foaf.model;


import java.util.ArrayList;
import java.util.List;

import org.fogbeam.foaf.api.FoafDocument;
import org.fogbeam.foaf.api.FoafOnlineAccount;
import org.fogbeam.foaf.api.FoafPerson;
import org.fogbeam.foaf.api.FoafProject;


public class FoafPersonImpl extends FoafAgentImpl implements FoafPerson
{
	
	/* standard FOAF properties */
	private FoafProject 			currentProject;
	private String 					family_name;
	private String 					firstName;
	private String 					geekcode;
	private String 					img;
	private List<FoafDocument> 		interests = new ArrayList<FoafDocument>();
	private List<FoafPerson> 		knows = new ArrayList<FoafPerson>();
	private String 					myersBriggs;
	private List<FoafProject> 		pastProjects = new ArrayList<FoafProject>();
	private String 					plan;
	private List<FoafDocument> 		publications = new ArrayList<FoafDocument>();
	private String 					schoolHomepage;
	private String 					surname;
	private List<String> 			topic_interests = new ArrayList<String>();
	private String 					workplaceHomepage;
	private List<FoafOnlineAccount> accounts = new ArrayList<FoafOnlineAccount>();
	
	/* extensions to standard FOAF */
	// TBD??
	
	

	public List<FoafOnlineAccount> getAccounts()
	{
		return accounts;
	}
	
	public void setAccounts( List<FoafOnlineAccount> onlineAccounts )
	{
		this.accounts = onlineAccounts;
	}	
	
	@Override
	public void addAccount( FoafOnlineAccount account )
	{	
		this.accounts.add( account );
	}
	
	public FoafProject getCurrentProject()
	{
		return currentProject;
	}
	
	public void setCurrentProject( FoafProject currentProject )
	{
		this.currentProject = currentProject;
	}
	
	public String getFamily_name()
	{
		return family_name;
	}
	
	public void setFamily_name( String family_name )
	{
		this.family_name = family_name;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName( String firstName )
	{
		this.firstName = firstName;
	}
	
	public String getGeekcode()
	{
		return geekcode;
	}
	
	public void setGeekcode( String geekcode )
	{
		this.geekcode = geekcode;
	}
	
	public String getImg()
	{
		return img;
	}
	
	public void setImg( String img )
	{
		this.img = img;
	}
	
	public List<FoafDocument> getInterests()
	{
		return interests;
	}
	
	public void setInterests( List<FoafDocument> interests )
	{
		this.interests = interests;
	}
	
	public void addInterest( FoafDocument interest )
	{
		this.interests.add( interest );
	}
	
	public List<FoafPerson> getKnows()
	{
		return knows;
	}
	
	public void setKnows( List<FoafPerson> knows )
	{
		this.knows = knows;
	}
	
	public void addKnows( FoafPerson knows )
	{
		this.knows.add( knows );
	}
	
	public String getMyersBriggs()
	{
		return myersBriggs;
	}
	
	public void setMyersBriggs( String myersBriggs )
	{
		this.myersBriggs = myersBriggs;
	}
	
	public List<FoafProject> getPastProjects()
	{
		return pastProjects;
	}
	
	public void setPastProjects( List<FoafProject> pastProjects )
	{
		this.pastProjects = pastProjects;
	}
	
	public void addPastProject( FoafProject pastProject )
	{
		this.pastProjects.add( pastProject );
	}
	
	public String getPlan()
	{
		return plan;
	}
	
	public void setPlan( String plan )
	{
		this.plan = plan;
	}
	
	public List<FoafDocument> getPublications()
	{
		return publications;
	}
	
	public void setPublications( List<FoafDocument> publications )
	{
		this.publications = publications;
	}
	
	@Override
	public void addPublication( FoafDocument publication )
	{
		this.publications.add( publication );
	}
	
	public String getSchoolHomepage()
	{
		return schoolHomepage;
	}
	
	public void setSchoolHomepage( String schoolHomepage )
	{
		this.schoolHomepage = schoolHomepage;
	}
	
	public String getSurname()
	{
		return surname;
	}
	
	public void setSurname( String surname )
	{
		this.surname = surname;
	}
	
	public List<String> getTopic_interests()
	{
		return topic_interests;
	}
	
	public void setTopic_interests( List<String> topic_interests )
	{
		this.topic_interests = topic_interests;
	}
	
	@Override
	public void addTopic_interest( String topic_interest )
	{
		this.topic_interests.add( topic_interest );
	}
	
	public String getWorkplaceHomepage()
	{
		return workplaceHomepage;
	}
	
	public void setWorkplaceHomepage( String workplaceHomepage )
	{
		this.workplaceHomepage = workplaceHomepage;
	}
}

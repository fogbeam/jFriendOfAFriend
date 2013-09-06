
package org.fogbeam.foaf.model;


import org.fogbeam.foaf.api.FoafPerson;


public class FoafPersonImpl extends FoafAgentImpl implements FoafPerson
{
	private String currentProject;
	private String family_name;
	private String firstName;
	private String geekcode;
	private String img;
	private String interest;
	private String knows;
	private String myersBriggs;
	private String pastProject;
	private String plan;
	private String publications;
	private String schoolHomepage;
	private String surname;
	private String topic_interest;
	private String workplaceHomepage;

	public String getCurrentProject()
	{
		return( this.currentProject );
	}

	public void setCurrentProject( String currentProject )
	{
		this.currentProject = currentProject;
	}

	public String getFamily_name()
	{
		return( this.family_name );
	}

	public void setFamily_name( String family_name )
	{
		this.family_name = family_name;
	}

	public String getFirstName()
	{
		return( this.firstName );
	}

	public void setFirstName( String firstName )
	{
		this.firstName = firstName;
	}

	public String getGeekcode()
	{
		return( this.geekcode );
	}

	public void setGeekcode( String geekcode )
	{
		this.geekcode = geekcode;
	}

	public String getImg()
	{
		return( this.img );
	}

	public void setImg( String img )
	{
		this.img = img;
	}

	public String getInterest()
	{
		return( this.interest );
	}

	public void setInterest( String interest )
	{
		this.interest = interest;
	}

	public String getKnows()
	{
		return( this.knows );
	}

	public void setKnows( String knows )
	{
		this.knows = knows;
	}

	public String getMyersBriggs()
	{
		return( this.myersBriggs );
	}

	public void setMyersBriggs( String myersBriggs )
	{
		this.myersBriggs = myersBriggs;
	}

	public String getPastProject()
	{
		return( this.pastProject );
	}

	public void setPastProject( String pastProject )
	{
		this.pastProject = pastProject;
	}

	public String getPlan()
	{
		return( this.plan );
	}

	public void setPlan( String plan )
	{
		this.plan = plan;
	}

	public String getPublications()
	{
		return( this.publications );
	}

	public void setPublications( String publications )
	{
		this.publications = publications;
	}

	public String getSchoolHomepage()
	{
		return( this.schoolHomepage );
	}

	public void setSchoolHomepage( String schoolHomepage )
	{
		this.schoolHomepage = schoolHomepage;
	}

	public String getSurname()
	{
		return( this.surname );
	}

	public void setSurname( String surname )
	{
		this.surname = surname;
	}

	public String getTopic_interest()
	{
		return( this.topic_interest );
	}

	public void setTopic_interest( String topic_interest )
	{
		this.topic_interest = topic_interest;
	}

	public String getWorkplaceHomepage()
	{
		return( this.workplaceHomepage );
	}

	public void setWorkplaceHomepage( String workplaceHomepage )
	{
		this.workplaceHomepage = workplaceHomepage;
	}
}

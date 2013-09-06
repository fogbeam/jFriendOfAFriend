package org.fogbeam.foaf.spi.jena25;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.fogbeam.foaf.api.FoafModel;
import org.fogbeam.foaf.api.FoafPerson;
import org.fogbeam.foaf.model.FoafPersonImpl;

import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.RDFWriter;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.sparql.vocabulary.FOAF;

public class JenaFoafModel implements FoafModel
{
	
	private Model jenaModel = null;
	private List<FoafPerson> persons = new ArrayList<FoafPerson>();
	
	@Override
	public void addPerson( FoafPerson person )
	{
		persons.add( person );
	}
	
	
	@Override
	public FoafPerson newPerson()
	{
		FoafPerson p = new FoafPersonImpl();
		return( p );
	}

	@Override
	public void clear()
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void read( InputStream in )
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void write( OutputStream out )
	{

		if( null == jenaModel )
		{
			jenaModel = ModelFactory.createDefaultModel();
			jenaModel.setNsPrefix( "rdfs", "http://www.w3.org/2000/01/rdf-schema#" );
			jenaModel.setNsPrefix( "foaf", "http://xmlns.com/foaf/0.1/" );
			jenaModel.setNsPrefix( "dc", "http://purl.org/dc/elements/1.1/" );
		}
	
		for( FoafPerson person : persons )
		{
			Resource jenaPerson = jenaModel.createResource( FOAF.Person );
			populatePersonProperties( person, jenaPerson );
		}
		
		RDFWriter w = jenaModel.getWriter();
		w.setProperty( "showXmlDeclaration", "true" );
		w.write( jenaModel, out, "RDF/XML" );
		
		
	}
	
	private void populatePersonProperties( FoafPerson person, Resource jenaPerson )
	{
		
		String aimchatid = person.getAimChatID();
		if( null != aimchatid )
		{
			jenaPerson.addProperty( FOAF.aimChatID, aimchatid );
		}
		String birthday = person.getBirthday();
		if( null != birthday )
		{
			jenaPerson.addProperty( FOAF.birthday,  birthday);			
		}
		
		String currentProject = person.getCurrentProject();
		if( null != currentProject )
		{
			jenaPerson.addProperty( FOAF.currentProject, currentProject );
		}
		
		String familyName = person.getFamily_name();
		if( null != familyName )
		{
			jenaPerson.addProperty( FOAF.family_name, familyName );
		}
		
		String firstName = person.getFirstName();
		if( null != firstName )
		{
			jenaPerson.addProperty(	FOAF.firstName, firstName );
		}
		String geekCode = person.getGeekcode();
		if( null != geekCode )
		{
			jenaPerson.addProperty( FOAF.geekcode, geekCode );
		}
		
		String gender = person.getGender();
		if( null != gender )
		{
			jenaPerson.addProperty( FOAF.gender, gender );
		}
		
		String holdsAccount = person.getHoldsAccount();
		if( null != holdsAccount )
		{
			jenaPerson.addProperty( FOAF.holdsAccount, holdsAccount );
		}
		
		String icqChatId = person.getIcqChatID();
		if( null != icqChatId )
		{
			jenaPerson.addProperty( FOAF.icqChatID, icqChatId );
		}
		
		String img = person.getImg();
		if( null != img )
		{
			jenaPerson.addProperty( FOAF.img, img );
		}
		
		String interest = person.getInterest();
		if( null != interest )
		{
			jenaPerson.addProperty( FOAF.interest, interest );
		}
		
		String jabberID = person.getJabberID();
		if( null != jabberID )
		{
			jenaPerson.addProperty( FOAF.jabberID, jabberID );
		}
		
		String knows = person.getKnows();
		if( null != knows )
		{
			jenaPerson.addProperty( FOAF.knows, knows );
		}
		
		String made = person.getMade();
		if( null != made )
		{
			jenaPerson.addProperty( FOAF.made, made );
		}
		
		String mbox = person.getMbox();
		if( null != mbox )
		{
			jenaPerson.addProperty(	FOAF.mbox, mbox );
		}
		
		String mboxSha1Sum = person.getMbox_sha1sum();
		if( null != mboxSha1Sum )
		{
			jenaPerson.addProperty( FOAF.mbox_sha1sum, mboxSha1Sum );
		}
		
		String msnChatID = person.getMsnChatID();
		if( null != msnChatID )
		{
			jenaPerson.addProperty( FOAF.msnChatID, msnChatID );
		}
		
		String myersBriggs= person.getMyersBriggs();
		if( null != myersBriggs )
		{
			jenaPerson.addProperty( FOAF.myersBriggs, myersBriggs );
		}
		
		String openID = person.getOpenid();
		if( null != openID )
		{
			jenaPerson.addProperty( FOAF.openid, openID );
		}
		
		String pastProject = person.getPastProject();
		if( null != pastProject )
		{
			jenaPerson.addProperty( FOAF.pastProject, pastProject );
		}
	
		String plan = person.getPlan();
		if( null != plan )
		{
			jenaPerson.addProperty( FOAF.plan, plan );
		}

		String publications = person.getPublications();
		if( null != publications )
		{
			jenaPerson.addProperty( FOAF.publications, publications );
		}
		
		String schoolHomepage = person.getSchoolHomepage();
		if( null != schoolHomepage )
		{
			jenaPerson.addProperty( FOAF.schoolHomepage, schoolHomepage );
		}
		
		String surname = person.getSurname();
		if( null != surname )
		{
			jenaPerson.addProperty( FOAF.surname, surname );
		}
		
		String tipjar = person.getTipjar();
		if( null != tipjar )
		{
			jenaPerson.addProperty( FOAF.tipjar, tipjar );
		}
		
		String topicInterest = person.getTopic_interest();
		if( null != topicInterest )
		{
			jenaPerson.addProperty( FOAF.topic_interest, topicInterest );
		}
		
		String workplaceHomepage = person.getWorkplaceHomepage();
		if( null != workplaceHomepage )
		{
			jenaPerson.addProperty( FOAF.workplaceHomepage, workplaceHomepage );
		}
		
		String yahooChatID = person.getYahooChatID();
		if( null != yahooChatID )
		{
			jenaPerson.addProperty( FOAF.yahooChatID, yahooChatID );
		}
	}
}
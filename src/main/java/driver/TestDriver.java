package driver;

import java.io.FileOutputStream;

import org.fogbeam.foaf.api.FoafModel;
import org.fogbeam.foaf.api.FoafPerson;
import org.fogbeam.foaf.factory.FoafModelFactory;

public class TestDriver
{
	public static void main( String[] args ) throws Exception
	{
		FoafModel model = FoafModelFactory.createModel( "JENA_25" );

		FoafPerson person = model.newPerson();
		person.setName( "John DOE");
		person.setAimChatID( "flibble" );
		person.setFirstName( "John" );
		person.setFamily_name( "DOE" );
		person.setGender( "male" );
		model.addPerson( person );

		FoafPerson person2 = model.newPerson();
		person2.setName( "Jane Doe" );
		person2.setAimChatID(  "foobar"  );
		person2.setFirstName( "Jane" );
		person2.setFamily_name( "Doe" );
		person2.setGender( "female" );
		model.addPerson( person2 );

		FileOutputStream fos = new FileOutputStream( "foo.rdf" );

		// System.out.println( model.toString() );

		model.write( fos );

		System.out.println( "done" );

	}
}

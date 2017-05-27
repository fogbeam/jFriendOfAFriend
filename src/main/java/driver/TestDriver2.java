package driver;

import java.io.FileOutputStream;

import org.fogbeam.foaf.api.FoafModel;
import org.fogbeam.foaf.api.FoafOnlineAccount;
import org.fogbeam.foaf.api.FoafPerson;
import org.fogbeam.foaf.factory.FoafModelFactory;

public class TestDriver2
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
		
		FoafOnlineAccount account1 = model.newOnlineAccount();
		account1.setAccountName( "John Doe / Quoddy" );
		account1.setAccountServiceHomepage( "http://localhost:8080/quoddy" );
		account1.setIdentifier(  "AB153GSA772929DQUOP" );
		account1.setType( "Quoddy" );
		
		person.addAccount( account1 );
		
		model.addPerson( person );
		
		
		FileOutputStream fos = new FileOutputStream( "quoddy_users.rdf" );

		// System.out.println( model.toString() );

		model.write( fos );

		System.out.println( "done" );

	}
}

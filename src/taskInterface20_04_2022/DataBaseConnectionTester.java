package taskInterface20_04_2022;

public class DataBaseConnectionTester {

	public static void main(String[] args) {
		   DataBaseConnector oDatabase = new OracleDatabase();
		   oDatabase.ConnectToDatabase();
		  
		  oDatabase = new MongoDataBase();
		  oDatabase.ConnectToDatabase();
		  
		  oDatabase = new SqlServerDataBase();
		  oDatabase.ConnectToDatabase();	  
		  
		 
	}

}

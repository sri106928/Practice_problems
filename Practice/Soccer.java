package programms;

public class Soccer extends Sports{
	@Override 
	String getName(){ 
   
  	return "Soccer Class"; 
     
   }
	@Override
	String getNumberOfTeamMembers(){
		
		//System.out.println( "Each team has 11 players in " + getName() );
		return "Each team has 11 players in " + getName(); 
        
 
	}

}

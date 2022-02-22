package week3.day1;

public class Student {
	public void acheiver(String  name,int medalCount) {
		System.out.println(name+" "+medalCount);		
	}
	public void acheiver(String country ,String sportName, int rank) {
		System.out.println(country+" "+sportName+" "+rank);		
	}
	public void acheiver(float weight, int height, long contactNo) {
		System.out.println(weight+" "+height+" "+contactNo);		
	}
	public void acheiver(String tournamentName, long prizeMoney) {
		System.out.println(tournamentName+" "+prizeMoney);		
	}
 public static void main(String[] args) {
	Sports sp=new Sports();
	sp.acheiver("Abilash", 1);
	sp.acheiver("india", "cricket",2 );
	sp.acheiver(40 , 4, 9894762960L);
	sp.acheiver("T20", 1000);


	}

}

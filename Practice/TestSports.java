package programms;

public class TestSports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sports sports = new Sports();
		System.out.println(sports.getName());
		System.out.println(sports.getNumberOfTeamMembers());
		Soccer soccer = new Soccer();
		System.out.println(soccer.getName());
		System.out.println(soccer.getNumberOfTeamMembers());

	}

}

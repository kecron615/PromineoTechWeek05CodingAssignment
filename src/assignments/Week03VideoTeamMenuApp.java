package assignments;

import java.util.Scanner;

public class Week03VideoTeamMenuApp {
	
	static Scanner s = new Scanner(System.in);
	static int addingIndex = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Add team member
		 * View team member
		 * view all team members
		 * delete team member by position
		 * delete all team members
		 */
		String[] team = new String[5];
		
		int decision = 0;
		
		while(decision != -1) {
			showMenu();
			decision = s.nextInt();
			
			if(decision < -1 || decision > 5) {
				System.out.println("Please pick a valid option");
			}else if (decision == 1) {
				showTeam(team);
			}else if (decision == 2) {
				showTeamMember(team);
			}else if (decision == 3) {
				addTeamMember(team);
			}else if (decision == 4) {
				deleteTeamMember(team);
			}else {
				deleteAllTeamMembers(team);
			}
		}
	}
	
	public static void deleteAllTeamMembers(String[] team) {
		for (String member : team) {
			member = null;
		}
	}
	
	public static void deleteTeamMember(String[] team) {
		System.out.println("Which team member would you like to delete?");
		int memberToDelete = s.nextInt();
		for (int i = 0; i < team.length; i++) {
			team[i] = null;
		}
	}
	
	private static void showTeam(String[] team) {
		System.out.println("Team: ");
		for (int i = 0; i < team.length; i++) {
		System.out.println(i + " : " + team[i]);
	}
	}//YOU SHOULD EITHER ASK ABOUT THIS ONE IN CLASS OR IN MENTOR... MAYBE KELSEY?
	public static void showTeamMember(String[] team) {
		System.out.println("Which team member would you like to see? ");
		int teamNumber = s.nextInt();
		if(isValid(teamNumber)) {
			System.out.println(teamNumber + "; " + team[teamNumber]);
		}
	}
		
	public static void addTeamMember(String[] team) {
		System.out.print("Enter new member name: ");
		String newMember = s.next();
		if (isValid(addingIndex)) {
		team[addingIndex++] = newMember;
		}
	}
	
	public static boolean isValid(int input) { 
		if(input >= 0 && input < 5) {
			return true;
		}else {
			System.out.println("Invalid entry.");
			return false;
		}
	}
	
	public static void showMenu() {
		System.out.println("Please pick an option or enter -1 to exit.");
		System.out.println("1) Show Team");
		System.out.println("2) Show Team Member");
		System.out.println("3) Add a Team Member");
		System.out.println("4) Delete Team Member");
		System.out.println("5) Delete All Team Members");
	}

}

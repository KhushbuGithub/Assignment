package com.capgemini.assignment2.hackerrank;

class Soccer extends Sport {
	@Override
	String getName() {
		return "Soccer Class";
	}

	// class Soccer extends Sports{
	@Override
	void getNumberOfTeamMembers() {
		System.out.println("Each team has 11 players in " + getName());
	}

	public static void main(String[] args) {
		Soccer sc = new Soccer();
		Sport s= new Sport();
		System.out.println(s.getName());
		s.getNumberOfTeamMembers();
		System.out.println(sc.getName());
		sc.getNumberOfTeamMembers();
	}

}

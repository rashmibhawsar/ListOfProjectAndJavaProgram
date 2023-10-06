package game;

import java.util.Scanner;

abstract class player{
	String name;
	long mob_no;
	int score;
	public int play(){

		
		return score;
		
	}
	player(){

		name= "rashmi";
		mob_no=56899643;
		score=97;
		
	}
	player(int score) {

		this.score=score;
		
	}
	void display() {};
}
class player1 extends player{
	
	int player1score ;
	player1(){

		player1score=95;
		
	}
	player1(String name,long mob,int score) {
		this.name=name;
		this.mob_no=mob;
		this.score=score;

		
	}
	void display() {
		System.out.println("player1..name..:   " +name);
		System.out.println("player1..mob_no..:   " +mob_no);
		System.out.println("player1..score..:   " +score);
	}
	

}
class player2 extends player{
	int player2score ;
	player2(){

		player2score=89;
	}
	player2(int score) {

		this.player2score=score;
	}
	
	player2(String name,long mob,int score) {
		this.name=name;
		this.mob_no=mob;
		this.score=score;
		}
	void display() {
		System.out.println("player1..name..:   " +name);
		System.out.println("player1..mob_no..:   " +mob_no);
		System.out.println("player1..score..:   " +score);
	}

}


public class FinalResult {
	public String compareScore( int score1,int score2) {
		if(score1>score2)
			return "player1";
		else
			return "player2";

	}

	public static void main(String[] args) {
		String name = null;
		long mob_no = 0;
		int score = 0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the deatils of two players");
		for(int i=1;i<=2;i++)
		{
			System.out.println("enter name of player[" +i+"]...");
			name= sc.next();
			System.out.println("enter mob_no of player[" +i+"]...");
			mob_no = sc.nextLong();
			System.out.println("enter score of player[" +i+"]...");
			score = sc.nextInt();

		}
		
		player1 firstplayer= new player1(name,mob_no,score);
		player2 secondplayer= new player2(name,mob_no,score);
		firstplayer.display();
		secondplayer.display();
		FinalResult f = new FinalResult();
		String result =f.compareScore(firstplayer.score, secondplayer.score);
		System.out.println("the winner of the gane is ..." +result);
		
		


	

	}

}

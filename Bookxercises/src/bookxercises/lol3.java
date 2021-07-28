package bookxercises;

import java.util.Random;
import java.util.Scanner;
import java.math.*;
public class lol3 {
	
	static Scanner s = new Scanner(System.in);
	static Random r = new Random();
	
	public static void game() {
		int humroll = r.nextInt(7);
		int humroll2 = r.nextInt(7);
		System.out.println("you got " + humroll + ", want more?");
		if (s.next().charAt(0) == 'y') {
		System.out.println("you got " + humroll2 + " total " + (humroll+humroll2));
		int machinelearning = r.nextInt(7) + r.nextInt(7);
		if (machinelearning<(humroll+humroll2)) {
			System.out.println("humanity is saved" + machinelearning);
		}
		else System.out.println("bamboozled again" + machinelearning);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean game = true;
		while (game) {
			System.out.println("GAME???????//");
			char input = s.next().charAt(0);
			switch (input) {
			case 'y': game(); break;
			
			case 'n': {game = false; break;}
			
			default: 
			}
			
		}
	}

}

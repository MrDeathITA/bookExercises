package bookxercises;

import java.util.Scanner;

public class lol2 {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("input year");
		int year = s.nextInt();
		if (year<1990 && year>1962) {
			System.out.println("old");
		}
		else if (year>2004 && year<2021) {
			System.out.println("new");
		}
		else System.out.println("lol");
		
	}
}

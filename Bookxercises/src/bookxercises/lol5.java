package bookxercises;

import java.util.Scanner;

public class lol5 {
	static Scanner s = new Scanner(System.in);
	static String arr[] = new String[3];
	int n = 3;
	public static void main(String[] args) {
		String temp;

		for(int j=0; j<3; j++) {
		arr[j] = s.nextLine();
		}
	for (int i=0; i<3; i++) {
		for (int k=i+1; k<3; k++ ) {
			if (arr[i].compareTo(arr[k]) > 0) {
				temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				}
			}
	}
	
	for (int l=0; l<3; l++) {
		System.out.println(arr[l]);
	}
	}
}

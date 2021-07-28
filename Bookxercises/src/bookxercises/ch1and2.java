package bookxercises;


public class ch1and2 {
	
	public static void page54(){
		//formula is 3.4x+50.2y=44.5  2.1x + .55y = 5.9
		//ax + by = e  cx + dy = f  // x=ed-bf/ad-bc  y=af-ec/ad-bc
		double x = (44.5*.55 - 50.2*5.9) / (3.4*.55 - 50.2*2.1);
		double y = (3.4*5.9 - 44.5*2.1) / (3.4*.55- 50.2*2.1);
		System.out.println(x + "and" + y);
	}
	
	public static void page5211() {
		System.out.println("Welcome to Java");
		System.out.println("Learning Java Now");
		System.out.println("Programming is fun");
	}
	
	public static void page5212() {
		for (int i=0; i<5; i++) {
			System.out.println("I love Java");
		}
	}
	
	public static void page5213() {
		//escape keys \t tab \b backspace \n new line \r form feed
		
		System.out.println("    J" +"\nJ  aaa   v\tvaaa" + "\nJ  J  aa  v  v    a a" + "\nJ    aaaa   v      aaaa" );
	}
	
	public static void page5214(int a, int b, int c, int d) {
		//powers to 4 of any 4 numbers
		System.out.println("a\ta^2\ta^3\ta^4" + "\n" + a + "\t" + Math.pow(a, 2) + "\t" + Math.pow(a, 3) + "\t" + Math.pow(a, 4) + 
				"\n" + b + "\t" + Math.pow(b, 2) + "\t" + Math.pow(b, 3) + "\t" + Math.pow(b, 4) + 
				"\n" + c + "\t" + Math.pow(c, 2) + "\t" + Math.pow(c, 3) + "\t" + Math.pow(c, 4) +
				"\n" + d + "\t" + Math.pow(d, 2) + "\t" + Math.pow(d, 3) + "\t" + Math.pow(d, 4));
	}
	
	public static void page5215() {
		System.out.println((7.5*6.5-4.5*3)/(47.5-5.5));
	}
	
	public static void page5216(int n) {
		//sum of sequence
		int tot = 0;
		for (int i=0; i<n+1; i++) {
			tot = tot + i;
		}
		System.out.println(tot);
	}
	
	public static void page5217(int i) {
		//pi with i numbers
		double pi =0;
		for (; i>0; i--) {
			pi += Math.pow(-1, i+1) / (2*i-1);
			if (i==1) {
				pi *= 4;
				System.out.println(pi);
			}		
		}	
	}
	
	
	public static void page5218(double d) {
		//area and perimeter of a circle
		double perimeter = Math.PI * d * 2;
		double area = Math.pow(d, 2) * Math.PI;
		System.out.println(perimeter + " " +  area);
	}
	

	public static void page5219(double b, double h) {
		//area and perimeter of rectangle
		double area = b * h;
		double perimeter = 2 * (b+h);
		System.out.printf("%.2f " + " %.2f", area, perimeter);
	}
	
	//make time object

	
	public static void page5220(bullshittimething time, double distance, Boolean km) {
		//miles to km given time or viceversa
		double hours = (time.hour + (time.minute/60) + (time.second/3600));
			if (km) {
			distance = distance*0.621371;
			double mph = distance / hours;
			System.out.println(mph);	
			}
		else {
			distance = distance*1.609344;
			double kmh = distance/hours;
			System.out.println(kmh);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bullshittimething time = new bullshittimething(1, 40, 35);
		page5220(time, 24, false);
	}

}

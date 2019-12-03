import java.util.Scanner;

public class Scaner {
	public static void main(String[] args) {
		System.out.println("Please enter radius of the circle:");
		Scanner input=new Scanner(System.in);
		Double rAdius=input.nextDouble();
		Double area= rAdius*rAdius*3.14;
		System.out.println("the area of the circle is:"+area);
	}
}

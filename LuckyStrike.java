import java.util.Scanner;

public class LuckyStrike {
	public static void main(String[] args) {
		int vipNo ;
		System.out.println("Input vip number:");
		Scanner input = new Scanner (System.in);
		vipNo=input.nextInt();
		int onesPlace=vipNo %10;
		int tensPlace=vipNo /10%10;
		int hundredsPlace =vipNo /100%10;
		int thousandsPlace=vipNo /1000;
		int total =onesPlace+tensPlace+hundredsPlace+thousandsPlace;
		if (total<15&&total>0) {
			System.out.println("np");
		}
		else {
			System.out.println("get.");
		}
	}
}

package algoprob;

import java.util.Scanner;

public class algoprob11_Sqrt 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		double c = sc.nextDouble();
		double t=c;
		double epsilon =1e-15;
		while(Math.abs(t - c/t) > epsilon*t)
		{
			t=((c/t)+t)/2;
		}
		System.out.println(t);
	}
}

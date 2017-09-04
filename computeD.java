package digitalsignatures;

import java.util.Scanner;

public class computeD {

	public static void main(String[] args) {
		// TODO function to find inverse of e modulo phi by using euclidean algorithm
		Scanner s=new Scanner(System.in);
		int phi=s.nextInt();
		int e=s.nextInt();
		int d=GCD(phi,e);
		if(d==-1){
			System.out.println("you have entered wrong numbers, the numbers are not coprime");
		}else
		System.out.println("the multiplicative inverse of e modulo phi is "+d);

	}

	private static int GCD(int phi, int e) {
		int b=0,r=0;
		while(r!=1){
			b=phi/e;
			r=phi%e;
			if(r==0){
				return -1;
			}
			phi=e;
			e=r;
		}
		return b;
	}

}

package digitalsignatures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class decimaltobinary {
	public static int i=0;
	public static void main(String[] args) {
		// function to find the binary equivalent of e
		Scanner s =new Scanner(System.in);
		int e=s.nextInt();
		int arr[]=new int[32];
		arr=convert(e);
		while( --i>=0){
			System.out.print(arr[i]+"");
		}
	}
	private static int[] convert(int e) {
		int r;
		int arr[]=new int[32];
		while(e>0){
			r=e%2;
			arr[i]=r;
			e=e/2;
			i++;
		}
		return arr;
	}

}

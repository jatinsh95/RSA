package digitalsignatures;

import java.util.ArrayList;
import java.util.Scanner;

public class Start_Rsa {
	private static Scanner s;

	public static void main(String[] args){
		/*Code to Encode Message*/
		
		s = new Scanner(System.in);
		String str = s.nextLine();
		ArrayList<String> array = new ArrayList<String>();
		array = EncodeMessage.conversion(str);
		int i = 0;
		while(i<array.size()){
		System.out.print(Integer.parseInt(array.get(i))+" ");
		i++;
		}
		//Code to compute d*/
		long a[] = Rsa.phi_n();
		long phi = a[4];
		long e = a[3];
		long d= Compute_d.GCD(phi,e);
		System.out.println("d=:"+d);
		/*
		 * code to convert Decimal To binary
		 */
		int arr[]=new int[32];
		Decimal_toBinary obj = new Decimal_toBinary();
		arr=obj.convert(e);
		
		System.out.println();
		
		int arrd[] = new int[32];
		Decimal_toBinary obj1 = new Decimal_toBinary();
		arrd = obj1.convert(d);
		long n=a[2];
		
		System.out.println();
		
		ArrayList<Long> encrypt = Message_Encryption.encryption(array,arr,obj.i, n);
		System.out.println("ENCRYPTED MESSAGE");
		i = 0;
		while(i<encrypt.size()){
		System.out.print(encrypt.get(i)+" ");
		i++;
		}
		System.out.println("\n");
		System.out.println("DCRYPTED MESSAGE");
		ArrayList<Long> dcrypt = Message_Dcryption.encryption(encrypt,arrd,obj1.i, n);
		i = 0;
		while(i<dcrypt.size()){
		System.out.print(dcrypt.get(i)+" ");
		i++;
		}
	}
}

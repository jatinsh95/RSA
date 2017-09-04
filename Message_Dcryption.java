package digitalsignatures;

import java.util.ArrayList;

public class Message_Dcryption {
	public static ArrayList<Long> encryption(ArrayList<Long> array,int a[], int i,long n){
		int j = 0;
		ArrayList<Long> encrypt = new ArrayList<Long>();
		while(j<array.size()){
			Long m = array.get(j);
			long c = 1;
			int k = i;
			while(--k>=0){
				c = (c*c)%n; 
				if(a[k] == 1){
					c = (c*m)%n;
				}
			}
			encrypt.add(c);
			j++;
		}
		return encrypt;
	}

}

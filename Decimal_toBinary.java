package digitalsignatures;



public class Decimal_toBinary {
	public int i=0;
	
	public int[] convert(long e) {
		int  r;
		int arr[]=new int[32];
		while(e>0){
			r=(int) (e%2);
			arr[i]=r;
			e=e/2;
			i++;
		}
		return arr;
	}


}

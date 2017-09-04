package digitalsignatures;



public class Compute_d {
	
	public static long GCD(long phi,long e) {
		int i=0;
		long d = 1;
		while(true){
			long sum = phi * i + 1;
			long r = sum % e;
				if(r == 0){
					d = sum / e;
					return d;
			}
			
				i++;
	}
} 
}

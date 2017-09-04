package digitalsignatures;

import java.util.Random;
import java.lang.Math;

public class PrimeGeneration {
	public static long nextLong(Random rng, long n) {
		   // error checking and 2^x checking removed for simplicity.
		   long bits, val;
		   do {
		      bits = (rng.nextLong() << 1) >>> 1;
		      val = bits % n;
		   } while (bits-val+(n-1) < 0L);
		   return val;
		}
	public static long[] prime(){
    long p = 0,q = 0 ;
  	Random r = new Random();
  	while(p==0){
  		Boolean b = true; 
  		long temp = r.nextInt(1000);
  		for(int i = 2;i<=Math.sqrt(temp);i++){
  			if(temp%i==0||temp == 1)
  				b = false; 
  		}
  		if(b)
  			p = temp;
  	}
	while(q == 0 || p == q){
  		Boolean b = true; 
  		long temp = r.nextInt(1000);
  		for(int i = 2;i<=Math.sqrt(temp);i++){
  			if(temp%i==0||temp == 1)
  				b = false; 
  		}
  		if(b)
  			q = temp;
  	}
	
	String n = ""+(long)p*q;
	long e=0;
	while(e<3){
		boolean b = true;
		long temp = nextLong(r,Long.parseUnsignedLong(n)-1);
		for(int i = 2;i<=Math.sqrt(temp);i++){
			if(temp%i==0||temp%(p-1)==0||temp%(q-1) == 0)
				b= false;
		}
		if(b)
			e = temp;
	}
	long a[] = {p,q,Long.parseUnsignedLong(n),e};
	return a;
	}
}

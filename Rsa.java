package digitalsignatures;

public class Rsa{ 
	public static long[] phi_n(){
		long a[]=PrimeGeneration.prime();
		long p = a[0];
		long q = a[1];
		long n = a[2];
		long phin = n-(p+q)+1;
		long b[]  = {p,q,n,a[3],phin};
		System.out.println();
		for(int i=0;i<5;i++)
		System.out.println(b[i]);
		return b;
	
	}
}
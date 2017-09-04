package digitalsignatures;

import java.util.ArrayList;


public class EncodeMessage {
	public static ArrayList<String> conversion(String str) {
		// function to change the string message to its corresponding binary
		// code by assigning blank=00,A=01,......Z=26
		ArrayList<String> array = new ArrayList<String>();
		String y = "";
		if(str.charAt(0)=='\0'){
			array.add("0000");
		}
		int i = 0;
		int end = str.length();
		if(end%2!=0)
		 str = str + " ";
			while(i<str.length()){
		
			y="";
			if(str.charAt(i)== ' ')
				y = y+"00";
			else if(str.charAt(i)>='A'&&str.charAt(i)<= 'I')
				y = y+"0"+(int)(str.charAt(i)-64);
			else if(str.charAt(i)>='J'&&str.charAt(i)<='Z')
				y = y+(int)(str.charAt(i)-64);
			if(str.charAt(i+1)== ' ')
				y = y+"00";
			else if(str.charAt(i+1)>='A'&&str.charAt(i+1)<= 'I')
				y = y+"0"+(int)(str.charAt(i+1)-64);
			else if(str.charAt(i+1)>='J'&&str.charAt(i+1)<='Z')
				y = y+(int)(str.charAt(i+1)-64);
			array.add(y);
			i = i+2;
	}
		
		return array;
	}
}

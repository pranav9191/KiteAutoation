package TESTINK_PKG;

public class ArrayOperation {
public static void main(String[] args) {
	String name = "TrialString";
	String REV = "";
	char revstring[] = name.toCharArray();
	
	for(int i=0; i<revstring.length/2; i++)
	{
		char PH = revstring[i];
		revstring[i] = revstring[revstring.length-1-i];
		revstring[revstring.length-1-i] = PH;
	}
	for(int i =0; i<revstring.length; i++)
	{
		REV += revstring[i];
	}
	System.out.println(REV);
}
}

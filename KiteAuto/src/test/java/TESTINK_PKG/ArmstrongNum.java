package TESTINK_PKG;

public class ArmstrongNum {
	public static void main(String[] args) {
		int A= 407;
		int UD = A%10;
		int DD = (A/10)%10;
		int CD = A/100;
		if((UD*UD*UD) + (DD*DD*DD) + (CD*CD*CD)==A)
		System.out.println(A+" is an armstrong number");
		else System.out.println(A+" is not an Arstrong Number");
	}
}

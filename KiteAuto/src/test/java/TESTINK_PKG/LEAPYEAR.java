package TESTINK_PKG;

import java.util.ArrayList;

public class LEAPYEAR {
	public static void main(String[] args) {
		String str = "aB12@6tu$rty&";
		int ttlspchar = 0;
		String str1;
		ArrayList<Integer> spchar = new ArrayList<Integer>();
		for (int i=0; i<str.length(); i++)
		{
			if(!(((str.charAt(i)>= '0')&& (str.charAt(i)<= '9'))||((str.charAt(i)>= 'a')&& (str.charAt(i)<= 'z'))||((str.charAt(i)>= 'A')&& (str.charAt(i)<= 'Z'))))
			{
				ttlspchar++;
				spchar.add(i);
			}
		}
		System.out.println("total special characters in string "+ttlspchar );
		for(int i=0; i<ttlspchar; i++)
		{
			System.out.println(str.charAt(spchar.get(i)));
		}
		str1 = str.replace('&', ' ');
		for(int i=0; i<str1.length(); i++)
		{
			System.out.print(str1.charAt(i));
		}
	}
}

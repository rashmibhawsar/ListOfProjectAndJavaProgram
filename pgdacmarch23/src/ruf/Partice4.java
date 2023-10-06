package ruf;

public class Partice4 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("ABC");
		StringBuffer sb2 = new StringBuffer("ABC");
		boolean s = sb1 == sb2;
		boolean s1 = sb1.equals(sb2);
		System.out.print(s + "," + s1);

		System.out.print("\n");

		String str1 = "ABC";
		String str2 = "ABC";
		boolean sStr = str1 == str2;
		boolean s1Str = str1.equals(str2);
		System.out.print(sStr + "," + s1Str);

		System.out.print("\n");

		String str3 = new String("ABC");
		String str4 = new String("ABC");
		boolean sStr34 = str3 == str4;
		boolean s1Str34 = str3.equals(str4);
		System.out.print(sStr34 + "," + s1Str34);

	}

}

/*
 * class A { A(int i) {}
 * 
 * A() {}
 * 
 * } // 1 class B extends A { B() { super(); }
 * 
 * } // 2
 */
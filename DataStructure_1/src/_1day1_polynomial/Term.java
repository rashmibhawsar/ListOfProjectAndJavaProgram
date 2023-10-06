package _1day1_polynomial;

import java.util.Scanner;

import _1day1_linklist.Node;

public class Term {
	int coeff;
	int exp;
	Term next;
	public Term() {
		coeff=0;
		exp=0;
		next=null;
	
	}
	public Term(int c ,int e) {
		coeff=c;
		exp=e;
		next=null;
	
	}

	
}

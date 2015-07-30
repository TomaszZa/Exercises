package com.capgemini.pythagorean;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class Pythagorean {
	static void pythagoreanCreate(){
	int a,b,c;
	for(a = 0; a< 1000; a++){
		for(b = 0; b < 1000; b++){
			for(c = 0;c< 1000; c++ ){
				checkPythagorean(a,b,c);
			}
		}
	}
	}
	
	static void checkPythagorean(int a, int b, int c){
		if(((a<b) && (b<c))&&(a*a+b*b == c*c)&&(a+b+c == 1000)) System.out.println("a="+a+" b="+b+" c="+c);
	}
}

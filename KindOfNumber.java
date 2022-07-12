package junitclass;

public class KindOfNumber {
	public void num(int a) {
		if(a==0) {
			System.out.println("netural num");
		}
		else if(a>0) {
			System.out.println("positive num");
		}
		 if(a<0) {
			System.out.println("ngative num");
		}
	}
public void findprime(int a) {
	if(a%2 == 0 || a%3 == 0) {
		System.out.println("not prime");
	}
	else {
		System.out.println("prime");
	}
}
}


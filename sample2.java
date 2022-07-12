package junitclass;

public class sample2 {
	public String name(String[] a) {
	
		int max = 0;
		String b= " ";
		for(int i = 0 ; i<a.length ; i++ ) {
			if(a[i].length() > max) {
				max = a[i].length();
				b = a[i].toUpperCase();
			}
		}
		return (b);
	}
}

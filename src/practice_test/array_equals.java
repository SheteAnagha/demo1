package practice_test;

public class array_equals {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b= {1,2,3,4};
		int count=0;
		if(a.length==b.length) {
		for(int i=0;i<a.length;i++) {
				if(a[i]==b[i]) {
				count++;	
				}	}
		if(count==a.length) {
		System.out.println("equal array");}
		else {
			System.out.println("array not equal");
		}}	
	}
}

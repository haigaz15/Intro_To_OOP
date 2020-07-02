import java.util.*;
public class FifthQuestion {

	public static void main(String[] args) {
		System.out.println("Type your number here:");
		String[] arr = inputArray();
		System.out.println();
		printArray(arr);
		String[] changeArr = changarr(arr);
        System.out.println();
        printArray(changeArr);
	}

	public static String[] inputArray() {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		String [] arr = new String[n];
		System.out.println("Type your words here:");
		for(int i =0; i<arr.length; i++) {
			arr[i] = keyboard.next();
		}
	  return arr;
	}

	public static void printArray(String[] a) {
			for(int j =0; j<a.length; j++) {
			System.out.print(a[j]+ " ");
		}
	}

	public static String[] changarr(String[] b) {
		String[] newArr = new String[b.length];
		int i = 0;
		int n;
		if(b.length % 2 == 0) {
			n = b.length;
		} else {
	           n = b.length - 1;
		       newArr[n] = b[n];
		}
		
		while(i<n) {
			newArr[i+1] = b[i];
			newArr[i] = b[i+1];
			i += 2;
		}
	 return newArr;
	}
}

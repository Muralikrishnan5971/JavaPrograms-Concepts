package stringPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ReversingAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "muralikrishnan";
		
//		Using the built in reverse method in String Builder class
				
		StringBuffer sb = new StringBuffer(str);
		
		StringBuffer reverseStr = sb.reverse();
		
		System.out.println(reverseStr);
		
//		Using the built in toCharArray method from the String class
		
		char[] strArray = str.toCharArray();
		
		for(int i=strArray.length-1; i>=0; i--) {
			
			System.out.print(strArray[i]);
		
		}

//		Using the reverse method in collections class
		
		char[] strArray1 = str.toCharArray();
		
		ArrayList<Character> al = new ArrayList<>();
		
		for (char c : strArray) {
			
			al.add(c); //Adding all the characters in the array to the ArrayList
		}
		
		Collections.reverse(al);
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}

}

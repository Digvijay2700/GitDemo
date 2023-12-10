package seleniumPro;

import java.util.ArrayList;

public class Class09 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Digvijay");
		a.add("Patil");
		a.add("selenium");
		a.add("Academy");
		a.add("exposure");
		
		for (String val : a)
		{
			System.out.println(val);
		}
		
		System.out.println(a.contains("selenium"));  //used to get to know whether this element is present or not in array
       
		
	
	
	}
}

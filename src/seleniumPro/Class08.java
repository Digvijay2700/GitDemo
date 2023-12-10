package seleniumPro;

import java.util.ArrayList;

public class Class08 {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Digvijay");
		a.add("Patil");
		a.add("selenium");
		a.add("Academy");
		a.add("exposure");
		
		for (int i = 0; i < a.size(); i++)
		{
			System.out.println(a.get(i));
		}		
	}

}

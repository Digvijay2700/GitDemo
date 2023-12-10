package seleniumPro;

public class Class12 {

	public static void main(String[] args) {

		String s = "Rahul Shetty Academy";
		
        String[] splstring = s.split(" ");
		
		for (String val : splstring)
		{
		System.out.println(val);
		}
		
        String s1 = "I am the Brave Boy";
		
        String[] splstring1 = s1.split("the");
		
		for (String val : splstring1)
		{
		System.out.println(val);
		}
		System.out.println(splstring1[1].trim());
		
	}
}

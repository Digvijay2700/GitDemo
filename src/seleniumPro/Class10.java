package seleniumPro;

import java.util.Arrays;
import java.util.List;

public class Class10 {

	public static void main(String[] args) {

		String[] name = {"digvijay", "patil", "selenium", "training"};
		
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("patil"));
	}
}

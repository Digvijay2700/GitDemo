package seleniumPro;

public class Class04 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
	       arr[0] = 1;
	       arr[1] = 2;
	       arr[2] = 3;
	       arr[3] = 4;
	       arr[4] = 5;
		
		int[] arr2 = {9,8,7,6,5};
		
		String[] name = {"digvijay", "patil", "selenium", "training"};
		
		//for loop
		
		for (int i = 0; i < arr2.length; i++)
		{
		   System.out.println(arr2[i]);
		}
		
		System.out.println("-----");
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("-----");
		
		for(int i = 0; i < name.length; i++)
		{
			System.out.println(name[i]);
		}
		

	}

}

package seleniumPro;

public class Class06 {

	public static void main(String[] args) {

        int[] arr5 = {1,2,3,4,5,6,7,8,9,10};
        
        for (int i = 0; i < arr5.length; i++)
        {
        	if (arr5[i] % 2 == 0)
        	{
        		System.out.println(arr5[i]);
        		break;
        	}
        	else
        	{
        		System.out.println(arr5[i]+" is not multiple of 2");
        	}
        }
	}
}

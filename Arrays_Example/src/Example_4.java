import java.util.Scanner;

public class Example_4 {

	public static void main(String[] args) {
		//Klasik kayan yildiz olusturma//
		Scanner inpt=new Scanner(System.in);
		
		System.out.print("Boyut Giriniz:");
		int n=inpt.nextInt();
	    
	     for(int i=1; i<=n; i++)
	     {
	         for(int j=1;j<=i; j+=1)
	         {
	             System.out.print("*" + " ");
	         }
	          System.out.println();   
	     }
	}

}

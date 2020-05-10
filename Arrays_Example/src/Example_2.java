import java.util.Scanner;

public class Example_2 {

	public static void main(String[] args) {
    Scanner input_arrays=new Scanner(System.in);
    int i,j;
    System.out.println("Dizinin Row,Column Degelerini Giriniz");
    System.out.print("Array Row :");
    i=input_arrays.nextInt();
    System.out.print("Array Column :");
    j=input_arrays.nextInt();
     int[][] array_text=new int[i][j];
     
     //Boyutunu belirledigimiz dizinin elemanlarini girme.
     System.out.println("Dizi elemanlarini giriniz");
     for (int k = 0; k < array_text.length; k++) {
		for (int k1 = 0; k1 < array_text[0].length; k1++) {
			System.out.print("["+k+"]"+"["+k1+"]=");
			array_text[k][k1]=input_arrays.nextInt();
		}
	  }
     
     // Oluşturulan diziyi ekrana basma
      for (int k = 0; k < array_text.length; k++) {
		for (int k1 = 0; k1 < array_text[0].length; k1++) {
			System.out.print(array_text[0].length==(k1+1) ? array_text[k][k1]+" ":array_text[k][k1]+"-");
		}
		System.out.println();
	   }
	}

}

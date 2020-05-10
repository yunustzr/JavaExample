import java.util.Arrays;
import java.util.Scanner;

public class Example_3 {

	public static void main(String[] args) {
		Scanner in_text=new Scanner(System.in);
		System.out.println("Dizi Tablosu Olusturma");
		int x,y;
		System.out.print("Row Value :");
		x=in_text.nextInt();
		System.out.print("Column Value :");
		y=in_text.nextInt();
		String[][] name_list=new String[x][y];
		//Value larini girme
		for (int i = 0; i < name_list.length; i++) {
			for (int j = 0; j < name_list[i].length; j++) {
				System.out.print("["+i+"]"+"["+j+"]=");
				name_list[i][j]=in_text.next();
			}
		}
		//Arrayi gosterme
		System.out.println("Array Values");
		for (int i = 0; i < name_list.length; i++) {
			for (int j = 0; j < name_list[i].length; j++) {
				System.out.print(name_list[i].length==j+1 ? name_list[i][j]+" ":name_list[i][j]+"-");
			}
			System.out.println();
		}
 
	}

}

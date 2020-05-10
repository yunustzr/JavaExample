import java.util.Scanner;

public class Example_1 {
    //Disardan girdigimiz degerlerle Array'i oluşturup ekrana basan code.
	public static void main(String[] args) {
     Scanner in_text=new Scanner(System.in);//Console Üzerinden veri girişini sağlar.
     int[][] satis_tablosu=new int[3][5];//Dizi boyutumuz 3 satır 5 sütündan oluşan 2 boyutlu bir dizidir.
     
     System.out.println("Satış Tablosunu OLuşturunuz");
     
     for(int i=0;i<satis_tablosu.length;i++) {
    	 for (int j = 0; j < satis_tablosu[0].length; j++) {
    		System.out.print(i+" .Satir "+j+" .Sütün :");
			satis_tablosu[i][j]=in_text.nextInt();
			
		}
     }
     //Ekrana Basma Girilen Değerleri
     System.out.println("Satış Tablomuz");
     for (int a = 0; a < satis_tablosu.length; a++) {
		for (int b = 0; b < satis_tablosu[0].length; b++) {
			System.out.print(satis_tablosu[a][b]+"  ");
		}
		System.out.println();
	}
     
     
	}

}

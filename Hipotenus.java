package Hipotenus;
import java.util.Scanner;

public class Hipotenus {
	public static void main(String[] args) {
		System.out.println("Üçgenin ilk kenar değerini giriniz(cm):");
		Scanner kenar1 = new Scanner(System.in);
		int kenarDegeriniz1 = kenar1.nextInt();		
		System.out.println("Üçgen ikinci kenar değerini giriniz(cm):");
		Scanner kenar2 = new Scanner(System.in);
		int kenarDegeriniz2 = kenar2.nextInt();	
	    double sonuc = Math.sqrt((kenarDegeriniz1*kenarDegeriniz1)+(kenarDegeriniz2*kenarDegeriniz2)); 
	    System.out.println("Hipotenüs degeriniz:\t" + sonuc + "\tcm");
	    
	    
		
		
	
	
	}
}

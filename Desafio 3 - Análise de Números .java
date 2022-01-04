import java.util.Scanner;
public class main {

public static void main(String[] args) {

 Scanner input = new Scanner(System.in);
 int N, par=0, impar=0, positivo=0, negativo=0;

 for (int i=0; i<5; i++) {

 N = input.nextInt();

 if (N % 2 != 0) {

impar++;


} else {

 par++;

 }

 if (N > 0) { positivo++; }

 if (N < 0) { negativo++; } 

 }

  System.out.println(par + " par(es)");

  System.out.println(impar + " impar(es)");

  System.out.println(positivo + " positivo(s)");

  System.out.println(negativo + " negativo(s)");


 }


}
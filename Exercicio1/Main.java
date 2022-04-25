package Exercicio1;
import java.util.Scanner;
public class Main {

    public static void main(String args[]){

        ListaDeCompras lista= new ListaDeCompras();
        Scanner teclado = new Scanner(System.in);
        int k=0;
        System.out.println("Quantidade de produtos:");
        k=teclado.nextInt();


        for (int i=0;i<k;i++){
            lista.insereLista(teclado.nextLine());
        }


        lista.imprimeLista();
    }
}

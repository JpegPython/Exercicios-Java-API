package Exercicio3;



import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Agenda {
    ArrayList<Compromisso> compromissos = new ArrayList<Compromisso>();
    Compromisso c=new Compromisso();
    String padrao = "aaaa/mm/dd";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(padrao);


    public void imprimeDia(Date dia) {
        System.out.println("Digite '0' para imprimir ingles e '1' caso contrario");
        Scanner teclado = new Scanner(System.in);
        int n1 = teclado.nextInt();
        System.out.println("Digite '0' para imprimir por extenso e '1' caso contrario");
        int n2 = teclado.nextInt();
        for (int i = 0; i < compromissos.size(); i++) {
            c = compromissos.get(i);
            if (dia == c.data) {
                System.out.println(c.titulo);
                System.out.println(c.descricao);
                System.out.println(c.local);
                if (n1 == 0 && n2 == 0) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(padrao);
                    System.out.println(simpleDateFormat.format(c.data));

                }
                else if (n1 == 1 && n2 == 0) {
                    padrao="dd/mm/aaaa";
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(padrao);
                    System.out.println(simpleDateFormat.format(c.data));

                }
                else if (n1 == 0 && n2 == 1) {
                    padrao="mm/dd";
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(padrao);
                    System.out.println(simpleDateFormat.format(c.data));

                }

                else {
                    padrao="dd/mm";
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(padrao);
                    System.out.println(simpleDateFormat.format(c.data));

                }

            }
        }
    }

}

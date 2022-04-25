package Exercicio2;

import java.util.ArrayList;

public class ProcessadorDeBoletos {
    protected float pagamento;
    ArrayList<Boleto> boletos = new ArrayList<Boleto>();
    Boleto b=new Boleto();
    Pagamento p=new Pagamento();
    Fatura f=new Fatura();


    public void processarBoletos(){

        for(int i=0;i<boletos.size();i++){
            b=boletos.get(i);
            p.valorPago+=b.valorPago;
        }

        f.foiPago =p.valorPago == f.valorTotal;
    }


    public ArrayList<Boleto> getBoletos(){
        return this.boletos;
    }



}

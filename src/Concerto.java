import java.io.Serializable;

public class Concerto extends Evento implements Serializable {
    public Concerto() {
        //define a quantidade de ingrssos disponiveis para venda
        QuanIn = 150;
        vetorIngressos = new Ingresso[QuanIn];
        setTipo("Concerto");
    }
    private Ingresso[] IngressoCon = new Ingresso[QuanIn];

    @Override
    public boolean VerificacaoDosIngressos() {
        int NumVip = 0;
        for(Ingresso atual : this.IngressoCon)
            if(atual != null)
                //retorna false caso mais que 10% dos ingressos sejam Vip
                if(atual instanceof InGreVip && NumVip <=(int) (QuanIn * 10)/100)
                    NumVip++;
                else
                    return false;
        return true;
    }
    @Override
    public double ReceiTot() {
        double total = 0;
        for(Ingresso atual : this.IngressoCon){
            if(atual!= null)
                total += atual.getPreco();
        }
        return total;
    }
    @Override
    public String[] extrato(){
        String[] extrtoComp = new String[0];
        for(Ingresso atual : this.IngressoCon){
            if(atual!= null)
                atual.toString();
        }return
    }
}

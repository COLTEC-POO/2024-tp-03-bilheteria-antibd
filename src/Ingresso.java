import java.util.Date;

public abstract class Ingresso implements RelaDeRece{

    protected Date dataVenda;
    //preço do ingresso normal
    protected float preco;
    protected String tipo;
    Ingresso(){}
    Ingresso(float prec){
        dataVenda = new Date();
        this.preco = prec;
    }
    @Override
    public String toString(){
        return dataVenda.toString()+ "\n" + preco + "\n" + tipo + "\n";
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public double ReceiTot() {
        return preco;
    }

    @Override
    public void extrato() {
        System.out.println(toString());
    }
}

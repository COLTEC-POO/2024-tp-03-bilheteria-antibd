public class InGreVip extends Ingresso {
    public InGreVip(){
        setPreco(getPreco() * 2);
        tipo = "Vip";
        System.out.println("Ingresso vip comprado");
    }
}

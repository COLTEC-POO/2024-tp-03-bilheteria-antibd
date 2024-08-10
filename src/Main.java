public class Main {
    public static void main(String[] args){
        Tela Exibir = new Tela();
        Deserializador oi = new Deserializador();
        String[] Socorro;
        Socorro = oi.ListarArquivos();
        for(String Sos : Socorro){
            System.out.println(Sos);
        }
        Evento[] ola ;
        //System.out.println(oi.Deserializa("Filme"));
        ola = oi.Deserializa("Filme");
        //String nome = ola[1].getNome();
        System.out.println(ola[1].getNome());

    }
}

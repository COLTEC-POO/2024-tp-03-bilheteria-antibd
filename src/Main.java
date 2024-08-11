import javax.swing.*;

public class Main {
    public static void main(String[] args){
        Object[] options = {"Filme", "Concerto", "Teatro"};
        int escolhido = JOptionPane.showOptionDialog(null,
        "Qual tipo de evento você vai Comprar o ingreso ",
                "Bilheteria Cinemark",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,options,options[0]);
        if (escolhido == 0){
            Object[] Filmes = {"Deadpool & Wolverine", "Coringa 2", "Meu malvado favorito 4"};
            int FilmeEsc = JOptionPane.showOptionDialog(null,
                    "Qual filme você quer ver",
                    "Bilheteria Cinemark",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,Filmes,Filmes[0]);
        }
        if (escolhido == 1){
            Object[] Concertos = {"Sakira", "Kenny West", "Taylor Swift"};
            int ConcEsc = JOptionPane.showOptionDialog(null,
                    "Você quer ir ao show de qual destes artistas ",
                    "Bilheteria Cinemark",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,Concertos,Concertos[0]);
        }
        if (escolhido == 2){
            Object[] Teatros = {"Cats", "Kenny West", "Taylor Swift"};
            int TeatroEsc = JOptionPane.showOptionDialog(null,
                    "Você quer ir ao show de qual destes artistas ",
                    "Bilheteria Cinemark",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,Teatros,Teatros[0]);
        }
    }
}

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        Object[] options = {"Filme", "Concerto", "Teatro"};
        JOptionPane.showOptionDialog(null,
        "Qual tipo de evento você vai Comprar o ingreso ",
                "Bilheteria Cinemark",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,options,options[0]);
    }
}

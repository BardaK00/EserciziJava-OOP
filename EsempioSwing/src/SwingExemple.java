import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SwingExemple {

    public static void main(String[]argc) {
        //creazione frame, scelta del layout e della size, specificazione dell'azione di chiusura
        var frame = new JFrame("Gay Tester");
        frame.setSize(300,300);
        frame.setLayout(new GridLayout(5,1));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //creazione prima label
        var labelTitle = new JLabel("Scopri anche tu di essere gay");
        frame.add(labelTitle);

        //creazione campo di input
        var inputField = new JTextField("INSERISCI NOME E COGNOME",1);
        frame.add(inputField);

        //creazione menu
        var labelScelta = new Label("Pensi di essere gay?");
        frame.add(labelScelta);

        var menuScelta = new JComboBox<String>();
        // aggiunta dei tasti al gruppo menu
        menuScelta.addItem("si");
        menuScelta.addItem("no");
        frame.add(menuScelta);

        //creazione bottone
        var bottoneVerifica = new JButton("Clicca per verificare");
        bottoneVerifica.addActionListener(new ActionListener(){
            // classe interna per specificare l'azione svolta al momento del click del bottone
            public void actionPerformed(ActionEvent e ){
                //variabili utilizzaper per ottenere le scelte inserite dall'utente
                String nome = inputField.getText();
                String scelta = (String)menuScelta.getSelectedItem();
                if(scelta.equals("si")){
                    JOptionPane.showMessageDialog(null,"ciao"+nome+" sei proprio un john cats");

                }else{
                    JOptionPane.showMessageDialog(null,"non è vero coglione sei gay");
                }
            }

        });

        frame.add(bottoneVerifica);


        //metodo per rendere il frame visibile su schermo
        frame.setVisible(true);
    }
}

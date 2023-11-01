import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BibliotekGUI {

    private ArrayList<Bog> bogListe; // Change to Bog
    private JTextArea bookListTextArea;
    private JButton opretBogButton;
    private JButton visBibliotekButton;
    private JButton fjernBogButton;

    private JButton udlaanBogButton;

    public BibliotekGUI() {
        bogListe = new ArrayList<>(); // Initialize bogListe
        Bog bib = new Bog(); // Assuming Bog is the book class

        JFrame frame = new JFrame("Bibliotek GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 700);

        opretBogButton = new JButton("Opret Bog");
        opretBogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleOpretBogButton();
            }
        });

        fjernBogButton = new JButton("Fjern Bog");
        fjernBogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handlefjernBog();
            }
        });

        udlaanBogButton = new JButton("Udlån Bog");
        udlaanBogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleUdlaanBogButton();
            }
        });


        visBibliotekButton = new JButton("Vis Bibliotek");
        visBibliotekButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleVisBibliotekButton();
            }
        });

        bookListTextArea = new JTextArea();
        bookListTextArea.setEditable(false);

        JPanel panel = new JPanel();
        panel.add(opretBogButton);
        panel.add(fjernBogButton);
        panel.add(udlaanBogButton);
        panel.add(visBibliotekButton);


        frame.add(panel);
        frame.setVisible(true);
    }

    private void handleOpretBogButton() {
        int nr = Integer.parseInt(JOptionPane.showInputDialog("Skriv Bognummer:"));
        String t = JOptionPane.showInputDialog("Skriv Titel:");
        String f = JOptionPane.showInputDialog("Skriv Forfatter:");
        boolean u = false;
        String d = JOptionPane.showInputDialog("Skriv Dato(efterlad tom hvis bog oprettes):");

        tilfoejBog(nr, t, f, u, d);
        updateBookList();
        JOptionPane.showMessageDialog(null, "Bog er tilføjet!");
    }
    public void handleUdlaanBogButton (){
        int nr = Integer.parseInt(JOptionPane.showInputDialog("Skriv Bognummer:"));
        int lnr = Integer.parseInt(JOptionPane.showInputDialog("Skriv Lejer Nummer:"));
        String lnavn = JOptionPane.showInputDialog("Skriv Lejer Navn:");
        String d = JOptionPane.showInputDialog("Skriv Dato:");

        udlaanBog(nr, lnr, lnavn, d);
        updateBookList();
        JOptionPane.showMessageDialog(null, "Bog er nu udlejet!");

    }


    private void handlefjernBog (){
        int nr = Integer.parseInt(JOptionPane.showInputDialog("Hvilken bog vil du fjerne:"));
        fjernBog(nr);
        bogListe.remove(nr);
        updateBookList();

        JOptionPane.showMessageDialog(null, "Bogen er nu fjernet!");

            }


    private void handleVisBibliotekButton() {
        updateBookList();
        // Instantiate and display the BibliotekListe frame
        new BibliotekListe(bogListe);
    }

    private void udlaanBog(int nr,int lnr, String lnavn, String d) {
        updateBookList();
        // Instantiate and display the BibliotekListe frame
        new BibliotekListe(bogListe);
    }

    private void updateBookList() {
        bookListTextArea.setText("");

        for (Bog book : bogListe) { // Change 'bib' to 'Bog'
            bookListTextArea.append(book.toString() + "\n");
        }
    }

    public void tilfoejBog(int nr, String t, String f, boolean u, String d) {
        Bog b = new Bog(nr, t, f, u, d);
        bogListe.add(b);
    }

    public void fjernBog (int nr){
        for (int i = 0; i < bogListe.size(); i++){
            if (bogListe.get(i).getBogId() == nr) {
                bogListe.remove(i);
            }
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BibliotekGUI();
            }
        });
    }


}

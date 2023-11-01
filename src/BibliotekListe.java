import javax.swing.*;
import java.util.ArrayList;

public class BibliotekListe extends JFrame {

    private JTextArea bookListTextArea;

    public BibliotekListe(ArrayList<Bog> bogListe) {
        setTitle("Bibliotek Liste");
        setSize(800, 700);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        bookListTextArea = new JTextArea();
        bookListTextArea.setEditable(false);

        JPanel panel = new JPanel();
        panel.add(new JScrollPane(bookListTextArea));

        add(panel);
        updateBookList(bogListe);
        setVisible(true);
    }

    public void updateBookList(ArrayList<Bog> bogListe) {
        bookListTextArea.setText("");

        for (Bog book : bogListe) {
            bookListTextArea.append(book.toString() + "\n");
        }
    }
}

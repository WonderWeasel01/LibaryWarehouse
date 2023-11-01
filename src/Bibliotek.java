import java.util.ArrayList;

public class Bibliotek {
    private ArrayList<Bog> bogListe = new ArrayList<>();

    public Bibliotek() {
    }

    public void tilfoejBog (int nr, String t, String f, boolean u, String d) {
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
    public void udlaanBog (int nr, int lnr, String lnavn, String d){
        Laaner la = new Laaner(lnr, lnavn);
        for (int i = 0; i < bogListe.size(); i++){
            if (bogListe.get(i).getBogId() == nr){
                bogListe.get(i).udlaanBog(la, d);
            }
        }
    }

    @Override
    public String toString() {
        return "Bibliotek{" +
                "bogListe=" + bogListe +
                '}';
    }
}
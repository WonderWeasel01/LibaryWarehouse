public class Bog {

    private int bogId;
    private String titel;
    private String forfatter;
    private boolean udlaant;        //true hvis bogen er udlånt, ellers false
    //navnet på den som har lånt bogen, ellers laaner=""
    private String udlaansDato;     //Datoen bogen er udlånt, hvis ikke udlånt så er udlaansDato=""
    private Laaner laaner;

    // Constructor
    public Bog(int bogId, String titel, String forfatter, boolean udlaant, String udlaansDato, Laaner laaner) {
        this.bogId = bogId;
        this.titel = titel;
        this.forfatter = forfatter;
        this.udlaant = udlaant;
        this.udlaansDato = udlaansDato;
        this.laaner = laaner;
    }

    public Bog(int bogId, String titel, String forfatter, boolean udlaant, String udlaansDato) {
        this.bogId = bogId;
        this.titel = titel;
        this.forfatter = forfatter;
        this.udlaant = udlaant;
        this.udlaansDato = udlaansDato;
    }

    public Bog() {
    }

    public int getBogId() {
        return bogId;
    }

    public void setBogId(int newBogId) {
        this.bogId = newBogId;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String newTitel) {
        this.titel = newTitel;
    }

    public String getForfatter() {
        return forfatter;
    }

    public void setForfatter(String newForfatter) {
        this.forfatter = newForfatter;
    }

    public boolean isUdlaant() {
        return udlaant;
    }

    public void setUdlaant(boolean udlaant) {
        this.udlaant = udlaant;
    }

    public Laaner getLaaner() {
        return laaner;
    }

    public void setLaaner(Laaner laaner) {
        this.laaner = laaner;
    }

    public String getUdlaansDato() {
        return udlaansDato;
    }

    public void setUdlaansDato(String udlaansDato) {
        this.udlaansDato = udlaansDato;
    }
    public void udlaanBog(Laaner laanerNavn, String dato) {
        if (!this.udlaant){
            this.laaner = laanerNavn;
            this.udlaansDato = dato;
            this.udlaant = true;
        }
    }

    public void afleverBog() {
        this.udlaant = false;
        this.laaner = null;
        this.udlaansDato = "";
    }

    @Override
    public String toString() {
        return "Bog{" +
                "bogId=" + bogId +
                ", titel='" + titel + '\'' +
                ", forfatter='" + forfatter + '\'' +
                ", udlaant=" + udlaant +
                ", udlaansDato='" + udlaansDato + '\'' +
                ", laaner=" + laaner +
                '}';
    }

}
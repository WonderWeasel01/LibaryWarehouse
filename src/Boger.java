public class Boger {
    private int bogId;
    private String titel;
    private String forfatter;
    private  boolean udlant;
    private  Laaner Laaner;


    private String udlaensDato;




    public Boger(int bogId, String titel, String forfatter){
        this.bogId = bogId;
        this.titel = titel;
        this.forfatter = forfatter;
    }

    public void udlaanBog(Laaner l, String dato) {
        this.udlant = true;
        this.Laaner = l;
        this.udlaensDato = dato;
    }


    public void afleverBog(Laaner l, String udlaensDato) {
        this.udlant = false;
        Laaner = l;
        this.udlaensDato = " ";
    }

    public int getBogId() {
        return bogId;
    }

    public void setBogId(int bogId) {
        this.bogId = bogId;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getForfatter() {
        return forfatter;
    }

    public void setForfatter(String forfatter) {
        this.forfatter = forfatter;
    }

    public boolean isUdlant() {
        return udlant;
    }

    public void setUdlant(boolean udlant) {
        this.udlant = udlant;
    }

    public  Laaner getLaener() {
        return Laaner;
    }

    public void setLaener(Laaner laaner) {
        Laaner = laaner;
    }

    public String getUdlaensDato() {
        return udlaensDato;
    }

    public void setUdlaensDato(String udlaensDato) {
        this.udlaensDato = udlaensDato;
    }

    @Override
    public String toString() {
        return "Boger{" +
                "bogId=" + bogId +
                ", titel='" + titel + '\'' +
                ", forfatter='" + forfatter + '\'' +
                ", udlant=" + udlant +
                ", Laaner='" + Laaner + '\'' +
                ", udlaensDato='" + udlaensDato + '\'' +
                '}';
    }
}


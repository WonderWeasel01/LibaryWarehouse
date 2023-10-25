public class Laaner {
    private int LaanerID;

    private String LaanerNavn;
    private String LaanerAdresse;

    private String LaanerMobil;

    public Laaner(int laanerID, String laanerNavn, String laanerAdresse, String laanerMobil) {
        LaanerID = laanerID;
        LaanerNavn = laanerNavn;
        LaanerAdresse = laanerAdresse;
        LaanerMobil = laanerMobil;
    }

    public int getLaanerID() {
        return LaanerID;
    }

    public void setLaanerID(int laanerID) {
        LaanerID = laanerID;
    }

    public String getLaanerNavn() {
        return LaanerNavn;
    }

    public void setLaanerNavn(String laanerNavn) {
        LaanerNavn = laanerNavn;
    }

    public String getLaanerAdresse() {
        return LaanerAdresse;
    }

    public void setLaanerAdresse(String laanerAdresse) {
        LaanerAdresse = laanerAdresse;
    }

    public String getLaanerMobil() {
        return LaanerMobil;
    }

    public void setLaanerMobil(String laanerMobil) {
        LaanerMobil = laanerMobil;
    }

    @Override
    public String toString() {
        return "Laaner{" +
                "LaanerID=" + LaanerID +
                ", LaanerNavn='" + LaanerNavn + '\'' +
                ", LaanerAdresse='" + LaanerAdresse + '\'' +
                ", LaanerMobil='" + LaanerMobil + '\'' +
                '}';
    }
}

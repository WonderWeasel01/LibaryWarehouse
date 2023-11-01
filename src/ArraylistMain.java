import java.util.ArrayList;

public class ArraylistMain {
    public static void main(String[] args) {
        //Opgave 1
        Bibliotek bib = new Bibliotek();

        bib.tilfoejBog(1,"Erased", "Junji ito",false,"");
        System.out.println(bib);
        bib.fjernBog(1);
        System.out.println(bib);
        bib.tilfoejBog(1,"Erased", "Junji ito",false,"");
        bib.udlaanBog(1,1,"jax","31/10-2023");
        System.out.println(bib);
        System.out.println(bib);

    }
}



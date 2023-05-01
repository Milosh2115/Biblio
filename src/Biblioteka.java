import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Biblioteka {
    private List<Ksiazka> ksiazki = new ArrayList<>();

    public void dodajksiazke(Ksiazka ksiazka) {
        ksiazki.add(ksiazka);
        System.out.println("");
        System.out.println("");
        System.out.println(ksiazka.gettytul() + " - ksiazka zostala dodana pomyslnie");
    }
    public void usunksiazke(Ksiazka ksiazka) {
        ksiazki.remove(ksiazka);
        System.out.println("");
        System.out.println("");
        System.out.println(ksiazka.gettytul() + " - ksiazka zostala usunieta pomyslnie");
    }
    public Ksiazka findksiazkabytytul(String tytul) {
        System.out.println("");
        System.out.println("");
        for (Ksiazka ksiazka : ksiazki) {
            String a = ksiazka.gettytul();
            if (a == tytul) {
                System.out.println("Ksiazka znaleziona po tytule: " + ksiazka.gettytul());
            }
        }
        return null;
    }
    public Ksiazka findksiazkabyautor(String autor) {
        System.out.println("");
        System.out.println("");
        for (Ksiazka ksiazka : ksiazki) {
            String a = ksiazka.getautor();
            if (a == autor) {
                System.out.println("Ksiazka znaleziona po autorze: " + ksiazka.gettytul());
            }
        }
        return null;
    }
    public Ksiazka findksiazkabygatunek(String gatunek) {
        System.out.println("");
        System.out.println("");
        for (Ksiazka ksiazka : ksiazki) {
            String a = ksiazka.getgatunek();
            if (a == gatunek) {
                System.out.println("Ksiazka znaleziona po gatunku: " + ksiazka.gettytul());
            }
        }
        return null;
    }
    public void drukujliste() {
        System.out.println("");
        System.out.println("");
        for (Ksiazka ksiazka : ksiazki) {
            System.out.println(ksiazka.gettytul());
        }
        System.out.println("Wydrukowano liste ksiazek w bibliotece");
    }
}
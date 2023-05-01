import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Biblioteka library = new Biblioteka();

        Ksiazka book1 = new Ksiazka("Wladca Pierscieni", "Tolkien", 2005, "Insignis", 64321, "Fantasy", 5);
        Ksiazka book2 = new Ksiazka("Harry Potter i Komnata Tajemnic ", "Rowling", 2012, "MediaRodzina", 123654, "Mlodziezowa", 4);
        Ksiazka book3 = new Ksiazka("Diuna", "Herbert", 1999, "Rebis", 123456, "Fantasy", 3);
       
        library.dodajksiazke(book1);
        library.dodajksiazke(book3);
        library.dodajksiazke(book2);
        
        library.drukujliste();

        book1.settytul("Wladca Pierscieni Powrot Krola");        
        library.drukujliste();
        Ksiazka znaleziona = library.findksiazkabygatunek("Fantasy");

        Ksiazka znaleziona1 = library.findksiazkabyautor("testowyy");

        book1.pozyczksiazke("Roman");
        book1.pozyczksiazke("Roman1");
        book1.pozyczksiazke("Roman2");
        book1.pozyczksiazke("Roman2");

        book1.oddajksiazke("Roman1");
        book1.oddajksiazke("Roman1");
        book1.oddajksiazke("Roman1");
        book1.oddajksiazke("Roman");
        book3.pozyczksiazke("Roman");

        book1.pozyczksiazke("Roman3");

        book1.oddajksiazke("Roman2");

        book1.pozyczksiazke("Roman3");

        Ksiazka znaleziona2 = library.findksiazkabygatunek("testowygatunek");

        book1.ktowypozycza();
        book3.ktowypozycza();
    }
}
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Calendar;  
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  

public class Ksiazka {
    private String tytul;
    private String autor;
    private int rokwydania;
    private String wydawca;
    private int ISBN;
    private String gatunek;
    private int dostepnosc;
    private String[][] ktowypozyczyl;

    public Ksiazka(String tytul, String autor, int rokwydania, String wydawca, int ISBN, String gatunek, int dostepnosc) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokwydania = rokwydania;
        this.wydawca = wydawca;
        this.ISBN = ISBN;
        this.gatunek = gatunek;
        this.dostepnosc = dostepnosc;
        this.ktowypozyczyl = new String[dostepnosc][3];
    } 


public String gettytul() {
    return tytul;
}
public String getautor() {
    return autor;
}
public int getrokwydania() {
    return rokwydania;
}
public String getwydawca() {
    return wydawca;
}
public int getISBN() {
    return ISBN;
}
public String getgatunek() {
    return gatunek;
}
public int getdostepnosc() {
    return dostepnosc;
}


public void settytul(String tytul) {
    this.tytul = tytul;
    System.out.println("");
    System.out.println("");
    System.out.println("Ksiazka: " + tytul);
    System.out.println("");
    System.out.println("Zmieniono tytul");
}
public void setautor(String autor) {
    this.autor = autor;
    System.out.println("");
    System.out.println("");
    System.out.println("Ksiazka: " + tytul);
    System.out.println("");
    System.out.println("Zmieniono autora");
}
public void setrokwydania(int rokwydania) {
    this.rokwydania = rokwydania;
    System.out.println("");
    System.out.println("");
    System.out.println("Ksiazka: " + tytul);
    System.out.println("");
    System.out.println("Zmieniono rok wydania");
}
public void setwydawca(String wydawca) {
    this.wydawca = wydawca;
    System.out.println("");
    System.out.println("");
    System.out.println("Ksiazka: " + tytul);
    System.out.println("");
    System.out.println("Zmieniono wydawce");
}
public void setISBN(int ISBN) {
    this.ISBN = ISBN;
    System.out.println("");
    System.out.println("");
    System.out.println("Ksiazka: " + tytul);
    System.out.println("");
    System.out.println("Zmieniono nr. ISBN");
}
public void setgatunek(String gatunek) {
    this.gatunek = gatunek;
    System.out.println("");
    System.out.println("");
    System.out.println("Ksiazka: " + tytul);
    System.out.println("");
    System.out.println("Zmieniono gatunek");
}
public void setdostepnosc(int dostepnosc) {
    this.dostepnosc = dostepnosc;
    System.out.println("");
    System.out.println("");
    System.out.println("Ksiazka: " + tytul);
    System.out.println("");
    System.out.println("Zmieniono dostepnosc");
}


public void pozyczksiazke(String kto) {
    System.out.println("");
    System.out.println("");
    System.out.println("Ksiazka: " + tytul);
    if(dostepnosc > 0) {
        dostepnosc--;
        ktowypozyczyl[dostepnosc][0] = kto;
        Date date = Calendar.getInstance().getTime();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE,60);
        Date kiedyoddacd = c.getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
        String strDate = dateFormat.format(date);
        String kiedyoddac = dateFormat.format(kiedyoddacd);
        ktowypozyczyl[dostepnosc][1] = strDate;
        ktowypozyczyl[dostepnosc][2] = kiedyoddac;
        System.out.println("");
        System.out.println("Ksiazka zostala wypozyczona pomyslnie.");
        System.out.println("");
        System.out.println("");
        System.out.println("Wypozyczajacy: " + ktowypozyczyl[dostepnosc][0]);
        System.out.println("");
        System.out.println("Data wypozyczenia: " + ktowypozyczyl[dostepnosc][1]);
        System.out.println("Termin oddania: " + ktowypozyczyl[dostepnosc][2]);
    } else {
        System.out.println("");
        System.out.println("Nie udalo sie wypozyczyc ksiazki. Brak wystarczajacej liczby egzemplarzy.");
    }
}
public void oddajksiazke(String ktotam) {
    System.out.println("");
    System.out.println("");
    System.out.println("Ksiazka: " + tytul);
    int z = 0;
    for (int i=0; i <ktowypozyczyl.length; i++ ) {
        String tested = ktowypozyczyl[i][0];
        if (ktotam == tested) {
            System.out.println("");
            System.out.println("Ksiazka zostala oddana pomyslnie przez: " + ktowypozyczyl[i][0]);
            ktowypozyczyl[i][0] = null;
            ktowypozyczyl[i][1] = null;
            ktowypozyczyl[i][2] = null;
            dostepnosc++;
            z = 1;
        }
    }
    if (z == 0) {
        System.out.println("");
        System.out.println(ktotam + " nie wypozycza tej ksiazki");
    }
}
public void ktowypozycza() {
    System.out.println("");
    System.out.println("");
    System.out.println("Ksiazka " + tytul + " wypozyczana jest przez:");
    int num = 1;
    for (int tmp = 0; tmp < ktowypozyczyl.length; tmp++ ) {
        if (ktowypozyczyl[tmp][0] == null) {
            System.out.println("");
            System.out.println("");
            System.out.println("Egzemplarz " + Integer.toString(num));
            System.out.println("");
            System.out.println("Pozostaje do wypozyczenia");
            num++;
        } else {
            System.out.println("");
            System.out.println("");
            System.out.println("Egzemplarz " + Integer.toString(num));
            System.out.println("");
            System.out.println("");
            System.out.println("Wypozyczajacy: " + ktowypozyczyl[tmp][0]);
            System.out.println("");
            System.out.println("Data wypozyczenia: " + ktowypozyczyl[tmp][1]);
            System.out.println("Termin oddania: " + ktowypozyczyl[tmp][2]);
            num++;
        }

    }
}
}
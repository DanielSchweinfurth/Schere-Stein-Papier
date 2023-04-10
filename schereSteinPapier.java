//imports
import java.util.*;
//anfang der Klasse

public class schereSteinPapier {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Spiel();
        }

       
    }

//variablen initialisierern
static String winner;
static int gewinner;



//getter und setter





//Methoden

public static int random() {
    Random zufall = new Random();
    int ran = zufall.nextInt(3);
    return ran;
}

public static String bot(int x) {
    switch(x){
        case 0:
            return "Stein";
        case 1:
            return "Schere";
        case 2:
            return "Papier";
        default:
        return "yeet";
    }
}

public static int user(String eingabe){
    switch (eingabe) {
        case "Papier":
            return 2;
        case "Schere":
            return 1;
        case "Stein":
            return 0;
        default:
        return 69;
    }
}

public static String eingabe(){
    Scanner scn = new Scanner(System.in);
    String eingabe;
    System.out.println("Schere, Stein, Papier");
    eingabe = scn.nextLine();

    return eingabe;
}

public static void auswertung(int spieler, int bot){
    // 0 = stein    
    // 1 = schere
    // 2 = papier
    
    
    //int gewinner;
    //0 = Spieler
    //1 = bot
    //String winner;


    if (spieler == bot) {
        System.out.println("unentschieden");
        return;
    }else if(spieler == 0 && bot == 1){
        gewinner = 0;
    }else if(spieler == 1 && bot == 2){
        gewinner = 0;
    }else if(spieler == 2 && bot == 0){
        gewinner = 0;
    }else if(spieler == 0 && bot == 2){
        gewinner = 1;
    }else if(spieler == 1 && bot == 0){
        gewinner = 1;
    }else if(spieler == 2 && bot == 1){
        gewinner = 1;
    }


    if(gewinner == 1){
        winner = "Bot";
    }else if(gewinner == 0){
        winner = "Spieler";
    }

    System.out.println("Der Gewinner ist " + winner + ".");

}

public static void Spiel(){
    int ranbot = random();
    int eingabe = user(eingabe());

    System.out.println();
    System.out.println("du wählst " + bot(eingabe));
    System.out.println("der Bot wählt " + bot(ranbot));

    auswertung(eingabe, ranbot);
    }






}



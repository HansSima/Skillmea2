import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*String pozdrav = "Ahoj svete";

        //Toto je pro vypsani textu
        System.out.println(pozdrav);
        System.out.println(pozdrav);
        System.out.println(pozdrav);
        System.out.println(pozdrav);*/

        /*int prvniCislo = 10;
        int druheCislo = 5;

        System.out.println(prvniCislo + druheCislo);
        System.out.println(prvniCislo - druheCislo);
        System.out.println(prvniCislo * druheCislo);
        System.out.println(prvniCislo / druheCislo);

        String pozdrav2 = "Ahoj";
        String jmeno = "Honza";

        System.out.println(pozdrav2 + " " + jmeno);*/

        //Uloha: Uzivatel napise sve jmeno a program ho pozdravi
        /*String pozdrav3 = "Ahoj, ";
        Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadej sve jmeno:");
        String jmeno = mujScanner.nextLine();
        System.out.println(pozdrav3 + jmeno);*/

        //Kalkulacka
        /*float prvniCislo;
        float druheCislo;
        Scanner mujScanner = new Scanner(System.in);

        System.out.println("Zadej prvni cislo:");
        prvniCislo = mujScanner.nextFloat();

        System.out.println("Zadej druhe cislo:");
        druheCislo = mujScanner.nextFloat();

        System.out.println(prvniCislo + druheCislo);
        System.out.println(prvniCislo - druheCislo);
        System.out.println(prvniCislo * druheCislo);
        System.out.println(prvniCislo / druheCislo);*/

        /*double a = 0.1;
        double b = 0.2;

        double soucet = a + b;
        System.out.println(soucet);*/

        //int NEJAKE_CISLO = 5;

        //Uzivatel zada slovo, ve vypisu budou vsechna pismena velke
        /*Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadej sve slovo:");
        String slovo = mujScanner.nextLine();

        System.out.println(slovo);*/

        //Prevod typu
        //int prevedeneCislo = Integer.parseInt("5");

        /*int prvniCislo = 8;
        int druheCislo = 3;

        System.out.println(prvniCislo + druheCislo);
        System.out.println(prvniCislo - druheCislo);
        System.out.println(prvniCislo % druheCislo);

        System.out.println(prvniCislo <= druheCislo);*/

        /*int cisloKPorovnani = 5;

        System.out.println(cisloKPorovnani > 0 && cisloKPorovnani <= 8);
        System.out.println(cisloKPorovnani > 8 || cisloKPorovnani < 0);
        System.out.println(!(cisloKPorovnani > 8 || cisloKPorovnani < 0));*/

        //Feature pro kontrolu veku, bude-li mit uzivatel 18 a vice vypis do konzole vitej v aplikaci
        /*int vek;
        Scanner mujScanner = new Scanner(System.in);

        System.out.println("Zadej svuj vek:");
        vek = mujScanner.nextInt();

        if(vek >= 18) {
            System.out.println("Uzivatel je dospely");
            if(vek >= 65){
                System.out.println("Uzivatel je senior");
            }
        }
        else if(vek >= 0 && vek < 18) {
            System.out.println("Uzivatel je nezletily");
        }
        else {
            System.out.println("Nelze zadat zaporny vek");
        }*/

        //Vypocet BMI hmotnost(kg)/vyska(m) na druhou, vypis do konzole vysledek
        // (<18.5) - podváha
        // (>=18.5 && <25) - optimální váha
        // (>=25) - nadváha
        /*float vyska;
        float hmotnost;
        float bmi;
        Scanner mujScanner = new Scanner(System.in);

        System.out.println("Zadej vysku(m):");
        vyska = mujScanner.nextFloat();
        System.out.println("Zadej vahu(kg)");
        hmotnost = mujScanner.nextFloat();
        bmi = hmotnost / (vyska * vyska);

        if(bmi < 18.5f && bmi>=0) {
            System.out.println("Uzivatel ma podvahu");
        }
        else if(bmi>=18.5f && bmi<25){
            System.out.println("Uzivatel ma optimalni vahu");
        }
        else if(bmi>=25) {
            System.out.println("Uzivatel ma nadvahu");
        }
        else {
            System.out.println("Uzivatel zadal zapornou hmotnost");
        }

        System.out.println("Vase BMI je: " + bmi);*/

        //Liche cislo = vyhrava, Sude cislo = prohrava
        /*int hozeneCislo;
        Random nahodnyGenerator = new Random();

        System.out.println("Pro hozeni kostkou stiskni enter");
        Scanner mujScanner = new Scanner(System.in);
        mujScanner.nextLine();

        hozeneCislo = nahodnyGenerator.nextInt(1, 7);
        System.out.println("Hozene cislo je: " + hozeneCislo);

        if(hozeneCislo % 2 == 1) {
            System.out.println("Licha - Vyhravas!");
        }
        else {
            System.out.println("Suda - Prohravas");
        }*/

        //Switch - den v tydnu
        /*Scanner mujScanner = new Scanner(System.in);
        int cisloDne;
        System.out.println("Zadej cislo dne:");
        cisloDne = mujScanner.nextInt();

        switch (cisloDne) {
            case 1:
                System.out.println("Je pondeli");
                break;
            case 2:
                System.out.println("Je utery");
                break;
            case 3:
                System.out.println("Je streda");
                break;
            case 4:
                System.out.println("Je ctvrtek");
                break;
            case 5:
                System.out.println("Je patek");
                break;
            case 6:
                System.out.println("Je sobota");
                break;
            case 7:
                System.out.println("Je nedele");
                break;
            default:
                System.out.println("Neplatne cislo dne");
        }

        switch (cisloDne) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Je pracovni den");
                break;
            case 6:
            case 7:
                System.out.println("Je vikend");
                break;
        }*/

        //Pole
        /*int[] znamky = new int[5];
        znamky[0] = 3;
        znamky[1] = 5;
        znamky[2] = 2;
        znamky[3] = 3;
        znamky[4] = 1;

        int[] znamky2 = new int[] {3, 5, 1, 3, 1};

        System.out.println(znamky[2]);*/

        /*String[] jmena = new String[30];
        Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadej pozici ke zmene(max 29)");
        int poziceZmeny = mujScanner.nextInt();
        mujScanner.nextLine();
        System.out.println("Zadej jmeno:");
        String jmeno = mujScanner.nextLine();

        jmena[poziceZmeny] = jmeno;
        System.out.println(jmena[poziceZmeny]);*/

        /*String[] jmena = new String[] {"Jan", "Petr", "Katka", "Jana"};
        jmena[0] = "jmeno";
        System.out.println(jmena);*/

        /*int[][][] pole2D = new int[3][3][5];
        pole2D[0][0][0] = 464;
        pole2D[0][1][0] = -92;*/

        //Smycky
        for(int i = 0; i < 10; i++){
            System.out.println(i * 10);
        }

    }
}
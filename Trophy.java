import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
class Trophy {
    private String name;
    private double weight;
    public Trophy(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public void display1() {
        System.out.println("YEAR: 1975.\n");
        System.out.println("TROPHY WINNER: West Indies.\n ");
        System.out.println("FINAL MATCH BETWEEN : England amd West Indies.\n ");
    }
    public void display2() {
        System.out.println("YEAR: 1979.\n");
        System.out.println("TROPHY WINNER: West Indies.\n");
        System.out.println("FINAL MATCH BETWEEN : England amd West Indies\n");
    }
    public void display3() {
        System.out.println("YEAR: 1983.\n");
        System.out.println("TROPHY WINNER: India.\n ");
        System.out.println("FINAL MATCH BETWEEN : India and West Indies.\n");
    }
    public void display4() {
        System.out.println("YEAR: 1987.\n");
        System.out.println("TROPHY WINNER: Australia.\n");
        System.out.println("FINAL MATCH BETWEEN : Australia and England.\n");
    }
    public void display5() {
        System.out.println("YEAR: 1992.\n");
        System.out.println("TROPHY WINNER: Pakistan.\n");
        System.out.println("FINAL MATCH BETWEEN : England and Pakistan.\n");
    }
    public void display6() {
        System.out.println("YEAR: 1996.\n");
        System.out.println("TROPHY WINNER: SriLanka.\n");
        System.out.println("FINAL MATCH BETWEEN : Australia and SriLanka.\n");
    }
    public void display7(){
        System.out.println("YEAR: 1999.\n");
        System.out.println("TROPHY WINNER: Australia.\n");
        System.out.println("FINAL MATCH BETWEEN : Australia and Pakistan.\n");
    }
    public void display8(){
        System.out.println("YEAR: 2003.\n");
        System.out.println("TROPHY WINNER: Australia.\n");
        System.out.println("FINAL MATCH BETWEEN : Australia and India.\n");
    }
    public void display9(){
        System.out.println("YEAR: 2007.\n");
        System.out.println("TROPHY WINNER: Australia.\n");
        System.out.println("FINAL MATCH BETWEEN : Australia and SriLanka.\n");
    }
    public void display10(){
        System.out.println("YEAR: 2011.\n");
        System.out.println("TROPHY WINNER: India.\n");
        System.out.println("FINAL MATCH BETWEEN : India and SriLanka.\n");
    }
    public void display11(){
        System.out.println("YEAR: 2015.\n");
        System.out.println("TROPHY WINNER: Australia.\n");
        System.out.println("FINAL MATCH BETWEEN : Australia and New Zealand.\n");
    }
    public void display12(){
        System.out.println("YEAR: 2019.\n");
        System.out.println("TROPHY WINNER: England.\n");
        System.out.println("FINAL MATCH BETWEEN : England and New Zealand.\n");}
}
class Sportsman {
    private String name;
    public Sportsman(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void winTrophy(Trophy trophy) {
        System.out.println(name + " winner for the trophy and Man of the match.\n\n" +"Trophy was made of "+ trophy.getName()+".\n");
    }
}
class T20Trophy {
    private String name;
    private double weight;
    public T20Trophy(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public void display1() {
        System.out.println("YEAR: 2007.\n");
        System.out.println("T20 TROPHY WINNER: India.\n");
        System.out.println("FINAL MATCH BETWEEN : Pakistan and India.\n");
    }
    public void display2() {
        System.out.println("YEAR: 2009.\n");
        System.out.println("T20 TROPHY WINNER: Pakistan.\n");
        System.out.println("FINAL MATCH BETWEEN : Pakistan and SriLanka.\n");
    }
    public void display3() {
        System.out.println("YEAR: 2010.\n");
        System.out.println("T20 TROPHY WINNER: England.\n");
        System.out.println("FINAL MATCH BETWEEN : Australia and England.\n");
    }
    public void display4() {
        System.out.println("YEAR: 2012.\n");
        System.out.println("T20 TROPHY WINNER: West indies.\n");
        System.out.println("FINAL MATCH BETWEEN : West indies and SriLanka.\n");
    }
    public void display5() {
        System.out.println("YEAR: 2014.\n");
        System.out.println("T20 TROPHY WINNER: SriLanka.\n");
        System.out.println("FINAL MATCH BETWEEN : India and SriLanka.\n");
    }
    public void display6() {
        System.out.println("YEAR: 2016.\n");
        System.out.println("T20 TROPHY WINNER: West indies.\n");
        System.out.println("FINAL MATCH BETWEEN : england and West indies.\n");
    }
    public void display7(){
        System.out.println("YEAR: 2021.\n");
        System.out.println("T20 TROPHY WINNER: New zealand.\n");
        System.out.println("FINAL MATCH BETWEEN : Australia and New zealand.\n");
    }
    public void display8(){
        System.out.println("YEAR: 2022.\n");
        System.out.println("T20 TROPHY WINNER: England.\n");
        System.out.println("FINAL MATCH BETWEEN : England and Pakistan.\n");
    }
    public void display9(){
        System.out.println("YEAR: 2007.\n");
        System.out.println("T20 TROPHY WINNER: Australia.\n");
        System.out.println("Final match between : Australia and SriLanka.\n");
    }
    public void display10(){
        System.out.println("YEAR: 2011.\n");
        System.out.println("TROPHY WINNER: India.\n");
        System.out.println("Final Match Between : India and SriLanka.\n");
    }
    public void display11(){
        System.out.println("YEAR: 2015.\n");
        System.out.println("T20 TROPHY WINNER: Australia.\n");
        System.out.println("Final match between : Australia and New Zealand.\n");
    }
    public void display12(){
        System.out.println("YEAR: 2019.\n");
        System.out.println("T20 TROPHY WINNER: England.\n");
        System.out.println("Final match between : England and New Zealand.\n");}
}
class T20Sportsman {
    private String name;
    public T20Sportsman(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void winTrophy(Trophy trophy) {
        System.out.println(name + " winner for the T20 trophy and Man of the match: \n" +"T20 Trophy was made of "+ trophy.getName());
    }
}
class ChampionsTrophy {
    private String name;
    private double weight;
    public ChampionsTrophy(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public void display1() {
        System.out.println("YEAR: 1998.\n");
        System.out.println("CHAMPIONS TROPHY WINNER: South Africa.\n ");
        System.out.println("FINAL MATCH BETWEEN : South Africa and West indiesr" +
                ".\n ");
    }
    public void display2() {
        System.out.println("YEAR: 2000.\n");
        System.out.println("CHAMPIONS TROPHY WINNER: New Zealand.\n");
        System.out.println("FINAL MATCH BETWEEN : India and New Zealand.\n");
    }
    public void display3() {
        System.out.println("YEAR: 2002.\n");
        System.out.println("CHAMPIONS TROPHY WINNER: Sri Lanka.\n");
        System.out.println("FINAL MATCH BETWEEN : India and SriLanka.\n");
    }
    public void display4() {
        System.out.println("YEAR: 2004.\n");
        System.out.println("CHAMPIONS TROPHY WINNER: West indies.\n");
        System.out.println("FINAL MATCH BETWEEN : West indies and England.\n");
    }
    public void display5() {
        System.out.println("YEAR: 2006.\n");
        System.out.println("CHAMPIONS TROPHY WINNER: Australia.\n");
        System.out.println("FINAL MATCH BETWEEN : Australia and West indies.\n");
    }
    public void display6() {
        System.out.println("YEAR: 2009.\n");
        System.out.println("CHAMPIONS TROPHY WINNER: West indies.\n");
        System.out.println("FINAL MATCH BETWEEN : england and West indies.\n");
    }
    public void display7(){
        System.out.println("YEAR: 2013.\n");
        System.out.println("CHAMPIONS TROPHY WINNER: India.\n");
        System.out.println("FINAL MATCH BETWEEN : India and England.\n");
    }
    public void display8(){
        System.out.println("YEAR: 2017.\n");
        System.out.println("CHAMPIONS TROPHY WINNER: Pakistan.\n");
        System.out.println("FINAL MATCH BETWEEN : India and Pakistan.\n");
    }
}
class ChampionsSportTrophy {
    private String name;
    public ChampionsSportTrophy(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void winTrophy(Trophy trophy) {
        System.out.println(name +" winner for the Champions trophy and Man of the match: \n\n" +"T20 Trophy was made of "+ trophy.getName()+trophy.getWeight());
    }
}
class SportsTrophy extends Trophy {
    private String sport;
    public SportsTrophy(String name,double weight, String sport) {
        super(name,weight);
        this.sport = sport;
    }
    public String getSport() {
        return sport;
    }
}

class Player {
    private String name;
    private ArrayList<Sportsman> members = new ArrayList<>();
    public Player(String name) {
        this.name = name;
    }
    public void addMember(Sportsman sportsman) {
        members.add(sportsman);
    }
    public void displayMembers() {
        System.out.println(name + " best player of all time:");
        for (Sportsman sportsman : members) {
            System.out.println("  -" + sportsman.getName());
        }
    }
}
class Tournament {
    private String name;
    private ArrayList<SportsTrophy> trophies = new ArrayList<>();
    public Tournament(String name) {
        this.name = name;
    }
    public void displayTrophies() {
        System.out.println(name + " tournament trophies:");
    }
}
class welcome extends Thread {
    String display;
    Date d;
    SimpleDateFormat Format;
    public void run()
    {
        d=new Date();
        Format=new SimpleDateFormat("E,dd-MMMM-yyyy - hh:MM:ss ");
        display=Format.format(d);

        try {
            System.out.println("\t\t\tWelcome To Trophy Project \t\t\t");

            Thread.sleep(2000);//2seconds

            System.out.println("Login Date and Time : "+display);

            System.out.println();
            System.out.print("*");
            Thread.sleep(500);//half seconds
            System.out.print("*");
            Thread.sleep(500);
            System.out.print("*");
            Thread.sleep(500);
            System.out.print("*");
            Thread.sleep(500);
            System.out.print("*");
            Thread.sleep(500);
            System.out.print("*");
            Thread.sleep(500);
            System.out.print("*");
            Thread.sleep(500);
            System.out.print("*");
            Thread.sleep(500);
            System.out.print("*");
            Thread.sleep(500);
            System.out.print("*");
            Thread.sleep(500);
            System.out.print("*");
            Thread.sleep(500);
            System.out.print("*");
            Thread.sleep(500);
            System.out.print("*");
            Thread.sleep(500);
            System.out.print("*");
            Thread.sleep(500);
            System.out.print("*");
            Thread.sleep(500);
            System.out.print("*");
            Thread.sleep(500);
            System.out.print("*");
            Thread.sleep(500);

            System.out.println();
        }
        catch(Exception e) {
        }
    }
}
class Project{
    public static void main(String[] args) {
        welcome w1=new welcome();
        w1.setName("Date and Time");

        w1.start();
        try
        {
            w1.join();
        }
        catch(Exception e) {}

        Trophy trophy1 = new Trophy("Gold and Silver", 11.0);
        Trophy trophy2 = new Trophy("18 karat Gold", 6.175);
        Trophy trophy3 = new Trophy("Gold and Silver", 11.0);
        Trophy trophy4 = new Trophy(null, 0.0);
        T20Trophy t2 = new T20Trophy(null, 0.0);

        // Create trophies
        SportsTrophy trophy = new SportsTrophy("World Cup", 11.1, "Cricket:");
        SportsTrophy trophys = new SportsTrophy("Grand Slam", 7.5, "Cricket:");

        // Create sportsmen
        Sportsman sportsman1 = new Sportsman("Clive Llyod");
        Sportsman sportsman2 = new Sportsman("Sir Vivian Richards");
        Sportsman sportsman3 = new Sportsman("Mohinder Amarnath");
        Sportsman sportsman4 = new Sportsman("David Boon");
        Sportsman sportsman5 = new Sportsman("Wasim Akram");
        Sportsman sportsman6 = new Sportsman("Aravinda de Silva");
        Sportsman sportsman7 = new Sportsman("Shane Warne");
        Sportsman sportsman8 = new Sportsman("Ponting");
        Sportsman sportsman9 = new Sportsman("Irfan Pathan");
        Sportsman sportsman10 = new Sportsman("Mahendra Singh Dhoni");
        Sportsman sportsman11 = new Sportsman("James Faulkner");
        Sportsman sportsman12 = new Sportsman("Ben Stokes");
        //west indies
        Sportsman sportsmanTw1=new Sportsman("Brian Lara");
        Sportsman sportsmanTw2=new Sportsman("Courtney Walsh and Curtly Ambrose");
        Sportsman sportsmanTw3=new Sportsman("Sir Viv Richards");
        Sportsman sportsmanTw4=new Sportsman("Sir Garfield Sobers");
        //India
        Sportsman sportsmanTi1=new Sportsman("Virat Kohli");
        Sportsman sportsmanTi2=new Sportsman("MS Dhoni");
        Sportsman sportsmanTi3=new Sportsman("Rohit Sharma");
        Sportsman sportsmanTi4=new Sportsman("Rishabh Pant");
        Sportsman sportsmanTi5=new Sportsman("Sachin Tendulkar");
        //Australia
        Sportsman sportsmanTa1=new Sportsman("Donald Bradman");
        Sportsman sportsmanTa2=new Sportsman("Adam Gilchrist");
        Sportsman sportsmanTa3=new Sportsman("Shane Keith Warne");
        Sportsman sportsmanTa4=new Sportsman("Shane Robert Watson");
        Sportsman sportsmanTa5=new Sportsman("Ricky Ponting");
        //pakistan
        Sportsman sportsmanTp1=new Sportsman("Shahid Afridi");
        Sportsman sportsmanTp2=new Sportsman("Imran Khan");
        Sportsman sportsmanTp3=new Sportsman("Babar Azam");
        Sportsman sportsmanTp4=new Sportsman("Wasim Akram");
        Sportsman sportsmanTp5=new Sportsman("Mohammad Hafeez");
         //England
        Sportsman sportsmanTe1=new Sportsman("Alastair Cook");
        Sportsman sportsmanTe2=new Sportsman("James Anderson");
        Sportsman sportsmanTe3=new Sportsman("Kevin Pietersen");
        Sportsman sportsmanTe4=new Sportsman("Wally Hammond");
        Sportsman sportsmanTe5=new Sportsman("Leonard Hutton");
          //srilanka
        Sportsman sportsmanTsr1=new Sportsman("Sanath Jayasuriya");
        Sportsman sportsmanTsr2=new Sportsman("Muttiah Muralitharan");
        Sportsman sportsmanTsr3=new Sportsman("Kumar Sangakkara");
        Sportsman sportsmanTsr4=new Sportsman("Mahela Jayawardene");
        Sportsman sportsmanTsr5=new Sportsman("Aravinda De Silva");
        //New zealand
        Sportsman sportsmanTn1=new Sportsman("Ross Taylor");
        Sportsman sportsmanTn2=new Sportsman(" Kane Williamson");
        Sportsman sportsmanTn3=new Sportsman("Daniel Vettori");
        Sportsman sportsmanTn4=new Sportsman("Richard Hadlee");
        Sportsman sportsmanTn5=new Sportsman("Stephen Fleming");
         // South africa
        Sportsman sportsmanTs1=new Sportsman(" Jacques Kallis");
        Sportsman sportsmanTs2=new Sportsman(" Shaun Pollock");
        Sportsman sportsmanTs3=new Sportsman("Dale Steyn");
        Sportsman sportsmanTs4=new Sportsman("AB de Villiers");
        Sportsman sportsmanTs5=new Sportsman(" Hashim Amla");

        T20Sportsman sportsmant1 = new T20Sportsman("Irfan Pathan");//2007
        T20Sportsman sportsmant2 = new T20Sportsman("Shahid Afridi");//2009
        T20Sportsman sportsmant3 = new T20Sportsman("Craig Kieswetter");//2010
        T20Sportsman sportsmant4 = new T20Sportsman("Marlon Samuels");//2012
        T20Sportsman sportsmant5 = new T20Sportsman("Kumar Sangakkara");//2014
        T20Sportsman sportsmant6 = new T20Sportsman("Marlon Samuels");//2016
        T20Sportsman sportsmant7 = new T20Sportsman("Mitchell Marsh ");//2021
        T20Sportsman sportsmant8 = new T20Sportsman("Sam Curran");//2022

        ChampionsTrophy ct = new ChampionsTrophy(null, 0.0);
        ChampionsSportTrophy cst1 = new ChampionsSportTrophy("Jacques Kallis");
        ChampionsSportTrophy cst2 = new ChampionsSportTrophy("Sourav Ganguly");
        ChampionsSportTrophy cst3 = new ChampionsSportTrophy("Virender Sehwag");
        ChampionsSportTrophy cst4 = new ChampionsSportTrophy("Ramnaresh Sarwan");
        ChampionsSportTrophy cst5 = new ChampionsSportTrophy("Shane Watson ");
        ChampionsSportTrophy cst6 = new ChampionsSportTrophy("Jacques Kallis");
        ChampionsSportTrophy cst7 = new ChampionsSportTrophy("Ravindra Jadeja");
        ChampionsSportTrophy cst8 = new ChampionsSportTrophy("Hassan Al");

        Tournament tournament1 = new Tournament("WORLD CUP TR0PHY:");
        Tournament tournament2 = new Tournament("T20 TROPHY :");
        Tournament tournament3 = new Tournament("CHAMPIONSHIP TROPHY :");

        Player p1 = new Player("West indies's");
        p1.addMember(sportsmanTw1);
        p1.addMember(sportsmanTw2);
        p1.addMember(sportsmanTw3);
        p1.addMember(sportsmanTw4);

        Player p2=new Player("Australia");
        p2.addMember(sportsmanTa1);
        p2.addMember(sportsmanTa2);
        p2.addMember(sportsmanTa3);
        p2.addMember(sportsmanTa4);
        p2.addMember(sportsmanTa5);

        Player p3=new Player("India");
        p3.addMember(sportsmanTi1);
        p3.addMember(sportsmanTi2);
        p3.addMember(sportsmanTi3);
        p3.addMember(sportsmanTi4);
        p3.addMember(sportsmanTi5);
        Player p4=new Player("Pakistan");
        p4.addMember(sportsmanTp1);
        p4.addMember(sportsmanTp2);
        p4.addMember(sportsmanTp3);
        p4.addMember(sportsmanTp4);
        p4.addMember(sportsmanTp5);
        Player p5=new Player("England");
        p5.addMember(sportsmanTe1);
        p5.addMember(sportsmanTe2);
        p5.addMember(sportsmanTe3);
        p5.addMember(sportsmanTe4);
        p5.addMember(sportsmanTe5);
        Player p6=new Player("South Africa");
        p6.addMember(sportsmanTs1);
        p6.addMember(sportsmanTs2);
        p6.addMember(sportsmanTs3);
        p6.addMember(sportsmanTs4);
        p6.addMember(sportsmanTs5);

        Player p7=new Player("New zeaLand");
        p7.addMember(sportsmanTn1);
        p7.addMember(sportsmanTn2);
        p7.addMember(sportsmanTn3);
        p7.addMember(sportsmanTn4);
        p7.addMember(sportsmanTn5);

        Player p8=new Player("Srilanka");
        p8.addMember(sportsmanTsr1);
        p8.addMember(sportsmanTsr2);
        p8.addMember(sportsmanTn3);
        p8.addMember(sportsmanTsr4);
        p8.addMember(sportsmanTsr5);

        Scanner sc = new Scanner(System.in);
        int num1, num2,num3 = 0;
        char ch, ch1 = 0;
        do {

            System.out.println("Enter any key to Start: ");
            ch = sc.next().charAt(0);

            try
            {
                System.out.println();

                System.out.print("Loading ");

                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.println();
            }
            catch(Exception EE) {
            }


            System.out.println("a) WORLD CUP TROPHY\t\t\tb) T20 TROPHY\t\t\tc) CHAMPIONSHIP TROPHY");
            System.out.println("Enter(a-c) to find trophy details: ");
            ch1 = sc.next().charAt(0);
            int counter = 1;
            switch (ch1) {//worldcup
                case 'a':
                    tournament1.displayTrophies();
                    for (int i = 1975; i <= 2019; i += 4)
                        System.out.println(counter++ + ")" + i);
                    System.out.println("Enter a year (1-13): ");
                    num1 = sc.nextInt();

                    if (num1 >= 1 || num1 <= 13) {

                        switch (num1) {
                            case 1:
                                trophy4.display1();
                                sportsman1.winTrophy(trophy1);
                                p1.displayMembers();
                                break;
                            case 2:
                                trophy4.display2();
                                sportsman2.winTrophy(trophy2);
                                p1.displayMembers();
                                break;
                            case 3:
                                trophy4.display3();
                                sportsman3.winTrophy(trophy3);
                                p3.displayMembers();
                                break;
                            case 4:
                                trophy4.display4();
                                sportsman4.winTrophy(trophy1);
                                p2.displayMembers();
                                break;
                            case 5:
                                trophy4.display5();
                                sportsman5.winTrophy(trophy1);
                                p4.displayMembers();
                                break;
                            case 6:
                                trophy4.display6();
                                sportsman6.winTrophy(trophy2);
                                p8.displayMembers();
                                break;
                            case 7:
                                trophy4.display7();
                                sportsman7.winTrophy(trophy3);
                                p2.displayMembers();
                                break;
                            case 8:
                                trophy4.display8();
                                sportsman8.winTrophy(trophy1);
                                p2.displayMembers();
                                break;
                            case 9:
                                trophy4.display9();
                                sportsman9.winTrophy(trophy2);
                                p2.displayMembers();
                                break;
                            case 10:
                                trophy4.display10();
                                sportsman10.winTrophy(trophy3);
                                p3.displayMembers();
                                break;
                            case 11:
                                trophy4.display11();
                                sportsman11.winTrophy(trophy2);
                                p2.displayMembers();
                                break;
                            case 12:
                                trophy4.display12();
                                sportsman12.winTrophy(trophy1);
                                p5.displayMembers();
                                break;
                            default:
                                System.out.println("Not available: ");

                        }//end of inner switch
                    }// end of if statement
                    break;
                case 'b'://T20
                    tournament2.displayTrophies();
                    System.out.println("1) 2007");
                    System.out.println("2) 2009");
                    System.out.println("3) 2010");
                    System.out.println("4) 2012");
                    System.out.println("5) 2014");
                    System.out.println("6) 2016");
                    System.out.println("7) 2021");
                    System.out.println("8) 2022");

                    System.out.println("Enter a year (1-8): ");
                    num2 = sc.nextInt();

                    switch (num2) {
                        case 1:
                            t2.display1();
                            sportsmant1.winTrophy(trophy1);
                            p3.displayMembers();
                            break;
                        case 2:
                            t2.display2();
                            sportsmant2.winTrophy(trophy2);
                            p4.displayMembers();
                            break;
                        case 3:
                            t2.display3();
                            sportsmant3.winTrophy(trophy3);
                            p5.displayMembers();
                            break;
                        case 4:
                            t2.display4();
                            sportsmant4.winTrophy(trophy1);
                            p1.displayMembers();
                            break;
                        case 5:
                            t2.display5();
                            sportsmant5.winTrophy(trophy2);
                            p8.displayMembers();
                            break;
                        case 6:
                            t2.display6();
                            sportsmant6.winTrophy(trophy3);
                            p1.displayMembers();
                            break;
                        case 7:
                            t2.display7();
                            sportsmant7.winTrophy(trophy1);
                            p7.displayMembers();
                            break;
                        case 8:
                            t2.display8();
                            sportsmant8.winTrophy(trophy2);
                            p5.displayMembers();
                            break;
                        default: {
                            System.out.println("Not available: ");
                        }

                    }//end of inner 1 switch
                    break;
                case 'c':
                    tournament3.displayTrophies();
                    System.out.println("1) 1998");
                    System.out.println("2) 2000");
                    System.out.println("3) 2002");
                    System.out.println("4) 2004");
                    System.out.println("5) 2006");
                    System.out.println("6) 2009");
                    System.out.println("7) 2013");
                    System.out.println("8) 2017");

                    System.out.println("Enter a year (1-8): ");
                    num3 = sc.nextInt();

                    switch (num3) { //switch for Champions trophy
                        case 1:
                            ct.display1();
                            cst1.winTrophy(trophy1);
                            p6.displayMembers();
                            break;
                        case 2:
                            ct.display2();
                            cst2.winTrophy(trophy2);
                            p7.displayMembers();
                            break;
                        case 3:
                            ct.display3();
                            cst3.winTrophy(trophy3);
                            p8.displayMembers();
                            break;
                        case 4:
                            ct.display4();
                            cst4.winTrophy(trophy1);
                            p1.displayMembers();
                            break;
                        case 5:
                            t2.display5();
                            sportsmant5.winTrophy(trophy2);
                            p2.displayMembers();
                            break;
                        case 6:
                            ct.display6();
                            cst6.winTrophy(trophy3);
                            p1.displayMembers();
                            break;
                        case 7:
                            ct.display7();
                            cst7.winTrophy(trophy1);
                            p3.displayMembers();
                            break;
                        case 8:
                            ct.display8();
                            cst8.winTrophy(trophy2);
                            p4.displayMembers();
                            break;
                        default: {
                            System.out.println("Not available");
                        }
                    }break;//end of inner 2 switch

            }//end of outter loop

            System.out.println("Do you want to continue? (y/n): ");
            ch = sc.next().charAt(0);
        }//end of do loop
        while (ch == 'y' || ch == 'Y');

        System.out.println("Goodbye!");

    }//end of psvm
}//end of main



package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {


    //todo Task 1 - fertig
    public void largestNumber(){

        Scanner scanner=new Scanner(System.in);
        System.out.print("Number 1: ");
        double eingabe= scanner.nextDouble();

        int zaehler=1;
        double zahl=eingabe;

        if(eingabe<=0 && zaehler==1){
            System.out.println("No number entered.");
        }else {
            while (eingabe > 0) {
                zaehler++;
                System.out.print("Number " + zaehler + ": ");
                eingabe = scanner.nextDouble();

                if (eingabe > zahl)
                    zahl = eingabe;
            }
            System.out.print("The largest number is ");
            System.out.printf("%,.2f", zahl);
            //code zu Formatieren gefunden am 03.10.22 auf https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/Format-double-Java-printf-example#:~:text=Just%20use%20%25.,double%20to%20two%20decimal%20places.
            System.out.println();
        }
    }

    //todo Task 2 - fertig
    public void stairs(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("n: ");
        int n= scanner.nextInt();
        int i, j, zahl=1;

        if(n<0) {
            System.out.println("Invalid number!");
        }

        for (i=1; i <= n; i = i+ 1) {
            for (j=1; j<=i;j++) {
                System.out.print(zahl+" ");
                zahl = zahl + 1;
            }
            System.out.println();
        }
    }

    //todo Task 3 - fertig
    public void printPyramid(){

        int i=6, j, k;
        for (j=1; j<=i; j++){
            for (k=i; k>j; k--){
                System.out.print(" ");
            }
            for (k=1; k<j*2; k=k+1){
                System.out.print("*");
            }
                System.out.println();
        }
    }

    //todo Task 4 - fertig
    public void printRhombus(){

        Scanner scanner=new Scanner(System.in);
        System.out.print("h: ");
        int h= scanner.nextInt();
        System.out.print("c: ");
        char c= scanner.next().charAt(0);

        if (h%2==0){
            System.out.println("Invalid number!");
            return;
        }

        int i, j, k, z;

        for (j=1; j<=h/2+1; j++){
            for (k=h/2+1; k>j; k--){
                System.out.print(" ");
            }
            for (z=j; z>0; z--) {
                        char b = (char) (c - z+1);
                        System.out.print(b);
            }
            for (i=1; i<j; i++) {
                char b = (char) (c - i);
                System.out.print(b);
            }
            System.out.println();
        }

        for ( j=h/2; j>=1; j--){
            for (k=h/2; k>=j; k--){
                System.out.print(" ");
            }
                 for (z=j; z>0; z--) {
                    char b = (char) (c - z+1);
                    System.out.print(b);
                }
                for (i=1; i<j; i++) {
                    char b = (char) (c - i);
                    System.out.print(b);
                }
            System.out.println();
        }
    }

    //todo Task 5 - fertig
    public void marks() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Mark 1: ");
        int note = scanner.nextInt();

        int zaehler = 1, fuenfer=0;
        double sum = 0, av=0;

        while (note != 0) {
            zaehler++;
            sum = sum + note;
            if(note==5) {
                fuenfer++;
            }
            if (note > 5 || note < 0) {
                System.out.println("Invalid mark!");
                sum = sum - note;
                zaehler--;
            }
            System.out.print("Mark " + zaehler + ": ");
            note = scanner.nextInt();
            }

        if(sum!=0){
            av=sum/(zaehler-1);
        }
        System.out.print("Average: ");
        System.out.printf("%,.2f", av);
        System.out.println();
        System.out.println("Negative marks: "+fuenfer);
    }

    //todo Task 6 - fertig
    public void happyNumbers(){

        Scanner scanner=new Scanner(System.in);
        System.out.print("n: ");
        int n= scanner.nextInt();
        int sum=0, sum1=0;

        if (n<=0){
            return;
        }

        while (sum1 != 4 && sum1 != 1) {

            while(n>0) {
                int n0 = n % 10;
                n = n / 10;
                sum = sum + n0*n0;
            }

            sum1=sum;
            n=sum;
            sum=0;
        }

        if(sum1==1){
            System.out.println("Happy number!");
        }else if(sum1==4){
            System.out.println("Sad number!");
        }else{
            System.out.println("kruziwuzi schon wieder verrechnet");
        }
    }


    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber(); //fertig

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs(); //fertig

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid(); //fertig

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks(); //fertig

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers(); //fertig

    }
}
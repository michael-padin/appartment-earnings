import java.util.Objects;
import java.util.Scanner;

public class Main {

    static void Record(int cost) {
        String [] months = {"","january", "february", "march", "April", "May", "June", "Juy", "August", "September", "October", "November", "December"};
        int startedMonth, endMonth;
        String record= "";
        int i;
        int paid = 0;
        int unpaid = 0;
        double unpaidInterest = 0;
        int earnings = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("\n\nEnter started month in numeric: ");
        startedMonth = scan.nextInt();
        System.out.println("Enter End month in numeric: ");
        endMonth = scan.nextInt();
        scan.nextLine();
        System.out.println("\nSo you started renting at " + months[startedMonth] + " and the end of the month should be " + months[endMonth] + "\n\n");

        System.out.println("\ntype paid if your paid in that month then unpaid if not\n\n");
        for (i = startedMonth; i <= endMonth; i++) {
            System.out.println("Enter record in " + months[i] + ": ");
            record = scan.nextLine();
            if (Objects.equals(record, "paid")) {
                earnings += cost;
            } else if (Objects.equals(record, "unpaid")) {
                unpaid += cost;
                unpaidInterest += cost * .20;
            }
        }

        System.out.println("earnings: " + earnings);
        System.out.println("unpaid: " + unpaid);
        System.out.println("Unpaid Interest: " + unpaidInterest);

    }


    public static void main (String[] args) {
        int apartment, cost;

        System.out.println("\n[1.] Adlaw \t [2.] Buwan \t [3.] Dagat:\n\n");
        System.out.println("Choose an apartment: ");
        Scanner scan = new Scanner(System.in);
        apartment = scan.nextInt();
        switch(apartment){
            case 1:
                cost = 1000;
                System.out.println("\nYou chose Adlaw apartment, This apartment cost" + cost + " enter the month were you start \nrenting and the end of the month");
                Record(cost);
                break;
            case 2:
                cost = 800;
                System.out.println("\nYou chose Buwan apartment, This apartment cost " +  cost + ". Now enter the month were you start \nrenting and the end of the month in numeric type\n");
                Record(cost);
                break;
            case 3:
                cost = 500;
                System.out.println("\nYou chose Dagat apartment, This apartment cost " +  cost + ". Now enter the month were you start \nrenting and the end of the month in numeric type\\n");
                Record(cost);
                break;
            default:
                System.out.println("Closed");
                break;
        }
    }
}

/*
import java.util.Scanner;

public class hanne {
    public static void main(String[] args) {

        int Adlaw = 1000; int Buwan = 800; int Dagat = 500;

        Scanner rent = new Scanner(System.in);

        System.out.println("Enter Tenant Name:");
        String name = rent.nextLine();

        System.out.println("Enter Month Started:");
        String startMonth = rent.nextLine();
        System.out.println("Enter Month End:");
        String endMonth = rent.nextLine();

        do{
            System.out.println("Choose Apartment:");
            System.out.println("[1]Adlaw \n[2]Buwan \n[3]Dagat");
            int choices = 0;
            int rentPrice =0;

            if(choices == 1)
                rentPrice=1000;
            else if(choices == 2)
                rentPrice=800;
            else rentPrice=500;

        }while
    }
}*/

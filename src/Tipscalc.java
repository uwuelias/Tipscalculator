import java.util.Scanner;
public class Tipscalc {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the total bill.");
        double bill=scan.nextDouble();
        System.out.println("Please enter the percentage you want to tip.");
        int tip=scan.nextInt();
        System.out.println("Please enter the number of people you want to spilt the bill amongst.");
        int people=scan.nextInt();
        double tipperperson=(bill*(tip/100)/people);
        double totalperperson=(tipperperson+bill)/people;
        System.out.println("Bill: "+bill);
        System.out.println("Tip: "+tip+"%");
        System.out.println("Number of people: "+people);
        System.out.println("Tip per person: $"+tipperperson);
        System.out.println("Total per person: $"+totalperperson);
    }
}

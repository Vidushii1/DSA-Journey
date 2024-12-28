import java.util.Scanner;
class Exercise2{

    // Q.1) Printing sum,product,difference and quotient of 2 numbers given by the user.
    // public static int sum(int a, int b){
    //     return a+b;
    // }
    // public static int difference(int a, int b){
    //     return a-b;
    // }
    // public static int product(int a, int b){
    //     return a*b;
    // }
    // public static double quotient(int a, int b){
    //     return (double)a/b;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter number a: ");
    //     int a = sc.nextInt();
    //     System.out.println("Enter number b: ");
    //     int b = sc.nextInt();

    //     System.out.println("Sum: " + sum(a, b));
    //     System.out.println("Difference: " + difference(a, b));
    //     System.out.println("Product: " + product(a, b));
    //     System.out.println("Quotient: " + quotient(a, b));
    // }


    // Q.2) Calculating Gross pay of the employee when the hours worked and hourly wages are given by the user.
    // public static double GrossPay(double hours, double hourlyWage){
    //     return hours*hourlyWage;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the number of hours worked by the Employee: ");
    //     double hours = sc.nextInt();
    //     System.out.println("Enter the number of hourly wages given to the Employee: ");
    //     double hourlyWage = sc.nextInt();

    //     System.out.println("Gross Pay of the Employee: " + GrossPay(hours, hourlyWage));
    // }


    // Q.3) Check whether the given number by the user is armstrong number or not.
    // public static void ArmstrongNum(int number){
    //     int sum = 0;
    //     int originalNum = number;
    //     int order = String.valueOf(number).length();

    //     while(number>0){
    //         int digit = number % 10;
    //         sum += Math.pow(digit, order);
    //         number = number / 10;

    //     }

    //     if(sum==originalNum){
    //         System.out.println(originalNum + " " +"is an armstrong number!" );
    //     }
    //     else{
    //         System.out.println(originalNum + " " + "is not an Armstrong number!");
    //     }

    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the number to check if it's Armstrong number or not: ");
    //     int number = sc.nextInt();
    //     ArmstrongNum(number);

    // }

    
    // Q.4) WAP to generate fibnocci series for a given number of terms.
    public static void Fibnocci(int n){
        int a = 0;
        int b = 1;

        System.out.println("Fibnocci series of " + " " + n + " " + "terms is: ");

        for(int i = 0; i<n ; i++){
            System.out.print(a + " ");
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the fibnocci series: ");
        int n = sc.nextInt();

        Fibnocci(n);
    }
}
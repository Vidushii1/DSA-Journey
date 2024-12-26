import java.util.*;
class Main {

    // Q.1
    // public static int Avg(int a, int b){
    //     int c = a+b/2;
    //     return c;
    // }
    // public static void main(String[] args) {
    //     // System.out.println("Try programiz.pro");
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter number a: ");
    //     int a = sc.nextInt();
    //     System.out.println("Enter number b: ");
    //     int b = sc.nextInt();
        
    //     System.out.println("Average of numbers a and b is: " + Avg(a,b));
    // }


    // Q.2
    // public static int Oddsum(int n){
    //     int i=1;
    //     int sum = 0;
    //     while(i<=n){
    //         if(i%2!=0){
    //             sum = sum + i;
    //         }
    //         i++;
    //     }
    //     return sum;

    // }
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the number upto which you want the sum of odd numbers:");
    //     int n = sc.nextInt();
    //     System.out.println("Sum of odd numbers: " + Oddsum(n));
    // }


    // Q.3
    // public static int GreaterNum(int a, int b){
    //     if(a>b){
    //         return a;
    //     }
    //     else{
    //         return b;
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc  = new Scanner(System.in);
    //     System.out.println("Enter no. a:");
    //     int a = sc.nextInt();
    //     System.out.println("Enter no. b:");
    //     int b = sc.nextInt();
    //     System.out.print("Largest no. :" + GreaterNum(a,b));

    // }


    // Q.4
    // public static double CircumferenceOfCircle(int r){
    //     double pi = 3.14;

    //     double circumference = 2 * pi * r;
    //     return circumference;

    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the radius: ");
    //     int r = sc.nextInt();

    //     System.out.println("Circumference of circle is: " + CircumferenceOfCircle(r));
    // }


    // Q.5
    // public static String EligibleToVote(int age){

    //     if(age>=18){
    //         return "Eligible to vote";
    //     }
    //     else{
    //         return "Not Eligible to vote";
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the age of the person: ");
    //     int age  = sc.nextInt();

    //     System.out.println(EligibleToVote(age));
    // }


    // Q.6
    // public static void main(String[] args) {
    //     int i=0;
    //     do { 
    //         System.out.println(i);
    //         i++;
    //     } while (i>0);
    // }


    // Q.7
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countPositive = 0;
        int countNeg = 0;
        int countZeros = 0;
        int n;
        System.out.println("Enter the number of inputs user wants to display: ");
        n = sc.nextInt();

        for(int i = 0; i<n; i++){
            // int num = sc.nextInt();
            // System.out.println(int i=0; i<n; i++){
            System.out.println("Enter number " + (i+1) + ":");
            int num = sc.nextInt();

            if(num<0){
                countNeg ++;
            }
            else if(num>0){
                countPositive ++;
            }
            else{
                countZeros ++;
            }
       
        }
        System.out.println(countPositive);
        System.out.println(countNeg);
        System.out.println(countZeros);

        
    }

    // Q.8
    // public static double PowerFunc(double x , int n){
    //     return Math.pow(x,n);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the base: ");
    //     double x = sc.nextDouble();

    //     System.out.println("Enter the power: ");
    //     int n = sc.nextInt();

    //     System.out.println(x + " " + "raised to the power" + " " + n + " " + "is: " + " " +  PowerFunc(x,n));
    // }


    // Q.9
    // public static int GCD(int a, int b){
    //     while(b!=0){
    //         int temp = b;
    //         b = a%b;
    //         a = temp;
    //     }
    //     return a;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a: ");
    //     int a = sc.nextInt();
    //     System.out.println("Enter b: ");
    //     int b = sc.nextInt();

    //     System.out.println("GCD of " + " " + a + " " + "and" + " " + b + " " + "is:" + GCD(a, b));
    // }


    // Q.10
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the number of terms: ");
    //     int n = sc.nextInt();

    //     int a = 0, b=1;

    //     for(int i=1; i<=n; i++){
    //         System.out.print(a + " ");
    //         int nextTerm = a + b;
    //         a = b; 
    //         b = nextTerm;
    //     }
    // }

}
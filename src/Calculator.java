import java.util.Scanner;
public class Calculator {
    //addition function
    public static double addition(double n,double m){
        return n+m;
    }
    // soustruction function
   public static double soustruction (double n,double m){
        if(n-m<0){
            System.out.println("warning! the result is negative");
           return n-m;
        }
        return n-m;
   }
    // miltiplication function
    public static double multiplication(double n,double m){
        return n*m;
    }
   // division function
    public static double division(double n,double m){
        if(m==0){
            System.out.println("division impossible");

        }
        return n/m;
    }
    // pow function
    public static double pow(double n,double m){
return Math.pow(n,m);
    }
    // racine carre
    public static double racine(double n){
        if(n<0){
            System.out.println("operation impossible");
        }
        return Math.sqrt(n);
    }
    // factorielle function
    public static long fact(int n){
     if(n<0){
         System.out.println("operation impossible");
     }
     long fact=1;
     for(int i=1;i<=n;i++){
         fact *=i;
     }
     return fact;

    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        double num1, num2, result=0;
        int a =0 ;
        //loop for the menu
        while(true) {
            System.out.println("=====MENU OF CALCULATOR ====");
            System.out.println("======1-Addition============");
            System.out.println("======2-Soustruction========");
            System.out.println("======3-Division============");
            System.out.println("=====4-Racine==============");
            System.out.println("======5-Multiplication======");
            System.out.println("======6-Pow=================");
            System.out.println("======7-Fact================");
            System.out.println("======8-Quit================");
            System.out.println("======By:MaryamElOuadaa=====");
            System.out.println("===    ====EnaaBm===========");
            System.out.println(": enter your choice :");
            choice = scanner.nextInt();
            if (choice == 8) {
                System.out.println("=========by_by_(^-^)=======");
                break;
            }

            switch (choice) {

                case 1://addition
                    System.out.print("enter the first number : ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    num2 = scanner.nextDouble();
                    result = addition(num1, num2);
                    System.out.println("Result : " + result);
                    break;
                case 2: // soustruction
                    System.out.print("enter the first number : ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    num2 = scanner.nextDouble();
                    result = soustruction(num1, num2);
                    System.out.println("Result : " + result);
                    break;
                case 3://division
                    System.out.print("enter the first number : ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    num2 = scanner.nextDouble();
                    result = division(num1, num2);
                    System.out.println("Result : " + result);
                    break;
                case 4: // racine
                    System.out.print("enter the  number : ");
                    num1 = scanner.nextDouble();
                    result = racine(num1);
                    System.out.println("Result : " + result);
                    break;
                case 5: //multiplication
                    System.out.print("enter the first number : ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    num2 = scanner.nextDouble();
                    result = multiplication(num1, num2);
                    System.out.println("Result : " + result);
                    break;
                case 6: //  pow
                    System.out.print("enter the first number : ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    num2 = scanner.nextDouble();
                    result = pow(num1, num2);
                    System.out.println("Result : " + result);
                    break;
                case 7://fact
                    System.out.print("enter the  number : ");
                    num1 = scanner.nextInt();
                    result = fact(a);
                    System.out.println("Result : " + result);
                    break;
                default:
                    System.out.println("Ops choice invalid!!");
            }
        }
        scanner.close();
    }

}

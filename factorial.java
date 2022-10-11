import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
         //n! = n*(n-1)*(n-2)*...*1
         try (Scanner sc = new Scanner(System.in)){
             System.out.println("Enter number you need factorial for");
             int i = sc.nextInt();
             int fact = 1;
            for (int j = 1;j<=i;j++){
                 fact *=j;
                 //it is multiplying j to the factorial at each increment
             }

             System.out.println("The factorial of "+i+" is "+fact);
         }
    }
}

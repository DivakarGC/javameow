import java.util.Scanner;

public class primeno {
    //Program to check if user input number is a prime number or not
    public static void main(String[] args){
         try (Scanner sc = new Scanner(System.in)){
         System.out.println("Enter the number to check prime");
         int i = sc.nextInt();
         //The above lines are for taking an user input (i) through the scanner
         
         boolean isPrime = true;
         //In the line, we are taking a boolen variable and setting it to true for later checking
         for(int j=2;j<i;j++){
            if(i%j==0){
                isPrime = false;
                break;
                //Here we will set isPrime to false if we get some other number that can divide the number
            }
         }
         //printing the number if isPrime value is 1 (true)
         if(isPrime){
             System.out.println(i+" is a prime number");
         }
         //printing not prime number statement is isPrime value is 0 (false)
         if(!isPrime){
             System.out.println(i+" is not a prime number");
         }
        }
    }
}
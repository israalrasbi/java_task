//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
          This is the solution for Task 1
         */
        int sum = 0;
        for(int i=0; i<=50; i++){
            if(i%2 == 0){
                sum += i;
            }
        }
        System.out.println("Task 1:");
        System.out.println("The sum of even numbers: "+sum);
        System.out.println();


        /*
        This is the solution for Task 2
         */
        System.out.println("Task 2:");
        //create a scanner object to take the input from the user
        Scanner sc = new Scanner(System.in);
        //take input from user
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        //print the multiplication table based on the user input
        System.out.println("The multiplication table of " + number);
        for(int i=1 ;i<=10; i++){
            System.out.println(number*i);
        }

        /*
        This is the solution for Task 3
         */
        System.out.println();
        System.out.println("Task 3:");
        //take the user input
        System.out.print("Enter number: ");
        int number2 = sc.nextInt();
        //define variables
        int i = 1; //this is the counter
        int factorial = 1; //this is to save the result of the factorial
        while(i<=number2){
            factorial = factorial * i;
            i++;
        }
        System.out.println("The factorial of " + number2+" is "+factorial);

        /*
        This is the solution for Task 4
         */
        //print
        System.out.println();
        System.out.println("Task 4:");
        int[] arr = {2,3,6,4,1,9,0};
        //assume the max is the first number
        int max = arr[0];
        //loop through the array
        for(int j=1; j< arr.length; j++ ){
            //check if the current number is bigger than the max
            //if yes, assign the new max>
            if(arr[j]>max){
                max = arr[j];
            }
        }
        System.out.println("The max number is "+max);

        /*
        This is the solution for Task 5
         */
        System.out.println();
        System.out.println("Task 5:");
        String str = "the cat in the hat";
        int count = 0; //create a variable to count the number of vowels
        //convert the string into char, then loop through the char
        for (char c: str.toCharArray()) {
            //check for each vowel, if there is a match then increment the count
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
                default:
                    break;
            }}
        System.out.println("The count of vowels is "+count);
    }
}
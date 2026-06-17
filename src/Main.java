import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;
public class Main{
    public static void main(String[] args){
        // getting out put
        System.out.println("Hello World");
        // getting user input
        // create a scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hey there "+ name + " I love you soo much.");
        // Variables
        // Variables method Type identifier = new Type(Variable);
        // creating variables and printing out virables
        String Name = new String("Hillary");
        System.out.println(Name);
        // datatypes
        // primitive datatypes; all the rest except the string datatype
        // string datatype is an object datatype so it can be instatiated
        // declaring variables and initialisation of variables
        int x = 5;
        System.out.println(x);
        // input for integers
        System.out.println("Please enter Your Age.");
        int age = scanner.nextInt();
        System.out.println("Your are "+ age + " years old.");
        // input for doubles
        System.out.println("What is your Salary?");
        double Salary = scanner.nextDouble();
        System.out.println("Your Salary is "+ Salary);
        // type casting
        String a = "400";
        Integer aa  = Integer.valueOf(a); // object
        System.out.println(aa + 600);
        int b = Integer.parseInt(a); // primitive int datatype
        System.out.println(b + 300);

        // for doubles
        String aaa = "500";
        Double c = Double.valueOf(aaa); // object double datatype
        System.out.println(c + 300);

        double cc = Double.parseDouble(aaa);
        System.out.println(aaa + 550);
        // String class
        // creating strings
        String movie = "Spiderman";
        // printing strings
        System.out.println(movie);
        // to get a character at a certain index
        System.out.println(movie.charAt(0));
        // concatenating strings
        System.out.println(movie + " Homecoming");
        // new line
        System.out.println("Giraffe\nAcademy");
        // length of a string
        double length =  movie.length();
        System.out.println("The length of the string movie is "+ length);
        System.out.println(movie.charAt(3));
        // checking if a string contains something
        System.out.println(movie.contains("Spidey"));
        // changing cases of strings
        String zoo = "Giraffe Academy";
        // to upper case
        System.out.println(zoo.toUpperCase());
        // to lower case
        System.out.println(zoo.toLowerCase());
        // removing spaces from a string
        System.out.println(zoo.strip());
        // comparing contents of strings
        String ZOO = "GiraffeAcademy";
        System.out.println(zoo.equals(ZOO));
        // conditional statements
        // if statements
        // checking gender and height
        boolean is_male = false;
        boolean is_tall = false;
        if (is_male && is_tall){
            System.out.println("You are a tall male");
        }
        else if(!is_male && is_tall){
            System.out.println("You are a tall female");
        }
        else if(is_male && !is_tall){
            System.out.println("You are a short male");

        }

        else{
            System.out.println("You are a short female");
        }
        int Age = 32;
        if (Age == 18 || Age > 18){
            System.out.println("You are an adult");
        }

        // switch statements
        int temp = 100;
        switch(temp){
            case 20:
                System.out.println("Warm");
                break;
            case 10:
                System.out.println("Cold");
                break;
            case 30:
                System.out.println("Hot");
                break;
            default:
                System.out.println("Temperature not listed");
                break;
        }
        // conditional statements; loops
        // while loops
        int i = 0;
        while (i<= 10){
            System.out.println(i);
            i++;
        }
        // for loop
        for(int k = 10; k >= 0; k--){
            System.out.println(k);
        }

        // do while loops
        // guessing a phone password
        String passcode = "Sharif@1998";
        String guess;
        Scanner Guess = new Scanner(System.in);
        do{
            System.out.println("What is the Passcode for the phone?");
            guess = Guess.nextLine();
        } while(passcode.equals(guess) != true);

        System.out.println("Successful login");

        // arrays
        // creating arrays
        // first method
        String[] friends = {"Jacob", "Fred","Lugard", "Kelly" };
        // second method
        String[] Friends = new String[5]; // this array has a length of 5
        // adding elements to this array
        // using a loop
        Scanner item = new Scanner(System.in);
        int  Length = Friends.length;
        int j =0;
        while (j< Length){
            System.out.println("What is the new item of the string?");
            String new_item = item.nextLine();
            Friends[j] = new_item;
            j++;

        }
        System.out.println(Arrays.toString(Friends));
        // printing it out using a loop (a foreach loop to be specific)
        for(String words : Friends){
            System.out.println(words);
        }
        // 2d arrays
        // creating 2d arrays; They are in a way rows by columns
        // first method
        int[][] numbers = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        // printing out this 2D array
        System.out.println(Arrays.deepToString(numbers));
        // printing them out using nested loops
        int rows;
        int columns;
        for(rows = 0; rows < numbers.length; rows++){
            for (columns = 0; columns < numbers[rows].length; columns++){
                 System.out.println(numbers[rows][columns] );
            }
        }
        System.out.println("Printing Successful");


    }
}
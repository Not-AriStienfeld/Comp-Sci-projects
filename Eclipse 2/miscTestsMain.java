//Project Name: Misc Tests
//Project Description: random tests for vscode  
//Date: 02-23-2021
//Written By: Ari Steinfeld


import java.util.Scanner;


public class miscTestsMain {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
       /*
        System.out.println("Please enter your address");
        String adress = s.nextLine();

        System.out.println(adress);

        String streetAdress = adress.substring(0, adress.indexOf(','));
        System.out.println(streetAdress);
        
        String city = adress.substring((adress.indexOf(',') +2), adress.indexOf(',') +4);
        System.out.println(city);

        String[] streetSplit = streetAdress.split(" ");
        String num = streetSplit[0];
        System.out.println(num);
        String street = streetSplit[1];
        System.out.println(street);
        String rd = streetSplit[2];
        System.out.println(rd);
        */
     


        System.out.println("Please enter your name in a format like: FirstName LastName; mm/dd/yyyy");
        String nameAndDOB = s.nextLine();
        String firstName = nameAndDOB.substring(0, 1+ nameAndDOB.indexOf(' '));
        String lastName = nameAndDOB.substring(nameAndDOB.indexOf(' '), nameAndDOB.indexOf(';'));
        String[] splitArray = nameAndDOB.split(";");
        String name = splitArray[0];
        String dateOfBirth = splitArray[1];
        int age  = 2021 - Integer.parseInt(dateOfBirth.substring(1 + dateOfBirth.lastIndexOf("/")));
        
        System.out.println("First Name: " + firstName + "\nLast Name: " + lastName + "\nFull Name: " + name + "\nDate of birth: " + dateOfBirth + "\nAge: " + age);

    }
}

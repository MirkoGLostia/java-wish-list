package org.exercise.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWhishList {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        // array and variables
        List<Presents> presentsList = new ArrayList<>();
        boolean exit = false;
        String person;
        String description;


        do {
            System.out.println("to who are you sending this?");
            person = userinput.nextLine();

            System.out.println("what is it?");
            description = userinput.nextLine();

            presentsList.add(new Presents(person, description));
            System.out.print("elements in list: ");
            System.out.println(presentsList.size());


            System.out.println("do you want to add another present to the list? (y/n)");
            String exitCode = userinput.nextLine();

            if (exitCode.equals("n")){
                exit = true;
            }
        }while (!exit);

        System.out.println(presentsList);


        userinput.close();
    }
}

package org.exercise.java.christmas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWhishList {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        // array and variables
        String person;
        String description;
        List<Presents> presentsList = new ArrayList<>();
        boolean exit = false;

        System.out.println("This is your list:");
        readAFile();

        System.out.println();
        System.out.println();


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


        writeFile(presentsList);

        System.out.println("***********************");

        readAFile();


        userinput.close();
    }

    private static void writeFile(List arg) {

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("./text-archive/whishList", true);
            for (int i = 0; i < arg.size(); i++) {
                fileWriter.write(String.valueOf(arg.get(i)));
                fileWriter.write("\n");
            }

        } catch (IOException e) {
            System.out.println("Unable to write file");
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void readAFile() {
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(new File("./text-archive/whishList"));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
    }
}

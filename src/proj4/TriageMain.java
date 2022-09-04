/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author rafiu
 */
public class TriageMain {

    public static void main(String[] args) throws FileNotFoundException {

        TriageSimulator TriageSimulator = new TriageSimulator();

        try {
            File file = new File("hospital.txt");
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {

                String fileData = reader.nextLine();

                TriageSimulator.add(fileData);

            }

            reader.close();

            TriageSimulator.fileList();
        } catch (FileNotFoundException e) {
            System.out.println("File not found in the system.");
        }
        while (!TriageSimulator.isEmpty()) {

            Scanner scan = new Scanner(System.in);
            System.out.println();
            System.out.println("Check in and check out in on high priority basis?");
            System.out.println("Do you want to check-out a patient from the queue?(yes/no)");

            String input = scan.nextLine();

            System.out.println();

            if (input.equalsIgnoreCase("yes")) {
                TriageSimulator.remove();
                TriageSimulator.fileList();

            } else if (input.equalsIgnoreCase("no")) {
                System.exit(0);
            }
        }

    }

}

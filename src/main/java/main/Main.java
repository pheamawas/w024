package main;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        demoScanner();
    }

    private static void demoScanner() {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            boolean hee = true;
            while (hee == true) {
                System.out.print("Enter: ");
                Scanner sc = new Scanner(System.in);
                bw.write(sc.next());
                System.out.println("Done Writing?: ");
                String hee1 = sc.next();
                if (hee1.equals("y")) hee = false;
                else if (hee1.equals("n")) {
                    bw.newLine();
                }
                else System.out.println("Invalid Input");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader br = new BufferedReader(new FileReader("output.txt"))) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

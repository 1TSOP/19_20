package ru.mirea;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Generate generate= new Generate();
        generate.beatifulplates();
        Scanner scanner= new Scanner(System.in);
//        String plate;
//        plate= scanner.nextLine();
        generate.search("Х666ВС197");
    }
}

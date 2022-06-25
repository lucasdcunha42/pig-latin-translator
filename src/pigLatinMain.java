import java.util.Scanner;
import java.lang.String;
import java.util.*;

public class pigLatinMain
    {
        public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
            String frase = input.nextLine();
            ArrayList<String> fraseArray = new ArrayList<>(Arrays.asList(frase.split(" ")));
            System.out.println(fraseArray);
        }
    }

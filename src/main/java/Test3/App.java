package Test3;

import com.google.common.io.Resources;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;


public class App {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(Resources.getResource("text.txt").getPath()));
        scan.useDelimiter(Pattern.compile(","));
        StringBuilder stringBuilder = new StringBuilder();
        if (scan.hasNext()) {
            stringBuilder.append(scan.next());
        }
        System.out.println("Text: " + stringBuilder);
        scan.close();
    }
}

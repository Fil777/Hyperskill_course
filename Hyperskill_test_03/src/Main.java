import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)  {
        String inData1 = "95\n96\n97\n90\n100\n";
        String inData2 = "102\n";
        System.setIn(new ByteArrayInputStream(inData1.getBytes(StandardCharsets.UTF_8)));
        Scanner scanner = new Scanner(System.in);

        int maxTemperature = 0; // Initialize maximum temperature observed

        // Add your while loop or do-while loop here to process input temperatures
        int temp;
        while (scanner.hasNextInt()) {
            //temp = Integer.parseInt(new StringBuilder(scanner.nextLine()).toString());
            temp = scanner.nextInt();
            if (temp >= 100) break;
            if (temp > maxTemperature) maxTemperature = temp;
        }

        // After exiting the loop, print the highest temperature
        System.out.println(maxTemperature);

        scanner.close(); // Close the scanner



    }
}



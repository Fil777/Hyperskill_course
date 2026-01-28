import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String inData1 = "234 8\n465 453 981 463 1235 871 475 981";
        String inData2 = "211 5\n871 205 123 871 1681";
        System.setIn(new ByteArrayInputStream(inData2.getBytes(StandardCharsets.UTF_8)));
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextLine()) return;
        int[] busDataArray = Arrays.stream(new StringBuilder(scanner.nextLine()).toString().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        if (!scanner.hasNextLine()) return;
        int[] bridgesHeightArray = Arrays.stream(new StringBuilder(scanner.nextLine()).toString().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        //Arrays.stream(busDataArray).forEach(System.out::println);
        System.out.println(Arrays.toString(busDataArray));
        //Arrays.stream(bridgesHeightArray).forEach(System.out::println);
        System.out.println(Arrays.toString(bridgesHeightArray));

        int crashBridge = 0;
        for(int i=0; i < busDataArray[1]; i++) {
            if (busDataArray[0] >= bridgesHeightArray[i]) {
                crashBridge = i+1;
                break;
            }
        }
        if (crashBridge > 0) {
            System.out.println("Will crash on bridge " + crashBridge);
        } else {
            System.out.println("Will not crash");
        }
    }
}

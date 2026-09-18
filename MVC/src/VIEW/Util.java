package VIEW;

import java.util.Scanner;

public class Util {
    public static String getString( Scanner scanner){
        return scanner.nextLine();
    }

    public static int getInt( Scanner scanner){
        return Integer.parseInt(scanner.nextLine());
    }

    public static Double getDouble( Scanner scanner){
        return Double.parseDouble(scanner.nextLine());
    }
}
 
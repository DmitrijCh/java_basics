import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
            System.out.println("Укажите путь до папки:");
            Scanner scanner = new Scanner(System.in);
            String path = scanner.nextLine();
            if(path.equals("STOP")){
                break;
            }
            try{
                long directorySize = FileUtils.calculateFolderSize(path);
                System.out.println(result(directorySize));
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }

    public static String result(long directorySize) {
        String[] memoryUnits = {"байт.", "Кб.", "Мб.", "Гб."};
        DecimalFormat decimalFormat = new DecimalFormat("###.####");
        for (int i = memoryUnits.length - 1; i >= 0; i--) {
            double convertedResult = directorySize / Math.pow(2, i * 10);
            if ((long) convertedResult > 0) {
                return "Размер папки составляет " + decimalFormat.format(convertedResult) + " " + memoryUnits[i];
            }
        }
        return "0";

    }
}

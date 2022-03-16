import java.util.Arrays;

public class Hospital {
    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] patientsTemperature = new float[patientsCount];
        for (int i = 0; i < patientsCount; i++) {
            patientsTemperature[i] =
                    Math.round(((float) (Math.random() * 8) + 32) * 100) / (float) 100.0;
        }
        return patientsTemperature;
    }

    public static String getReport(float[] temperatureData) {
        int count = 0;
        float sum = 0f;
        for (float temperatureDatum : temperatureData) {
            if (temperatureDatum >= 36.2 && temperatureDatum <= 36.9) {
                count++;
            }
            sum += temperatureDatum;
        }
        float avg = sum / temperatureData.length;
        return String.format(
                "Температуры пациентов: " +
                        "%s\nСредняя температура:" +
                        " %.2f\nКоличество здоровых: %d",
                Arrays.toString(temperatureData), avg, count);
    }
}
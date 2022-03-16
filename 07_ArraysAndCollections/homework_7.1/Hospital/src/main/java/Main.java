public class Main {
    public static void main(String[] args) {
        Hospital temperatures = new Hospital();
        float[] patientsTemperatures = temperatures.generatePatientsTemperatures(10);
        System.out.println(temperatures.getReport(patientsTemperatures));
    }
}
public class GeometryCalculator {
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {
        double area = radius * radius * Math.PI;
        System.out.println("Площадь круга с радиусом " + radius + " = " + area);
        return 0;
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {
        double volume = (4 * Math.PI * Math.pow(radius, 3)) / 3;
        System.out.println("Объем шара = " + volume);
        return 0;
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        {
            return a < b + c && b < a + c && c < a + b;
        }
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        if (isTrianglePossible(a, b, c)) {
            System.out.println("Можно построить треугольник");
            double p = (a + b + c) / 2;
            double p1 = (p - a);
            double p2 = (p - b);
            double p3 = (p - c);
            double pp = p * p1 * p2 * p3;
            double m = Math.sqrt(pp);
            System.out.println("Площадь треугольника = " + m);
            return m;
        }
        System.out.println("Не возможно построить треугольник");
        return 0;
    }
}

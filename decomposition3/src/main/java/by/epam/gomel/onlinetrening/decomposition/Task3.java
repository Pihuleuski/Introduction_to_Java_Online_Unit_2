package by.epam.gomel.onlinetrening.decomposition;

/*
Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
 */
public class Task3 {
    public static void main(String[] args) {
        double side = 10.0;
        System.out.println(areaOfHexagon(side));
    }

    public static double areaOfTriangle(double a){
        return Math.sqrt(3)*Math.pow(a, 2)/4;
    }

    public static double areaOfHexagon(double side){
        return areaOfTriangle(side) * 6;
    }
}

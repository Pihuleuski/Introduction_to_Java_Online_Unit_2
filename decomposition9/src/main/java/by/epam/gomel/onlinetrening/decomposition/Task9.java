package by.epam.gomel.onlinetrening.decomposition;

/*
Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой.
 */
public class Task9 {
    double x = 10;
    double y = 10;
    double z = 11;
    double t = 12;
    double d = Math.sqrt(x*x + y*y);

    public static void main(String[] args) {
        Task9 task = new Task9();
        System.out.println(task.calculateSquare());
    }

    public double calculateSquare(){
        return square1() + square2();
    }

    public double square1(){
        return x*y*0.5;
    }

    public double square2(){
        double p = (z + t + d)/2;
        return Math.sqrt(p*(p-z)*(p-t)*(p-d));
    }
}

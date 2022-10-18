/*
public class Solution {

    public static void main(String[] args) {
        System.out.println("Человечество живет в Солнечной системе.");
        System.out.println("Ее возраст около " + SolarSystem.age + " лет.");
        System.out.println("В Солнечной системе " + SolarSystem.planetsCount + " известных планет.");
        System.out.println("Как и большинство звездных систем, состоит из " + SolarSystem.starsCount + " звезды.");
        System.out.println("Звезды по имени " + SolarSystem.starName + ".");
        System.out.println("Расстояние к центру галактики составляет " + SolarSystem.galacticCenterDistance + " световых лет.");
        System.out.println("Каждый обитатель Солнечной системы должен знать эту информацию!");
    }
}
*/
/*
public class Solution {

    public static void main(String[] args) {
        Planet earth = new Planet();
        earth.name = "Земля";
        earth.age = 4_540_000_000L;
        earth.speed = 170_218;
        earth.area = 510_072_000;
        earth.printInformation();
    }
}
*/
/*
public class Solution {
    public static void main(String[] args) {
        System.out.println("Презентация роботов произведенных компанией " + Robot.vendor);

        Robot robot1 = new Robot("RCV-322", 2019);
        robot1.displayInformation();

        Robot robot2 = new Robot("JavaTron-008", 2017);
        robot2.displayInformation();

        Robot robot3 = new Robot("BugDestroyer-007", 1998);
        robot3.displayInformation();

        Robot robot4 = new Robot("Gundam-14", 2004);
        robot4.displayInformation();

        Robot robot5 = new Robot("Eve-2", 2012);
        robot5.displayInformation();
    }
}
 */
/*
public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        double s_double = Double.parseDouble(string);
        long s_double_round = Math.round(s_double);
        System.out.println(s_double_round);
    }
}
*/
/*
public class Solution {
    public static void main(String[] args) {
        Window window = new Window();
        window.printSize();
        window.changeSize(4, 5);
        window.printSize();
    }
}
*/
/*
public class Solution {
    public static final String EQUAL = " = ";

    public static void main(String[] args) {
        int a = 45;
        int b = 15;
        Calculator.add(a, b);
        Calculator.subtract(a, b);
        Calculator.multiply(a, b);
        Calculator.divide(a, b);
    }

    static class Calculator {
        public static void add(int a, int b) {
            System.out.println(a + " + " + b + EQUAL + (a + b));
        }

        public static void subtract(int a, int b) {
            System.out.println(a + " - " + b + EQUAL + (a - b));
        }

        public static void multiply(int a, int b) {
            System.out.println(a + " * " + b + EQUAL + (a * b));
        }

        public static void divide(int a, int b) {
            System.out.println(a + " / " + b + EQUAL + (a / b));
        }
    }

}
*/
public class Solution {
    public static void main(String[] args) {
        Outer.Inner x = new Outer().new Inner();
        Outer.Nested y = new Outer.Nested();
    }
}

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GradeRegister register = new GradeRegister();


        register.addGradeBasedOnPoints(16);
        register.addGradeBasedOnPoints(8);
        register.addGradeBasedOnPoints(-3);
        register.addGradeBasedOnPoints(62);
        register.addGradeBasedOnPoints(99);
        register.addGradeBasedOnPoints(101);
        register.addGradeBasedOnPoints(64);
        System.out.println(register.averageOfPoints());
        
        
        GradeRegister regi = new GradeRegister();

        regi.addGradeBasedOnPoints(82);
        regi.addGradeBasedOnPoints(83);
        regi.addGradeBasedOnPoints(96);
        regi.addGradeBasedOnPoints(51);
        regi.addGradeBasedOnPoints(48);
        regi.addGradeBasedOnPoints(56);
        regi.addGradeBasedOnPoints(61);

        System.out.println(regi.averageOfPoints());
    }
}

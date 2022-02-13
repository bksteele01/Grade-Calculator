import java.util.*;
class gradecalc{
        public static void main(String[] args){
                Scanner answers = new Scanner(System.in);
                System.out.println("enter your CPSC 284 quiz grade: ");
                double quizgrade1 = answers.nextDouble();
                System.out.println("enter your CPSC 284 exam grade: ");
                double examgrade1 = answers.nextDouble();
                System.out.println("enter your CPSC 284 lab grade: ");
                double labgrade1 = answers.nextDouble();
                CPSC284 myclass = new CPSC284(quizgrade1, examgrade1, labgrade1, 100);
                System.out.println();
                System.out.println("CPSC 284 grade is:");
                System.out.println(myclass.printGrade());


                System.out.println();
                System.out.println("enter your CPSC 240 project grade: ");
                double projectgrade2 = answers.nextDouble();
                System.out.println("enter your CPSC 240 lab grade: ");
                double labgrade2 = answers.nextDouble();
                System.out.println("enter your CPSC 240 quiz grade: ");
                double quizgrade2 = answers.nextDouble();
                System.out.println("enter your CPSC 240 writing grade: ");
                double writinggrade2 = answers.nextDouble();
                CPSC240 myclass2 = new CPSC240(projectgrade2, labgrade2, quizgrade2, writinggrade2);
                System.out.println();
                System.out.println("CPSC 240 grade is:");
                System.out.println(myclass2.printGrade());


                System.out.println();
                System.out.println("enter your CPSC 225 quiz grade: ");
                double quizgrade3 = answers.nextDouble();
                System.out.println("enter your CPSC 225 homework grade: ");
                double hwgrade3 = answers.nextDouble();
                System.out.println("enter your CPSC225 final exam grade: ");
                double finalgrade3 = answers.nextDouble();
                CPSC225 myclass3 = new CPSC225(quizgrade3, hwgrade3, finalgrade3);
                System.out.println();
                System.out.println("CPSC 225 grade is:");
                System.out.println(myclass3.printGrade());


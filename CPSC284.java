
public class CPSC284{
        double quizgrade;
        double examgrade;
        double labgrade;
        double attendance;
        CPSC284(double quiz, double exam, double lab, double attend){
                quizgrade = quiz * .30;
                examgrade = exam * .30;
                labgrade = lab * .30;
                attendance = attend * .1;
        }
        public double printGrade(){
                double total  = quizgrade + examgrade + labgrade + attendance;
                return total;
        }
}


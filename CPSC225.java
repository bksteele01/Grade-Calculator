public class CPSC225{
        double quizgrade;
        double hwgrade;
        double finalexamgrade;
        public CPSC225(double quiz, double hw, double finalexam){
                quizgrade = quiz *.3;
                hwgrade = hw *.5;
                finalexamgrade = finalexam *.2;
        }
        public double printGrade(){
                double total = quizgrade + hwgrade + finalexamgrade;
                return total;
        }
}


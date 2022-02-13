public class CPSC240{
        double projects;
        double labs;
        double quizzes;
        double reflectivewriting;
        public CPSC240(double projectgrade, double labgrade, double quizgrade, double writegrade){
                projects = projectgrade * .5;
                labs = labgrade * .2;
                quizzes = quizgrade * .15;
                reflectivewriting = writegrade * .15;
        }
        public double printGrade(){
                double total = projects + labs + quizzes + reflectivewriting;
                return total;
        }
}


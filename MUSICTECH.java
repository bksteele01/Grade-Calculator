public class MUSICTECH{
        double participationgrade;
        double quizzesgrade;
        double projectsgrade;
        double finalexamgrade;
        public MUSICTECH(double part, double quiz, double projects, double finall){
                participationgrade = part * .1;
                quizzesgrade = quiz * .2;
                projectsgrade = projects * .5;
                finalexamgrade = finall * .2;
        }
        public double printGrade(){
                double total = participationgrade + quizzesgrade + projectsgrade + finalexamgrade;
                return total;
        }
}


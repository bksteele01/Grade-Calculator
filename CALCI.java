public class CALCI{
        double onlinegrade;
        double dailygrade;
        double weeklygrade;
        double masterygrade;
        public CALCI(double online, double daily, double weekly, double mastery){
                onlinegrade = online * .125;
                dailygrade = daily * .1;
                weeklygrade = weekly*.125;
                masterygrade = mastery*.65;
        }
        public double printGrade(){
                double total = onlinegrade + dailygrade + weeklygrade + masterygrade;
                return total;
        }
}


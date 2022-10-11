public class Chickens02 {
    public static void main(String[] args) {
        //Put your code here
        int eggs=0;
        int monday=100;
        int tuesday=121;
        int wednesday=117;
        double dailyAverage;
        double monthlyAverage;
        double monthlyProfit;

        eggs+=monday+tuesday+wednesday;
        dailyAverage=eggs/3.0;
        monthlyAverage=dailyAverage*30.0;

        monthlyProfit=monthlyAverage*0.18;

        System.out.println("Daily Average Egg Yield:   " +dailyAverage);
        System.out.println("Monthly Average Egg Yield: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }

}
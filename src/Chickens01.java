public class Chickens01 {
    public static void main(String[] args) {
        //Put your code here
        int eggsPerChicken=4;
        int chickenCount=8;
        int totalEggs=eggsPerChicken*chickenCount;
        chickenCount++;
        totalEggs+=eggsPerChicken*chickenCount;
        chickenCount/=2;
        totalEggs+=eggsPerChicken*chickenCount;


        System.out.println("Total Eggs: "+totalEggs);
        System.out.println("Total Chickens: "+chickenCount);
    }
}
import java.util.Scanner;

public class Ruin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter staring amount:");
        int startAmount = in.nextInt();
        System.out.print("Enter chance of winning(value between 0 and 1):");
        double winChance = in.nextDouble();
        System.out.print("Enter win limit:");
        int winLimit = in.nextInt();
        System.out.print("Enter # of days to simulate:");
        int totalSimulations = in.nextInt();
        int ruins = 0;

        for (int day = 1; day <= totalSimulations; day++) {
            int money = startAmount;
            int plays = 0;
            while (money < (winLimit) && money > 0) {
                double random = Math.random();
                if (random < winChance) {
                 money++;
              }
                else {
                  money--;
                plays++;
               }
        }

            System.out.println("Day: " + day);
            System.out.println("Plays: " + plays);
            if (money <= 0) {
                System.out.println("Ruined!");
                ruins++;
            }
            else {
                System.out.println("Success!");
            }
            double ruinRate = ruins/totalSimulations;
            System.out.println("Ruin chance:" + ruinRate);
        }
    }
}

public class Main
{
    public static void main(String[] args) {
        double summerSeason = 10000.00;
        double winterSeason = 11000.10;
        double springSeason = 12000.20;
        double fallSeason = 13000.20;
        double totalCost = summerSeason + springSeason + winterSeason + fallSeason;

        System.out.println("The cost of the summer season is: $" + summerSeason);
        System.out.println("The cost of the winter season is: $" + winterSeason);
        System.out.println("The cost of the spring season is: $" + springSeason);
        System.out.println("The cost of the fall season is: $" + fallSeason);

        System.out.println("This brings your yearly maintenance to: $" + totalCost);
    }
}
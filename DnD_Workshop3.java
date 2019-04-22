import java.util.Scanner;

public class DnD_Workshop3{
    public static int diceRoll() {            //Get random values by rolling the dice
        //Roll 4d6 ,diceRoll method
        int dice1 = (int) (Math.random() * 1000 % 6 + 1);
        int dice2 = (int) (Math.random() * 1000 % 6 + 1);
        int dice3 = (int) (Math.random() * 1000 % 6 + 1);
        int dice4 = (int) (Math.random() * 1000 % 6 + 1);
        // Find lowest dice and add result of the other 3
        int tot;
        if ((dice1 < dice2) && (dice1 < dice3) && (dice1 < dice4))
            tot = dice2 + dice3 + dice4;
        else if ((dice2 < dice1) && (dice2 < dice3) && (dice2 < dice4))
            tot = dice1 + dice3 + dice4;
        else if ((dice3 < dice1) && (dice3 < dice2) && (dice3 < dice4))
            tot = dice1 + dice2 + dice4;
        else
            tot = dice1 + dice2 + dice3;

        return tot;
    }

    //Creating a method for all the user input data    //method for calculating bonus
    public static void Bonus(int stat, String name) {
        int bonus;
        if (stat > 10 && stat != 11) {    //checking the input is above 10,not equal to 11
            bonus = (stat - 10) / 2;  //cumulative +1
            System.out.println(name + ":" + "[" + stat + "]" + "[" + "+" + bonus + "]");
        } else if (stat == 10 || stat == 11) {
            bonus = 0;
            System.out.println(name + ":" + "[" + stat + "]" + "[" + bonus + "]");
        } else if (stat < 10) {
            bonus = -((10 - stat) + 1) / 2;
            System.out.println(name + ":" + "[" + stat + "]" + "[" + bonus + "]");
        }
    }


    //main method
    public static void main(String[] args) {
        int bonusCon = 0;
        char choice;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the Level:");
        int level = input.nextInt();
        while (level <= 0 || level > 20) {
            System.out.println("Invalid Input! Please enter valid data");//error message for invalid data
            System.out.print("Enter integer for Level:"); //Level
            level = input.nextInt();
        }


        do {                              //calling diceroll method
            int str = diceRoll();
            int dex = diceRoll();
            int con = diceRoll();
            int _int = diceRoll();
            int wis = diceRoll();
            int cha = diceRoll();


            System.out.println("Level:" + "[" + level + "]"); //displaying level
            //calling bonus method
            Bonus(str, "Str");
            Bonus(dex, "Dex");
            Bonus(con, "Con");
            Bonus(_int, "Int");
            Bonus(wis, "Wis");
            Bonus(cha, "Cha");

            // calculating Hitpoints as 1d6+[Con Bonus] per level
            int hp = (6+ bonusCon) * level;
            System.out.println("HP:" + "[" + hp + "]");

            //the option to accept or re-roll their stats
            System.out.println("Type r if you want to re-roll or any other Character if you " +
                    "want to Accept: ");
            choice = input.next().charAt(0);
        } while (choice == 'r'||choice=='R');

    }
}



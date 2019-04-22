import java.util.Scanner;
public class DnD_Workshop2{

        public static void main(String[] args) {
           //declaring variables
        int bonusStr, bonusDex, bonusCon, bonusInt, bonusWis, bonusCha;
        bonusCon=0;
        char choice;
        int str,dex,con,_int,wis,cha;
        int dice1,dice2,dice3;
        int totStr,totDex,totCon,totInt,totWis,totCha;

            Scanner input = new Scanner(System.in);
            System.out.print("Please enter the Level:");
            int level = input.nextInt();
                 while(level<=0||level>20){
                 System.out.println("Invalid Input! Please enter valid data");//error message for invalid data
                 System.out.print("Enter integer for Level:"); // getting Level again
                 level = input.nextInt();//storing value of level
                 }
                 System.out.println("Level:" + "[" + level + "]");


        do {                                                 //Get random values by rolling the dice
            dice1=(int) ((Math.random() * 1000 % 6 + 1));   //Roll 3d6
            dice2=(int) ((Math.random() * 1000 % 6 + 1));
            dice3=(int) ((Math.random() * 1000 % 6 + 1));
            totStr=dice1+dice2+dice3;                    //Get the total for stats
            str=totStr;

            dice1=(int) ((Math.random() * 1000 % 6 + 1));
            dice2=(int) ((Math.random() * 1000 % 6 + 1));
            dice3=(int) ((Math.random() * 1000 % 6 + 1));
            totDex=dice1+dice2+dice3;
            dex=totDex;

            dice1=(int) ((Math.random() * 1000 % 6 + 1));
            dice2=(int) ((Math.random() * 1000 % 6 + 1));
            dice3=(int) ((Math.random() * 1000 % 6 + 1));
            totCon=dice1+dice2+dice3;
            con=totCon;

            dice1=(int) ((Math.random() * 1000 % 6 + 1));
            dice2=(int) ((Math.random() * 1000 % 6 + 1));
            dice3=(int) ((Math.random() * 1000 % 6 + 1));
            totInt=dice1+dice2+dice3;
            _int=totInt;

            dice1=(int) ((Math.random() * 1000 % 6 + 1));
            dice2=(int) ((Math.random() * 1000 % 6 + 1));
            dice3=(int) ((Math.random() * 1000 % 6 + 1));
            totWis=dice1+dice2+dice3;
            wis=totWis;

            dice1=(int) ((Math.random() * 1000 % 6 + 1));
            dice2=(int) ((Math.random() * 1000 % 6 + 1));
            dice3=(int) ((Math.random() * 1000 % 6 + 1));
            totCha=dice1+dice2+dice3;
            cha=totCha;

           //calculating bonus
            if (str > 10 && str != 11) {    //checking the input is above 10,not equal to 11
                bonusStr = (str - 10) / 2;  //cumulative +1
                System.out.println("Str:" + "[" + str + "]" + "[" + "+" + bonusStr + "]");
            } else if (str == 10 || str == 11) {
                    bonusStr = 0;
                    System.out.println("Str:" + "[" + str + "]" + "[" + bonusStr + "]");
                } else {
                        bonusStr = -((10 - str) + 1) / 2;
                        System.out.println("Str:" + "[" + str + "]" + "[" + bonusStr + "]");
                  }



            if (dex > 10 && dex != 11) {
                bonusDex = (dex - 10) / 2;
                System.out.println("Dex:" + "[" + dex + "]" + "[" + "+" + bonusDex + "]");
            } else if (dex == 10 || dex == 11) {
                    bonusDex = 0;
                    System.out.println("Dex:" + "[" + dex + "]" + "[" + bonusDex + "]");
                } else {

                        bonusDex = -((10 - dex) + 1) / 2;
                        System.out.println("Dex:" + "[" + dex + "]" + "[" + bonusDex + "]");
                    }


            if (con > 10 && con != 11) {
                bonusCon = (con - 10) / 2;
                System.out.println("Con:" + "[" + con + "]" + "[" + "+" + bonusCon + "]");
            } else if (con == 10 || con == 11) {
                    bonusCon = 0;
                    System.out.println("Con:" + "[" + con + "]" + "[" + bonusCon + "]");
                } else {

                        bonusCon = -((10 - con) + 1) / 2;
                        System.out.println("Con:" + "[" + con + "]" + "[" + bonusCon + "]");
                    }

            if (_int > 10 && _int != 11) {
                bonusInt = (_int - 10) / 2;
                System.out.println("Int:" + "[" + _int + "]" + "[" + "+" + bonusInt + "]");
            } else if (_int == 10 || _int == 11) {
                    bonusInt = 0;
                    System.out.println("Int:" + "[" + _int + "]" + "[" + bonusInt + "]");
                } else {
                        bonusInt = -((10 - _int) + 1) / 2;
                        System.out.println("Int:" + "[" + _int + "]" + "[" + bonusInt + "]");
                    }

            if (wis > 10 && wis != 11) {
                bonusWis = (wis - 10) / 2;
                System.out.println("Wis:" + "[" + wis + "]" + "[" + "+" + bonusWis + "]");
            } else if (wis == 10 || wis == 11) {
                    bonusWis = 0;
                    System.out.println("Wis:" + "[" + wis + "]" + "[" + bonusWis + "]");
                } else {
                        bonusWis = -((10 - wis) + 1) / 2;
                        System.out.println("Wis:" + "[" + wis + "]" + "[" + bonusWis + "]");
                    }

            if (cha > 10 && cha != 11) {
                bonusCha = (cha - 10) / 2;
                System.out.println("Cha:" + "[" + cha + "]" + "[" + "+" + bonusCha + "]");
            } else if (cha == 10 || cha == 11) {
                    bonusCha = 0;
                    System.out.println("Cha:" + "[" + cha + "]" + "[" + bonusCha + "]");
                } else {
                        bonusCha = -((10 - cha) + 1) / 2;
                        System.out.println("Cha:" + "[" + cha + "]" + "[" + bonusCha + "]");
                    }

            // calculating Hitpoints as 1d6+[Con Bonus] per level
            int hp=(6 +bonusCon)*level;
            System.out.println("HP:" + "[" + hp + "]");

                    //the option to accept or re-roll their stats
            System.out.println("Type r if you want to re-roll or " +
                    "any other Character if you want to Accept: ");
            choice =input.next().charAt(0);
        } while (choice=='r'||choice=='R');

    }
}




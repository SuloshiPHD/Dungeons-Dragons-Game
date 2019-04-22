import java.util.Scanner; //import the java.util package
public class DnD {
    public static void main(String[] args) {
        //declaring the variables
        int str, dex, con, _int, wis, cha, level;
        double hp;
        int bonusStr, bonusDex, bonusCon, bonusInt, bonusWis, bonusCha;

        //Calling the inbuilt Scanner for Reading input Data and Declaring its value
        Scanner input = new Scanner(System.in); //Getting inputs from the User,keyboard
        System.out.println("Enter integer for Level:");
        level = input.nextInt();           //store inputs
        
        while(level<=0){
            System.out.println("Invalid Input! Please enter valid data" +
                    "\nEnter integer for Level:");//error message for invalid data
            level = input.nextInt();
        }

        System.out.println("Enter integer for Str:"); //Strength
        str = input.nextInt();
         while(str<0){
             System.out.println("Invalid Input! Please enter valid data" +
                     "\nEnter integer for Str:");//error message for invalid data
             str = input.nextInt();
             
         }
        System.out.println("Enter integer for Dex:"); //Dexterity
        dex = input.nextInt();
        while(dex<0) {
            System.out.println("Invalid Input! Please enter valid data" +
                    "\nEnter integer for Dex:");//error message for invalid data
            dex = input.nextInt();
        }

        System.out.println("Enter integer for Con:"); //Constitution
        con = input.nextInt();
        while(con<0){
            System.out.println("Invalid Input! Please enter valid data" +
                    "\nEnter integer for Con:");//error message for invalid data
            con = input.nextInt();
         }
        
        System.out.println("Enter integer for Int:"); //Intelligence
        _int = input.nextInt();
        while(_int<0) {
            System.out.println("Invalid Input! Please enter valid data" +
                    "\nEnter integer for Int:");//error message for invalid data
            _int = input.nextInt();
        }

        System.out.println("Enter integer for Wis:"); //Wisdom
        wis = input.nextInt();
        while(wis<0) {
            System.out.println("Invalid Input! Please enter valid data" +
                    "\nEnter integer for Wis:");//error message for invalid data
            wis = input.nextInt();
        }
        
        System.out.println("Enter integer for Cha:"); //Charisma
        cha = input.nextInt();
        while(cha<0){
            System.out.println("Invalid Input! Please enter valid data" +
                    "\nEnter integer for Cha:");//error message for invalid data
            cha = input.nextInt();
        }
        
                 System.out.println("Level:" + "[" + level + "]");


        // calculating bonus
        if (str > 10 && str != 11) {    //checking the input is above 10,not equal to 11
            bonusStr = (str - 10) / 2;  //cumulative +1
            System.out.println("Str:" + "[" + str + "]" + "[" + "+" + bonusStr + "]");
        } else if (str == 10 || str== 11) {
                bonusStr = 0;
                System.out.println("Str:" + "[" + str + "]" + "[" + bonusStr + "]");
            } else {
            bonusStr = -((10 - str) + 1) / 2;
            System.out.println("Str:" + "[" + str + "]" + "[" + bonusStr + "]");
        }



            if (dex > 10 && dex != 11) {
                bonusDex = (dex - 10) / 2;
                System.out.println("Dex:" + "[" + dex + "]" + "[" + "+" + bonusDex + "]");
            } else if (dex == 10 || dex== 11) {
                    bonusDex = 0;
                    System.out.println("Dex:" + "[" + dex + "]" + "[" + bonusDex + "]");
                } else {
                bonusDex = -((10 - dex) + 1) / 2;
                System.out.println("Dex:" + "[" + dex + "]" + "[" + bonusDex + "]");
            }



        if (con> 10 && con != 11) {
            bonusCon = (con - 10) / 2;
            System.out.println("Con:" + "[" + con + "]" + "[" + "+" + bonusCon + "]");
        } else if (con == 10 || con== 11) {
                bonusCon = 0;
                System.out.println("Con:" + "[" + con + "]" + "[" + bonusCon + "]");
            } else {
            bonusCon = -((10 - con) + 1) / 2;
            System.out.println("Con:" + "[" + con + "]" + "[" + bonusCon + "]");
        }



        if (_int> 10 && _int != 11) {
            bonusInt = (_int - 10) / 2;
            System.out.println("Int:" + "[" + _int + "]" + "[" + "+" + bonusInt + "]");
        } else if (_int == 10 || _int== 11) {
                bonusInt = 0;
                System.out.println("Int:" + "[" + _int + "]" + "[" + bonusInt + "]");
            } else {
                bonusInt = -((10 - _int) + 1) / 2;
                System.out.println("Int:" + "[" + _int + "]" + "[" + bonusInt + "]");
            }



        if (wis> 10 && wis != 11) {
            bonusWis = (wis - 10) / 2;
            System.out.println("Wis:" + "[" + wis + "]" + "[" + "+" + bonusWis + "]");
        } else if (wis == 10 || wis== 11) {
                bonusWis = 0;
                System.out.println("Wis:" + "[" + wis + "]" + "[" + bonusWis + "]");
            } else {
                bonusWis = -((10 - wis) + 1) / 2;
                System.out.println("Wis:" + "[" + wis + "]" + "[" + bonusWis + "]");
            }



        if (cha> 10 && cha != 11) {
            bonusCha = (cha - 10) / 2;
            System.out.println("Cha:" + "[" + cha + "]" + "[" + "+" + bonusCha + "]");
        } else if (cha == 10 || cha== 11) {
                bonusCha = 0;
                System.out.println("Cha:" + "[" + cha + "]" + "[" + bonusCha + "]");
            } else {
            bonusCha = -((10 - cha) + 1) / 2;
            System.out.println("Cha:" + "[" + cha + "]" + "[" + bonusCha + "]");
        }

        //Calculating the HitPoints using the given formular
        hp =(level * (Math.random() * 1000 % 6 + 1));
        System.out.println("HP:" + "[" + hp + "]");


    }
}





import java.util.Objects;
import java.util.Scanner;

public class Character {

    Scanner sc = new Scanner(System.in);
                                              //instance variables
    private int level;
    String characterClass;       //Hitpoints and bonus are derive attributes.They are not in the class
    private int str;               //with private only can access with in the class
    private int dex;              //accessor- get,mutator-set
    private int con;
    private int _int;
    private int wis;
    private int cha;
    private int hitDice;

    public double HP;
    public int bonusStr;
    public int bonusCon;
    public int bonusInt;

    private int bAB;
    private int combatBonus;
    private int damageBonus;
    private int skillPoints;


    public Character() {
        super();

        this.level = level;
        this.characterClass = characterClass;
        this.str = str;
        this.dex = dex;
        this.con = con;
        this._int = _int;
        this.wis = wis;
        this.cha = cha;
        this.hitDice = hitDice;
        this.bAB = bAB;
        this.combatBonus = combatBonus;
        this.damageBonus = damageBonus;
        this.skillPoints = skillPoints;

    }


    // method to prompt Level
    public void promptLevel() {
        System.out.print("Please enter the Level:");
        this.level = sc.nextInt();
        while ((level <= 0) || (level > 20)) {
            //error message for invalid data
            System.out.println("Invalid Input! Please enter valid data");
            System.out.println("Enter integer for Level"); //Level
            this.level = sc.nextInt();
        }
    }

    public void promptCharacterClass() {
                System.out.println("Choose a character:\n 1.Barbarian\n 2.Bard\n" +
                        " 3.Cleric\n 4.Druid\n 5.Fighter\n" +
                " 6.Monk\n 7.Paladin\n 8.Ranger\n 9.Rogue\n 10.Sorcerer\n 11.Warlock\n 12.Wizard");
          System.out.println("Please enter Character name (String name) to select a character:");
          this.characterClass = sc.next();

    }

    // Method to Enter the attributes directly
    public int attributesDirect(String attribute) {
        System.out.println("Enter integer for " + attribute);
        int valAttribute = sc.nextInt();
        while (valAttribute < 0) {
            System.out.println("Invalid Input! Please enter valid data" +
                    "\nEnter integer for "+attribute);//error message for invalid data
            valAttribute = sc.nextInt();
        }
        return valAttribute;
    }
    // Method to Roll 4d6 and discard the lowest value

    public int roll4D6Type1(String attributes) {

        int timesOfRolling = 4;
        int total = 0;
        int fullTotal = 0;
        int[] roll = new int[timesOfRolling];
        for (int i = 0; i < timesOfRolling; i++) {
            roll[i] = (int) (Math.random() * 1000 % 6 + 1);
            fullTotal += roll[i];
        }
        int min = roll[0];
        for (int i = 0; i < timesOfRolling; i++) {
            if (roll[i] < min)
                min = roll[i];
        }
        total = fullTotal - min;
        return total;
    }

    //Roll 4d6 and discard the lowest value and if the attribute is 16 or higher,
    // add the value of an additional 1d6
    public int roll4D6Type2() {
        int valTot = 0;
        int valTotS = roll4D6Type1("Str");
        if (valTotS >= 16) {
            valTot = valTotS + ((int) (Math.random() * 1000 % 6 + 1));
        }
        int valTotD = roll4D6Type1("Dex");
        if (valTotD >= 16) {
            valTot = valTotD + ((int) (Math.random() * 1000 % 6 + 1));
        }
        int valTotCo = roll4D6Type1("Con");
        if (valTotCo >= 16) {
            valTot = valTotCo + ((int) (Math.random() * 1000 % 6 + 1));
        }
        int valTotI = roll4D6Type1("Int");
        if (valTotI >= 16) {
            valTot = valTotI + ((int) (Math.random() * 1000 % 6 + 1));
        }
        int valTotW = roll4D6Type1("Wis ");
        if (valTotW >= 16) {
            valTot = valTotW + ((int) (Math.random() * 1000 % 6 + 1));
        }
        int valTotCh = roll4D6Type1("Cha");
        if (valTotCh >= 16) {
            valTot = valTotCh + ((int) (Math.random() * 1000 % 6 + 1));
        }
        return valTot;
    }

    //	Roll Method IX
    public int mostToLeast(int stat, int rolls) {
        //9d6
        int noOfroll9d6 = rolls;
        int totNod6 = 0;
        int totHighest3 = 0;
        int[] rollNod6 = new int[noOfroll9d6];
        for (int i = 0; i < rollNod6.length; i++) {
            rollNod6[i] = (int) (Math.random() * 1000 % 6 + 1);
            //tot9d6 += roll9d6[i];
            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            int max3 = Integer.MIN_VALUE;

            if (rollNod6[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = rollNod6[i];
            } else if (rollNod6[i] > max2) {                                  // If roll9d6[i] is in between max1 and
                max3 = max2;                                       //   max2 then update second
                max2 = rollNod6[i];
            } else if (rollNod6[i] > max3) {
                max3 = rollNod6[i];
            }
            totHighest3 = max1 + max2 + max3;
        }
        return totHighest3;
    }

    // METHOD TO SELECT AN OPTION FOR GENERATE ATTRIBUTES
    public void selectMethod() {
        System.out.println("Please enter a following number to choose an option :");
        System.out.println("1.Entering the attributes directly.\n" +
                "2.Roll 4d6 and discard the lowest value.\n" +
                "3.Roll 4d6 and discard the lowest value and " +
                "if the attribute is 16 or higher, add the value of an additional 1d6\n" +
                "4. Roll each attribute from most to least important ");
        char selection = sc.next().charAt(0);
        if (selection == '1') {
           str= attributesDirect("Str");
           dex=attributesDirect("Dex");
           con=attributesDirect("Con");
           _int=attributesDirect("Int");
           wis=attributesDirect("Wis");
           cha=  attributesDirect("Cha");

            bonusStr=Bonus(str,"Str");
            Bonus(dex,"Dex");
            bonusCon=Bonus(con,"Con");
            bonusInt=Bonus(_int,"Int");
            Bonus(wis,"Wis");
            Bonus(cha,"Cha");

        } else if (selection == '2') {
            str=roll4D6Type1("Str");
            dex=roll4D6Type1("Dex");
            con=roll4D6Type1("Con");
            _int=roll4D6Type1("Int");
            wis=roll4D6Type1("Wis");
            cha=roll4D6Type1("Cha");

            bonusStr=Bonus(str,"Str");
            Bonus(dex,"Dex");
            bonusCon=Bonus(con,"Con");
            bonusInt=Bonus(_int,"Int");
            Bonus(wis,"Wis");
            Bonus(cha,"Cha");


        } else if (selection == '3') {
            str=roll4D6Type2();
            dex=roll4D6Type2();
            con=roll4D6Type2();
            _int=roll4D6Type2();
            wis=roll4D6Type2();
            cha=roll4D6Type2();

            bonusStr=Bonus(str,"Str");
            Bonus(dex,"Dex");
            bonusCon=Bonus(con,"Con");
            bonusInt=Bonus(_int,"Int");
            Bonus(wis,"Wis");
            Bonus(cha,"Cha");

        } else if (selection == '4') {
            str=mostToLeast(str, 9);
            dex=mostToLeast(dex, 8);
            con=mostToLeast(con, 7);
            _int=mostToLeast(_int, 6);
            wis=mostToLeast(wis, 5);
            cha=mostToLeast(cha, 4);

            bonusStr=Bonus(str,"Str");
            Bonus(dex,"Dex");
            bonusCon=Bonus(con,"Con");
            bonusInt=Bonus(_int,"Int");
            Bonus(wis,"Wis");
            Bonus(cha,"Cha");

        }
    }


    // method to calculate bonus
    public static int Bonus(int stat, String name) {

        int bonus = 0;
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
        return bonus;
    }


     //getter and setter

      public int getLevel() {
        return level;
    }


    public void setLevel(int level) {
        this.level = level;
    }


    public String getCharacterClass() {
        return characterClass;
    }


    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }


    public int getStr() {
        return str;
    }


    public void setStr() {
        this.str = str;
    }


    public int getDex() {
        return dex;
    }


    public void setDex() {
        this.dex = dex;
    }


    public int getCon() {
        return con;
    }


    public void setCon() {
        this.con = con;
    }


    public int get_int() {
        return _int;
    }


    public void set_int() {
        this._int = _int;
    }


    public int getWis() {
        return wis;
    }


    public void setWis() {
        this.wis = wis;
    }


    public int getCha() {
        return cha;
    }


    public void setCha() {
        this.cha = cha;
    }


    public int getHitDice() {
        return hitDice;
    }


    public void setHitDice(int hitDice) {
        this.hitDice = hitDice;
    }


    public double getHP() {
        return HP;
    }


    public void setHP(double hP) {
        HP = hP;
    }


    public int getBonusStr() {
        return bonusStr;
    }


    public void setBonusStr(int bonusStr) {
        this.bonusStr = bonusStr;
    }


    public int getBonusCon() {
        return bonusCon;
    }


    public void setBonusCon(int bonusCon) {
        this.bonusCon = bonusCon;
    }


    public int getBonusInt() {
        return bonusInt;
    }


    public void setBonusInt(int bonusInt) {
        this.bonusInt = bonusInt;
    }


    public int getbAB() {
        return bAB;
    }


    public void setbAB(int bAB) {
        this.bAB = bAB;
    }


    public int getCombatBonus() {
        return combatBonus;
    }


    public void setCombatBonus(int combatBonus) {
        this.combatBonus = combatBonus;
    }


    public int getDamageBonus() {
        return damageBonus;
    }


    public void setDamageBonus(int damageBonus) {
        this.damageBonus = damageBonus;
    }


    public int getSkillPoints() {
        return skillPoints;
    }


    public void setSkillPoints(int skillPoints) {
        this.skillPoints = skillPoints;
    }
    //method to choose hitdice
    public int selectHitDice() {
        if (Objects.equals(characterClass, "Sorcerer") || Objects.equals(characterClass, "Wizard")) {
            this.hitDice = 6;
        } else if (Objects.equals(characterClass, "Bard") || Objects.equals(characterClass, "Cleric") ||
                Objects.equals(characterClass, "Druid") || Objects.equals(characterClass, "Monk") ||
                Objects.equals(characterClass, "Rogue") || Objects.equals(characterClass, "Warlock")) {

            this.hitDice = 8;

        } else if (Objects.equals(characterClass, "Fighter") || Objects.equals(characterClass, "Paladin")
                || Objects.equals(characterClass, "Ranger")) {

            this.hitDice = 10;
        } else if (Objects.equals(characterClass, "Barbarian")) {
            this.hitDice = 12;
        }
        return hitDice;
    }


    //method to calculate hitponts
    public double calculateHP() {
        HP = (bonusCon + hitDice) * level;
        return HP;
    }

    //method to calculate Base Attack Bonus
    public int baseAttackBonus() {
        if (Objects.equals(characterClass, "Barbarian") || Objects.equals(characterClass, "Fighter")
                || Objects.equals(characterClass, "Paladin") || Objects.equals(characterClass, "Ranger")) {
            bAB = level;
        } else if (Objects.equals(characterClass, "Bard") || Objects.equals(characterClass, "Cleric")
                || Objects.equals(characterClass, "Druid") || Objects.equals(characterClass, "Monk")
                || Objects.equals(characterClass, "Rogue") || Objects.equals(characterClass, "Warlock")) {
            bAB = (level * 3) / 4;
        } else if (Objects.equals(characterClass, "Sorcerer") || Objects.equals(characterClass, "Wizard")) {
            bAB = level / 2;
        }
        return bAB;
    }

    //method to calculate combat bonus
    public int combat() {
        combatBonus = bAB + bonusStr;
        return combatBonus;
    }

    //method to calculate damage bonus
    public int damage() {
        damageBonus = bonusStr;
        return damageBonus;
    }

    //method to calculate skill points
    public int calculateSkillPoints() {
        if (this.level > 1 && this.level < 20) {
            if (Objects.equals(characterClass, "Barbarian")) {
                skillPoints = 4 + bonusInt;
            } else if (Objects.equals(characterClass, "Bard")) {
                skillPoints = 6 + bonusInt;
            } else if (Objects.equals(characterClass, "Cleric")) {
                skillPoints = 2 + bonusInt;
            } else if (Objects.equals(characterClass, "Druid")) {
                skillPoints = 4 + bonusInt;
            } else if (Objects.equals(characterClass, "Fighter")) {
                skillPoints = 2 + bonusInt;
            } else if (Objects.equals(characterClass, "Monk")) {
                skillPoints = 4 + bonusInt;
            } else if (Objects.equals(characterClass, "Paladin")) {
                skillPoints = 2 + bonusInt;
            } else if (Objects.equals(characterClass, "Ranger")) {
                skillPoints = 6 + bonusInt;
            } else if (Objects.equals(characterClass, "Rogue")) {
                skillPoints = 8 + bonusInt;
            } else if (Objects.equals(characterClass, "Sorcerer")) {
                skillPoints = 2 + bonusInt;
            } else if (Objects.equals(characterClass, "Warlock")) {
                skillPoints = 4 + bonusInt;
            } else if (Objects.equals(characterClass, "Wizard")) {
                skillPoints = 2 + bonusInt;
            }
        } else if (this.level == 1) {
            if (Objects.equals(characterClass, "Barbarian")) {
                skillPoints = (4 + bonusInt) * 4;
            } else if (Objects.equals(characterClass, "Bard")) {
                skillPoints = (6 + bonusInt) * 4;
            } else if (Objects.equals(characterClass, "Cleric")) {
                skillPoints = (2 + bonusInt) * 4;
            } else if (Objects.equals(characterClass, "Druid")) {
                skillPoints = (4 + bonusInt) * 4;
            } else if (Objects.equals(characterClass, "Fighter")) {
                skillPoints = (2 + bonusInt) * 4;
            } else if (Objects.equals(characterClass, "Monk")) {
                skillPoints = (4 + bonusInt) * 4;
            } else if (Objects.equals(characterClass, "Paladin")) {
                skillPoints = (2 + bonusInt) * 4;
            } else if (Objects.equals(characterClass, "Ranger")) {
                skillPoints = (6 + bonusInt) * 4;
            } else if (Objects.equals(characterClass, "Rogue")) {
                skillPoints = (8 + bonusInt) * 4;
            } else if (Objects.equals(characterClass, "Sorcerer")) {
                skillPoints = (2 + bonusInt) * 4;
            } else if (Objects.equals(characterClass, "Warlock")) {
                skillPoints = (4 + bonusInt) * 4;
            } else if (Objects.equals(characterClass, "Wizard")) {
                skillPoints = (2 + bonusInt) * 4;
            }
        }
        return skillPoints;
    }

    // method to print outputs
    public void printOutput() {
        System.out.println("Character class:" + characterClass);
        System.out.println("Hit dice :"+hitDice);

        double HpValue=calculateHP();
        System.out.println("HP:" + "[" +HpValue+ "]");
        System.out.println("BAB"+"[" +baseAttackBonus()+ "]");
        System.out.println("Combat Bonus"+"[" +combat()+ "]");
        System.out.println("Damage Bonus"+"[" +damage()+ "]");
        System.out.println("Skill Points"+"[" +calculateSkillPoints()+ "]");


    }
}

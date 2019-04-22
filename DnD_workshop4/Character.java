import java.util.Objects;
import java.util.Scanner;
public class Character{

    Scanner sc = new Scanner(System.in);
    private String characterName;       //instance variables
    private int level;
    private String characterClass;       //Hitpoints and bonus are derive attributes.They are not in the class
    private int str;               //with private only can access with in the class
    private int dex;              //accessor- get,mutator-set
    private int con;
    private int _int;
    private int wis;
    private int cha;
    private int hitDice;

    public double HP;
    public int bonusCon;

    public Character(){
        super();
        this.characterName = characterName;
        this.level = level;
        this.characterClass = characterClass;
        this.str =str;
        this.dex =dex;
        this.con =con;
        this._int =_int;
        this.wis =wis;
        this.cha =cha;
        this.hitDice =hitDice;
    }


    // method to prompt Level
    public void inputLevel() {
        System.out.print("Please enter the Level:");
        this.level = sc.nextInt();
        while ((level <= 0) || (level > 20)) {
            //error message for invalid data
            System.out.println("Invalid Input! Please enter valid data");
            System.out.println("Enter integer for Level"); //Level
            this.level = sc.nextInt();
        }
    }
    // method to prompt character class and character name
    public void inputCharactClassAndCharactName() {
        System.out.print("Please enter Character Name:");
        this.characterName = sc.next();
        System.out.println("Please select any characterClass from these:\nBarbarian, " +
                "Bard, Cleric,Druid,Fighter, Monk,Paladin,Ranger,Rogue,Sorcerer,Warlock,Wizard");
        this.characterClass = sc.next();
    }
    //method to calculate hitponts
    public double calculateHP() {
        HP = (bonusCon + hitDice) * level;
        return HP;
    }

    //method for rolling the dice
    public int diceRoll() {
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

        int timesOfRolling = 4;
        int noOfFaces = hitDice;
        int total =0;
        int fullTotal = 0;
        int[] roll = new int[timesOfRolling];
        for (int i=0;i<timesOfRolling;i++){
            roll[i] = (int) (Math.random() * 1000 % noOfFaces + 1);
            fullTotal += roll[i];
        }
        int min= roll[0];
        for (int i=0;i<timesOfRolling;i++){
            if (roll[i]<min)
                min = roll[i];
        }
        total = fullTotal-min;
        return total;
    }



    // method to calculate bonus
    public static int Bonus(int stat, String name) {

        int bonus=0;
        if (stat > 10 && stat != 11) {    //checking the input is above 10,not equal to 11
            bonus = (stat - 10) / 2;  //cumulative +1
            System.out.println(name + ":" + "[" + stat + "]" + "[" + "+" + bonus + "]");
        } else if (stat == 10 || stat == 11) {
            bonus = 0;
            System.out.println(name + ":" + "[" + stat + "]" + "[" + bonus + "]");
        } else if (stat < 10) {
            bonus = -((10 - stat) + 1) / 2;
            System.out.println(name + ":" + "[" + stat + "]" + "[" + bonus + "]");

        } return bonus;
    }

    //getter and setter

    public int getStr() {
        return str;
    }
    public void setStr() {
        this.str = diceRoll();
    }
    public int getDex() {
        return dex;
    }
    public void setDex() {
        this.dex = diceRoll();
    }
    public int getCon() {
        return con;
    }
    public void setCon() {
        this.con = diceRoll();
    }
    public int get_int() {
        return _int;
    }
    public void set_int() {
        this._int = diceRoll();
    }
    public int getWis() {
        return wis;
    }
    public void setWis() {
        this.wis = diceRoll();
    }
    public int getCha() {
        return cha;
    }
    public void setCha() {
        this.cha = diceRoll();
    }

    public int getHitDice() {
        return hitDice;
    }

    // method to print output
    public void printOutput() {

        System.out.println("\n\nCharacter name:" + characterName);
        System.out.println("Character class:" + characterClass);
        System.out.println("Hit dice :"+hitDice);


        Bonus(str,"Str");
        Bonus(dex,"Dex");
        bonusCon=Bonus(con,"Con");
        Bonus(_int,"Int");
        Bonus(wis,"Wis");
        Bonus(cha,"Cha");

        double HpValue=calculateHP();
        System.out.println("HP:" + "[" +HpValue+ "]");


    }
}






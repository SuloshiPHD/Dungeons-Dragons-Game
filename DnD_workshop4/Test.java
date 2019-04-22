import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Character obj1 = new Character();   //constructor

        char choice;
        obj1.inputCharactClassAndCharactName();


        obj1.inputLevel();


        do {

            obj1.diceRoll();
            obj1.setStr();
            obj1.setDex();
            obj1.setCon();
            obj1.set_int();
            obj1.setWis();
            obj1.setCha();


            obj1.printOutput();

            System.out.println("Type r if you want to re-roll or any other Character if you want to Accept: ");
            choice = sc.next().charAt(0);


        } while (choice == 'r');
    }
}




import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

    public class Coursework2DnD {
        public static void main(String[] args) throws IOException {
            char choiceCharacter;
            Scanner sc = new Scanner(System.in);
            char choiceToReroll;
            // calling the character class
             Character charactObj= new Character();
            // calling the Skill class
            Skill skillObj= new Skill();

            // calling the setLevel and prompt methods
            charactObj.promptLevel();
            //prompt for character name
            System.out.print("Please enter Character Name:");
            String characterName = sc.next();

            do {
                charactObj.promptCharacterClass();
                skillObj.characterSkills();

                do {
                    charactObj.selectMethod();
                    //calling set value methods
                    charactObj.setStr();
                    charactObj.setDex();
                    charactObj.setCon();
                    charactObj.set_int();
                    charactObj.setWis();
                    charactObj.setCha();


                    charactObj.selectHitDice();

                    System.out.println("\nCharacter name:" + characterName);
                    //calling the output method
                    charactObj.printOutput();

                    // Asking from the user whether to reroll or not
                    System.out.println("Type r if you want to re-roll or " +
                            "any other Character if you want to Continue: ");
                    choiceToReroll = sc.next().charAt(0);

                } while (choiceToReroll == 'r');


                //writing to the text file
                File file = new File("C:\\Users\\Admin\\IdeaProjects\\CW02\\src\\SkillList");
                FileWriter fw = new FileWriter(file, true);
                PrintWriter pw = new PrintWriter(fw, true);
                pw.println("Acrobatics");
                pw.println("Athletics");
                pw.println("Endurance");
                pw.println("Heal");
                pw.println("Intimidate");
                pw.println("Perception");
                pw.println("Religion");
                pw.println("Stealth");
                pw.println("Streetwise");
                pw.println("Nature");
                pw.println("Dungeoneering");
                pw.println("History");
                pw.println("Insight");
                pw.println("Arcana");
                pw.println("Diplomacy");
                pw.println("Thievery");
                pw.println("Bluff");
                pw.println("Animal_handling");
                pw.println("Sleight_hand");

                //reading the file
                Scanner input = new Scanner(file);
                while (input.hasNext()) {
                    System.out.println(input.next());
                }

                //calling the skill class
                Skill list = new Skill();

                //Allow the user to select another character or quit
                System.out.println("Enter Y to select another character or N to quit");
                choiceCharacter = sc.next().charAt(0);
            }while(choiceCharacter == 'Y' || choiceCharacter=='y');

        }
    }


import javafx.scene.Node;

import java.util.Objects;
import java.util.Scanner;

public class Skill {

    Scanner sc=new Scanner(System.in);
    Character obj= new Character();

    public void characterSkills() {
        if (Objects.equals(obj.characterClass, "Barbarian")) {
            System.out.println("Choose two from Animal Handling, Athletics," +
                    " Intimidation, Nature, Perception, and Survival");
            for(int i=0;i<2;i++){
                String skill=sc.next();
            }

        } else if (Objects.equals(obj.characterClass, "Bard")) {
            System.out.println("Choose any three:");
            for(int i=0;i<3;i++){
                String skill=sc.next();
            }
        } else if (Objects.equals(obj.characterClass, "Cleric")) {
            System.out.println("Choose two from History, Insight, Medicine," +
                    " Persuasion, and Religion");
            for(int i=0;i<2;i++){
                String skill=sc.next();
            }
        } else if (Objects.equals(obj.characterClass, "Druid")) {
            System.out.println("Choose two from Arcana, Animal Handling," +
                    " Insight, Medicine, Nature, Perception, Religion, and Survival");
            for(int i=0;i<2;i++){
                String skill=sc.next();
            }
        } else if (Objects.equals(obj.characterClass, "Fighter")) {
            System.out.println("Choose two skills from Acrobatics, " +
                    "Animal Handling, Athletics, History, Insight, Intimidation, " +
                    "Perception, and Survival");
            for(int i=0;i<2;i++){
                String skill=sc.next();
            }
        } else if (Objects.equals(obj.characterClass, "Monk")) {
            System.out.println("Choose two from Acrobatics, Athletics, History," +
                    " Insight, Religion, and Stealth");
            for(int i=0;i<2;i++){
                String skill=sc.next();
            }
        } else if (Objects.equals(obj.characterClass, "Paladin")) {
            System.out.println("Choose two from Athletics, Insight, Intimidation," +
                    " Medicine, Persuasion, and Religion");
            for(int i=0;i<2;i++){
                String skill=sc.next();
            }
        } else if (Objects.equals(obj.characterClass, "Ranger")) {
            System.out.println("Choose three from Animal Handling, Athletics, Insight, " +
                    "Investigation, Nature, Perception, Stealth, and Survival");
            for(int i=0;i<3;i++){
                String skill=sc.next();
            }
        } else if (Objects.equals(obj.characterClass, "Rogue")) {
            System.out.println("Choose four from Acrobatics, Athletics, Deception, Insight, " +
                    "Intimidation, Investigation, Perception, Performance, Persuasion, " +
                    "Sleight of Hand, and Stealth");
            for(int i=0;i<4;i++){
                String skill=sc.next();
            }
        } else if (Objects.equals(obj.characterClass, "Sorcerer")) {
            System.out.println(" Choose two from Arcana, Deception, Insight, " +
                    "Intimidation, Persuasion, and Religion");
            for(int i=0;i<2;i++){
                String skill=sc.next();
            }
        } else if (Objects.equals(obj.characterClass, "Warlock")) {
            System.out.println("Choose two skills from Arcana, Deception," +
                    " History, Intimidation, Investigation, Nature, and Religion");
            for(int i=0;i<2;i++){
                String skill=sc.next();
            }
        } else if (Objects.equals(obj.characterClass, "Wizard")) {
            System.out.println("Choose two from Arcana, History, Insight, " +
                    "Investigation, Medicine, and Religion");
            for(int i=0;i<2;i++){
                String skill=sc.next();
            }
        }
    }
}

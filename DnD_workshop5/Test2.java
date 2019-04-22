import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test2{
    public static void main(String[] args) throws FileNotFoundException {
        Skill firstSkill=new Skill("Acrobatics","","",5,6,6);
        Skill head=firstSkill;
        Skill secondSkill=new Skill("Athletics","","",6,8,9);

        firstSkill.setNext_Skill(secondSkill);

        Skill thirdSkill=new Skill();
        secondSkill.setNext_Skill(thirdSkill);

        Skill fourthSkill=new Skill();
        thirdSkill.setNext_Skill(fourthSkill);

        Skill fifthSkill=new Skill();
        fourthSkill.setNext_Skill(fifthSkill);

        Skill sixthSkill=new Skill();
        fifthSkill.setNext_Skill(sixthSkill);

        Skill seventhSkill=new Skill();
        sixthSkill.setNext_Skill(seventhSkill);

        Skill eightthSkill=new Skill();
        seventhSkill.setNext_Skill(eightthSkill);

        Skill ninethSkill=new Skill();
        eightthSkill.setNext_Skill(ninethSkill);

        Skill tenthSkill=new Skill();
        ninethSkill.setNext_Skill(tenthSkill);


        Skill current=fifthSkill;
        File file=new File("C:\\Users\\Admin\\IdeaProjects\\Cw1Workshop5\\src\\Skills.txt");
        FileWriter fw=new FileWriter();
        List<String>list=new LinkedList<>();
        String mySkill;
        Scanner sc=new Scanner(new FileInputStream());
        while (sc.hasNext()){
            mySkill=sc.next();
            list.add(mySkill);
        }
        System.out.println(list);


                Charcter obj1 = new Charcter();   //constructer

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






    }
}

# Dungeons-Dragons-Game
Workshop 1: This program by reading 7 variables from the console( from the user) Str, Dex, Con, Int, Wis, Cha and Level. These variables stand for the following words according the game Dungeons and Dragons. Str for Strength, Dex for Dexterity, Con for Constitution, Int for Intelligence and Cha for Charisma. Also we have to prompt for game level from user inclusive these six variables. After reading them print back them and should calculate the bonus for each stat.  This bonus should be cumulative +1 for each every even number above 10, -1 for each every odd number below 10 and 0 at 10. Bonus must display a + before the number if it is positive, a – before it if is negative and no sign if the bonus is 0. Hit points should be calculated by the following formula.
Hit points =Level*(Math. random( )*1000%6+1).

✔✔✔ Pseudo code for the program  

BEGIN

1	Prompt for variables Level and other six variables Str, Dex, Con, Int, Wis, Cha.

2.	Get Level, Str, Dex, Con, Int, Wis, Cha.
3.                DOWHILE (Level<=0)
4.		Display “Invalid Input! Please enter valid level: ”
5.		Get level.
      	       ENDDO
6.	       DOWHILE (variable value<0)
7.		Display “ Invalid Input! Please enter valid data: ”
8.		Get variable 
        	       ENDDO
9.		IF (variable value>10  `AND  variable value!=11) THEN
10.			BonusVariable=(variable value-10)/2
11.		    ELSE IF (variable value==10 OR variable value==11) THEN
12.			        Bonus variable=0
          			   ELSE
13.			    Bonus variable=-((10-variablevalue)+1)/2
               ENDIF 
ENDIF

14.	Calculate Hitpoints=Level*(Math.random ( )*1000%6+1)
15.	Display Level: [Level]
16.	Display variable name: [variable value] [Bonus variable]
17.	Display the Hitpoints value.

	END
	
  This program reads fine seven variables from the console and validates that inputs in a correct manner. Sanity checks the input and terminate if input is invalid. And calculate bonus and hit points accurately. 

Workshop 2: I have to implement this program by reading ONLY the level from the console and the other six variables Str, Dex, Con, Int, Wis, and Cha must be rolled on 3d6. Now we have to use (Math.random()*1000 %6+1) to receive a random number from one to six. The hit dice 3d6 defines a dice which has six faces and the number three indicates the times of rolling or number of dices. These variables stand for the following words according the game Dungeons and Dragons. Str for Strength, Dex for Dexterity, Con for Constitution, Int for Intelligence and Cha for Charisma. Hit points should be computed as (1d6+conbonus) per level. Moreover bonus should be cumulative +1 for each every even number above 10, -1 for each every odd number below 10 and 0 at 10.  We should roll all these stats as one block of six and print them back. And also user should have a selection to accept the result or re-roll their stats again. Once they accepted the result, we have to print them back
This program reads Level from the user roll all these stats as one block of and then display them. Then calculate bonus and hit points accurately. The user has an option to accept or re-roll their stats which I had done by using a do while loop. Once accepted I printed back the result. 

✔✔✔  Pseudo code for the program  
BEGIN

Prompt for Level

Get Level

DOWHILE (Level<=0) OR(Level>20)

    Display “Please Enter a valid Input”
    
    Prompt for Level
    
    Get Level
    
ENDDO

Get random values for each stat by rolling the dice:

dice1 = (int) (Math.random() * 1000 % 6 + 1)

dice2 = (int) (Math.random() * 1000 % 6 + 1)

dice3= (int) (Math.random() * 1000 % 6 + 1)

totVariable=dice1+dice2+dice3

Variable=totVariable

  IF (Variable>10) AND (Variable!=11) THEN
  
      BonusVariable=(Variable-10)/2
      
              ELSE IF  (Variable==10)  OR  (Variable==11) THEN
              
                BonusVariable=0 
                
               ELSE
               
                BonusVariable=-((10-variablevalue)+1)/2
                
ENDIF

             ENDIF
             
Calculate Hitpoints=(6+BonusCon)*level)

Display the outputs as follows:

Level:[Level]

VariableName:[Variable][BonusVariable]

Str:[Str][BonusStr]
Dex:[Dex][BonusDex]
Con:[Con][BonusCon]
Int:[Int][BonusInt]
Wis:[Wis][BonusWis]
Cha:[Cha][BonusCha]

Display the Hitpoints value

Prompt For Choice.

Display “ Type r if you want to re-roll or any other character if you want to accept”

Read Choice.

DOWHILE (Choice==r)

END

Workshop 3: The program should read the level from the console in the same way in previous workshop. Now the variables Str , Dex, Con, Int, Wis, and Cha would be rolled on 4d6 which means a dice which has six faces and the number 4 indicates the times of rolling or number of dices to be rolled. Moreover I have to implement this by dropping the lowest dice. To do that I have to call a function that takes a pointer to a stat variable as an argument. As well Hit points should be calculated as 1d6+[Con Bonus] per level.
Similarly to previous workshop there must be a way to accept or re-roll user’s stats. But the dice roll should be abstracted as a function that accepts a dice type and returns a roll value.
I can get a random number from 1 to 6 using (Math.Random()*1000 %6+1) formula.

✔✔✔  Pseudo code for the program  

BEGIN

Prompt for Level

Get Level

DOWHILE (Level<=0) OR(Level>20)
    Display “Please Enter a valid Input”
    Prompt for Level
    Get Level
ENDDO

Dice roll( ) method

dice1 =  (Math.random() * 1000 % 6 + 1);
 dice2 =  (Math.random() * 1000 % 6 + 1);
 dice3 =  (Math.random() * 1000 % 6 + 1);
 dice4 =  (Math.random() * 1000 % 6 + 1);

IF ((dice1 < dice2) && (dice1 < dice3) && (dice1 < dice4))
 tot = dice2 + dice3 + dice4;
  ELSE IF ((dice2 < dice1) && (dice2 < dice3) && (dice2 < dice4))
   tot = dice1 + dice3 + dice4;
      ELSE IF ((dice3 < dice1) && (dice3 < dice2) && (dice3 < dice4))
       tot = dice1 + dice2 + dice4;
         ELSE 
         tot = dice1 + dice2 + dice3;
       ENDIF
     ENDIF
   ENDIF


Bonus Method( )

  
  IF (stat>10) AND (stat!=11) THEN
      Bonus=(Variable-10)/2
              ELSE IF  (stat==10)  OR  (stat==11) THEN
                Bonus=0 
               ELSE
                Bonus=-((10-stat)+1)/2

ENDIF
ENDIF

Calculate Hitpoints=(6+BonusCon)*level)   

Display the outputs as follows:

Level:[Level]
VariableName:[Variable][BonusVariable]
Str:[Str][BonusStr]
Dex:[Dex][BonusDex]
Con:[Con][BonusCon]
Int:[Int][BonusInt]
Wis:[Wis][BonusWis]
Cha:[Cha][BonusCha]

Display the Hitpoints value

Prompt For Choice.

Display “ Type r if you want to re-roll or any other character if you want to accept”

Read Choice.

DOWHILE (Choice==r)

END

Workshop 4: Create a character class to contain all characters and read from character.level and character.class. Furthermore the six variables also part of the character class. And now hit points should be calculated as Character.Hitdice + Character. [Con Bonus]  per level. Similarly roll all stats as one block using a method which accepts a dice type determined by character class.

✔✔✔  Pseudo code for the program  

BEGIN

inputLevel( ) method

Display “Please enter level”

Get Level

DOWHILE (Level<=0) OR(Level>20)
    Display “Please Enter a valid Input”
    Prompt for Level
    Get Level
ENDDO

inputCharactClassAndCharactName( )  method

Display “Please enter Character name and character class”

Get character name and character class

calculateHp( ) method

HP = (bonusCon + hitDice) * level 

Dice roll( ) method

IF (characterClass==sorcerer) || (characterClass==wizard)) THEN
    hitDice = 6
  ELSEIF (characterClass==bard) || (characterClass==cleric) ||
                (characterClass== druid) || (characterClass==monk) ||
                 (characterClass==rogue) || (characterClass== warlock)) THEN
                   hitDice = 8
       ELSEIF (characterClass==fighter) || (characterClass==paladin)
        	     || (characterClass==ranger)) THEN
                   hitDice = 10
               ELSEIF(characterClass==barbarian)) 
                         hitDice = 12
                       ELSE
                           Display”Invalid Character class”

               ENDIF
     ENDIF
   ENDIF

Set timesOfRolling to 4

noOfFaces = hitDice;

set total to zero

set  fullTotal to zero

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


Bonus Method( )

  IF (stat>10) AND (stat!=11) THEN
      Bonus=(Variable-10)/2
              ELSE IF  (stat==10)  OR  (stat==11) THEN
                Bonus=0 
               ELSE
                Bonus=-((10-stat)+1)/2

ENDIF

ENDIF

Calculate Hitpoints=(6+BonusCon)*level)   

Display the outputs as follows:

Level:[Level]
Character name
Character class
VariableName:[Variable][BonusVariable]
Str:[Str][BonusStr]
Dex:[Dex][BonusDex]
Con:[Con][BonusCon]
Int:[Int][BonusInt]
Wis:[Wis][BonusWis]
Cha:[Cha][BonusCha]

Display the Hitpoints value

Prompt For Choice.

Display “ Type r if you want to re-roll or any other character if you want to accept”

Read Choice.

DOWHILE (Choice==r)

END

CourseWork 2:
Implement a character generator for the Dungeons and Dragons. The Program should ask for a game level, character name, character class and method to generate attributes. The attributes are str, dex, con, int, wis, cha. The user has 4 options to generate attributes. Analysis part clearly describes about them. The bonus is calculated for each attribute. Then program should calculate hit points, skill-points, Base Attack Bonus, Combat bonus, Damage bonus for each class. It should ask and accept a character name.




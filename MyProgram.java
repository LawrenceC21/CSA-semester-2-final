import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        // Player
        Attack pAt1 = new Attack(-25, 0, 1, false, "strike");
        Attack pAt2 = new Attack(-10, 1, 2, true, "plasma balls");
        Fighter player = new Fighter("Aoi", 100, pAt1, pAt2);
        
        System.out.println("Welcome to Fighters Z a rpg style game inspired by street fighter, DragonBall z and pokemon");
        System.out.println("You play as Aoi, Japans greatist fighter who as been forced into a life or death turniment with the greatest fighters from around the world");
        System.out.println("The winner will be permited to make one wish on the Dragon orbs, any desire, any need can be the winners");
        System.out.println("Your first openent as you enter the ring is Alice, a redhead Swedish pirate and Navagator who fights with a bowstaff");
        
        // First oponent, Alice, inpired by Nami from one peice
        Attack nAt1 = new Attack(-10, 0, 1, false, "Oar swing");
        Attack nAt2 = new Attack(-20, 0, 1, true, "Electric wave");
        Fighter Navagator = new Fighter("Alice", 35, nAt1, nAt2);
        fight(player, Navagator);
        System.out.println("");
        System.out.println("As Alice draws her last breath she mutters something about wishing she helped make a straw hat king");
        System.out.println("Next up is Alexander, a Danish fighter who fights with a dull knife and wears googles");
        System.out.println("He has the ability to boost the bult force of his knife so it can even break bones");
        System.out.println("");
        
        // Second oponent, Alexander, Inspired by Nanami from Jujutsu Kiasen
        Attack sAt1 = new Attack(-10, 0, 1, false, "Ratio");
        Attack sAt2 = new Attack(-10, 10, 2, false, "Black flash");
        Fighter Suit = new Fighter("Alexander", 50, sAt1, sAt2);
        fight(player, Suit);
        
        System.out.println("");
        System.out.println("Alaxander dies his last toughts of his plans to move to Malasia and live happy");
        System.out.println("Next is the sorcerer slayer Jesus from Mexico");
        System.out.println("");
        
        // Third opponent, Jesus, loosly based on Toji from Jujutsu Kiasen, Jesus is the hispanic name not Jesus Christ
        Attack rAt1 = new Attack(-20, 5, 1, false, "Invered spear strike");
        Attack rAt2 = new Attack(-10, 10, 1, false, "Invered deflection");
        Fighter Restriction = new Fighter("Jesus", 60, rAt1, rAt2);
        fight(player, Restriction);
        
        System.out.println("");
        System.out.println("As Jesus dies his final toughs are of his young son who's only company are werid animals");
        System.out.println("After so many battles the turniment organizerss allow you to heal an extra time before the last 2 fights");
        player.heal();
        System.out.println("Next in the semi-finals is Dianna from Grease she is a warrior princess and part time superhero");
        System.out.println("");
        
        // Forth opponent, Dianna, inspired by Wonder Woman from Dc comics
        Attack wAt1 = new Attack(-5, 0, 3, true, "Sheild toss");
        Attack wAt2 = new Attack(-15, 0, 1, false, "Sword slash");
        Fighter Warrior = new Fighter("Dianna", 75, wAt1, wAt2);
        fight(player, Warrior);
        
        System.out.println("");
        System.out.println("As Dianna is defeated she begins praying to Zues to take venegnce on the creator of this turniment");
        System.out.println("In the final round is the Kenyen fighter, Pickle, a green Alien who crash landed In kenya years ago");
        System.out.println("");
        
        // Fith opponent, Pickle, inspired by Piccolo from Dragon ball
        Attack zAt1 = new Attack(-10, 0, 4, true, "Ki cluster");
        Attack zAt2 = new Attack(-25, 0, 1, true, "Special beam cannon");
        Fighter Zfighter = new Fighter("Pickle", 83, zAt1, zAt2);
        fight(player, Zfighter);
        
        System.out.println("");
        System.out.println("As Pickle is defeated he thinks of his young student and how no one will be there to raise him");
        System.out.println("You won the turniment but at the cost of so many lives");
        System.out.println("However there is a way to  save everyone, you can use the Dragon orbs to wish everyone back to life, do you do it");
        System.out.println("Please answer 1 for yes and any other number for no");
        System.out.println("");
        
        Scanner answer = new Scanner(System.in);
        
        Attack tAt1 = new Attack(-20, 0, 2, true, "Summon Mr.Vest");
        Attack tAt2 = new Attack(-100, 0, 10, true, "Supper F");
        Fighter teacher = new Fighter("Ms. Rouix", 65, tAt1, tAt2);
        int response = answer.nextInt();
        
        if(response == 1)
        {
            System.out.println("You wish back the fallen fighters however somethings wrong");
            System.out.println("The game starts to break, the fallen where nnever supposed to walk again");
            System.out.println("The developer does not know what to do and calls for assistance");
            System.out.println("The turniment organizer begins to beg at your feat before crumbling into a pile of dust do to your actions");
            System.out.println("You most now fight the culler of code in order to stop the game from being deleated forever and  save your world");
            
            fight(player, teacher);
            
            System.out.println("");
            System.out.println("By some miricale you defeated Ms.Roiux and your world iis at peice");
            System.out.println("The other fighters are free to live out there dreams and the organizers of the turniment all died, by your hands or in the chaos");
            System.out.println("You are Zues's vengence you saved teh world and brought it peice");
        } else {
            System.out.println("You win, your greatest desires are granted however at what cost");
            System.out.println("So many dead, so much destruction you live with the guilt forever");
        }
        /* Used to test fight and getChoice
        Fighter nav = new Fighter("dummy", 100, pAt1, pAt2);
        fight(player, duplicate);
        */
    }
    // Gets the players choice of action in a fight
    public static int getChoice(Fighter play)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Chose between \n option 1: " + play.getAtOne().getAtName() + "\n option 2: " + play.getAtTwo().getAtName() + "\n option 3: heal");
        System.out.println("Please type the number that coresponds to the option you want and not the word");
        for(int i = 0; 0 <= 10; i++)
        {
            int choice = input.nextInt();
            if(choice == 1)
            {
                return 1;
            } else if(choice == 2)
            {
                return 2;
            } else if(choice == 3)
            {
                return 3;
            } else if(choice == 0)
            {
                return 0;
            } else if(i < 10)
            {
                System.out.println("Try again, please pick between 1, 2, 3, or 4");
            } else
            {
                System.out.println("Your too stupid for this game");
            }
        }
    }
    //Simulates fights and determines if player wins
    public static void fight(Fighter play, Fighter oppenent)
        {
            System.out.println(" ");
            System.out.println("The fight with " + oppenent.getFightName() + " Begins");
            
            while(play.getSatis() != true && oppenent.getSatis() != true)
            {
                int oppChoice = (int)(Math.random() * 3) + 1;
                int playChoice =  getChoice(play);
                
                if(oppChoice == 1)
                {
                    for(int i = 0; i < oppenent.getAtOne().getNumHits(); i++)
                    {
                        play.ChangeHp(oppenent.getAtOne().getDamage());
                        oppenent.ChangeHp(oppenent.getAtOne().getLifeChange());
                    }
                    
                    System.out.println(" ");
                    System.out.println(oppenent.getFightName() + " used " + oppenent.getAtOne().getAtName());
                    System.out.println(oppenent.getFightName() + "'s health total " + oppenent.getHp());
                    System.out.println("Your health total " + play.getHp());
                    
                } else if(oppChoice == 2)
                {   for(int i = 0; i < oppenent.getAtTwo().getNumHits(); i++)
                    {
                        play.ChangeHp(oppenent.getAtTwo().getDamage());
                        oppenent.ChangeHp(oppenent.getAtTwo().getLifeChange());
                    }
                    
                    System.out.println(" ");
                    System.out.println(oppenent.getFightName() + " used " + oppenent.getAtTwo().getAtName());
                    System.out.println(oppenent.getFightName() + "'s health total " + oppenent.getHp());
                    System.out.println("Your health total " + play.getHp());
                    
                } else if(oppChoice == 3)
                {
                    oppenent.heal();
                    System.out.println(" ");
                    System.out.println(oppenent.getFightName() + " healed, there curent health total is " + oppenent.getHp());
                    
                }  else
                {
                    System.out.print("oppChoice is not working propely");
                }
                
                if(playChoice == 1)
                {
                    for(int i = 0; i < play.getAtOne().getNumHits(); i++)
                    {
                        oppenent.ChangeHp(play.getAtOne().getDamage());
                        play.ChangeHp(play.getAtOne().getLifeChange());
                    }
                    System.out.println(" ");
                    System.out.println(" You used " + play.getAtOne().getAtName());
                    System.out.println(oppenent.getFightName() + "'s health total " + oppenent.getHp());
                    System.out.println("Your health total " + play.getHp());
                    
                } else if(playChoice == 2)
                {   for(int i = 0; i < play.getAtTwo().getNumHits(); i++)
                    {
                        oppenent.ChangeHp(play.getAtTwo().getDamage());
                        play.ChangeHp(play.getAtTwo().getLifeChange());
                    }
                    System.out.println(" ");
                    System.out.println("You used " + play.getAtTwo().getAtName());
                    System.out.println(oppenent.getFightName() + "'s health total " + oppenent.getHp());
                    System.out.println("Your health total " + play.getHp());
                    
                } else if(playChoice == 3)
                {
                    play.heal();
                    System.out.println(" ");
                    System.out.println("You healed, your health total is " + play.getHp());
                    
                }  else if(playChoice == 0)
                {
                    System.out.print("dev shortcut");
                    oppenent.ChangeHp(-99999999);
                } else {
                    System.out.print("playChoice is not working properly");
                }
            }
            
            if(play.getSatis() == false)
            {
                System.out.println(" ");
                System.out.println("You win, free heal!");
                play.heal();
                System.out.println("Your new health total is " + play.getHp());
                
            } else {
                System.out.println(" ");
                System.out.println("You lost, Aoi was deafeted and you run is over");
                System.out.println("Try again!");
                System.exit(0);
            }
        }
}

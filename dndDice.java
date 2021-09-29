import java.util.Scanner;
import java.util.Random;

public class dndDice
{
    public static void rollDice(int selectedDice)
    {
        Random randomizer = new Random();
        int answer = randomizer.nextInt(selectedDice) + 1;
        System.out.print(answer);
    }

    public static void main(String[] args)
    {
        int[] diceOptions = {4, 6, 8, 10, 12, 20};

        Scanner keyboard = new Scanner(System.in);

        char Yes = 'Y';
        char No = 'N';
        char Answer;

        int diceRoll;

        boolean validDice = false;

        //Begin
        do{
            do {
            System.out.print("What dice should we roll?: d");
            diceRoll = keyboard.nextInt();

            for(int i = 0; i < diceOptions.length; i++) {
                if(diceOptions [i] == diceRoll) {
                    validDice = true;
                    break;
                }
                else {
                    validDice = false;
                }
            }
        }while (validDice == false);

        rollDice(diceRoll);

        System.out.print("\nRoll again? (Y/N): ");
        Answer = keyboard.next().charAt(0);

        while (Answer != Yes && Answer != No)
        {
            System.out.println("invalid entry try again");
            System.out.print("\nRoll again? (Y/N): ");
            Answer = keyboard.next().charAt(0);
        }
        }while (Answer == Yes);
        

    }
}
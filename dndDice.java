import java.util.Scanner;
import java.util.Random;

public class dndDice
{
    public static void main(String[] args)
    {
        int[] dFour = {1, 2, 3, 4};
        int[] dSix = {1, 2, 3, 4, 5, 6};
        int[] dEight = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] dTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] dTwelve = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] dTwenty = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        char Yes = 'Y';
        char No = 'N';
        char Answer;

        int subscript = 0;

        int four = 4;
        int six = 6;
        int eight = 8;
        int ten = 10;
        int twelve = 12;
        int twenty = 20;
        int diceRoll;

        System.out.print("What dice should we roll?: d");
        diceRoll = keyboard.nextInt();

        //Need while loop for incorrect responses
        // while (diceRoll != four)
        // {
        //     System.out.print("What dice should we roll?: d");
        //     diceRoll = keyboard.nextInt();
        // }

        if (diceRoll == four)
        {
            subscript = r.nextInt(4);
            System.out.println(dFour[subscript]);
        }

        else if (diceRoll == six)
        {
            subscript = r.nextInt(6);
            System.out.println(dSix[subscript]);
        }

        else if (diceRoll == eight)
        {
            subscript = r.nextInt(8);
            System.out.println(dEight[subscript]);
        }

        else if (diceRoll == ten)
        {
            subscript = r.nextInt(10);
            System.out.println(dTen[subscript]);
        }

        else if (diceRoll == twelve)
        {
            subscript = r.nextInt(12);
            System.out.println(dTwelve[subscript]);
        }

        else if (diceRoll == twenty)
        {
            subscript = r.nextInt(20);
            System.out.println(dTwenty[subscript]);
        }

        else
        {
            System.out.println("invalid dice");
        }

        System.out.print("\nRoll again? (Y/N): ");
        Answer = keyboard.next().charAt(0);

        while (Answer != Yes && Answer != No)
        {
            System.out.println("invalid entry try again");
            System.out.print("\nRoll again? (Y/N): ");
            Answer = keyboard.next().charAt(0);
        }

        //Begin
        while (Answer == Yes)
        {
            System.out.print("What dice should we roll?: d");
            diceRoll = keyboard.nextInt();

        //Need while loop for incorrect responses
        if (diceRoll == four)
        {
            subscript = r.nextInt(4);
            System.out.println(dFour[subscript]);
        }

        else if (diceRoll == six)
        {
            subscript = r.nextInt(6);
            System.out.println(dSix[subscript]);
        }

        else if (diceRoll == eight)
        {
            subscript = r.nextInt(8);
            System.out.println(dEight[subscript]);
        }

        else if (diceRoll == ten)
        {
            subscript = r.nextInt(10);
            System.out.println(dTen[subscript]);
        }

        else if (diceRoll == twelve)
        {
            subscript = r.nextInt(12);
            System.out.println(dTwelve[subscript]);
        }

        else if (diceRoll == twenty)
        {
            subscript = r.nextInt(20);
            System.out.println(dTwenty[subscript]);
        }

        else
        {
            System.out.println("invalid dice");
        }

        System.out.print("\nRoll again? (Y/N): ");
        Answer = keyboard.next().charAt(0);

        while (Answer != Yes && Answer != No)
        {
            System.out.println("invalid entry try again");
            System.out.print("\nRoll again? (Y/N): ");
            Answer = keyboard.next().charAt(0);
        }
        }
        

    }
}
package task2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GuessGame {

    private int random;

    GuessGame(int limit)
    {
        Random rand = new Random();
        random = rand.nextInt(limit);

    }

    public void guess() throws NumberFormatException
    {
        int choice = 0;
        while(true)
        {
            try
            {
                choice = Integer.parseInt(JOptionPane.showInputDialog("Input your choice"));
            }
            catch (NumberFormatException e)
            {
                e.printStackTrace();
            }

            if(choice == random)
            {
                System.out.println("you win right Guess");
                break;
            }
            else
            {
                System.out.println("guess again ...");
            }
        }

    }

    public static void main(String[] args) {
        GuessGame guessGame = new GuessGame(10);
        guessGame.guess();
    }
}

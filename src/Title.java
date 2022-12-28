package src;

import java.util.Scanner;
import java.util.Arrays;
import java.util.regex.Pattern;


public class Title{
    public int screenSizeY;
    public int screenSizeX;
    public int[] aliveRules;
    public int[] deadRules;
    
    final String MESSAGE = "Mini Conway's Game of Life v0.6 \nWelcome! This is my first project in java, I hope you enjoy!";

    
    public void defineValues(){
        Scanner scanner = new Scanner(System.in);
        String option;

        System.out.println(MESSAGE);
        System.out.println("Type 1 to customize the values or 0 to use the default value:");

        while (true) {
            option = scanner.nextLine();
            

            if (option.equals("0")){
                screenSizeY = 30;
                screenSizeX = 150;
                aliveRules = new int[]{2, 3};
                deadRules = new int[]{3};
                
                break;
            } else if (option.equals("1")){
                System.out.println("Ok, Let's customize the values.");
                break;
            } else {
                System.out.println("You typed a wrong option, please try again:");
            }
        }

        if (option.equals("1")){
            System.out.println("Please, type the size of the columns:");
            option = scanner.nextLine();
            screenSizeY = Integer.parseInt(option);

            System.out.println("Now, Type the size of the rows:");
            option = scanner.nextLine();
            screenSizeX = Integer.parseInt(option);

            System.out.println("Now, enter the number of neighboring cells that allow the cell to stay alive:");
            System.out.println("type the number between lines, for example: 2-3");
            option = scanner.nextLine();
            String[] optionRules = option.split("-");
            aliveRules = new int[optionRules.length];
            for (int i = 0; i < aliveRules.length; i++)aliveRules[i] = Integer.parseInt(optionRules[i]);

            System.out.println("Now, enter the number of neighboring cells that allow the cell to be alive:");
            System.out.println("type the number between lines, for example: 2-3");
            option = scanner.nextLine();
            optionRules = option.split("-");
            deadRules = new int[optionRules.length];
            for (int i = 0; i < deadRules.length; i++)deadRules[i] = Integer.parseInt(optionRules[i]);
        }
    }

}
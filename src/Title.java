package src;

import java.util.Scanner;


public class Title{
    public int screenSizeY;
    public int screenSizeX;
    
    final String MESSAGE = "Mini Conway's Game of Life v0.5 \nWelcome! This is my first project in java, I hope you enjoy!";

    
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
        }
    }

}
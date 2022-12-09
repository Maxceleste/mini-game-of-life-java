package src;

import java.util.Random;

public class Field{
    
    // Declaring our variables
    int screenY;
    int screenX;
    boolean[][] screen;

    //Constructor
    public Field(int screenY, int screenX){
        this.screenY = screenY;
        this.screenX = screenX;
    }

    public void createField(){
        /** Assign the value to screen variable */
        screen = new boolean[screenY][screenX];

        for (int y = 0; y < screenY; y++){
            for (int x = 0; x < screenX; x++){
                screen[y][x] = false;
            }
        }
    }

    public void printField(){
        //Pick the boolean array and transform to visual
        String visual = "";

        for (boolean[] row : screen){
            for (boolean field : row){
                visual += field ? "█" : " ";
            }

            visual += "\n";
        }

        System.out.println(visual);
    }

    public void randomField(){
        // Generate a random pattern of alive and dead cells
        Random r = new Random();
        boolean alive;

        for (boolean[] row : screen){
            for (int i = 0; i < row.length; i++){
                row[i] = r.nextBoolean();
            }
        }
    }

}
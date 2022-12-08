package src;

public class Field{
    
    // Declaring our variables
    int screenY;
    int screenX;
    String[][] screen;

    public Field(int screenY, int screenX){
        this.screenY = screenY;
        this.screenX = screenX;
    }

    public String[][] createField(){
        /** Return the array field defined with the values defined in the object */

        screen = new String[screenY][screenX];

        for (int y = 0; y < screenY; y++){
            for (int x = 0; x < screenX; x++){
                screen[y][x] = " ";
            }
        }
        return screen;
    }

    public void printField(String[][] screen){
        //little test to see if the screen works
        String visual = "";

        for (String[] row : screen){
            for (String field : row){
                visual += "O ";
            }

            visual += "\n";
        }

        System.out.println(visual);
    }

}
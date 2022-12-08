import src.Field;

class Game{
    
    public static void main(String [] args){
        String[][] screen;
        Field field = new Field(50, 50);

        screen = field.createField();
        field.printField(screen);

    }

}
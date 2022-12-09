import src.Field;

class Game{
    
    public static void main(String [] args){
        String[][] screen;
        Field field = new Field(30, 150);

        screen = field.createField();
        field.printField(screen);

    }

}
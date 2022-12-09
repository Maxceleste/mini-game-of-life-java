import src.Field;

class Game{
    
    public static void main(String [] args){
        Field field = new Field(30, 150);

        field.createField();
        field.randomField();
        field.printField();

    }

}
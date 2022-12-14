import src.Field;
import src.Rules;

class Game{
    
    public static void main(String [] args){
        Field field = new Field(30, 150);
        Rules rules = new Rules(field.screenY, field.screenX);

        field.createField();
        field.randomField();
        field.printField();

        while(true){
            field.screen = rules.nextGeneration(field.screen);
            field.printField();
            try {Thread.sleep(50);} catch (InterruptedException ex) { }
        }

    }

}
import src.*;

class Game{
    
    public static void main(String [] args){
        
        Title title = new Title();
        title.defineValues();

        int screenY = title.screenSizeY;
        int screenX = title.screenSizeX;


        Field field = new Field(screenY, screenX);
        Rules rules = new Rules(field.screenY, field.screenX, title.aliveRules, title.deadRules);

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
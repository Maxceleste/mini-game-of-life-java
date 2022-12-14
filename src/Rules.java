package src;

public class Rules {
    int rows;
    int columns;

    public Rules(int rows, int columns){
        this.rows = rows - 1;
        this.columns = columns - 1;
    }

    public boolean[][] nextGeneration(boolean[][] generation){
        // Recieve the past generation and return the next, based in conway's game of life rules

        boolean[][] nextGen;
        nextGen = new boolean[rows + 1][columns + 1];

        for (int row = 0; row <= rows ; row++){
            for (int column = 0; column <= columns; column++){
                boolean cell = generation[row][column];
                int neighboorsAlive = 0;
                int[][] neighboorsPositions = determineNeighboors(row, column);


                for(int i = 0; i < 8; i++){
                    boolean alive = generation[neighboorsPositions[i][0]][neighboorsPositions[i][1]];
                    if (alive){
                        neighboorsAlive += 1;
                    }
                }


                if (cell){
                    if (neighboorsAlive < 2 || neighboorsAlive > 3){
                        nextGen[row][column] = false;
                    } else {
                        nextGen[row][column] = true;
                    }
                } else {
                    if (neighboorsAlive == 3){
                        nextGen[row][column] = true;
                    }
                }
            }
        }
        return nextGen;
    }

    public int[][] determineNeighboors(int positionRow, int positionColumn){
        int[][] neighboorsPositions = new int[8][2]; // the neighboors positions will be stored in clock-wise position
        /* 
        7 0 1
        6 X 2
        5 4 3        
        */

        neighboorsPositions[0][0] = positionRow - 1;
        neighboorsPositions[0][1] = positionColumn;
        neighboorsPositions[1][0] = positionRow - 1;
        neighboorsPositions[1][1] = positionColumn + 1;
        neighboorsPositions[2][0] = positionRow;
        neighboorsPositions[2][1] = positionColumn + 1;
        neighboorsPositions[3][0] = positionRow + 1;
        neighboorsPositions[3][1] = positionColumn + 1;
        neighboorsPositions[4][0] = positionRow + 1;
        neighboorsPositions[4][1] = positionColumn;
        neighboorsPositions[5][0] = positionRow + 1;
        neighboorsPositions[5][1] = positionColumn - 1;
        neighboorsPositions[6][0] = positionRow;
        neighboorsPositions[6][1] = positionColumn - 1;
        neighboorsPositions[7][0] = positionRow - 1;
        neighboorsPositions[7][1] = positionColumn - 1;


        if (positionRow == 0){
            neighboorsPositions[7][0] = rows;
            neighboorsPositions[0][0] = rows;
            neighboorsPositions[1][0] = rows;
        } else if (positionRow == rows){
            neighboorsPositions[5][0] = 0;
            neighboorsPositions[4][0] = 0;
            neighboorsPositions[3][0] = 0;
        }

        if (positionColumn == 0){
            neighboorsPositions[7][1] = columns;
            neighboorsPositions[6][1] = columns;
            neighboorsPositions[5][1] = columns;
        } else if (positionColumn == columns){
            neighboorsPositions[1][1] = 0;
            neighboorsPositions[2][1] = 0;
            neighboorsPositions[3][1] = 0;
        }

        return neighboorsPositions;

    }

}
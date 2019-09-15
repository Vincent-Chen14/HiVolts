import java.util.Random;
public class Board{

    //constructor
    public void Board {
        Random rand = new Random();
        int [][] boardMat= {
                {1, 1 , 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 0 , 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0 , 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0 , 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0 , 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0 , 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0 , 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0 , 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0 , 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0 , 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0 , 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 1 , 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };
        /* nothing = 0, fence = 1, moh = 2, player = 3*/
        int fenceTracker = 0;
        int mohsTracker = 0;
        int playerTracker = 0;
        int RowNum;
        int ColNum;
        int playerX;
        int playerY;
        //making fences
        while(fenceTracker<20){
            RowNum = rand.nextInt(9)+1;
            ColNum = rand.nextInt(9)+1;
            if(boardMat[RowNum][ColNum] == 0)(
                boardMat[RowNum][ColNum] = 1;
                fenceTracker++;)
        }
        //making mohs
        while (mohsTracker<12){
            RowNum = rand.nextInt(9)+1;
            ColNum = rand.nextInt(9)+1;
            if(boardMat[RowNum][ColNum] == 0){
                boardMat[RowNum][ColNum] = 2;
                mohsTracker++;}
        }
        //making player
        while(playerTracker<1){
            int playerX = rand.nextInt(9)+1;
            int playerY = rand.nextInt(9)+1;
            if(boardMat[RowNum][ColNum] == 0){
                boardMat[RowNum][ColNum] = 3;
                playerTracker++;}
            }
        }
    //methods
        public int getPlayerX(){return playerX;}
        public int getPlayerY(){return playerY;}
        public int getNum(int x, int y){return boardMat[x][y];}
        public void changePos(int x, int y, int num){boardMat[x][y] = num;}
    }

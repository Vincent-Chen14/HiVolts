//Use the class as a group of method
public class Mhos {
    //contructor not needed?
    public void Mhos(){
        int[] mhosX = new int{12};
        int[] mhosY = new int{12};
        int counter = 0;
        //sets up the mhos location into two arrays
        int xDiff;
        int yDiff;
        for(int i =0; i<boardMat.legnth; i++)
            for(int j=0; j<boardMat[i].legnth; j++)
                if(boardMat[i][j] == 2)
                    mhosX[counter] = i;
                    mhosY[counter] = j;
                    counter++;
    }
    //methods
    int getMhoX(num){return mhosX[num];}
    int getMhoX(num){return mhosY[num];}

    void moveWhere(int x, int y, int i){
        if(x == 0 && y >0){
            if(boardMat[mhosX[i]][mhosY[i]+1]==0){
                boardMat[mhosX[i]][mhosY[i]]=0;
                boardMat[mhosX[i]][mhosY[i]+1]=2;
            }
            if(boardMat[mhosX[i]][mhosY[i]+1]==1) {
                boardMat[mhosX[i]][mhosY[i]] = 0;
                mhosX[i] = null;
                mhosY[i] = null;
            }
        }
        if

    }
    void mhoMove(){

        //cycles through every mho position
        for(int i = 0; i<12; i++){
            xDiff = board.getPlayerX()-mhosX[i];
            yDiff = board.getPlayerY()-mhosY[i];


    }

    }

}


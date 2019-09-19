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
    void mhosValid(int i, int posChangeX, int posChangeY){
        if(boardMat[mhosX[i]+posChangeX][mhosY[i]+posChangeY]==0){
            boardMat[mhosX[i]][mhosY[i]]=0;
            boardMat[mhosX[i]+posChangeX][mhosY[i]+posChangeY]=2;
        }
        else if(boardMat[mhosX[i]+posChangeX][mhosY[i]+posChangeY]==1) {
            boardMat[mhosX[i]][mhosY[i]] = 0;
            mhosX[i] = null;
            mhosY[i] = null;
        }
        else if(boardMat[mhosX[i]+posChangeX][mhosY[i]+posChangeY]==3) {
            alive = false
        }

    }
    int getMhoX(num){return mhosX[num];}
    int getMhoX(num){return mhosY[num];}

    void moveWhere(int x, int y, int i){
        if(x == 0 && y >0){
            mhosValid(i, 0, 1)
        }
        else if(x==0 && y<0){
            mhosValid(i, 0, -1)
        }
        else if(x>0 && y==0){
            mhosValid(i, -1, 0)
        }
        else if(x<0 && y==0){
            mhosValid(i, 1, 0)
        }
        else if(x==y || x == -1 * y){
            if(x>0 && y>0) {
                mhosValid(i, -1, 1)
            }
            else if(x>0 && y<0) {
                mhosValid(i, -1, -1)
            }
            else if(x<0 && y>0) {
                mhosValid(i, 1, 1)
            }
            else if(x<0 && y<0) {
                mhosValid(i, 1, -1)
            }
        }
        else{
            if(x>0 && y>0){
                if(x>y){
                    mhosValid(i, -1, 0)
                }
                else{
                    mhosValid(i, 0, 1)
                }
            }
            else if(x>0 && y<0){
                f(x>y){
                    mhosValid(i, -1, 0)
                }
                else{
                    mhosValid(i, 0, -1)
                }
            }
            else if(x<0 && y>0){
                f(x>y){
                    mhosValid(i, 1, 0)
                }
                else{
                    mhosValid(i, 0, 1)
                }
            }
            else if(x<0 && y<0){
                f(x>y){
                    mhosValid(i, 1, 0)
                }
                else{
                    mhosValid(i, 0, -1)
                }
            }
        }

    }
    void mhoMove(){
        //cycles through every mho position
        for(int i = 0; i<12; i++){
            xDiff = board.getPlayerX()-mhosX[i];
            yDiff = board.getPlayerY()-mhosY[i];
            moveWhere(xDiff, yDiff, i)
        }

    }

}


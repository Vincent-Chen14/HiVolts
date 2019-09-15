//Use the class as a group of method
public class Mhos {
    //contructor not needed?
    public void Mhos(){
        int[] mhosX = new int{12};
        int[] mhosY = new int{12};
        int counter = 0;
        //sets up the mhos location into two arrays
        for(int i =0; i<boardMat.legnth; i++)
            for(int j=0; j<boardMat[i].legnth; j++)
                if(boardMat[i][j] == 2)
                    mhosX[counter] = i;
                    mhosY[counter] = j;
                    counter++;
    }
    //methods
    void mhoMove(x, y){
        int xDiff;
        int yDiff;
        //cycles through every mho position
        for(int i = 0; i<12; i++)


    }

    }

}


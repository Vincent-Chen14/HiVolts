
import java.util.Scanner;//remove later!!
class Main(){
//game method
    void runGame{
        Board board=new Board();
        Scanner keyboard=new Scanner(System.in);
        //remove later
        boolean alive=true;
        while(alive=true){
            //graphics here?
            //run controller method1
        //endOfGame
        }
    }

//controller method
    void controller{
        char move=keyboard.nextChar();
        //This needs to be typed in consol, use key adapter/listener from swing to get the NEXT key pressed, not typed.
            if( move == q;){
                moveValid(board.getPlayerX()-1, board.getPlayerY()-1)

            }

        }

//check if move is valid
    void moveValid(x, y){
        //if open
        if(Board.getNum(x, y) == 0){
            Board.changePos(x, y, 1)
        }
        else{
            alive = false;
        }
    }

        //Main
    public static void main(String[] args){


        }
}
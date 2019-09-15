
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
            controller(keyboard.nextChar())
        //endOfGame, after while loop stops
        }
    }

//controller method, move into controller class to save space
    void controller(x){
        char move=x
        //This needs to be typed in consol, use key adapter/listener from swing to get the NEXT key pressed, not typed.
            if( move == q;){
                moveValid(board.getPlayerX()-1, board.getPlayerY()-1)
                //run mohs movement method code
            }
            else if( move == w;){
                moveValid(board.getPlayerX()-1, board.getPlayerY())
                //run mohs movement method code
            }
            else if( move == e;){
                moveValid(board.getPlayerX()-1, board.getPlayerY()+1)
                //run mohs movement method code
            }
            else if( move == a;){
                moveValid(board.getPlayerX(), board.getPlayerY()-1)
                //run mohs movement method code
            }
            else if( move == s;){
                moveValid(board.getPlayerX(), board.getPlayerY())
                //run mohs movement method code
            }
            else if( move == d;){
                moveValid(board.getPlayerX(), board.getPlayerY()+1)
                //run mohs movement method code
            }
            else if( move == z;){
                moveValid(board.getPlayerX()+1,board.getPlayerY()-1)
                //run mohs movement method code
            }
            else if( move == x;){
                moveValid(board.getPlayerX()+1, board.getPlayerY())
                //run mohs movement method code
            }
            else if( move == c;){
                moveValid(board.getPlayerX()+1, board.getPlayerY()+1)
                //run mohs movement method code
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
import java.util.Random;
//import javax.swing;
import java.util.Scanner;//remove later!!
class Main(){
//game method
    void runGame{
        Board board=new Board();
        Mhos mhos = new Mhos();
        Scanner keyboard=new Scanner(System.in);
        Random rand = new Random();
        boolean alive=true;
        boolean jumped=false;
        while(alive=true){
            //graphics here?
            //run controller method1
            controller(keyboard.nextChar())
            if jumped=false{

                //mohs movement method
            }
            jumped = false;
        }
        //endOfGame, after while loop stops

    }

//controller method, move into controller class to save space
    void controller(x){
        char move=x
        //This needs to be typed in consol, use key adapter/listener from swing to get the NEXT key pressed, not typed.
        if( move == q;){
            moveValid(board.getPlayerX()-1, board.getPlayerY()-1)
        }
        else if( move == w;){
            moveValid(board.getPlayerX()-1, board.getPlayerY())
        }
        else if( move == e;){
            moveValid(board.getPlayerX()-1, board.getPlayerY()+1)
        }
        else if( move == a;){
            moveValid(board.getPlayerX(), board.getPlayerY()-1)
        }
        else if( move == s;){
            moveValid(board.getPlayerX(), board.getPlayerY())
        }
        else if( move == d;){
            moveValid(board.getPlayerX(), board.getPlayerY()+1)
        }
        else if( move == z;){
            moveValid(board.getPlayerX()+1,board.getPlayerY()-1)
        }
        else if( move == x;){
            moveValid(board.getPlayerX()+1, board.getPlayerY())
        }
        else if( move == c;){
            moveValid(board.getPlayerX()+1,board.getPlayerY()+1)
        }
        else if(move == j;){
            moveValid(rand.nextInt(9)+1, rand.nextInt(9)+1)
            jumped = true;
        }
    }


//check if move is valid and move
    void moveValid(x, y){
        //if open
        if(Board.getNum(x, y) == 0){
            Board.changePos(x, y, 1)
            Board.changePos(getPlayerX(), getPlayerY(), 0)
            Board.changePlayerX(x)
            Board.changePlayerY(y)
        }
        else{
            alive = false;
        }
    }

        //Main
    public static void main(String[] args){
        }
}
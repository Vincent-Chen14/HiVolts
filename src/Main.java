import java
class Main {

//controller method, move into controller class to save space
    boolean controller(char x){
        char move=x;
        //This needs to be typed in consol, use key adapter/listener from swing to get the NEXT key pressed, not typed.
        if( move == 'q'){
            moveValid(board.getPlayerX()-1, board.getPlayerY()-1);
            return false;
        }
        else if( move == 'w'){
            moveValid(board.getPlayerX()-1, board.getPlayerY());
            return false;
        }
        else if( move == 'e'){
            moveValid(board.getPlayerX()-1, board.getPlayerY()+1);
            return false;
        }
        else if( move == 'a'){
            moveValid(board.getPlayerX(), board.getPlayerY()-1);
            return false;
        }
        else if( move == 's'){
            moveValid(board.getPlayerX(), board.getPlayerY());
            return false;
        }
        else if( move == 'd'){
            moveValid(board.getPlayerX(), board.getPlayerY()+1);
            return false;
        }
        else if( move == 'z'){
            moveValid(board.getPlayerX()+1,board.getPlayerY()-1);
            return false;
        }
        else if( move == 'x'){
            moveValid(board.getPlayerX()+1, board.getPlayerY());
            return false;
        }
        else if( move == 'c'){
            moveValid(board.getPlayerX()+1,board.getPlayerY()+1);
            return false;
        }
        else if(move == 'j'){
            moveValid(rand.nextInt(9)+1, rand.nextInt(9)+1);
            jumped = true;
            return false;
        }
        else if(move == 'r'){
            return true;
        }
    }


//check if move is valid and move
    void moveValid(x, y){
        //if open
        if(Board.getNum(x, y) == 0){
            Board.changePos(x, y, 1);
            Board.changePos(getPlayerX(), getPlayerY(), 0);
            Board.changePlayerX(x);
            Board.changePlayerY(y);
        }
        else{
            alive = false;
        }
    }
    void runGame () {
        Board board=new Board();
        Mhos mhos = new Mhos();
        Scanner keyboard=new Scanner(System.in);
        Random rand = new Random();
        int numMoves = 0;
        boolean alive=true;
        boolean jumped=false;
        while(alive=true && mhosDead<12){
            board.displayBoard(numMoves);
            //run controller method1
            if(controller(keyboard.nextChar())){
                runGame();
            }
            numMoves++;
            if (jumped=false){
                mhos.mhoMove();
        //mohs movement method
            }
            jumped = false;
        }
        if(mhosDead==12){
            System.out.println("");
            System.out.println("YOU WIN");
        }
        else{
            System.out.println("");
            System.out.println("YOU LOSE");
        }
        if(controller(keyboard.nextChar())){
            runGame();
        }


    }

        //Main
    public static void main(String[] args){
        runGame();
    }
}
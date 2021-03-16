import processing.core.*;

public class TicTacToe extends PApplet {

    boolean gameOver = false;
    char [][] board = new char[3][3];
    char currentTurn = 'X';

    public class X {
        //private instance variables
        private float xLocation;
        private float yLocation;
        //Constructor
        public X(float xLocation, float yLocation) {
            this.xLocation = xLocation;
            this.yLocation = yLocation;
        }
        //non-static methods
        public void draw() {
            line(xLocation, yLocation, xLocation + 100, yLocation - 100);
            line(xLocation, yLocation, xLocation - 100, yLocation + 100);
            line(xLocation, yLocation, xLocation + 100, yLocation + 100);
            line(xLocation, yLocation, xLocation - 100, yLocation - 100);
        }
    }

    public class O {
        //private instance variables;
        private float xLocation;
        private float yLocation;
        //Constructor
        public O(float xLocation, float yLocation) {
            this.xLocation = xLocation;
            this.yLocation = yLocation;
        }
        //non-static methods
        public void draw() {
            noFill();
            ellipse(xLocation, yLocation, 200, 200);
        }
    }

    public static void main(String[] args) {
        PApplet.main("TicTacToe");
    }

    public void settings() {
        size(600, 600);
    }

    public void mousePressed() {
        if(currentTurn == 'X') {
            if(mouseX > 0 && mouseX < 200 && mouseY > 0 && mouseY < 200 && mousePressed && board[0][0] == 0 && determineWinner(board) == 0) {
                board[0][0] = 'X';
                currentTurn = 'O';
            }
            else if(mouseX > 200 && mouseX < 400 && mouseY > 0 && mouseY < 200 && mousePressed && board[0][1] == 0 && determineWinner(board) == 0) {
                board[0][1] = 'X';
                currentTurn = 'O';
            }
            else if(mouseX > 400 && mouseX < 600 && mouseY > 0 && mouseY < 200 && mousePressed && board[0][2] == 0 && determineWinner(board) == 0) {
                board[0][2] = 'X';
                currentTurn = 'O';
            }
            else if(mouseX > 0 && mouseX < 200 && mouseY > 200 && mouseY < 400 && mousePressed && board[1][0] == 0 && determineWinner(board) == 0) {
                board[1][0] = 'X';
                currentTurn = 'O';
            }
            else if(mouseX > 200 && mouseX < 400 && mouseY > 200 && mouseY < 400 && mousePressed && board[1][1] == 0 && determineWinner(board) == 0) {
                board[1][1] = 'X';
                currentTurn = 'O';
            }
            else if(mouseX > 400 && mouseX < 600 && mouseY > 200 && mouseY < 400 && mousePressed && board[1][2] == 0 && determineWinner(board) == 0) {
                board[1][2] = 'X';
                currentTurn = 'O';
            }
            else if(mouseX > 0 && mouseX < 200 && mouseY > 400 && mouseY < 600 && mousePressed && board[2][0] == 0 && determineWinner(board) == 0) {
                board[2][0] = 'X';
                currentTurn = 'O';
            }
            else if(mouseX > 200 && mouseX < 400 && mouseY > 400 && mouseY < 600 && mousePressed && board[2][1] == 0 && determineWinner(board) == 0) {
                board[2][1] = 'X';
                currentTurn = 'O';
            }
            else if(mouseX > 400 && mouseX < 600 && mouseY > 400 && mouseY < 600 && mousePressed && board[2][2] == 0 && determineWinner(board) == 0) {
                board[2][2] = 'X';
                currentTurn = 'O';
            }
        }
        else if (currentTurn == 'O') {
            if(mouseX > 0 && mouseX < 200 && mouseY > 0 && mouseY < 200 && mousePressed && board[0][0] == 0 && determineWinner(board) == 0) {
                board[0][0] = 'O';
                currentTurn = 'X';
            }
            else if(mouseX > 200 && mouseX < 400 && mouseY > 0 && mouseY < 200 && mousePressed && board[0][1] == 0 && determineWinner(board) == 0) {
                board[0][1] = 'O';
                currentTurn = 'X';
            }
            else if(mouseX > 400 && mouseX < 600 && mouseY > 0 && mouseY < 200 && mousePressed && board[0][2] == 0 && determineWinner(board) == 0) {
                board[0][2] = 'O';
                currentTurn = 'X';
            }
            else if(mouseX > 0 && mouseX < 200 && mouseY > 200 && mouseY < 400 && mousePressed && board[1][0] == 0 && determineWinner(board) == 0) {
                board[1][0] = 'O';
                currentTurn = 'X';
            }
            else if(mouseX > 200 && mouseX < 400 && mouseY > 200 && mouseY < 400 && mousePressed && board[1][1] == 0 && determineWinner(board) == 0) {
                board[1][1] = 'O';
                currentTurn = 'X';
            }
            else if(mouseX > 400 && mouseX < 600 && mouseY > 200 && mouseY < 400 && mousePressed && board[1][2] == 0 && determineWinner(board) == 0) {
                board[1][2] = 'O';
                currentTurn = 'X';
            }
            else if(mouseX > 0 && mouseX < 200 && mouseY > 400 && mouseY < 600 && mousePressed && board[2][0] == 0 && determineWinner(board) == 0) {
                board[2][0] = 'O';
                currentTurn = 'X';
            }
            else if(mouseX > 200 && mouseX < 400 && mouseY > 400 && mouseY < 600 && mousePressed && board[2][1] == 0 && determineWinner(board) == 0) {
                board[2][1] = 'O';
                currentTurn = 'X';
            }
            else if(mouseX > 400 && mouseX < 600 && mouseY > 400 && mouseY < 600 && mousePressed && board[2][2] == 0 && determineWinner(board) == 0) {
                board[2][2] = 'O';
                currentTurn = 'X';
            }
        }
        if(gameOver) {
            if(mousePressed) {
                gameOver = false;
                board = new char[3][3];
                currentTurn = 'X';
            }
        }
    }

    public void draw() {
        background(3, 252, 190);
        line(200, height, 200, 0);
        line(400, height, 400, 0);
        line(0, 400, width, 400);
        line(0, 200, width, 200);
        fill(0);
        textSize(24);
        textAlign(LEFT);
        text("Current Turn: " + currentTurn, 10, 30);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] == 'X') {
                    if(determineWinner(board) == 'X') {
                        textSize(32);
                        textAlign(CENTER);
                        text("X Won!", width/2, height/2);
                        gameOver = true;
                    }
                    X x = new X(100 + j*200, 100 + i*200);
                    x.draw();
                }
                else if (board[i][j] == 'O') {
                    if(determineWinner(board) == 'O') {
                        textSize(32);
                        textAlign(CENTER);
                        text("O Won!", width/2, height/2);
                        gameOver = true;
                    }
                    O o = new O(100 + j*200, 100 + i*200);
                    o.draw();
                }
            }
        }
        boolean allOccupied = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] == 0) {
                    allOccupied = false;
                }
            }
        }
        if (allOccupied && determineWinner(board) == 0) {
            textSize(32);
            textAlign(CENTER);
            text("It's a tie!", width/2, height/2);
            gameOver = true;
        }
        if(gameOver) {
            textSize(32);
            textAlign(CENTER);
            text("Click to play again!", width/2, height/2+50);
        }
    }

    public char determineWinner(char [][] board) {
        char winner = 0;
        if(board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
            winner = 'X';
        }
        if(board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
            winner = 'X';
        }
        if(board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') {
            winner = 'X';
        }
        if(board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') {
            winner = 'X';
        }
        if(board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
            winner = 'X';
        }
        if(board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
            winner = 'X';
        }
        if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
            winner = 'X';
        }
        if(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
            winner = 'X';
        }
        if(board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') {
            winner = 'O';
        }
        if(board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') {
            winner = 'O';
        }
        if(board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') {
            winner = 'O';
        }
        if(board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') {
            winner = 'O';
        }
        if(board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') {
            winner = 'O';
        }
        if(board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') {
            winner = 'O';
        }
        if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
            winner = 'O';
        }
        if(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
            winner = 'O';
        }
        return winner;
    }
}
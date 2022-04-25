// Tic Tac Toe
// April 25, 2022

// Doesnt check winner unless the 3rd row and column have something in it

int msX, msY; // Stores Mouse X and Y pos;
boolean turnX; // Stores which turn it is;
int[][] board = new int[3][3]; // 0 = null, 1 = X, 2 = O
int row, col;
int winner; // 0 = null, 1 = X, 2 = O

void setup(){
  size(700, 700);
  stroke(0);
  noCursor();
  background(255);
  textAlign(CENTER);
}

void draw(){
  background(255);
  println(mouseX + ", " + mouseY);

  if(board[0][0] == board[1][1] && board[1][1] == board[2][2]) // Diagonal
    winner = board[1][1];
  if(board[2][0] == board[1][1] && board[1][1] == board[0][2]) // Reverse Diagonal
    winner = board[1][1];
  
  if(board[0][0] == board[0][1] && board[0][1] == board[0][2])
    winner = board[0][0];
  if(board[1][0] == board[1][1] && board[1][1] == board[1][2])
    winner = board[1][0];
  if(board[2][0] == board[2][1] && board[2][1] == board[2][2])
    winner = board[2][0];

  if(board[0][0] == board[1][0] && board[1][0] == board[2][0])
    winner = board[0][0];
  if(board[0][1] == board[1][1] && board[1][1] == board[2][1])
    winner = board[0][1];
  if(board[0][2] == board[1][2] && board[1][2] == board[2][2])
    winner = board[0][2];
  
  line(100, 100, 600, 100);
  line(100, 100, 100, 600);
  line(100, 600, 600, 600);
  line(600, 100, 600, 600);
  
  line(266, 100, 266, 600);
  line(433, 100, 433, 600);
  line(100, 266, 600, 266);
  line(100, 433, 600, 433);
  
  for(int c = 0; c < board.length; c++){
    for(int  r = 0; r < board[0].length; r++){
      if(board[r][c] == 1)
        placeX(r, c);
      else if(board[r][c] == 2)
        placeO(r, c);
    }
  }

  textSize(50);
  fill(0);
  if(winner == 1)
    text("Player 'X' is the winner!", 350, 70);
  else if(winner == 2)
    text("Player 'O' is the winner!", 350, 70);
  fill(255);
    
  rect(245, 620, 210, 65);
  fill(0);
  textSize(35);
  text("Reset", 350, 667);
  fill(255); 

  // Cursor
  if(turnX){
    line(mouseX-5, mouseY-5, mouseX+5, mouseY+5);
    line(mouseX-5, mouseY+5, mouseX+5, mouseY-5);
  }
  else
    circle(mouseX, mouseY, 10);
}

void checkWin(){

}

void mouseClicked(){
  msX = mouseX;
  msY = mouseY;
  
  boolean oOB = false; // Checks if mouse position out of bounds
  
  if(mouseX < 100 || mouseX > 600)
    oOB = true;
  else if(msX >= 100 && msX < 266)
    col = 0;
  else if(msX >= 266 && msX < 433)
    col = 1;
  else if(msX >= 433 && msX <= 600)
    col = 2;
  
  if(mouseY < 100 || mouseY > 600)
    oOB = true;
  else if(msY >= 100 && msY < 266)
    row = 0;
  else if(msY >= 266 && msY < 433)
    row = 1;
  else if(msY >= 433 && msY <= 600)
    row = 2;
  
  if(turnX && oOB == false && board[row][col] == 0 && winner == 0){
    board[row][col] = 1;
    turnX = false;
  }
  else if(oOB == false && board[row][col] == 0 && winner == 0){
    board[row][col] = 2;
    turnX = true;
  }

  if(msX >= 245 && msX <= 455 && msY >= 620 && msY <= 685){
    winner = 0;
    for(int c = 0; c < board.length; c++){
      for(int r = 0; r < board[0].length; r++){
        board[r][c] = 0;
      }
    }
  }
}

void placeX(int posX, int posY){
   int xCoor, yCoor;
   if(posX == 0)
     xCoor = 180;
   else if(posX == 1)
     xCoor = 350;
   else
     xCoor = 515;
   
   if(posY == 0)
     yCoor = 180;
   else if(posY == 1)
     yCoor = 350;
   else
     yCoor = 515;
     
   line(yCoor+50, xCoor+50, yCoor-50, xCoor-50);
   line(yCoor+50, xCoor-50, yCoor-50, xCoor+50);
}

void placeO(int posX, int posY){
   int xCoor, yCoor;
   if(posX == 0)
     xCoor = 180;
   else if(posX == 1)
     xCoor = 350;
   else
     xCoor = 515;
   
   if(posY == 0)
     yCoor = 180;
   else if(posY == 1)
     yCoor = 350;
   else
     yCoor = 515;
     
   circle(yCoor, xCoor, 100);
}

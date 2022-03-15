/**
 * Keyboard. 
 * 
 * Click on the image to give it focus and press the letter keys 
 * to create forms in time and space. Each key has a unique identifying 
 * number. These numbers can be used to position shapes in space. 
 */
   
boolean[] keys = new boolean[5]; // if key pressed
int xCoor = 0; // cursor x coordinate
int yCoor = 0; // cursor y coordinate
int cHeight = 500; // canvas height
int cWidth = 500; // canvas width
int tempX = 0;
int tempY = 0;
   
void setup() {
  size(500, 500);
  noStroke();
  background(0);
}

void draw() { 
  tempX = xCoor;
  tempY = yCoor;
  if(keys[0]){
    //print("UP ");
    if (yCoor > 0)
      yCoor--;
  }
  if(keys[1]){
    //print("DOWN ");
    if (yCoor < cHeight)
      yCoor++;
  }
  if(keys[2]){
    //print("LEFT ");
    if (xCoor > 0)
      xCoor--;
  }
  if(keys[3]){
    //print("RIGHT ");
    if (xCoor < cWidth)
      xCoor++;
  }
  //println();
  println("(" + xCoor + ", " + yCoor + ")");
  
  //line(tempX, tempY, xCoor, yCoor);
  //background(0);
  
  println("Space == " + keys[4]);
  
  if(xCoor != tempX || yCoor != tempY){
    if(keys[4] == false)
      circle(xCoor, yCoor, 2);
  }
}

void keyPressed() {
  if (key == CODED){
    if (keyCode == UP)
      keys[0] = true;
    if (keyCode == DOWN)
      keys[1] = true;
    if (keyCode == LEFT)
      keys[2] = true;
    if (keyCode == RIGHT)
      keys[3] = true;
    if (keyCode == 32) //Space Bar
      keys[4] = true;
  }
  if (key == ' ') //Space Bar
    keys[4] = true;
  if (key == 'c') //clear
    background(0);
}

void keyReleased() {
  if (key == CODED){
    if (keyCode == UP)
      keys[0] = false;
    if (keyCode == DOWN)
      keys[1] = false;
    if (keyCode == LEFT)
      keys[2] = false;
    if (keyCode == RIGHT)
      keys[3] = false;
  }
  if (key == ' ') //Space Bar
    keys[4] = false;
}

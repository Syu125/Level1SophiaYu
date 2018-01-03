boolean endGame = false;
double birdYVelocity=2;
double gravity=0.5;
int pipeX=500;
int pipe2X=500;
int pipeHeight=(int) random(200, 200);
int pipe2Height=(int) random(200, 200);
int x=250;
int y=100;
void setup() {
  size(500, 500);
}
void draw() {
  text("Score", 20, 20);
  pipeX-=5;
  pipe2X-=5;
  y+=birdYVelocity;
  birdYVelocity+=gravity;
  background(157, 188, 240);
  fill(255, 75, 75);
  ellipse(x, y, 8, 8);
  fill(0, 255, 0);
  rect(pipeX, 0, 50, pipeHeight);
  fill(0, 255, 0);
  rect(pipe2X, 500, 50, -pipe2Height);
  if (pipeX==-50) {
    pipeX=500;
    pipeHeight=(int) random(200, 200);
  }
  if (pipe2X==-50) {
    pipe2X=500;
    pipe2Height=(int) random(200, 200);
  }
  if (inter1(x, y, pipeX, pipeHeight, 50)) {
    endGame=true;
  } 
  if (inter2(x, y, pipe2X, pipe2Height, 50)) {
    endGame=true;
  }
  if (endGame==true) {
    fill(255, 0, 0);
    rect(0, 0, 500, 500);
  }
 
}

  boolean inter1(int birdX, int birdY, int paddleX, int paddleY, int paddleLength) {
    if (birdY < paddleY - 4  && birdX > paddleX && birdX < paddleX + paddleLength) {
      return true; 
    } else {
      return false;
    }
  }

  boolean inter2(int birdX, int birdY, int paddleX, int paddleY, int paddleLength) {
    if (birdY > paddleY - 4 && birdX > paddleX && birdX < paddleX + paddleLength) {
      return true;
    } else {
      return false;
    }
  }

void mousePressed() {
  birdYVelocity=-5;
}
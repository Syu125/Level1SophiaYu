import ddf.minim.*;
Minim minim;
AudioSample sound;  
PImage backgroundImage;
int x = 240;
int y = 160;
int s = 5;
int Y = mouseY;
int S = 0;

void setup() {
  minim = new Minim (this);
  sound = minim.loadSample("pong.wav", 128);
  backgroundImage = loadImage("pong.jpg");
  size(480, 320);
}
void draw() {

  Y = mouseY;
  image(backgroundImage, 0, 0);
  x+=s;
  y+=S;
  ellipse(x, y, 5, 5);  
  fill(52, 245, 243);    
  noStroke(); 
  rect(0, Y, 5, 40);
  if (x>475) {
    sound.trigger();  
    s=-5;
  }
  if (x<5) {
    sound.trigger();  
    s=5;
  }
  if (y>320) {
    sound.trigger();  
    S=-5;
  }
  if (y<5) {
    sound.trigger();  
    S=5;
  }
  if (intersects(x, y, 0, Y, 40)) {
    if (Y > 240) {
      S = 1;
    } else if (Y < 240) {
      S = -1;
    } else if (Y == 240) {
      S = 0;
    }
  }else if(x <5){
    background(0,0,0);
    text("You Lose!",215,160);
    stop();
  }
}
  boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
    if (ballY > paddleY && ballX == paddleX && ballX < paddleX + paddleLength)
      return true;
    else 
    return false;
  }

boolean endGame = false;
double birdYVelocity=2;
double gravity=0.5;
int pipeX=500;
int pipeHeight=(int) random(100, 250);
int x=250;
int y=100;
void setup(){
  size(500,500);
}
void draw(){
  pipeX-=5;
  y+=birdYVelocity;
  birdYVelocity+=gravity;
  background(157,188,240);
  fill(255,75,75);
  ellipse(x,y,50,50);
  fill(0,255,0);
  rect(pipeX,0,50,pipeHeight);
  if(pipeX==-50){
  pipeX=500;
  pipeHeight=(int) random(50, 200);
 if(intersects(x,y,pipeX,0,50)){
 endGame=true;
 }
if(endGame==true){
fill(255,0,0);
rect(0,0,500,500);
}

  }
}
boolean intersects(int birdX, int birdY, int paddleX, int paddleY, int paddleLength) {
if (birdY > paddleY - 4 && birdX > paddleX && birdX < paddleX + paddleLength){
return true;
}else{
  return false;
}

}
void mousePressed(){
birdYVelocity=-10;
}
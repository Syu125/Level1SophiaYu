double birdYVelocity=2;
double gravity=0.5;
int x=250;
int y=100;
void setup(){
  size(500,500);
}
void draw(){
  y+=birdYVelocity;
  birdYVelocity+=gravity;
  background(157,188,240);
  fill(255,75,75);
  ellipse(x,y,50,50);
  
}
void mousePressed(){
;
}
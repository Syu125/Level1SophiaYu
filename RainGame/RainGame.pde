int randomNumber=(int) random(500); 
int x=200;
int y=0;
void setup(){
  size(500, 500);

}

void draw(){
    y=y+5;
background(225,225,225);
for(int i=0;i<500;i++){
  ellipse(x, y, 20, 40); 
  fill(0, 0, 225);
  noStroke();
}
if(y==500){
  x=0;
  int randomNumber=(int) random(500); 
  y=0;

}
}
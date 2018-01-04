int frogX = 250;
int frogY = 450;
Car c1= new Car();
Car c2 = new Car();
Car c3 = new Car();
Car c4 = new Car();
Car c5 = new Car();
Car c6 = new Car();
Lillipad l1 = new Lillipad();
Lillipad l2 = new Lillipad();
Lillipad l3 = new Lillipad();
Lillipad l4 = new Lillipad();
Lillipad l5 = new Lillipad();
Lillipad l6 = new Lillipad();
void setup() {
  size(500, 500);
}
void draw() {
  background(146, 194, 216);
  fill(229,25,80);
  ellipse(frogX, frogY, 30, 30);
  if (frogX>=485) {
    frogX-=20;
  } else if (frogX<=15) {
    frogX+=20;
  } else if (frogY>=485) {
    frogY-=20;
  } else if (frogY<=15) {
    frogY+=20;
  }
  c1.display();
  c1.moveRight();
  if(intersects(c1)){
    frogX = 250;
    frogY = 450;
   
}
c2.display();
  c2.moveLeft();
  if(intersects(c2)){
    frogX = 250;
    frogY = 450;

} 
c3.display();
  c3.moveRight();
  if(intersects(c3)){
    frogX = 250;
    frogY = 450;

}   
c4.display();
  c4.moveLeft();
  if(intersects(c4)){
    frogX = 250;
    frogY = 450;
    
}
c5.display();
  c5.moveRight();
  if(intersects(c5)){
    frogX = 250;
    frogY = 450;
   
}
c6.display();
  c6.moveLeft();
  if(intersects(c6)){
    frogX = 250;
    frogY = 450;
}
  l1.displayL();
  l1.moveRight();
  
   l2.displayL();
  l2.moveRight();
  
   l3.displayL();
  l3.moveRight();
  
   l4.displayL();
  l4.moveRight();
  
   l5.displayL();
  l5.moveRight();
  
   l6.displayL();
  l6.moveRight();
  

if(frogY<70){
background(0,0,0);
fill(255,255,255);
text("You win!", 225,250);
}
}
void keyPressed()
{
  if (key == CODED) {
    if (keyCode == UP)
    {
      frogY-=15;
      fill(229,25,80);
      rect(frogX-10,frogY+25,5,15);
      fill(229,25,80);
      rect(frogX+5,frogY+25,5,15);
    } else if (keyCode == DOWN)
    {
      frogY+=15;
      fill(229,25,80);
      rect(frogX-10,frogY-40,5,15);
      fill(229,25,80);
      rect(frogX+5,frogY-40,5,15);

    } else if (keyCode == RIGHT)
    {
      frogX+=15;
      fill(229,25,80);
      rect(frogX-40,frogY-10,15,5);
      fill(229,25,80);
      rect(frogX-40,frogY+8,15,5);
    } else if (keyCode == LEFT)
    {
      frogX-=15;
      fill(229,25,80);
      rect(frogX+15,frogY-10,15,5);
      fill(229,25,80);
      rect(frogX+15,frogY+8,15,5);
    }
  }
}

class Car{
  
int carX = 0;
int carY = (int) random (100,400);
int carSpeed = (int) random(5,10);
int carSize = (int) random(50,150);


int getcarX(){
  return carX;
}
int getcarY(){
  return carY;
}
int getcarSize(){
  return carSize;
}
void moveLeft(){
carX-=carSpeed;
if(carX<-50){
carX=520;
carY = (int) random(100,400);
carSpeed = (int) random(5,10);
}
}
void moveRight(){
  carX+=carSpeed;
  if(carX>550){
    carX=-60;
    carY = (int) random(100,400);
    carSpeed = (int) random(5,10);
  }
}
  void display() 
  {
    fill(139,86,62);
    rect(carX , carY,  carSize, 20);
  }

}
boolean intersects(Car car) {
if ((frogY+15> car.getcarY() && frogY-15 < car.getcarY()+50) && (frogX+1 > car.getcarX() && frogX-1 < car.getcarX()+car.getcarSize()))
          return true;
    else 
        return false;
}
class Lillipad{
  
int padX = 0;
int padY = (int) random (100,400);
int padSpeed = (int) random(5,10);
int padSize = 20;


int getpadX(){
  return padX;
}
int getcarY(){
  return padY;
}
int getcarSize(){
  return padSize;
}
void moveLeft(){
padX-=padSpeed;
if(padX<-50){
padX=520;
padY = (int) random(100,400);
padSpeed = (int) random(5,10);
}
}
void moveRight(){
  padX+=padSpeed;
  if(padX>550){
    padX=-60;
    padY = (int) random(100,400);
    padSpeed = (int) random(5,10);
  }
}
  void displayL() 
  {
    fill(40,222,96);
    ellipse(padX , padY,  padSize, 20);
  }

}
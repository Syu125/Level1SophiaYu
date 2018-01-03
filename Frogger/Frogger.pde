int frogX = 250;
int frogY = 450;
Car c1= new Car();
Car c2 = new Car();
Car c3 = new Car();
Car c4 = new Car();
Car c5 = new Car();
Car c6 = new Car();
void setup() {
  size(500, 500);
}
void draw() {
  background(146, 194, 216);
  fill(5, 180, 56);
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
}
void keyPressed()
{
  if (key == CODED) {
    if (keyCode == UP)
    {
      frogY-=15;
    } else if (keyCode == DOWN)
    {
      frogY+=15;
    } else if (keyCode == RIGHT)
    {
      frogX+=15;
    } else if (keyCode == LEFT)
    {
      frogX-=15;
    }
  }
}
class Car{
  
int carX =0;
int carY = ;
int carSpeed = 10;
int carSize = 50;

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
if(carX==-50){
carX=520;
}
}
void moveRight(){
  carX+=carSpeed;
  if(carX==550){
    carX=-60;
  }
}
  void display() 
  {
    fill(0,0,0);
    rect(carX , carY,  carSize, 20);
  }

}
boolean intersects(Car car) {
if ((frogY+15> car.getcarY() && frogY-15 < car.getcarY()+50) && (frogX+1 > car.getcarX() && frogX-1 < car.getcarX()+car.getcarSize()))
          return true;
    else 
        return false;
}
int frogX = 250;
int frogY = 250;
Car c1= new Car();
Car c2 = new Car();
void setup() {
  size(500, 500);
}
void draw() {
  background(146, 194, 216);
  fill(5, 180, 56);
  ellipse(frogX, frogY, 30, 30);
  c1.display();
  c2.display();
  if (frogX>=485) {
    frogX-=20;
  } else if (frogX<=15) {
    frogX+=20;
  } else if (frogY>=485) {
    frogY-=20;
  } else if (frogY<=15) {
    frogY+=20;
  }
}
void keyPressed()
{
  if (key == CODED) {
    if (keyCode == UP)
    {
      frogY-=10;
    } else if (keyCode == DOWN)
    {
      frogY+=10;
    } else if (keyCode == RIGHT)
    {
      frogX+=10;
    } else if (keyCode == LEFT)
    {
      frogX-=10;
    }
  }
}
class Car{
int carX = 250;
int carY = 250;
int carSpeed = 0;
int carSize = 50;

  void display() 
  {
    fill(0,0,0);
    rect(carX , carY,  carSize, 20);
  }

}
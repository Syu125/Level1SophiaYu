
int randomNumber=(int) random(500); 
int y=0;
int score=0;

void setup(){
  size(500, 500);

}

void draw(){
    y=y+10;

    if(y==500){
  y=0;
 randomNumber=(int) random(500); 
  }
background(225,225,225);

fill(98,98,98);
  rect(mouseX-25,450,50,50);
  fill(0,0,225);
  ellipse(randomNumber, y, 10, 20); 
  noStroke();
  fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);
println("Your score is now: " + score);
if(y>480){
  if (randomNumber > mouseX-25 && randomNumber < mouseX+25 ){
      score++;
  }
   else if (score > 0)
     score--;
}
if(score==11){
text("You Win!", 225, 250);
textSize(50);
stop();

}
}
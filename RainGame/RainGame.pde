//import ddf.minim.*;  
//Minim minim;      
//AudioSample sound; 
minim = new Minim (this);  
sound = minim.loadSample("BD.wav", 128);
int randomNumber=(int) random(500); 
int y=0;
int score=0;

void setup(){
  size(500, 500);

}

void draw(){
    y=y+15;
background(225,225,225);
if(y>495){
  if (randomNumber > mouseX-25 && randomNumber < mouseX+25 ){
      score++;
      sound.trigger();  
  }
   else if (score > 0)
     score--;

}
  randomNumber=(int) random(500); 
  y=0;

fill(98,98,98);
  rect(mouseX-25,450,50,50);
  fill(0,0,225);
  ellipse(randomNumber, y, 20, 40); 
  noStroke();
  fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);
println("Your score is now: " + score);
if(score==10){
text("You Win!", 225, 250);
textSize(50);
stop();

}
}
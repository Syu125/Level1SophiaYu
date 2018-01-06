float x =0;
float y = 0;
float r = random(0);
float g = random(255);
float b = random(255);
int i = 0;
int X = 0;
int a = 1;

void setup() {
  size(2000, 1200);
  background(255, 255, 255);
}
void draw() {

  makeMagical();
     x = random(1000);
  y = random(1000);
 
 for(int i = 0; i<= X; i++){
 fill(r, g, b);
    ellipse(getWormX(i), getWormY(i), 5, 5);
    r = random(0);
    g = random(255);
    b = random(255);
    
 }

 
  
}
float frequency = 0.001;
float noiseInterval = PI; 

void makeMagical() {
  fill( 0, 0, 0, 10 );rect(0, 0, width, height);noStroke();
}

float getWormX(int i) {
  return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
  return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}
void mousePressed(){
 X++;
   

}
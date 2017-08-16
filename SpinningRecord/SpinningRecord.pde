import ddf.minim.*;  
PImage pictureOfRecord;
Minim minim;  
AudioPlayer song;  
int i=0;

void setup(){
minim = new Minim(this); 
song = minim.loadFile("song1.mp3", 512);
pictureOfRecord = loadImage("Record.jpg");
size(pictureOfRecord.width, pictureOfRecord.height);
}

void draw(){
  image(pictureOfRecord,0,0);
  if(mousePressed){
      rotateImage(pictureOfRecord,i+=70);
      song.play();
    }else{
      song.pause();
    }
  image(pictureOfRecord, 0,0);
}

void rotateImage(PImage image, int amountToRotate) {
      translate(width/2, height/2);
      rotate(amountToRotate*TWO_PI/360);                              
      translate(-image.width/2, -image.height/2);     
}

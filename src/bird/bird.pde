int birdX = 105;
int birdY =200;

int birdYVelocity = 70;
double gravity = 2;

int pipeX = 500;
int upperY = 0;
int upperPipeHeight = 300;
int pipeGap =160;
int lowerY;

int score = 0;




void setup(){

  size(500,800);
  
  
}

void draw(){
   
  
  
  
  background(135, 206, 250);
  fill (50,205,50);
  
  ellipse(birdX,birdY, 75, 50);
  
  birdY+=gravity;
  gravity+=0.25;
 
  
  teleportPipes();
  crashCheck();
  
  
}

void mousePressed() {
   birdY-=birdYVelocity;
   
   gravity=0;
  
}

void teleportPipes(){
   fill(255, 0, 0);
  rect(pipeX, upperY, 100, upperPipeHeight);
  
  lowerY = upperY + upperPipeHeight + pipeGap;
  
  rect(pipeX, lowerY, 100, height);
  pipeX-=1; 
 
  if (pipeX < -100){
    pipeX=500;
    
    score++;
    System.out.println(score);
  } 
}

void crashCheck() {
  if (birdX == pipeX){
    System.out.println("Crash");
    
   //return true;
  }
  
}
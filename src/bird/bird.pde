int birdX = 105;
int birdY =200;

int birdYVelocity = 70;
double gravity = 2;

int pipeX = 500;
int upperY = 0;
int upperPipeHeight = 300;
int pipeGap =190;
int lowerY;

int score = 0;

boolean crashed =false;


int speed= 10;

void setup(){

  size(500,800);
  
  
}

void draw(){
  
  crashed = crashCheck();
  
  if (crashed == true){
    fill(0,0,0);
    textSize(19); 
    //System.out.println("Crashed True");
    text("You died with a final score of "  +score, 180, 375);
   
   
   }
   
   else{
    background(135, 206, 250);
    
    fill(0,0,0);
    textSize(19); 
    text("Score: "  +score, 410, 20);
    
    fill (50,205,50);
   
    ellipse(birdX,birdY, 75, 50);
  
    birdY+=gravity;
    gravity+=0.25;
 
  
    teleportPipes();
    crashCheck();
  
   }
}

void mousePressed() {
    if(crashed== false){
     birdY-=birdYVelocity;
     gravity=0;
    }
  
}

void teleportPipes(){
   fill(255, 0, 0);
   
  rect(pipeX, upperY, 100, upperPipeHeight);
  


  lowerY = upperY + upperPipeHeight + pipeGap;
  
  rect(pipeX, lowerY, 100, height);
  pipeX-=speed; 
 
  if (pipeX < -100){
    
    upperPipeHeight = (int) random(100, 350);
    pipeX=500;
    
    score++;
    System.out.println(score);
    
  } 
}

boolean crashCheck() {
  if (birdX >= pipeX && pipeX >= 25){
    if(birdY <= upperPipeHeight || birdY >= upperPipeHeight+pipeGap-10){
      //System.out.println("Crashed");
      return true; 
    }
  }

  return false;
}
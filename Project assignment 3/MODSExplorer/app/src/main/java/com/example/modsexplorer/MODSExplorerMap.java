package com.example.modsexplorer;

import ketai.net.nfc.KetaiNFC;
import ketai.ui.KetaiGesture;
import processing.core.PApplet;
import processing.core.PImage;

import android.content.Intent;
import android.view.MotionEvent;

public class MODSExplorerMap extends PApplet {

  int tagValue;
  int ptagValue;
  int mapToggle;
  int imageNumber;
  int pictureCount;
  KetaiNFC ketaiNFC;
  float mapX, mapY, mapWidth, mapHeight;
  float zoomX, zoomY;
  PImage mapFloor1, mapFloor2; 
  PImage aviationStation1, aviationStation2, aviationStation3, aviationStation4, aviationStation5;
  PImage discoveryCenter1;
  PImage ecoScapes1, ecoScapes2, ecoScapes3, ecoScapes4, ecoScapes5, ecoScapes6, ecoScapes7, ecoScapes8;
  PImage everglades1, everglades2;
  PImage gizmoCity1;
  PImage goGreen1, goGreen2, goGreen3;
  PImage otter1, otter2;
  PImage powerfulYou1, powerfulYou2, powerfulYou3, powerfulYou4, powerfulYou5, powerfulYou6, powerfulYou7;
  PImage prehistoric1, prehistoric2;
  PImage stormCenter1, stormCenter2, stormCenter3, stormCenter4, stormCenter5, stormCenter6;
  PImage waterStory1, waterStory2, waterStory3, waterStory4, waterStory5, waterStory6, waterStory7;
  PImage arrowLeft, arrowRight;
  PImage homeButton;
  PImage backButton;
  KetaiGesture gesture;


public void setup() {   
    
    //Sets orientation and instantiates variables 
  
    smooth();
    imageMode(CENTER);
    orientation(PORTRAIT);
    textSize(36);
    textAlign(CENTER, BOTTOM);
    fill(255);
    mapWidth = width;
    mapHeight = 9*height/10;
    mapX = mapWidth/2;
    mapY = mapHeight/2;
    mapToggle = 1;
    tagValue = 0;
    ptagValue = 0;
    imageNumber = 1;
    pictureCount = 0;
    gesture = new KetaiGesture(this);
    
    //establishes images as part of the PImage Class
    
    homeButton = new PImage();
    backButton = new PImage();
    mapFloor1 = new PImage();
    mapFloor2 = new PImage();
    aviationStation1 = new PImage();
    aviationStation2 = new PImage();
    aviationStation3 = new PImage();
    aviationStation4 = new PImage();
    aviationStation5 = new PImage();
    discoveryCenter1 = new PImage();
    ecoScapes1 = new PImage();
    ecoScapes2 = new PImage();
    ecoScapes3 = new PImage();
    ecoScapes4= new PImage();
    ecoScapes5 = new PImage();
    ecoScapes6 = new PImage();
    ecoScapes7 = new PImage();
    ecoScapes8 = new PImage();
    everglades1 = new PImage();
    everglades2 = new PImage();
    gizmoCity1 = new PImage();
    goGreen1 = new PImage();
    goGreen2 = new PImage();
    goGreen3 = new PImage();
    otter1 = new PImage();
    otter2 = new PImage();
    powerfulYou1 = new PImage();
    powerfulYou2 = new PImage();
    powerfulYou3 = new PImage();
    powerfulYou4 = new PImage();
    powerfulYou5 = new PImage();
    powerfulYou6 = new PImage();
    powerfulYou7 = new PImage();
    prehistoric1 = new PImage();
    prehistoric2 = new PImage();
    stormCenter1 = new PImage();
    stormCenter2 = new PImage();
    stormCenter3 = new PImage();
    stormCenter4 = new PImage();
    stormCenter5 = new PImage();
    stormCenter6 = new PImage();
    waterStory1 = new PImage();
    waterStory2 = new PImage();
    waterStory3 = new PImage();
    waterStory4 = new PImage();
    waterStory5 = new PImage();
    waterStory6 = new PImage();
    waterStory7 = new PImage();
    arrowLeft = new PImage();
    arrowRight = new PImage();
    
    //homeButton = loadImage("home button_2.png");
    //backButton = loadImage("Back Button.png");
    mapFloor1 = loadImage("mapFloor1.png");
    mapFloor2 = loadImage("mapFloor2.png");
    //arrowLeft = loadImage("Arrow Left.png");
    //arrowRight = loadImage("Arrow Right.png");
    /**aviationStation1 = loadImage("aviationStation_1.JPG");
    aviationStation2 = loadImage("aviationStation_2.JPG");
    aviationStation3 = loadImage("aviationStation_3.JPG");
    aviationStation4 = loadImage("aviationStation_4.JPG");
    aviationStation5 = loadImage("aviationStation_5.JPG");
    discoveryCenter1 = loadImage("discoveryCenter_1.JPG");
    ecoScapes1 = loadImage("ecoScapes_1.JPG");
    ecoScapes2 = loadImage("ecoScapes_2.JPG");
    ecoScapes3 = loadImage("ecoScapes_3.JPG");
    ecoScapes4= loadImage("ecoScapes_4.JPG");
    ecoScapes5 = loadImage("ecoScapes_5.JPG");
    ecoScapes6 = loadImage("ecoScapes_6.JPG");
    ecoScapes7 = loadImage("ecoScapes_7.JPG");
    ecoScapes8 = loadImage("ecoScapes_8.JPG");
    everglades1 = loadImage("everglades_1.JPG");
    everglades2 = loadImage("everglades_2.JPG");
    gizmoCity1 = loadImage("gizmoCity_1.JPG");
    goGreen1 = loadImage("goGreen_1.JPG");
    goGreen2 = loadImage("goGreen_2.JPG");
    goGreen3 = loadImage("goGreen_3.JPG");
    otter1 = loadImage("otter_1.png");
    otter2 = loadImage("otter_2.JPG");
    powerfulYou1 = loadImage("powerfulYou_1.JPG");
    powerfulYou2 = loadImage("powerfulYou_2.JPG");
    powerfulYou3 = loadImage("powerfulYou_3.JPG");
    powerfulYou4 = loadImage("powerfulYou_4.JPG");
    powerfulYou5 = loadImage("powerfulYou_5.JPG");
    powerfulYou6 = loadImage("powerfulYou_6.JPG");
    powerfulYou7 = loadImage("powerfulYou_7.JPG");
    prehistoric1 = loadImage("prehistoric_1.png");
    prehistoric2 = loadImage("prehistoric_2.JPG");
    stormCenter1 = loadImage("stormCenter_1.JPG");
    stormCenter2 = loadImage("stormCenter_2.JPG");
    stormCenter3 = loadImage("stormCenter_3.JPG");
    stormCenter4 = loadImage("stormCenter_4.JPG");
    stormCenter5 = loadImage("stormCenter_5.png");
    stormCenter6 = loadImage("stormCenter_6.JPG");
    waterStory1 = loadImage("waterStory_1.JPG");
    waterStory2 = loadImage("waterStory_2.JPG");
    waterStory3 = loadImage("waterStory_3.JPG");
    waterStory4 = loadImage("waterStory_4.JPG");
    waterStory5 = loadImage("waterStory_5.JPG");
    waterStory6 = loadImage("waterStory_6.JPG");
    waterStory7 = loadImage("waterStory_7.JPG");*/
}


    //--HERE
public void draw() {

if(tagValue != ptagValue) {
  imageNumber = 1;
}

if(tagValue == 0){
	background(255, 255, 255);
	pushMatrix();
	if(mapToggle == 1) {
		  image(mapFloor1, mapX, mapY, mapWidth, mapHeight);
		} else if(mapToggle == 2) {
		  image(mapFloor2, mapX, mapY, mapWidth, mapHeight); 
		}
	popMatrix();
}

switch(tagValue) {
//case 0:
//break;

case 1:
    fill(0);
    pictureCount = 5;
    tagValue = 0; //-
    aviationStation();
    break;

case 2:
    fill(0);
    pictureCount = 1;
    tagValue = 0; //--resets the variable, that way when it opens the MAP app it does not reach this case.
    discoveryCenter();
break;

/*case 3:
fill(0);
pictureCount = 0;
discoveryLab();
break;
*/
case 4:
    fill(0);
    pictureCount = 8;
    tagValue = 0;//-
    ecoScapes();
    break;

case 5: 
    fill(0);
    pictureCount = 2;
    tagValue = 0;
    everglades();
    return;

case 6:
    fill(0);
    pictureCount = 1;
    tagValue = 0;
    gizmoCity();
    break;

case 7:
    fill(0);
    pictureCount = 3;
    tagValue = 0;
    goGreen();
    break;

case 8:
    fill(0);
    pictureCount = 2;
    tagValue = 0;
    otter();
    break;

case 9:
    fill(0);
    pictureCount = 7;
    tagValue = 0;
    powerfulYou();
    break;

case 10:
    fill(0);
    pictureCount = 2;
    tagValue = 0;
    prehistoric();
    break;

case 11:
    fill(0);
    pictureCount = 6;
    tagValue = 0;
    stormCenter();
    break;

case 12:
    fill(0);
    pictureCount = 7;
    tagValue = 0;
    waterStory();
    break;

    default:


}

fill(255, 255, 255);
//rect(0, 9*height/10, width, height/10);
//image(homeButton, width/2, 19*height/20, width/7, height/10+2);



//if(tagValue != 0) {
  //image(arrowLeft, width/20, 19*height/20, width/10, height/10);
  //image(arrowRight, 19*width/20, 19*height/20, width/10, height/10);
  //image(backButton, width/14, height/20, width/7, height/10);
//}

ptagValue = tagValue;
}
public void mousePressed() {
  if(tagValue != 0 && mouseX>0 && mouseX<width/10 && mouseY>9*height/10 && mouseY<height) {
      if(imageNumber>1) {
        imageNumber--;
      } else {
        imageNumber = pictureCount;
      }
    }
    if(tagValue != 0 && mouseX>9*width/10 && mouseX<width && mouseY>9*height/10 && mouseY<height) {
      if(imageNumber<pictureCount) {
        imageNumber++;
      } else {
        imageNumber = 1;

      }
    }
    if(tagValue != 0 && mouseX>0 && mouseX<width/7 && mouseY>0 && mouseY<height/10) {
    	mapToggle = 1;
        mapWidth = width;
        mapHeight = 9*height/10; 
        mapX = mapWidth/2;
        mapY = mapHeight/2;
        tagValue = 0;
    }
    
    // Exit screen
    if(mouseX>3*width/7 && mouseX<4*width/7 && mouseY>9*height/10 && mouseY<height) {
    	exit();
    }
}

  public void onTap(float x, float y) {
      zoomX = mapWidth/width;
    zoomY = mapHeight/(9*height/10);
      
      if(mapToggle == 1 && mouseY < 9*height/10) {
        
    	  if(mouseX > ((((1748-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((2416-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1410-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1612-1650)*height/3300)*zoomY)+mapY)) {

              mapToggle = 2;
                mapWidth = width;
                mapHeight = 9*height/10; 
                mapX = mapWidth/2;
                mapY = mapHeight/2;
          
        }
        
        if(mouseX > ((((866-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1152-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((450-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((856-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 5;
          
        }
        if(mouseX > ((((866-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1152-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((866-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1206-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 11;
          
        }
        if(mouseX > ((((866-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1152-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1222-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1566-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 7;
          
        }
        if(mouseX > ((((866-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1152-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1580-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((2040-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 2;
          
        }
        if(mouseX > ((((1270-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1464-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1134-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1852-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 4;
          
        }
        if(mouseX > ((((1466-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1634-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1258-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1852-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 4;
          
        }
        if(mouseX > ((((1638-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1752-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1370-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((2090-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 4;
          
        }
        if(mouseX > ((((1270-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1464-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((688-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1130-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 12;
          
        }
        if(mouseX > ((((1466-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1634-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((688-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1258-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 12;
          
        }
        if(mouseX > ((((1638-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1752-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((688-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1368-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 12;
          
        }
        if(mouseX > ((((1270-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1522-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((332-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((682-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 10;
          
        }
        if(mouseX > ((((1534-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1754-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((414-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((682-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 8;
          
        }
      } else if(mapToggle == 2 && mouseY<9*height/10) {
          
          if(mouseX > ((((1748-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((2416-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1410-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1612-1650)*height/3300)*zoomY)+mapY)) {

            mapToggle = 1;
              mapWidth = width;
              mapHeight = 9*height/10;
              mapX = mapWidth/2;
              mapY = mapHeight/2;
              
              
            }
        
        if(mouseX > ((((386-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((778-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1752-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((2502-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 1;
          
        }
        if(mouseX > ((((386-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((778-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1350-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1744-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 6;
          
        }
        if(mouseX > ((((866-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1284-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1150-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1828-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 9;
          
        }
        if(mouseX > ((((1392-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1716-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((1310-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((1542-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 3;
          
        }
        if(mouseX > ((((1298-1275)*width/2550)*zoomX)+mapX) && mouseX < ((((1696-1275)*width/2550)*zoomX)+mapX) && mouseY > ((((340-1650)*height/3300)*zoomY)+mapY) && mouseY < ((((734-1650)*height/3300)*zoomY)+mapY)) {
          tagValue = 8;
          
        }
        }


  }
  
  public void mouseDragged() {
      if((mouseX-pmouseX) < 0) { //swipe to the left
        if((mapX + mapWidth/2) > width) {
          mapX += mouseX-pmouseX;
        } 
      } else { //swipe to the right
        if((mapX-mapWidth/2) < 0) {
          mapX += mouseX-pmouseX;
        }
      }
      
      if((mouseY-pmouseY) < 0) { //swipe up
        if((mapY + mapHeight/2) > 9*height/10) {
          mapY += mouseY-pmouseY;
        }
      } else { //swipe down
        if(mapY-(mapHeight/2) < 0)  {
          mapY += mouseY-pmouseY;
        }
     } 
      
    }
  public void onPinch(float x, float y, float d) {
      mapWidth = constrain(mapWidth + 2 * d, width, 2*width);
      mapHeight = constrain(mapHeight + 2 * (mapHeight/mapWidth) * d, 9*height/10, 2*9*height/10);
      }
  public void aviationStation() {
    //background(255, 247, 114);
      Intent intent = new Intent();
      intent.setAction("org.mods.tofly");
      sendBroadcast(intent);

  }
  //
  public void discoveryCenter() {
      Intent intent = new Intent();
      intent.setAction("org.example.discoverycenter");
      sendBroadcast(intent);

  }
  public void discoveryLab() {
    background(255,247,114);
  }
  public void ecoScapes() {
    //background(255,247,114);
      Intent intent = new Intent();
      intent.setAction("org.example.ecoscapes");
      sendBroadcast(intent);
  }
  public void everglades() {
    //background(255,247,114);

      Intent intent = new Intent();
      intent.setAction("org.example.sudoku");
      sendBroadcast(intent);
  }
    
  public void gizmoCity() {
      Intent intent = new Intent();
      intent.setAction("org.example.gizmoCity");
      sendBroadcast(intent);
  }
  public void goGreen() {
    //background(255,247,114);

      Intent intent = new Intent();
      intent.setAction("org.mods.gogreen");
      sendBroadcast(intent);
  }
  public void otter() {
    //background(255,247,114);

      Intent intent = new Intent();
      intent.setAction("org.example.otters");
      sendBroadcast(intent);
      //Intent launchintent = getPackageManager().getLaunchIntentForPackage("org.example.otters");
      //startActivity(launchintent);

  }
  public void powerfulYou() {
    //background(255,247,114);

      Intent intent = new Intent();
      intent.setAction("org.mods.powerfulyou");
      sendBroadcast(intent);
  }
  public void prehistoric() {
    //background(255,247,114);

      Intent intent = new Intent();
      intent.setAction("org.example.prehistoricflorida");
      sendBroadcast(intent);
  }
  

  public void stormCenter() {
    //background(255,247,114);

      Intent intent = new Intent();
      intent.setAction("org.mods.app.stormcenter");
      sendBroadcast(intent);
  }
  public void waterStory() {
    //background(255,247,114);

      Intent intent = new Intent();
      intent.setAction("org.mods.app.floridawaterstory");
      sendBroadcast(intent);
  }



  public boolean surfaceTouchEvent(MotionEvent event) {  //(20)
      //call to keep mouseX and mouseY constants updated
      super.surfaceTouchEvent(event);
      //forward events
      return gesture.surfaceTouchEvent(event);

  }


}

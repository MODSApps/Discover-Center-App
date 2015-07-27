package com.example.modsexplorer;

import java.util.Map;

import ketai.net.nfc.KetaiNFC;
import processing.core.PApplet;
import processing.core.PImage;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;

import com.parse.ParseUser;


public class NFCMODSREAD extends PApplet {

/**
 * <p>Ketai Sensor Library for Android: http://KetaiProject.org</p>
 *
 * <p>Ketai NFC Features:
 * <ul>
 * <li>handles incoming Near Field Communication Events</li>
 * </ul>
 * <p>Note:
 * Add the following within the sketch activity to the AndroidManifest.xml:
 * 
 * <uses-permission android:name="android.permission.NFC" /> 
 *
 * <intent-filter>
 *   <action android:name="android.nfc.action.TECH_DISCOVERED"/>
 * </intent-filter>
 *
 * <intent-filter>
 *  <action android:name="android.nfc.action.NDEF_DISCOVERED"/>
 * </intent-filter>
 *
 * <intent-filter>
 *  <action android:name="android.nfc.action.TAG_DISCOVERED"/>
 *  <category android:name="android.intent.category.DEFAULT"/>
 * </intent-filter>
 *
 * </p> 
 * <p>Updated: 2012-03-10 Daniel Sauter/j.duran</p>
 */
// Required NFC methods on startup





Map<String, Boolean> stickerCollection;
String tagText = "";
KetaiNFC ketaiNFC;
int tagValue;
int ptagValue;
int imageNumber;
int pictureCount;
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
PImage nfcImage;

@SuppressWarnings("unchecked")
public void setup() {   
	
  stickerCollection = (Map<String, Boolean>) ParseUser.getCurrentUser().get("stickerCollection");

  ketaiNFC = new KetaiNFC(this);
  smooth();
  imageMode(CENTER);
  orientation(PORTRAIT);
  textSize(36);
  textAlign(CENTER, BOTTOM);
  fill(255);
  tagValue = 0;
  ptagValue = 0;
  imageNumber = 1;
  pictureCount = 0;
  
  //establishes images as part of the PImage Class
  
  nfcImage = new PImage();
  homeButton = new PImage();
  backButton = new PImage();
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
  
  nfcImage = loadImage("nfc_page.png");
  homeButton = loadImage("home button_2.png");
  backButton = loadImage("Back Button.png");
  arrowLeft = loadImage("Arrow Left.png");
  arrowRight = loadImage("Arrow Right.png");
  aviationStation1 = loadImage("aviationStation_1.JPG");
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
  waterStory7 = loadImage("waterStory_7.JPG");
  
}



public void draw() {
  background(255, 247, 114);
  if(tagValue == 0) {
	  image(nfcImage, width/2, 9*height/20, width, 9*height/10);
  }
if(tagValue != ptagValue) {
      imageNumber = 1;
    }
    
switch(tagValue) {
case 0:
break;

case 1:
fill(0);
pictureCount = 5;
aviationStation();
break;

case 2:
fill(0);	
pictureCount = 1;
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
ecoScapes();
break;

case 5: 
fill(0);
pictureCount = 2;
everglades();
break;

case 6:
fill(0);
pictureCount = 1;
gizmoCity();
break;

case 7:
fill(0);
pictureCount = 3;
goGreen();
break;

case 8:
fill(0);
pictureCount = 2;
otter();
break;

case 9:
fill(0);
pictureCount = 7;
powerfulYou();
break;

case 10:
fill(0);
pictureCount = 2;
prehistoric();
break;

case 11:
fill(0);
pictureCount = 6;
stormCenter();
break;

case 12:
fill(0);
pictureCount = 7;
waterStory();
break;

}

    image(homeButton, width/2, 19*height/20, width/7, height/10+2);

    if(tagValue != 0) {
      image(arrowLeft, width/20, 19*height/20, width/10, height/10);
      image(arrowRight, 19*width/20, 19*height/20, width/10, height/10);
      image(backButton, width/14, height/20, width/7, height/10);
      }
    

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
          tagValue = 0;
      }
      
      // Exit screen
      if(mouseX>3*width/7 && mouseX<4*width/7 && mouseY>9*height/10 && mouseY<height) {
      	exit();
      }
  }

public void onNFCEvent(String txt) { //(2)
tagValue = Integer.parseInt(trim(txt)); 
}



public void aviationStation() {
	stickerCollection.put("aviationStation", true);
	ParseUser.getCurrentUser().saveInBackground();
	
    background(255, 247, 114);

    Intent launchintent = getPackageManager().getLaunchIntentForPackage("org.example.discoverycenter");
    startActivity(launchintent);
  }
  public void discoveryCenter() {
    Intent launchintent = getPackageManager().getLaunchIntentForPackage("org.example.discoverycenter");
    startActivity(launchintent);
  }
  public void discoveryLab() {
    background(255,247,114);
  }
  public void ecoScapes() {
	stickerCollection.put("ecoScapes", true);
	ParseUser.getCurrentUser().saveInBackground();
	
    background(255, 247, 114);

    Intent launchintent = getPackageManager().getLaunchIntentForPackage("org.example.discoverycenter");
    startActivity(launchintent);

    }

  public void everglades() {
	stickerCollection.put("everglades", true);
	ParseUser.getCurrentUser().saveInBackground();
	
    background(255, 247, 114);

      Intent launchintent = getPackageManager().getLaunchIntentForPackage("org.example.discoverycenter");
      startActivity(launchintent);
  }
    
  public void gizmoCity() {
    background(255, 247, 114);
      Intent launchintent = getPackageManager().getLaunchIntentForPackage("org.example.discoverycenter");
      startActivity(launchintent);
  }
  public void goGreen() {
	stickerCollection.put("goGreen", true);
	ParseUser.getCurrentUser().saveInBackground();
    background(255, 247, 114);

      Intent launchintent = getPackageManager().getLaunchIntentForPackage("org.example.discoverycenter");
      startActivity(launchintent);
  }
  public void otter() {
	stickerCollection.put("otter", true);
	ParseUser.getCurrentUser().saveInBackground();
  
    background(255, 247, 114);

      Intent launchintent = getPackageManager().getLaunchIntentForPackage("org.example.discoverycenter");
      startActivity(launchintent);
  }
  public void powerfulYou() {
	stickerCollection.put("powerfulYou", true);
	ParseUser.getCurrentUser().saveInBackground();
	
    background(255, 247, 114);

      Intent launchintent = getPackageManager().getLaunchIntentForPackage("org.example.discoverycenter");
      startActivity(launchintent);
  }
  public void prehistoric() {
	stickerCollection.put("prehistoric", true);
	ParseUser.getCurrentUser().saveInBackground();
	
    background(255, 247, 114);

      Intent launchintent = getPackageManager().getLaunchIntentForPackage("org.example.discoverycenter");
      startActivity(launchintent);
  }
  

  public void stormCenter() {
	stickerCollection.put("stormCenter", true);
	ParseUser.getCurrentUser().saveInBackground();
	
    background(255, 247, 114);

      Intent launchintent = getPackageManager().getLaunchIntentForPackage("org.example.discoverycenter");
      startActivity(launchintent);
  }
  public void waterStory() {
	stickerCollection.put("waterStory", true);
	ParseUser.getCurrentUser().saveInBackground();
  
    background(255, 247, 114);

      Intent launchintent = getPackageManager().getLaunchIntentForPackage("org.example.discoverycenter");
      startActivity(launchintent);
  }

  
 

PendingIntent mPendingIntent; 

public void onCreate(Bundle savedInstanceState) {
  ketaiNFC = new KetaiNFC(this);
  super.onCreate(savedInstanceState);
  mPendingIntent = PendingIntent.getActivity(this, 0, new Intent(this, 
  getClass()).addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP), 0); 
}

public void onNewIntent(Intent intent) {
  if (ketaiNFC != null)
    ketaiNFC.handleIntent(intent); 
}

}

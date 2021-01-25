package mine;

import processing.core.PApplet;
import processing.core.PImage;

public class MyDisplay extends PApplet {
    PImage img;
    float current = 255;
    @Override
    public void setup() {
        size(600,600);
        background(100,200,100);
        img = loadImage("https://images.pexels.com/photos/2775863/pexels-photo-2775863.jpeg?cs=srgb&dl=pexels-marta-dzedyshko-2775863.jpg&fm=jpg","jpg");
    }

    @Override
    public void draw() {
        img.resize(width,height);
        image(img,0,0);
        current = (current + 1) % 256;
        fill(current,current,0);
        ellipse(width/5,height/5,width/4,height/4);

    }
}

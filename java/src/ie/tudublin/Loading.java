package ie.tudublin;


import processing.core.PApplet;

public class Loading extends PApplet
{
        float x = 100;
        float y = 360;
        float x1 = 300;
        float y1 = 40;
        float currX;

    public void settings()
    {
        size(500,500);
    }

    public void setup()
    {
       
    }


    public void loadbar(float increment)
    {
        
        
        currX += increment;
        //rect(x,y,width,height);
        rect(x,y,x1,y1);
        
        
        if(currX<= x1)
        {
            fill(255);
            rect(x,y,currX,y1);
        }
        if(currX>=x1)
        {
            fill(255);
            rect(x,y,x1,y1);
        }
        
        
    }




    public void draw()
    {
        float increment = 1;
       
        background(0);
        stroke(255);
        noFill();
        loadbar(increment);
        
    }
    

}
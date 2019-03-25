package ie.tudublin;

public class Main
{	
	
	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new UI());
		
	}
	public void loading()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Loading());
		
	}


	public static void main(String[] args)
	{
		Main main = new Main();
		//main.startUI();	
		main.loading();		
	}
}
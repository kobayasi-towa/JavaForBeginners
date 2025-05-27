
public class Rectlf extends MyFrame{
	public void run() {
		setColor(0,128,0);
		int x = 30;
		
		for(int i =0; i<9; i++) {
			
				fillRect(x,x,10,100);
			
			x +=20;
		}
		for(int i =0; i<9; i++) {
				fillRect(x,100,10,x);
			
			x +=20;
		}
		
		
	}
	
	
	

}

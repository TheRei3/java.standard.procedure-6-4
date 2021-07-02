package ex6no4;

public class ex6no4 {  //  242p
	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];
		
		for( int i = 0 ; i < tvArr.length ; i++ ) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i +10 ;
		}
		
		for( int i = 0 ; i < tvArr.length ; i++ ) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
		}
	}
	
}

class Tv{
	String Color;
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
	
}
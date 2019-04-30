
public class Bus {
	String number;
	int capacity;
	double speed=0;
	
	void start(){
		speed=20.0;
	}
	
	void spedUp(){
		if (speed<maxSped)speed+=10;
	}
	
	void spedDown(){
		speed-=10;
	}
	void setNumder(String num){
		number=num;
	}
	void stop(){
		speed=0.0;
	}
	void printBus(){
		System.out.println("The Bus N" +number + " speed is-" +speed);
	}

}

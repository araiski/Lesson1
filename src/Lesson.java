
public class Lesson {
	public static void main(String[] args){
		Bus bus1 = new Bus();
		Bus bus2 = new Bus();
		Bus bus3 = new Bus();
		
		bus1.setNumder("M100");
		bus2.setNumder("M200");
		bus3.setNumder("M300");
		
		Bus[] buses = {bus1,bus2,bus3};
		for(int i=0;i<buses.length; i++){
			buses[i].start();
		}
		bus1.spedUp();
		bus2.spedDown();
		
		bus1.printBus();
		bus2.printBus();
		bus3.printBus();
	}

}

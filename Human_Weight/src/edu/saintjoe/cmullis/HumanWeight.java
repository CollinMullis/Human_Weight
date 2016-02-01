package edu.saintjoe.cmullis;

public class HumanWeight {

		public final int NUM_REGIONS = 6;
		
		int[] wghtArray = new int[NUM_REGIONS];
		String[] regArray = new String[NUM_REGIONS];
		
		public HumanWeight( int newIndx, String regName, int newWght) {
			
			wghtArray[newIndx] = newWght;
			regArray[newIndx] = regName;
			
		}
		
			public String toString() {
				String output = new String(); 
				output = "Region\t Weight\n";
				for(int n=0; n < NUM_REGIONS; n++) {
					output = output + "/t" + regArray[n] + "\t" + wghtArray[n] + "\n";
				}
				return output;
			
		}
		
		public static void main(String[] args) {
			
			new HumanWeight(0,"Africa",134);
			new HumanWeight(1,"Asia",127);
			new HumanWeight(2,"Europe",156);
			new HumanWeight(3,"Latin America",150);
			new HumanWeight(4,"Northern America",178);
			new HumanWeight(5,"Oceania",163);
			
		}
		
		
		
		
		
		
}

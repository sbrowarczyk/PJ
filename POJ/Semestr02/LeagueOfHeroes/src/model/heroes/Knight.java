package model.heroes;

public class Knight extends Hero implements ICanBeHero {
	
	protected void modifyStrength(){
		strength=(int)((strength+1)/1.2);
		strength++;
		strength *= 1.2;
	}
	
	protected void modifyDefence(){
		defence=(int)((defence+1)/1.1);
		defence++;
		defence *= 1.1;
	}
	
	protected void modifyIntelligence() {
		intelligence++;
	}
	
	protected void modifyDextrity(){
		dextrity=(int)((dextrity+1)/1.05);
		dextrity++;
		dextrity *= 1.05;
	}
	
	protected void modifyAgility(){
		agility=(int)((agility+1)/1.02);
		agility++;
		agility *= 1.02;
	}
	
	protected void modifySpeed(){
		speed=(int)((speed+1)/1.05);
		speed++;
		speed *= 1.05;
	}
	
	@Override
	public void printoutHero(){
		System.out.println("-----------------------------------------------------------");
		System.out.println(getName()+ "\t|"
				+ "str: "+getStrenght() + "\t|"
				+ "def: "+getDefence() + "\t|"
				+ "int: "+getIntelligence() + "\t|"
				+ "agi: "+getAgility() + "\t|"
				+ "dex: "+getDextrity() + "\t|"
				+ "speed: "+getSpeed() + " |");
		System.out.println("-----------------------------------------------------------");
	}
	
	
}

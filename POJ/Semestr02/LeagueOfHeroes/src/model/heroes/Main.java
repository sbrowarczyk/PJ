package model.heroes;

public class Main {

	public static void main(String[] args) {
		
		Hero mage = new Mage();
		Hero knight = new Knight();
		Hero archer = new Archer();
		
		mage.setName("Gandalf");
		knight.setName("Aragorn");
		archer.setName("Legolas");
		
		for(int i = 0; i < 100; i++){
			
			mage.levelUp();
			mage.raiseInt();
			mage.raiseAgi();
			mage.raiseDef();
			mage.raiseDex();
			mage.raiseSpd();
			mage.raiseStr();
			
			knight.levelUp();
			knight.raiseInt();
			knight.raiseAgi();
			knight.raiseDef();
			knight.raiseDex();
			knight.raiseSpd();
			knight.raiseStr();
			
			archer.levelUp();
			archer.raiseInt();
			archer.raiseAgi();
			archer.raiseDef();
			archer.raiseDex();
			archer.raiseSpd();
			archer.raiseStr();
			
		}
		
		mage.printoutHero();
		knight.printoutHero();
		archer.printoutHero();	
		
	}	
	
}

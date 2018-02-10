package virtualpetshelter;

public class RoboticDog extends Dog implements Walkable {
	private boolean isOiled = false;
	private int oilLevel;
	
	public RoboticDog(String name,int boredom, int health, int happiness, int oilLevel) {
		this.name = name;
		this.boredom = boredom;
		this.health = health;
		this.happiness= happiness; 	
		this.oilLevel = oilLevel;
		
	}

	public RoboticDog(String name, String description) {
		// TODO Auto-generated constructor stub
		this.name = name; 
		this.description = description;
	}

	@Override
	public void healthEffect() {
		// TODO Auto-generated method stub
		if(oilLevel <= 80) {
			health -=10;
		}
		
		if (50 >= boredom && boredom >=45) {
			health -= 5; 
		}
		
		if(isOiled) {
			health +=5; 
		}
	}

	@Override
	public void happinessEffect() {
		// TODO Auto-generated method stub
		if(health <= 80) {
			happiness -=10;	
		}
	
		if(isWalking == false) {
			happiness -= 5;
			
		}
		
		if(isOiled == false) {
			happiness -= 5;
			
		}
		
	}

	/* (non-Javadoc)
	 * @see virtualpetshelter.Walkable#walkPet()
	 */
	@Override
	public void walkPet() {
		// TODO Auto-generated method stub
		isWalking = true; 
		happiness +=10;
		oilLevel -=5; 
	}

	public void oilRobot() {
		// TODO Auto-generated method stub
		happiness +=5; 
		oilLevel -= 5;
		isOiled = true;
	}

	public boolean isOiled() {
		return isOiled;
	}

	public int getOilLevel() {
		// TODO Auto-generated method stub
		return oilLevel;
	}

	@Override
	public boolean isWalking() {
		// TODO Auto-generated method stub
		return isWalking;
	}

	@Override
	public void tickEffect() {
		// TODO Auto-generated method stub
		health -= 5;
		happiness -= 5;
		boredom += 2;
		healthEffect();
		happinessEffect();
		
	}

	public void chargePet(int amountToCharge) {
		health += amountToCharge;
		
	}

	

}

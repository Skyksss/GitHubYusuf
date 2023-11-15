
public class fighter {
	String name;
	int health;
	int damage;
	int weight;
	double dodge;

	public fighter(String name, int health, int damage, int weight , double dodge ) {
		
		this.name = name;
		this.health = health;
		this.damage = damage;
		this.weight = weight;
		if (dodge > 0 && dodge <100) 
		{
		this.dodge = dodge;	
		}else {
			this.dodge = 0;
		}
		
	}

	int hit(fighter rival) {
		System.out.println(this.name + "  to =>  " + rival.name + " " + this.damage + " Damage Given");
	    System.out.println("-------------------------------------------------------------------------------");
		if (rival.isDodge()) 
	{
	System.out.println("|||||||||||||||||||||||||||-");
	System.out.println(rival.name  + " Damage Blocked ");	
	System.out.println("|||||||||||||||||||||||||||-");
	}
		if (rival.health - this.damage < 0) {
		return 0;
	}	
	
		return rival.health - this.damage;
	}

	
	boolean isDodge() {
		double randomNumber = Math.random()*100 ;
				
		return  randomNumber <= this.dodge;
		
	}
}

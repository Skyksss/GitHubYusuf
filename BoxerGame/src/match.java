import java.util.Random;

public class match {
	fighter f1;
	fighter f2;

	int minWeight;
	int maxWeight;

	public match(fighter f1, fighter f2, int minWeight, int maxWeight) {
		super();
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
	}

	public void run() {
		if (isCheck()) {
			while (this.f1.health >= 0 && this.f2.health > 0) {
				System.out.println("******NEW ROUND*****");
				double Start = Math.random();
				double start1 = Math.random();

				if (Start > start1) {
					System.out.println("First hit coming from " + this.f1.name);
					this.f2.health = f1.hit(this.f2);
					if (isWin()) {
						break;
					}

				} else {
					System.out.println("Firsht hit coming from " + this.f2.name);
					this.f1.health = f2.hit(this.f1);
					if (isWin()) {
						break;
					}

				}
				System.out.println("|--------------Remaning Healths---------------|");
				System.out.println(this.f1.name + " Health : " + this.f1.health);
				System.out.println(this.f2.name + " Health : " + this.f2.health);
			}

		} else {
			System.out.println(" Fighters weight does not equal");
		}
	}

	boolean isCheck() {
		return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight)
				&& (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
	}

	boolean isWin() {
		if (this.f1.health == 0) {
			System.out.println("******************************");
			System.out.println(this.f2.name + " WON!!!!");
			System.out.println("******************************");
			return true;
		}

		if (this.f2.health == 0) {
			System.out.println(this.f1.name + " WON?!?!!?");
			return true;
		}
		return false;
	}

}

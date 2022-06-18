package kegiatan3;

public abstract class hero {
	public double healthPoint, attackDamage, defense;
	public int level;
	public boolean lifeStatus;
	public String name;

	public void attack(hero target) {
		spawnIntro();
		target.reviewDamage(this.attackDamage);
		System.out.println("Sisa darah " + target.name + ": " + target.healthPoint);
	}

	public void reviewDamage(double damage) {
		double realDamage = damage - this.defense;
		this.healthPoint -= realDamage;
		if (this.healthPoint <= 0) {
			this.healthPoint = 0;
			this.lifeStatus = false;
		}
	}

	public void checkStatus() {
		System.out.println("Nama = " + this.name);
		System.out.println("Level = " + this.level);
		System.out.println("Darah = " + this.healthPoint);
		System.out.println("Pertahanan = " + this.defense);
		System.out.println("Serangan = " + this.attackDamage);
		System.out.println("Status = " + this.lifeStatus);
		System.out.println();
	}

	public abstract void spawnIntro();
}

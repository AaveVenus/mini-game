package kegiatan3;

public class tank extends hero {
	public tank(int level, String nama) {
		this.healthPoint = 7000;
		this.defense = 500 + 15;
		this.attackDamage = 500;
		this.healthPoint += 200 * level;
		this.defense += 15 * level;
		this.attackDamage += 20 * level;
		this.level = level;
		this.name = nama;
		this.lifeStatus = true;
	}

	public void spawnIntro() {
		System.out.println("Bunuhlah saya");
	}
}

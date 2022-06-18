package kegiatan3;

public class Assassin extends hero implements CriticalDamage {
	public Assassin(int level, String nama) {
		this.healthPoint = 3000;
		this.defense = 300;
		this.attackDamage = 800;
		this.healthPoint += 90 * level;
		this.defense += 15 * level;
		this.attackDamage += 30 * level;
		this.level = level;
		this.name = nama;
		this.lifeStatus = true;
		this.attackDamage += attackDamage * bonusDamage;
	}

	public void spawnIntro() {
		System.out.println("Matilah kamu");
	}
}

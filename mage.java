package kegiatan3;

public class mage extends hero implements MagicalDamage {
	public mage(int level, String nama) {
		this.healthPoint = 2500;
		this.defense = 200;
		this.attackDamage = 700;
		this.healthPoint += 85 * level;
		this.defense += 10 * level;
		this.attackDamage += 35 * level;
		this.level = level;
		this.name = nama;
		this.lifeStatus = true;
		this.attackDamage += attackDamage * magicbonusDamage;
	}

	public void spawnIntro() {
		System.out.println("Ezz dek");
	}
}

public class Magician extends Character{
	public Magician(String name, int hp, int mp) {
		super(name, hp *= 0.8 , mp *= 1.2);
	}

	@Override
	public void introduce() {
		System.out.println("私は " + name + " 魔法使いだ！　だから魔力が強いぞ！！");
		super.introduce();
	}

	@Override
	public void attack(Character c) {
		System.out.println(this.name + "の攻撃！");
		c.damage((int)Math.floor(this.mp*1.2));
	}

}

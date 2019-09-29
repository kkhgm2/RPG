
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
		magic(c);
	}

	public void magic(Character c) {
		System.out.println(this.name + "の魔法攻撃！");
		if(c instanceof Knight) {
			System.out.println(c.name + "は戦士だ！　チャンス！！");
			c.damage((int)Math.floor(this.mp *0.5));
		}else {
			c.damage((int)Math.floor(this.mp * 0.3));
		}

	}

}


public class CharacterStats 
{
	private String name;
	private String weapon;
	private String element;
	private int level;
	private int HP;
	private int attack;
	private int defense;
	private int mastery;
	
	public CharacterStats (String name, String weapon, String element, int level, int HP, int attack, int defense, int mastery)
	{
		this.name = name;
		this.weapon = weapon;
		this.element = element;
		this.level = level;
		this.HP = HP;		
		this.attack = attack;
		this.defense = defense;
		this.mastery = mastery;
		
	}
	
	public void rename(String name)
	{
		this.name = name;
	}
	
	void display()
	{
		System.out.format("Name: %s \nWeapon: %s \nElement: %s \nLevel: %d \nHP: %d \nAttack: %d \nDefense: %d \nElemental Mastery: %d\n\n", this.name, this.weapon, this.element, this.level, this.HP, this.attack, this.defense, this.mastery);
	}

}

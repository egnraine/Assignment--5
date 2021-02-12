
public class Driver 
{
	public static void main (String[] args)
	{
		CharacterStats Traveler = new CharacterStats("Username", "Sword", "Adaptive", 1, 912, 18, 57, 0);
		Traveler.display();
		
		Traveler.rename("Lumine");
		Traveler.display();
	}
}

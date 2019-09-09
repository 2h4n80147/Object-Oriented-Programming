
class Sounds {
	final static String cow = "Moo";
	enum Volume {
		LOW, 
		MEDIUM,
		High
	}
	public static String volumeIt(String syl, Volume V) {
		if (V == Volume.LOW)
			return syl.toLowerCase();
		if (V == Volume.MEDIUM)
		{
			return syl.substring(0, syl.length()/2).toUpperCase() + syl.substring(syl.length()/2).toLowerCase();
			
		}
		return syl.toUpperCase();
	}
}

class AnimalVoice  {
	String syl;
	Sounds.Volume V;
	
	{
		System.out.println("Init block is called");
		this.syl = Sounds.volumeIt(Sounds.cow, Sounds.Volume.LOW);
	}
	
	AnimalVoice (String syl, Sounds.Volume V) {
		System.out.println("Constructor is called");
		this.syl = Sounds.volumeIt(syl, V);
		this.V = V;
		
	}
	public void makeSound() {
		System.out.println(syl);
	}
	public static void sleep() {
		System.out.println("ZZzz Zzz...");
	}
	public void makeSound (int count) {
		for (int i = 0; i < count; i++)
			System.out.print(syl + " ");
		System.out.println("");
	}
}
public class P5 {
	public static void main(String args[]) {
		AnimalVoice Fox;
		Fox = new AnimalVoice("flip flop", Sounds.Volume.MEDIUM);
		AnimalVoice.sleep();
		Fox.makeSound();
		Fox.makeSound(10);
	}
}

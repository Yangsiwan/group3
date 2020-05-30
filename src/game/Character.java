package game;

public class Character {
	private String name;
	private static int hp;
   public Character(String name, int hp) {
	   this.name = name;
	   this.hp = hp;
   }
   public Character() {
	   this.name="null";
	   this.hp = 0;
	}
   public static void growHp(int grow) {
	   hp+=grow;
   }
public String getName() {
	   return name;
   }
   public static int getHp() {
	   return hp;
   }

}

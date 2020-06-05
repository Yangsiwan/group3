package game;

public class Character {
	private static String name;
	private static int hp;
   public Character(String name) {
	   this.name = name;
	   hp=50;
   }
   public Character() {
	   this.name="null";
	   this.hp = 0;
	}
   public static void growHp(int grow) {
	   hp+=grow;
	   if(hp<=0) main.gameover();
   }
public static String getName() {
	   return name;
   }
   public static int getHp() {
	   return hp;
   }

}

package main;

public class Character {
	private static String name;
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
	   if(hp<=0) Main.gameover();
   }
public static String getName() {
	   return name;
   }
   public static int getHp() {
	   return hp;
   }

}

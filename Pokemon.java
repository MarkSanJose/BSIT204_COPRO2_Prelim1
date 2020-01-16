import java.util.Random;
import java.util.Scanner;

class Pokemon{
		
	private String name;
	private int hp;
	private int damage;
	
public Pokemon(String name, int hp, int damage)
{
	this.name = name;
	this.hp = hp;
	this.damage = damage;
}	
	public String getName(){	
	return this.name;
}
	public int getHp(){	
	return this.hp;
}
	public int getDamage(){	
	return this.damage;
}
	public void setHp(int hp){	
	this.hp = hp;
}
	public void SetDamage(int damage){	
	this.damage = damage;
}
}

class Attacks{	
	private String attack1;
	private String attack2;
	private String attack3;
	private String attack4;
	
public Attacks(String attack1, String attack2, String attack3, String attack4)
{
	this.attack1 = attack1;
	this.attack2 = attack2;
	this.attack3 = attack3;
	this.attack4 = attack4;
}	
	public String getAttack1(){	
	return this.attack1;
}
	public String getAttack2(){	
	return this.attack2;
}
	public String getAttack3(){	
	return this.attack3;
}
	public String getAttack4(){	
	return this.attack4;
}
	public void setAttack1(String attack1){	
	this.attack1 = attack1;
}
	public void setAttack2(String attack2){	
	this.attack2 = attack2;
}
	public void setAttack3(String attack3){	
	this.attack3 = attack3;
}	
	public void setAttack4(String attack4){	
	this.attack4 = attack4;
}
}

 class Game {
 
 public static void main(String[]args){
 	
 Scanner scan = new Scanner(System.in);
 Random random = new Random();

 String[] RandomEnemies = {"Darkrai","Mewtwo","Giratina","Gengar","Marshadow"};
 int EnemyPokemon = random.nextInt(RandomEnemies.length);
 String Enemy = RandomEnemies[EnemyPokemon];
 System.out.println("A wild " + Enemy + " appeared!");
  
 String[] RandomPoke = {"Lugia","Charizard","Blastoise","Venusaur"};
 int PlayerPokemon;
 int PokemonNumber = 1;
 for (String pokemons : RandomPoke)
 {
 System.out.println(PokemonNumber + ". " + pokemons );
 PokemonNumber++;
 }
 
 System.out.println("Pick a Pokemon: "); 
 switch (Integer.parseInt(scan.nextLine()))
 {
 case 1 : PlayerPokemon = 0;
 break;
 
 case 2 : PlayerPokemon = 1;
 break;
 
 case 3 : PlayerPokemon = 2;
 break;
 
 case 4 : PlayerPokemon = 3;
 break;
 
 default : PlayerPokemon = 0;
 }

 String Player = RandomPoke[PlayerPokemon];
 System.out.println("You picked " + Player);

 Pokemon enemy = new Pokemon(Enemy, 100, 0);
 Pokemon player = new Pokemon(Player, 100, 0);	
 Attacks player_Attacks = new Attacks("","","","");
 Attacks enemy_Attacks = new Attacks("","","","");
 
 while(enemy.getHp() > 0 && player.getHp() > 0){
 
 System.out.println(Enemy + " HP: " + enemy.getHp());
 System.out.println("_______________________");
 System.out.println(Player + " HP: " + player.getHp());

 Random player_random_damage = new Random();
 Random enemy_random_damage = new Random();

 int[] player_damage1 = {4,9,14,19,21}; 
 int[] player_damage2 = {5,9,16,20,23}; 
 int[] player_damage3 = {6,10,15,18,22}; 
 int[] player_damage4 = {7,11,12,16,25}; 
 int[] enemy_damage1 = {5,8,7,14,21}; 
 int[] enemy_damage2 = {3,6,8,16,20}; 
 int[] enemy_damage3 = {7,9,9,13,25}; 
 int[] enemy_damage4 = {5,7,12,13,22}; 
 

 int player_damage1_power = player_random_damage.nextInt(player_damage1.length);
 int player_damage1_result = player_damage1[player_damage1_power];
 
 int player_damage2_power = player_random_damage.nextInt(player_damage2.length);
 int player_damage2_result = player_damage2[player_damage2_power];
 
 int player_damage3_power = player_random_damage.nextInt(player_damage3.length);
 int player_damage3_result = player_damage3[player_damage3_power];
 
 int player_damage4_power = player_random_damage.nextInt(player_damage4.length);
 int player_damage4_result = player_damage4[player_damage4_power];
 
 int enemy_damage1_power = enemy_random_damage.nextInt(enemy_damage1.length);
 int enemy_damage1_result = enemy_damage1[enemy_damage1_power];
 
 int enemy_damage2_power = enemy_random_damage.nextInt(enemy_damage2.length);
 int enemy_damage2_result = enemy_damage2[enemy_damage2_power];
 
 int enemy_damage3_power = enemy_random_damage.nextInt(enemy_damage3.length);
 int enemy_damage3_result = enemy_damage3[enemy_damage3_power];
 
 int enemy_damage4_power = enemy_random_damage.nextInt(enemy_damage4.length);
 int enemy_damage4_result = enemy_damage4[enemy_damage4_power];
 
 if(Player.equals("Lugia"))
 {
 player_Attacks.setAttack1("Pressure");
 player_Attacks.setAttack2("Multiscale");
 player_Attacks.setAttack3("Ge talon");
 player_Attacks.setAttack4("Rawr");
 } 
 	
 else if(Player.equals("Charizard"))
 {
 player_Attacks.setAttack1("Blaze");
 player_Attacks.setAttack2("Solar Beam");
 player_Attacks.setAttack3("Solar Power");
 player_Attacks.setAttack4("Fire Blast"); 
 }
 
 else if(Player.equals("Blastoise"))
 {
 player_Attacks.setAttack1("Fake Out");
 player_Attacks.setAttack2("Aqua Jet");
 player_Attacks.setAttack3("Water Blast");
 player_Attacks.setAttack4("Hydro Pump"); 
 }
 
 else if(Player.equals("Venusaur"))
 {
 player_Attacks.setAttack1("Solar Beam");
 player_Attacks.setAttack2("Vine Whip");
 player_Attacks.setAttack3("Overgrow");
 player_Attacks.setAttack4("Chlorophyll");
 }
 
 if(Enemy.equals("Darkrai"))
 {
 enemy_Attacks.setAttack1("Dark Void");
 enemy_Attacks.setAttack2("Ominous Wind");
 enemy_Attacks.setAttack3("Faint Attack");
 enemy_Attacks.setAttack4("Nightmare");
 } 
 	
 else if(Enemy.equals("Mewtwo"))
 {
 enemy_Attacks.setAttack1("Psytrike");
 enemy_Attacks.setAttack2("Psychic");
 enemy_Attacks.setAttack3("Aura Sphere");
 enemy_Attacks.setAttack4("Wala na ako maisip"); 
 }
 
 else if(Enemy.equals("Giratina"))
 {
 enemy_Attacks.setAttack1("Chaotic Star");
 enemy_Attacks.setAttack2("Crisis Dive");
 enemy_Attacks.setAttack3("Shadow Claw");
 enemy_Attacks.setAttack4("Devour Light"); 
 }
 
 else if(Enemy.equals("Gengar"))
 {
 enemy_Attacks.setAttack1("Curse Body");
 enemy_Attacks.setAttack2("Creep Show");
 enemy_Attacks.setAttack3("Sinister Fog");
 enemy_Attacks.setAttack4("Twilight Poison");
 }
 
 else if(Enemy.equals("Marshadow"))
 {
 enemy_Attacks.setAttack1("Let Loose");
 enemy_Attacks.setAttack2("Shadow Punch");
 enemy_Attacks.setAttack3("Red Knuckles");
 enemy_Attacks.setAttack4("Shadow Hunt");	
 }
 
 System.out.println("1. " + player_Attacks.getAttack1());
 System.out.println("2. " + player_Attacks.getAttack2());
 System.out.println("3. " + player_Attacks.getAttack3());
 System.out.println("4. " + player_Attacks.getAttack4());
 System.out.println("_______________________");
 System.out.println("Choose an attack");
 
 int player_attack;
 switch (scan.nextInt())
 {
 case 1 : player_attack = 0;
 break;
 case 2 : player_attack = 1;
 break;
 case 3 : player_attack = 2;
 break;
 case 4 : player_attack = 3;
 break;
 default : player_attack = 0;
 }
	
 if (player_attack == 0)
 {
 System.out.println(Player +" uses "+ player_Attacks.getAttack1());
 System.out.println(Enemy + " takes " + player_damage1_result +" damage");
 enemy.setHp(enemy.getHp() - player_damage1_result);

 System.out.println(Enemy +" uses "+ enemy_Attacks.getAttack1());
 System.out.println(Player + " takes " + enemy_damage1_result +" damage");
 player.setHp(player.getHp() - enemy_damage1_result);
 }
 
 else if (player_attack == 1)
 {
 System.out.println(Player +" uses "+ player_Attacks.getAttack2());
 System.out.println(Enemy + " takes " + player_damage2_result +" damage");
 enemy.setHp(enemy.getHp() - player_damage2_result);

 System.out.println(Enemy +" uses "+ enemy_Attacks.getAttack2());
 System.out.println(Player + " takes " + enemy_damage2_result +" damage");
 player.setHp(player.getHp() - enemy_damage2_result);
 }
 
 else if (player_attack == 2)
 {
 System.out.println(Player +" uses "+ player_Attacks.getAttack3());
 System.out.println(Enemy + " takes " + player_damage3_result +" damage");
 enemy.setHp(enemy.getHp() - player_damage3_result);

 System.out.println(Enemy +" uses "+ enemy_Attacks.getAttack3());
 System.out.println(Player + " takes " + enemy_damage3_result +" damage");
 player.setHp(player.getHp() - enemy_damage3_result);
 }
 
 else if (player_attack == 3)
 {
 System.out.println(Player +" uses "+ player_Attacks.getAttack4());
 System.out.println(Enemy + " takes " + player_damage4_result +" damage");
 enemy.setHp(enemy.getHp() - player_damage4_result);

 System.out.println(Enemy +" uses "+ enemy_Attacks.getAttack4());
 System.out.println(Player + " takes " + enemy_damage4_result +" damage");
 player.setHp(player.getHp() - enemy_damage4_result);
 } 
 }	

 if (player.getHp() <= 0)
 {
 System.out.println("_______________________");	
 System.out.println(Player + " Fainted ");
 System.out.println(Enemy + " Wins ");
 }
 
 else if (enemy.getHp() <= 0)
 {
 System.out.println("_______________________");	
 System.out.println(Enemy + " Fainted ");
 System.out.println(Player + " Wins ");
 }
 
 
 
 
 
 
 
 
 
 
 
	 }
 }
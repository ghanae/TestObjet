package test;
//objet player
public class Player {
	static private String name="java";
	static double health=20;
	static private double attack=2;
	public Player() {//pour creer le constructeur de player on fait ctrl+espace :pour chercher ce constr
		// TODO Auto-generated constructor stub
	}
	public Player(String str, int i, int j) {
		//un objet unique qui se genee en fonction du constructeur
		Player.name=str;//pour redefinir les variables on doit les declarer static 
		Player.health=i;//ou on peut faire this.health=i,//designe l'instance de la classe courante 
		Player.attack=j;
	}
	//les fonctions pour modifier et recuperer les donnees de player,pour cela on met notre souris sur la variable et on selectionne create getterand setter 
	public String getName() {//fonction pour recuperer le name
		return name;
	}
	public void setName(String name) {//fonction pour modifier le name
		this.name = name;
	}
	public double getHealth() {
		return health;
	}
	public void setHealth(double health) {
		this.health = health;
	}
	public double getAttack() {
		return attack;
	}
	public void setAttack(double attack) {
		this.attack = attack;
	}
	//effectuer des operations sur les player
	public void damage(double damage) {
		this.health-=damage;
		System.out.println("le joueur "+this.name+"a subit "+damage);
	}
	
}

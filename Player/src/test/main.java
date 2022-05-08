package test;
//la fonction principale
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player1=new Player();//creer le premier player;les aguments par defaut
		System.out.println("le premier joueur:\nname : "+player1.getName()+"\nvie : "+player1.getHealth()+"\nattack : "+player1.getAttack());//appeler les methodes
		Player player2=new Player("hanae",29,98);//ici on utilise le constructeur pour passer nos propres arguments
		System.out.println("le deuxieme joueur:\nname : "+player2.getName()+"\nvie : "+player2.getHealth()+"\nattack : "+player2.getAttack());
		//pour changer le nom seulement on fait:
		player2.setName("nom est changé");
		System.out.println("le deuxieme joueur apres changement:\nname : "+player2.getName()+"\nvie : "+player2.getHealth()+"\nattack : "+player2.getAttack());
		player2.damage(9);
		System.out.println("l'age actuel apres damage : "+player2.getHealth());
		player2.damage(player1.getAttack());//damage entre player1 et player2
		System.out.println("l'age actuel apres damage : "+player2.getHealth());
	}

}

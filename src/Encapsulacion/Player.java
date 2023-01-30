package Encapsulacion;

public class Player {
    private String name;
    private int health;
    private String weapon;

    //Para bloquear el acceso desde el main, ponemos todo en privado y creamos un constructor.
    //Y para que no pueda ponerse la vida que quiera limitamos el acceso en constructor. O podemos crear un if en Health limitando el minimo y el maximo.

    public Player(String name, String weapon) {
        this.name = name;
        this.health = 100;
        this.weapon = weapon;
    }

    public void applyDamage(int damage){
        this.health-=damage;
        if(this.health<=0){
            System.out.println("Player died");
        }
    }


    public int getHealth(){
        return health;
    }


}

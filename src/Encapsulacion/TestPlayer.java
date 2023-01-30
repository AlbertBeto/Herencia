package Encapsulacion;

public class TestPlayer {

    public static void main(String[] args) {

        Player p1= new Player("Roger","Axe");

        /*
  Con los cambios realizados en player ya no hay acceso directo a los atributos con lo que no puedes modificar
  los valores directamente desde el main sino que das unos valores inciales con el constructor.

        p1.name="patri";
        p1.health=100;
        p1.weapon="nuclear bomb";

        int damage=70;
        p1.applyDamage(damage);

        System.out.println("Actual health "+p1.getHealth());

        damage=50;
        p1.health=80;
        p1.applyDamage(damage);
        System.out.println("Actual health "+p1.getHealth());
*/

    }
}

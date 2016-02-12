import java.util.ArrayList;

/**
 * Created by marat on 2/12/16.
 */
public class Main {
    public static void main(String[] args) {
        Bunker bunker = new Bunker(500000, "Bunker1");
        ArrayList<Gun> force = new ArrayList<>();
        Tank tank = new Tank(200, "Tank", 2000);
        Helicopter helicopter = new Helicopter(100, "Helicopter", 2000, 20);
        Commander commander = new Commander(10, "Commander", 9999);
        Soldier soldier = new Soldier(9, "Soldier", 5, commander);
        Grenade he = new Grenade(10, 4);
        Patron patron = new Patron(4, 0);
        NuclearBomb nuclearBomb = new NuclearBomb(99999, 100);
        Automatic automatic = new Automatic(30, 222);
        ArtilleryShell artilleryShell = new ArtilleryShell(100, 10);
        NuclearFacility nuclearFacility = new NuclearFacility(321, "NuclearFac", 254);
        tank.reloading(1, artilleryShell);
        helicopter.reloading(1, artilleryShell);
        nuclearFacility.reloading(1, nuclearBomb);
        force.add(tank);
        force.add(helicopter);
        force.add(nuclearFacility);
        //начинаем атаку бункера
        //полиморфизм
        for (Gun gun : force){
            gun.shoot(bunker);
        }
        AbstractMachine machine = helicopter; // восходящее преобразование
        machine.start(); //позднее связывание
    }
}

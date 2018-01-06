import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Field field = new Field(); //создаем игровое поле
        Player player = new Player();  // создаем игрока
        PosX posX = new PosX();
        PosY posY = new PosY();
/*
        System.out.println("Введите положение корабля: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));  //
        int pos = Integer.parseInt(reader.readLine());                                 // прописать положение корабля

        Ship ship = new Ship(pos-1); // создаем корабль с позицией "pos"
*/

        int positionShipX = posX.getPosX();
        int positionShipY = posY.getPosY();

        Ship ship = new Ship(positionShipX, positionShipY);
        field.init();
        field.setShip(ship);
        System.out.println("\n" + "Game start");

        do {
            field.show();
            int shootX = player.getShootX();
            int shootY = player.getShootY();
            field.doShoot(shootX, shootY);
        } while (field.isNotGameOver());
    }
}
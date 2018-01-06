import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PosY {
    int getPosY() throws IOException {
        System.out.println("Введите положение корабля Y: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));  //
        int posY = Integer.parseInt(reader.readLine());
        return --posY;
    }
}

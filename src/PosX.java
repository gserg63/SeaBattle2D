import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PosX {
    int getPosX() throws IOException {
        System.out.println("Введите положение корабля X: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));  //
        int posX = Integer.parseInt(reader.readLine());
        return --posX;
    }
}

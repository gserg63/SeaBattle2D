import java.io.*;

import java.util.Scanner;

public class Player {
    int getShootX() throws IOException {
        System.out.println("Куда стрелять?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        s = br.readLine();
        System.out.printf("Вы ввели: %s\n", s);

        int shoot = Integer.parseInt(s);
        shoot--; // -1 для реальной позиции, без смещения из-за отсчета массива
        return shoot;

    }    int getShootY() throws IOException {
        System.out.println("Куда стрелять?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        s = br.readLine();
        System.out.printf("Вы ввели: %s\n", s);

        int shoot = Integer.parseInt(s);
        shoot--; // -1 для реальной позиции, без смещения из-за отсчета массива
        return shoot;
    }
}
/*
Надо проверку на 0 и "-" и прбел в строке ввода

 */
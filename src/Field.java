public class Field {
//    final int SIZE = 10; //размер поля (size field)
    char[][] cells = new char[10][10];
    Ship ship;

    void init() {    // инициализация поля (initialize field)
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
            cells[j][i] = '.';
            }
            System.out.println();
        }
    }
    void setShip(Ship ship) {
            this.ship = ship;
            cells[ship.positionX][ship.positionY] = 'X';
        }

    void doShoot(int shootX, int shootY) {
            switch (cells[shootX][shootY]) {
                case '.':
                    System.out.println("Промах");
                    cells[shootX][shootY] = '*';
                    break;
                case 'X':
                    System.out.println("Супер! Корабль потоплен");
                    cells[shootX][shootY] = '-';
                    System.out.println(cells);
                    break;
                case '*':
                    System.out.println("Уже стреляли!");
                    break;
                default:
                    System.out.println("ERROR");
            }
    }
    void show(){
        System.out.println(cells);
        }

        boolean isNotGameOver() {
        return cells[ship.positionX][ship.positionY] == 'X';
    }
}

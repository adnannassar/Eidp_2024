package ControlStructure.Loops.DO_While;

public class Do_WhileTest {
    public static void main(String[] args) {
        System.out.print("While:    ");
        int x = 10;
        while (x <= 5) {
            System.out.print(x + " ");
            x++;
        }

        System.out.print("\nDO While: ");
        int y = 10;
        do {
            System.out.print(y + " ");
            y++;
        } while (y <= 5);
    }
}

import java.util.ArrayList;

public class NumberOfWays {

    public static int tilesBreadth = 2;
    public static int tilesLen = 1;
    public static int floorBreadth = 2;


    public static ArrayList<Character> arr = new ArrayList<>();

    public static int countWays(int floorLen) {
        if (floorLen == 0) {
            System.out.println(arr);
            return 1;
        }

        if (floorLen < 0) {
            return 0;
        }


        arr.add('V');
        int choice1 = countWays(floorLen - tilesLen);
        arr.remove(arr.size() - 1);//for considering all possible choices


        arr.add('H');
        int choice2 = countWays(floorLen - tilesBreadth);
        arr.remove(arr.size() - 1);

        return choice1 + choice2;
    }

    public static void main(String[] args) {
        System.out.println("Total number of ways: " + countWays(3));
    }
}

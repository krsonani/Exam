import java.util.*;

class liner {
    static int[] nub = { 10, 20, 30, 40, 50, 60, 70, 80 };

    public static int search(int x) {
        int i;
        for (i = 0; i < nub.length; i++) {
            if (nub[i] == x) {
                break;
            }
        }
        if (i == nub.length) {
            return -1;
        }
        return i;

    }

    public static void main(String argc[]) {
        System.out.println("enter the element for search");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int pos = search(x);
        System.out.println("element is at position=" + pos);
    }
}
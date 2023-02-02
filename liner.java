import java.util.*;

class liner {
    static int[] nub = { 10, 20, 30, 40, 50, 60, 70, 80 };

    public static int searchBinary(int l, int h, int x) {

        int m = l + (h - l) / 2;
        int pos;
        if (nub[m] == x)
            return m;
        if (nub[m] < x) {
            pos = searchBinary(m, h, x);
        } else {
            pos = searchBinary(l, m, x);
        }
        return pos;
    }

    public static int searchLiner(int x) {
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

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1 for binary search and 2 for liner search");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("enter the element for search");
                int y = sc.nextInt();
                int l = 0;
                int h = nub.length;
                int posb = searchBinary(l, h, y);
                System.out.println("element is at position=" + posb);
                break;
            case 2:
                System.out.println("enter the element for search ");
                int z = sc.nextInt();
                int pos = searchLiner(z);
                System.out.println("element is at position=" + pos);
                break;
        }
    }
}
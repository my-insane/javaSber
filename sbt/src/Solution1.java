import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int a = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        String st1 = sc2.nextLine();
        StringTokenizer st = new StringTokenizer(st1);
        for (int i = 0; i < a; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        int maxVal = 0;
        for (int j = 0; j < 2; j++) {
            maxVal = Collections.max(list);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == maxVal) {
                    list.set(i, list.get(i) / 2);
                }
            }
        }
        for (int e : list) {
            System.out.print(e + " ");
        }
    }
}

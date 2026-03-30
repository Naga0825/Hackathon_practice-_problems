import java.util.HashMap;

class ContainsDuplicate {
    public static boolean isContainDuplicate(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                return true; // duplicate found
            }
            map.put(arr[i], true);
        }
        return false; // no duplicates
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3};
        boolean ans = isContainDuplicate(arr);
        System.out.println(ans); // should print true
    }
}

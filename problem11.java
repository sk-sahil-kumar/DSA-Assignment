public class problem11 {

    public static int firstOccurrence(int[] arr, int target) {
        int start = 0, end = arr.length - 1, ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1;
            } else if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return ans;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int start = 0, end = arr.length - 1, ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                ans = mid;
                start = mid + 1;
            } else if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 7, 9, 9};
        int target = 4;

        System.out.println("First occurrence: " + firstOccurrence(arr, target));
        System.out.println("Last occurrence: " + lastOccurrence(arr, target));
    }
}

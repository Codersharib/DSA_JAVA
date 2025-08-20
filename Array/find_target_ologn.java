public class find_target_ologn {
    public static int target_element_index(int[] array,int target) {
        int n = array.length;
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (target == array[mid]) {
                return mid;
            }
            if (array[l] <= array[mid]) {
                if (array[l] < target && target < array[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (array[mid] < target && target < array[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[]={4,5,6,7,0,1,2};
        System.out.println(target_element_index(array,1));;
    }
}

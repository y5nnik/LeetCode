package Java;

public class MedianOfTwoArrays_4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int size1 = nums1.length;
        int size2 = nums2.length;

        int size = size1 + size2;
        int [] array = new int[size];
        int count1 = 0;
        int count2 = 0;
        int count = 0;

        while (count1<=size1 && count2<=size2 ) {
            if (count1 == size1) {
                while (count2 < size2) {
                    array[count++] = nums2[count2++];
                }
                break;
            }
            else if (count2 == size2) {
                while (count1 < size1) {
                    array[count++] = nums1[count1++];
                }
                break;
            }
            else {
                if (nums1[count1] < nums2[count2]) {
                    array[count++] = nums1[count1++];
                }
                else {
                    array[count++] = nums2[count2++];
                }
            }
        }

        if (size %2 == 0) {
            return (float)(array[size/2] + array[(size/2)-1])/2;
        }
        else {
            return array[size/2];
        }
    }

    public static void main(String[] args) {

        int [] one = {1,2};
        int [] two = {3,4};

        System.out.println(findMedianSortedArrays(one,two));
    }
}

package leetCode.search;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main1539 {
    public static void main(String[] args) {
//        int[] arr={1,3,5,6};
////        MissingInteger missingInteger=new MissingInteger();
////        int missingInteger1=missingInteger.findKthPositive(arr,5);
////        System.out.println(missingInteger1);
//
//        SearchInsertPosition searchInsertPosition=new SearchInsertPosition();
//        int pos=searchInsertPosition.searchInsert(arr,7);
//        System.out.println(pos);


//        int [][] matrix={
//                {3,2},
//                {-3,-3},
//                {-3,-3},
//                {-3,-3}
//        };

//        CountNegative countNegative=new CountNegative();
//        int counter=countNegative.countNegatives(matrix);
//        System.out.println(counter);
//        int[] arr1={1,2};
//        int[] arr2={1,1};
//        IntersectionArray intersectionArray=new IntersectionArray();
//       int[] arr= intersectionArray.intersection(arr1,arr2);
//       System.out.println(Arrays.toString(arr));

//        int[][] matrix={
//                {1,3,5,7},
//                {10,11,16,20},
//                {23,30,34,50}
//        };
//
//        Search2DMatrix search2DMatrix=new Search2DMatrix();
//        boolean result=search2DMatrix.searchMatrix(matrix,5);
//        System.out.println(result);

        int[] nums1={4,9,5,4};
        int[] nums2={9,4,9,8,4,4};

        IntersectionArrayII intersectionArrayII=new IntersectionArrayII();
        int[] arr=intersectionArrayII.intersection(nums1,nums2);
        System.out.println(Arrays.toString(arr));



    }
}

public class ArrayisSubsetOfAnother {
    // TC=O(m*n)
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6 };
        int arr2[] = { 1, 2, 3, 1 };
        int j = 0;
        // ARRAY2 IS NOT A SUBSET OF ARRAY1
        for (int i = 0; i < arr2.length; i++) {
            for (j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    arr1[j] = 0;
                    break;
                }
            }
            if (j == arr1.length) {
                System.out.println("False");
            }
        }
        if (j != arr1.length) {
            System.out.println("True");
        }
    }
}
// DONE IN GFG

// Using Map
/*
 * class Compute {
 * public String isSubset( long a1[], long a2[], long n, long m) {
 * HashMap<Long,Integer> mp= new HashMap<>();
 * for(long a:a1){
 * mp.put(a,mp.getOrDefault(a,0)+1);
 * }
 * for(int i=0;i<a2.length;i++){
 * if(mp.containsKey(a2[i])){
 * mp.put(a2[i],mp.get(a2[i])-1);
 * if(mp.get(a2[i])==0){
 * mp.remove(a2[i]);
 * }
 * }else{
 * return "No";
 * }
 * }
 * return "Yes";
 * }
 * }
 */

package JavaBasics;

public class CompareArrayList {

    //We have one more approach to do this: ArrayList and HashSet
    // boolean isunique = true;
    // We need a parameter to get and print the unique values.

    public static void Program1(String[] args) {
        System.out.println("Compare 2 arrays and find the unique numbers in them");
        int[] arr = {24, 35, 67, 89, 90, 95};
        int[] arr2 = {24, 35, 67, 89};
        int sum = 0;

        System.out.println("length of first declared array=" + arr.length);
        System.out.println("length of first declared array=" + arr2.length);

        for (int i = 0; i < arr.length; i++) {
            boolean isunique = true;
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {
                    isunique = false;
                    break;
                }
            }
            if (isunique) {
                System.out.println(arr[i]);
                int c = arr[i];
                sum = sum + c;
            }
        }
        System.out.println("Sum of unique elements = " + sum);
    }
    // Program: Function to find unique elements between two ArrayLists
//    public class UniqueElementSum {
//
//        // Function to find unique elements between two ArrayLists
//        public static ArrayList<Integer> findUniqueElements(ArrayList<Integer> list1, ArrayList<Integer> list2) {
//            // Using HashSet to eliminate duplicates and for efficient searching
//            HashSet<Integer> set1 = new HashSet<>(list1);
//            HashSet<Integer> set2 = new HashSet<>(list2);
//
//            // Remove elements from set1 that are also in set2 (common elements)
//            set1.removeAll(set2);
//
//            // Remove elements from set2 that are also in set1 (common elements)
//            set2.removeAll(new HashSet<>(list1));
//
//            // Combine unique elements from both sets
//            set1.addAll(set2);
//
//            // Return the result as an ArrayList
//            return new ArrayList<>(set1);
//        }

        // Function to calculate the sum of unique elements
//        public static int calculateSum(ArrayList<Integer> uniqueElements) {
//            int sum = 0;
//            for (Integer num : uniqueElements) {
//                sum += num;
//            }
//            return sum;
//        }
//
//        public static void main(String[] args) {
//            // Example ArrayLists
//            ArrayList<Integer> list1 = new ArrayList<>();
//            ArrayList<Integer> list2 = new ArrayList<>();
//
//            // Populating the ArrayLists
//            list1.add(10);
//            list1.add(2);
//            list1.add(3);
//            list1.add(7);
//            list1.add(5);
//
//            list2.add(3);
//            list2.add(4);
//            list2.add(5);
//            list2.add(6);
//            list2.add(11);
//
//            // Finding unique elements
//            ArrayList<Integer> uniqueElements = findUniqueElements(list1, list2);
//
//            // Displaying unique elements
//            System.out.println("Unique elements: " + uniqueElements);
//
//            // Calculating the sum of unique elements
//            int sum = calculateSum(uniqueElements);
//
//            // Displaying the result
//            System.out.println("Sum of unique elements: " + sum);
//        }
//    }
}

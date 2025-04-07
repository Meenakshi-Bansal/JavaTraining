package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListPrograms {

    public static void main(String[] args){

        ArrayListPrograms obj = new ArrayListPrograms();
        obj.removeDuplicates();
        obj.compareTwoArrayList();

    }

    public void removeDuplicates(){

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,1,2,3,4,5,2,3,4,2,6,3,4,5,7,8,9,10));
        //1. Linked Hash Set
        LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<Integer>(numbers);
        List<Integer> finalData = new ArrayList<Integer>(uniqueNumbers);
        System.out.println(finalData);

        //2. Stream
        ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,1,2,3,4,5,2,3,4,2,6,3,4,5,7,8,9,10));
        List<Integer> finalvalue = numbers1.stream().distinct().collect(Collectors.toList());
        System.out.println(finalvalue);
    }

    public void compareTwoArrayList(){
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,13,11,4,5));
        ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,11,17));

        //Output: [13,3,17]

        //Compare two arrays list and print the common elements in both the lists
        //numbers.retainAll(numbers1);
        //System.out.println(numbers);

        //Compare the two arraylists and print the unique numbers in 3rd array list.

        ArrayList<Integer> copyNumbers = new ArrayList<>(numbers);
        System.out.println(copyNumbers);

        //Unique in array list 1
        numbers.removeAll(numbers1);
        System.out.println(numbers);

        //Unique in array list 2
        numbers1.removeAll(copyNumbers);
        System.out.println(numbers1);

        numbers.addAll(numbers1);
        System.out.println(numbers);
    }

}

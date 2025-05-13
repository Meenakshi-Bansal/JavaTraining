package Collections.ArrayList;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListPrograms {

    public static void main(String[] args){

        ArrayListPrograms obj = new ArrayListPrograms();
        //obj.removeDuplicates();
        //obj.compareTwoArrayList();
        obj.reverseArrayList();

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

    //Compare two arrays list and find out the unique elements in both the lists and print the elements
    //ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,13,11,4,5));
    //ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,11,17));
    //Output: [13,3,17]

    public void compareTwoArrayList(){
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,13,11,4,5));
        ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,11,17));

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

    //Reverse Array list
    //ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,11,17));
    //Output: [17,11,5,4,3,2,1]

    public void reverseArrayList(){
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,11,17));
        ArrayList<Integer> reverseList = new ArrayList<Integer>();
        //numbers.stream().forEach(it -> numbers.size());
        //Collections.reverse(numbers);
        //System.out.println(numbers);

        int size = numbers.size();
        //System.out.println(size);

        for (int i = size-1; i>=0; i--){
            Integer i1 = numbers.get(i);
            //int temp = i1;
            reverseList.add(i1);
        }
        System.out.println(reverseList);
    }


}

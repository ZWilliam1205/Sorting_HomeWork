import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public void mergeArray(ArrayList<Integer> array1 , ArrayList<Integer> array2){
        ArrayList<Integer> mergedArray = null;
        int index1 = 0;
        int index2 = 0;
        while(index1 < array1.size() || index2 < array2.size()){
            if(index1 >= array1.size()) {
                mergedArray.add(array2.get(index2));
                index2+=1;
                continue;
            }

            if(index2 >= array2.size()){
                mergedArray.add(array1.get(index1));
                index1+=1;
                continue;
            }

            if(array1.get(index1) < array2.get(index2)){
                mergedArray.add(array2.get(index2));
                index2+=1;
            }
            else{
                mergedArray.add(array1.get(index1));
                index1+=1;
            }
        }
    }

}
package Arrays;

import java.util.Arrays;

public class Array {

    private int [] items;
    private int count;

    public Array(int length){
        items = new int [length];
    }

    public void insert (int item){
        if(items.length == count){
            int [] newItems = new int[count*2];

            for(int i=0; i<count; i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;
    }

    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void removeAt(int index){
        if(index <0 || index >= count){
             throw new IllegalArgumentException();
        } else{
            for(int i= index; i<count ; i++){
                items[i] = items[i+1];
            }
            count--;
        }
    }

    public int indexOf(int item){
        for(int i=0; i<count; i++){
            if(items[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public int max(){
        int max=0;
        for(int i=0; i<count; i++){
            if(items[i] > max){
                max = items[i];
            }
        }
        return max;
    }

    public int[] intersect( int[] A, int [] B){
        return Arrays.stream(A)
                .distinct()
                .filter(x -> Arrays.stream(B).anyMatch(y -> y == x))
                .toArray();
     }

    public int[] reverse(){
        int temp ;
        for(int i=0, j=count-1; i<=(count/2); i++){
            temp = items[i];
            items[i] = items[j];
            items[j] = temp;
            j--;
        }
        return items;
    }

    public void insertAt(int item, int index){
        if(index == count){
            items[count++] = item;
        } else if (index > count){
            throw new IllegalArgumentException();
        } else {
            for (int i=count+1; i>=index; i--){
                if(i== index){
                    items[i] = item;
                    count++;
                } else {
                    items[i] = items[i - 1];
                }
            }
        }
    }
}


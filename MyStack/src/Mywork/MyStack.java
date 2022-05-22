package Mywork;


import java.util.Arrays;

/**
 * @author YinXin
 * @creat 2022--05--09
 */
public class MyStack<T> {
    private Object arrays[] = new Object[16];
    private int i = 0;
    public void push(T data){
        arrays[i++] = data;
        if (i > arrays.length/2){
            capacity();
        }
    }
    public void pop(){
        if (i > 0) {
            for (int y = i - 1; y < arrays.length - 1; y++) {
                arrays[y] = arrays[y + 1];
            }
            i--;
        }
    }
    public T top(){
        if (i == 0){
            return null;
        }
        return (T)arrays[i-1];
    }
    private void capacity(){
        arrays = Arrays.copyOf(arrays,arrays.length*2);
    }
}
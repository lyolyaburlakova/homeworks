package task4;
import java.util.NoSuchElementException;

/**
 * Должен наследовать SimpleList
 *
 * Должен иметь 2 конструктора
 * - без аргументов - создает внутренний массив дефолтного размера на ваш выбор
 * - с аргументом - начальный размер массива
 */
public class MyArrayList implements SimpleList {

    public int array[];
    public int current_size;
    public int size = 8;

    public MyArrayList() {
        int t = 1;
        for (int current_size = 0; current_size < size; current_size++){
            array[current_size] = t;
            t ++;
        }
    }

    public MyArrayList(int capacity) {
        this.array = new int[capacity];
    }

    @Override
    public void add(int item) {
        int[] s = new int[size + 1];
        for(int i = 0; i < size + 1; i++){
            s[i] = array[i];
        }
        s[size] = item;
    }

    @Override
    public int remove(int idx) throws NoSuchElementException {
        try {
            int t = array[idx];
            for (int i = idx; i < size; i ++){
                array[i] = array[i+1];
            }
            array[size] = Integer.parseInt(null);
            size --;
            return t;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int size() {
        int s = 0;
        for(int i = 0; i < size; i++) {
            s++;
        }
        return s;
    }

    @Override
    public int get(int idx) throws NoSuchElementException{
        try {
            return array[idx];
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return array[idx];
    }

}
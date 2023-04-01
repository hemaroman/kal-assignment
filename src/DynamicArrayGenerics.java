import java.util.Arrays;

public class DynamicArrayGenerics<T> {
        private T [] array;
        private int size;
        private int count = 0;

         DynamicArrayGenerics(int size){
            this.size = size;
            array =(T[]) new Object[size];
        }

        void addElement(T element) {
            if(count == size){
                T[] temp = (T[]) new Object[size * 2];
                System.arraycopy(array, 0, temp, 0, size);
                array = temp;
                size*=2;
            }
            array[count] = element;
            count++;
        }

        void deleteElement(int index) {
            T[] temp =(T[]) new Object[size - 1];
            for (int i = 0; i < index ; i++){
                temp[i] = array[i];
            }
            for (int i = index; i < size - 1; i++){
                temp[i] = array[i + 1];
            }
            array = temp;
        }

        void updateElement(int index, T element) {
            array[index] = element;
        }

        void insertElement(int index, T element) {
            T[] temp = (T[]) new Object[size + 1];
            for (int i = 0; i < size - 1; i++){
                if (i < index)
                    temp[i] = array[i];
                if (i == index)
                    temp[index] = element;
                if (i >= index)
                    temp[i + 1] = array[i];
            }
            array = temp;
        }

        int indexOf(T element){
            for(int i = 0; i < count; i++)
            {
                if(array[i] == element)
                    return i;
            }
            return -1;
        }

        int size()
        {
            return count;
        }

        void printElements() {
            System.out.println(Arrays.toString(array));
        }
    }


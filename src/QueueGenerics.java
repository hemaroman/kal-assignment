import java.util.Arrays;

public class QueueGenerics <T> {

        private int capacity;
        private T []storage;
        private int front =0;
        private int back = 0;
        private int count = 0;
        public QueueGenerics(int capacity) {
            this.capacity = capacity;
            storage = (T[]) new Object[capacity];
        }


        Object pick() {
            if (storage[front] == null)
                return storage[front + 1];
            else
                return storage[front];
        }

        boolean isEmpty(){
            if (count == 0)
                return true;

            return false;
        }
        void add(T value){
            if((capacity-1) >= count ) {
                storage[front] = value;
                front = (front +1) % capacity;
                count++;
            }
            else
                throw new IllegalStateException("ምን አስበህ ነዉ");
        }

        Object remove(){
            if(count > 0) {
                Object value = storage[back];
                storage[back] = null;
                back = (back+1) % capacity;
                count--;

                return value;
            }
            return -1;
        }

        @Override
        public String toString() {
            return Arrays.toString(storage);
        }
    }
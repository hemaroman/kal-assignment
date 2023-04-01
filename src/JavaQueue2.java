import java.util.Arrays;

public class JavaQueue2 {
        int capacity;
        int[]storage;
        int front =0;
        int back = 0;
        int count = 0;
        public JavaQueue2(int capacity) {
            this.capacity = capacity;
            storage = new int[capacity];
        }


        int pick() {
                if (front == 0)
                    return storage[front + 1];
                else
                    return storage[front];
        }

        boolean isEmpty(){
            if (count == 0)
            return true;

            return false;
        }
        void add(int value){
            if((capacity-1) >= count ) {
                storage[front] = value;
                front = (front +1) % capacity;
                count++;
            }
            else
                throw new IllegalStateException("ምን አስበህ ነዉ");
        }

        int remove(){
            if(count > 0) {
                int value = storage[back];
                storage[back] = 0;
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

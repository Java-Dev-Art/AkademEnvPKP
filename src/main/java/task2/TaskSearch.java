package task2;

public class TaskSearch {
    public void task(int[] numbers, int x){
        System.out.println(search(numbers,x));
    }
    private boolean search(int[] numbers, int x) {

        for (int i = 0; i <= numbers.length-1; i++) {
            if (numbers[i] == x) {
                return true;
            }
        }
        return false;
    }
}

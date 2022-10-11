package task2;

/*
    Mając tablicę int[] numbers, wypełnioną liczbami całkowitymi i
    posortowaną malejąco ( numbers[i] > numbers[i+1] ), sprawdź czy
    występuje w niej liczba int x. Metoda powinna zwracać wartość TRUE,
    jeśli dana liczba występuje oraz FALSE w przeciwnym wypadku. W rozwiązaniu zależy
    nam na jak najmniejszej złożoności obliczeniowej (priorytet) oraz pamięciowej. Podaj
    szacowaną złożoność obliczeniową oraz pamięciową. Poniżej sygnatura metody do napisania.

    private boolean search(int[] numbers, int x){}
 */
public class Task2 {
    public static void main(String[] args) {

        int[] ints =new int[]{1,2,3,4,};

        TaskSearch taskSearch = new TaskSearch();
        taskSearch.task(ints,3);
    }
}


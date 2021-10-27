package threads;

public class Main {

    public static void main(String[] args) {

        int[] array = {2,4,6,8,10};
        ThreadSum t1 = new ThreadSum("#1°", array);
        ThreadSum t2 = new ThreadSum("#2°", array);
        ThreadSum t3 = new ThreadSum("#3°", array);

    }

}

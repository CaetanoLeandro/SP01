package threads;

public class Calculator {

    private int sum;

    public synchronized int sumArray(int[] array) {

        sum = 0;

        for (int i=0; i<array.length; i++) {

            sum += array[i];

            System.out.println("Adding: " + Thread.currentThread().getName()
            + "Add value: "  + array[i] + "Total: " +sum);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        return sum;
    }

}

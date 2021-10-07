package treads;

public class ThreadSum implements Runnable{

    private String name;
    private int[] nums;
    private static Calculator calc = new Calculator();

    public ThreadSum(String name, int[] nums){
       this.name = name;
       this.nums = nums;
       Thread t = new Thread(this, name);
       t.start();
    }


    @Override
    public void run() {

        System.out.println(this.name + "start");
        int sum = calc.sumArray(this.nums);
        System.out.println("Sum thread " + this.name + "is " + sum);
        System.out.println(this.name + "finish");

    }
}

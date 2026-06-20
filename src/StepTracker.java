public class StepTracker {
    private int min;
    private int days;
    private int ActD;
    private int total;

public StepTracker(int minimum) {
    min = minimum;
    days = 0;
    ActD = 0;
    total = 0;
}

public void addDailySteps(int steps){

    if (steps >= min){
        ActD++;
    }
    days++;
    total += steps; // focuse
    }

public int activeDays(){
    return ActD;
}
public double averageSteps(){
    return (double) total/days;
}

    public static void main(String[] args) {
        StepTracker stepp = new StepTracker(2000);
        stepp.addDailySteps(1000);
        stepp.addDailySteps(8000);
        stepp.addDailySteps(6000);
        int el = stepp.activeDays();

        System.out.println("here" + stepp.averageSteps());
        System.out.println(el);

    }
}

package exercises;

public class DataMobile extends Standard {
    protected int dataUsage;
    protected final int MAX_DATA;

    // Constructor w/ extended functionality
    public DataMobile(int mins, int texts, int data) {
        super(mins, texts);
        this.MAX_DATA = data;
    }

    // Unique transfer method for the DataMobile class
    public void transfer(int n) {
        if ((this.dataUsage + n) > MAX_DATA) {
            System.out.println("You don't have enought MB's to transfer that ammount");
        } else {
            this.dataUsage += n;
        }
    }

    // Billing method for both the DataHeavy and DataMobile classes
    @Override
    public double billing() {
        // For the DataHeavy class
        if(this instanceof DataHeavy){
            if(this.dataUsage > MAX_DATA){
                int aboveMbLimit = this.dataUsage - MAX_DATA;
                return super.billing() + MAX_DATA*0.25 + aboveMbLimit*0.3 - textsUsed * 0.05;
            } else {
                return super.billing() + this.dataUsage * 0.25 - textsUsed * 0.05;
            }
        // For the DataMobile class
        } else {
            return super.billing() + this.dataUsage * 0.15;
        }
    }
}

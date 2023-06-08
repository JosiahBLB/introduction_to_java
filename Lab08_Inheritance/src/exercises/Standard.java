package exercises;

public class Standard {
    protected int minutesUsed;
    protected int textsUsed;
    protected final int MAX_MINS;
    protected final int MAX_TEXTS;

    // Constructor
    public Standard(int mins, int texts) {
        this.minutesUsed = 0;
        this.textsUsed = 0;
        this.MAX_MINS = mins;
        this.MAX_TEXTS = texts;
    }

    // Uses talk minuite(s) if available otherwise an error is printed
    public void talk(int nMinsTalked) {
        if ((this.minutesUsed + nMinsTalked) > MAX_MINS) {
            System.out.println("Maximum call miniutes exceeded");
        } else {
            this.minutesUsed += nMinsTalked;
        }
    }

    // Uses talk text(s) if available otherwise an error is printed
    public void text(int nTextSent) {
        if ((this.textsUsed + nTextSent) > MAX_TEXTS) {
            System.out.println("Maximum allocated texts exceeded");
        } else {
            this.textsUsed += nTextSent;
        }
    }

    // Prints the bill
    public double billing() {
        return this.minutesUsed * 0.1 + this.textsUsed * 0.05;
    }
}

package exercises;

public class SparkPlugApp {
    public static void main(String[] args) {
        // Array of 3 Standard objects
        Standard[] packages = new Standard[3];

        // Instantiate each different mobile plan
        packages[0] = new Standard(10, 10);
        packages[1] = new DataMobile(10, 10, 10);
        packages[2] = new DataHeavy(10, 10, 10);

        // Set values of each instance variable
        for (Standard mobilePackage : packages) {
            if (mobilePackage instanceof DataMobile){
                DataMobile dm = (DataMobile) mobilePackage;
                dm.transfer(5);
            } else if (mobilePackage instanceof DataHeavy){
                DataHeavy dh = (DataHeavy) mobilePackage;
                dh.transfer(15);
            }
            mobilePackage.text(6);
            mobilePackage.talk(4);

            // Calculate each plan's bill
            System.out.println(String.format("%.2f", mobilePackage.billing()));
        }
    }
}

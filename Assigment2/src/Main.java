public class Main {
    public static void main(String[] args) {

        InPatient inPatient = new InPatient("Abdisamad", 70.0,
                7, 100.0);
        OutPatient outPatient = new OutPatient("Ahmed", 100.0, 45.0);

        inPatient.printBill();
        outPatient.printBill();
    }


}
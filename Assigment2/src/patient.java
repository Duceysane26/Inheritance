class Patient {

     public String name;
     public double consultationFee;

    // Constructor
    public Patient(String name, double consultationFee) {
        this.name = name;
        this.consultationFee = consultationFee;
    }

    // calculate bill
    public double calculateBill() {
        return consultationFee;
    }

    // Print Bill
    public void printBill() {
        System.out.println("Patient Name: " + name);
        System.out.println("Total Bill: $" + calculateBill());
        System.out.println("Consultation Fee: $" + consultationFee);

        System.out.println("------------------------");
    }
}
class InPatient extends Patient {

    private int daysAdmitted;
    private double roomCharge;

    // Constructor
    public InPatient(String name, double consultationFee, int daysAdmitted, double roomCharge) {
        super(name, consultationFee);
        this.daysAdmitted = daysAdmitted;
        this.roomCharge = roomCharge;
    }

    // Override calculateBill()
    @Override
    public double calculateBill() {
        return consultationFee + (daysAdmitted * roomCharge);
    }
}
class OutPatient extends Patient {

    private double labFee;

    // Constructor
    public OutPatient(String name, double consultationFee, double labFee) {
        super(name, consultationFee);
        this.labFee = labFee;
    }

    // Override calculateBill()
    @Override
    public double calculateBill() {
        return consultationFee + labFee;
    }
}
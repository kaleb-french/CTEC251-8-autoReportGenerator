public abstract class VehicleReport {
    final void generateReport(){
        this.collectData();
        this.formatReport();
        this.logStatus();
    }
    protected void collectData(){
        System.out.println("Collecting GPS Data...");
    }
    protected abstract void formatReport();
    protected void logStatus(){
        System.out.println("Log Entry Created!");
    }
}

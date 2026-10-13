public abstract class VehicleReport {
    final void generateReport(){
        this.collectData();
        this.formatReport();
        if(this.shouldCheckMaintenance()){
            this.performMaintenanaceCheck();
        }
        this.logStatus();
    }
    protected void collectData(){
        System.out.println("Collecting GPS Data...");
    }
    protected abstract void formatReport();
    protected void logStatus(){
        System.out.println("Log Entry Created!");
    }
    protected boolean shouldCheckMaintenance(){
        return false;
    }
    protected void performMaintenanaceCheck(){
        System.out.println("Performing maintenance check...");
    }
}

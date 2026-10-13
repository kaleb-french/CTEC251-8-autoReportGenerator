public class TruckReport extends VehicleReport{

	@Override
	protected void formatReport(){
	    System.out.println("Formating report for heavy cargo.");
	}
	@Override
	protected boolean shouldCheckMaintenance(){
	    return true;
	}

}

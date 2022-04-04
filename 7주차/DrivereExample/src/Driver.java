public class Driver {
	public void drive(Vehicle vehicle) {
                    if(vehicle instanceof Bus) { 
			Bus bus = (Bus) vehicle;  //타입 변환
			bus.checkFare();
		}
		vehicle.run();
	}
}
public class Driver {
	public void drive(Vehicle vehicle) {
                    if(vehicle instanceof Bus) { 
			Bus bus = (Bus) vehicle;  //Ÿ�� ��ȯ
			bus.checkFare();
		}
		vehicle.run();
	}
}
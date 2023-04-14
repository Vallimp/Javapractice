package Interfaces;

	public class AustralianTraffic implements CentralTraffic,ContinentalTraffic {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			CentralTraffic a= new AustralianTraffic();
			a.redStop();
			a.FlashYellow();
			a.greenGo();

		AustralianTraffic at=new AustralianTraffic();
		ContinentalTraffic ct=new AustralianTraffic();
		at.walkonsymbol();
		ct.Trainsymbol();
		}	
		
		//this method is only confined to this class rest all are the interface method implementations
		
		public void walkonsymbol()
		{
		System.out.println("walking");
		}
		

		public void FlashYellow() {
			// TODO Auto-generated method stub
			System.out.println(" flash yellow implementation");
		}

		public void greenGo() {
			// TODO Auto-generated method stub
			System.out.println(" Green go implementation");

		}

		public void redStop() {
			// TODO Auto-generated method stub
			System.out.println(" redstop implementation");
		}

		public void Trainsymbol() {
			// TODO Auto-generated method stub
			
		}
		
}

package Observation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Observer stev=new Admin("Steve");
		Observer harry=new Admin("Harry");
		Observer jon=new Admin("Jhones");
		
		INotificationService notificationService=new NotificationService();
		notificationService.addSubscriber(stev);
		notificationService.addSubscriber(harry);
		notificationService.addSubscriber(jon);
		notificationService.notifySubscriber();
		notificationService.removeSubscriber(jon);
		
		

	}

}

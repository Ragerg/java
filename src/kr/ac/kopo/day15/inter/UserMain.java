package kr.ac.kopo.day15.inter;

public class UserMain {
	
	public static void main(String[] args) {
	
//		TV tv = new SamsungTV();
		TV tv = new LGTV();

		tv.powerOn();
		tv.volumedown();
		tv.mute();
		tv.channelUp();
		tv.mute();
		tv.powerOff();
//		SamsungTV sam = (SamsungTV)tv;
		
//		System.out.println(sam);
//		System.out.println(sam.toString());
		
		
		
		System.out.println(tv);
		System.out.println(tv.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

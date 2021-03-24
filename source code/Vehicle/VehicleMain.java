import java.util.*;
public class VehicleMain {
	public static void main(String[] args) {
		int fuelcap=0;
		int cc=0;
		boolean Kick=false;
		String kick1;
		String audio= null;
		int numd=0;
		String make1=null;
		String num1=null;
		String type1=null;
		
		System.out.println("1.Four Wheeler");
		System.out.println("2.Two Wheeler");
		System.out.println("Enter Vehicle Type:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1)
		{
			FourWheeler s1=new FourWheeler(make1, num1, type1, fuelcap, cc, audio, numd);
			System.out.println("Vehicle Make:");
			make1=sc.next();
			s1.setMake(make1);
			System.out.println("Vehicle Number:");
			num1=sc.next();
			s1.setVehicleNumber(num1);
			System.out.println("Fuel Type:\n1.Petrol \n2.Deisel");
			n=sc.nextInt();
			if(n==1)
				s1.setFuelType("Petrol");
			else
				s1.setFuelType("Diesel");
			System.out.println("Fuel Capacity:");
			fuelcap=sc.nextInt();
			s1.setFuelCapacity(fuelcap);
			System.out.println("Engine CC:");
			cc=sc.nextInt();
			s1.setCc(cc);
			System.out.println("Audio System:");
			audio=sc.next();
			s1.setAudioSystem(audio);
			System.out.println("Number of doors:");
			numd=sc.nextInt();
			s1.setNumberOfDoors(numd);
			s1.displayBasicinfo();
			s1.displayDetailInfo();
			
		}
		else
		{
			TwoWheeler v1=new TwoWheeler(make1, num1, type1, fuelcap, cc, Kick);
			System.out.println("Vehicle Make:");
			make1=sc.next();
			v1.setMake(make1);
			System.out.println("Vehicle Number:");
			num1=sc.next();
			v1.setVehicleNumber(num1);
			System.out.println("Fuel Type:\n1.Petrol \n2.Deisel");
			n=sc.nextInt();
			if(n==1)
			{
				v1.setFuelType("Petrol");
			}
			else
			{
				v1.setFuelType("Diesel");
			}
			System.out.println("Fuel Capacity:");
			fuelcap=sc.nextInt();
			v1.setFuelCapacity(fuelcap);
			System.out.println("Engine CC:");
			cc=sc.nextInt();
			v1.setCc(cc);
			System.out.println("kick Start Available(yes/no):");
			kick1=sc.next();
			if(kick1.equals("yes"))
			{
				v1.setKickStartAvailable(true);
			}
			else
			{
				v1.setKickStartAvailable(false);
			}
			
			
			v1.displayBasicinfo();
			v1.displayDetailInfo();
		}
	}
}


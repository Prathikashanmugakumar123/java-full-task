package karthick;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Demo1{
	Scanner s=new Scanner(System.in);
   public  void square() {
System.out.println("Welcome for square lands🎉");
 String areas[]= {"1.urban🏢","2.rural🌾"};
 for(String sites:areas) {
	 System.out.println(sites);
 }
 System.out.println("Enter your choice:");
 int choice=s.nextInt();
 s.nextLine();
 if(choice==1) {
	 int rate=1000;
System.out.println("Welcome to Urban Areas 🏢:"); 
	System.out.println("Each square feet rate is "+rate);
	System.out.println("Enter how much square feet do you want?");
	int sqrt_feet=s.nextInt();
	s.nextLine();
	System.out.println("Do you want this site or not(yes/no):");
	String ans=s.nextLine();
	if(ans.equalsIgnoreCase("yes")) {
		System.out.println("each square feet is "+rate);
		System.out.println("your select square feet rate is "+sqrt_feet);
		System.out.println("your total square feet rate is "+(sqrt_feet*rate));
		s.nextLine();
		System.out.println("Enter your name:");
		String name=s.nextLine();
		s.nextLine();
		System.out.println("Enter your gender:");
		String gender=s.nextLine();
		s.nextLine();
		System.out.println("Enter your phone no:");
		String ph=s.nextLine();
		s.nextLine();
		System.out.println("Enter your address:");
		String address=s.nextLine();
		s.nextLine();
		System.out.println("Enter your id proof(aadhar):");
		String id=s.nextLine();
		if(ph.length()==10) {		
	 if(id.length()==12) {
		String bill="========🤩𝓣𝓮𝓻𝓻𝓪𝓒𝓪𝓵𝓬🤩====================\n"+"name:"+name+"\n"+"gender"+gender+"\n"
		+"phone no:"+ph+"\n"+"address:"+address+"\n"+"id proof:"+id+"\n"+
				    "==========================================\n";
		System.out.println(bill);
		String imageLink = "https://www.google.com/search?q=land+images&oq=land+images&gs_lcrp=EgZjaHJvbWUqBggAEEUYOzIGCAAQRRg7MgcIARAAGIAEMgcIAhAAGIAEMgcIAxAAGIAEMgcIBBAAGIAEMgcIBRAAGIAEMgcIBhAAGIAEMgcIBxAAGIAEMgcICBAAGIAEMggICRAAGBYYHtIBCDM0MTJqMGo5qAIGsAIB8QWqb6PHLKrsgg&sourceid=chrome&source=chrome.ob&ie=UTF-8";

        System.out.print("Do you want to see site? (yes/no): ");
        String answer = s.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            try {
				Desktop.getDesktop().browse(new URI(imageLink));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        } else {
            System.out.println("Website not opened.");
        }
	}}else {
		System.out.println("pls enter a valid phone no or id");
	}
		}
	else {
		System.out.println("Enter your feedback🤔:");
		String feedback=s.nextLine();
		System.out.println("Thank You,visit again😀");
	}
 }
 else {
	 
 }
   }
public void rectangle() {
	System.out.println("Welcome for rectangle lands🎉");
   }
public  void triangle() {
	System.out.println("Welcome for triangle lands🎉");
}
public  void circle() {
	System.out.println("Welcome for circle lands🎉");   
}
public  void pentagon() {
	System.out.println("Welcome for pentagon lands🎉");   
}
public static void main(String[] args) {
	Demo1 d=new Demo1();
	Scanner s=new Scanner(System.in);
	while(true) {
		System.out.println("🤩𝓣𝓮𝓻𝓻𝓪𝓒𝓪𝓵𝓬🤩");
		String values[]= {"1.square🟥","2.Rectangle🖵","3.Triangle📐","4.circle⭕","5.pentagon⬟"};
		for(String items:values) {
			System.out.println(items);
		}
		System.out.println("Enter your choice😀:");
		int choice=s.nextInt();
		switch(choice) {
		case 1:
			d.square();
			break;
		case 2:
			d.rectangle();
			break;
		case 3:
			d.triangle();
			break;
		case 4:
			d.circle();
			break;
		case 5:
			d.pentagon();
			break;
		default:
			System.out.println("pls enter a valid choice😒");
		}}
}}








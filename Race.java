import java.util.*;
public class Race{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		double[] speeds=new double[5];
		double totalspeed=0.0;
		for(int i=0;i<5;i++){
			System.out.print("Enter the speed of racer"+(i+i)+":");
			speed[i]=s.nextDouble();
			totalspeed+=speed[i];
		}
		double avg=totalspeed/5;
		System.out.println("avg:"+avg);
		System.out.println("speed greater than avg speed:");
		for(double i:speed){
			if(i>avg){
			System.out.println(i);
			}
		}
	}
}
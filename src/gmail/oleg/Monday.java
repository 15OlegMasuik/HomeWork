package gmail.oleg;

import java.util.Arrays;

//import java.util.Arrays;
//import java.util.Date;

public class Monday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int t=23;
	//	System.out.println(t>100?"steam":(t<=0?"ice":"water"));
//		long startTime =new Date().getTime();
//		int[] arryaInt= new int [10];
//		short [] arrayShort = new short[100];
//		byte  [] arrayByte = new byte[100];
//		int couneter=0;
//		int counterI=0;
//		int counterS=0;
//		int counterB=0;
//		do{
//			int rnd=(int)(Math.random()*Integer.MAX_VALUE);
//			if((counterB<10)&&(rnd<=Byte.MAX_VALUE)){
//				arrayByte[counterB++]=(byte)rnd;
//				
//			}else if((counterI<10)&&(rnd<=Short.MAX_VALUE)){
//				arrayShort[counterS++]=(short)rnd;
//				
//			}else if(counterI<10){
//				arryaInt[counterI++]=rnd;
//				
//			}
//			couneter++;
//		}while((counterI+counterS+counterB)<30);
//		System.out.println("Byte"+Arrays.toString(arrayByte));
//		System.out.println("Int"+Arrays.toString(arryaInt));
//		System.out.println("Short"+Arrays.toString(arrayShort));
//		System.out.println("counter"+ couneter);
//		long endTime= new Date().getTime();
//		System.out.println("time" +(endTime-startTime));
		
//		int a =8888856;
//		int counter=0;
//		
//		do{
//			System.out.println(a%2);
//			a/=10;
//			counter++;
//		}while(a!=0);
//			System.out.println(counter);
			
		int[] a = new int[9];
		int[] b = { 1,1,1};
	
		System.arraycopy(b, 0, a, (a.length-b.length)/2 , b.length);

		System.out.println(Arrays.toString(a));
	}

}

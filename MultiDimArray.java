import java.util.*;
class MultiDimArray{
	public static void main(String[] ar){
		int marks[][]=new int[10][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rollno and Marks: ");
		for(int i=0;i<marks.length;i++){
			System.out.println("Rollno");
			marks[i][0]=sc.nextInt();
			System.out.println("Marks");
			marks[i][1]=sc.nextInt();
		}
	for(int j=0;j<marks.length;j++){
		System.out.println("Rollno"+marks[j][0]+"Marks"+marks[j][1]);
	}
}
}
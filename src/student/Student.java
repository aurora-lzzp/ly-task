package student;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Student {

	private String name;
	private int age;
	private int classnum;
	private int stunum;
	Scanner sc = new Scanner(System.in);
	
	public Student(){
		setName(name);
		setAge(age);
		setClassnum(classnum);
		setStunum(stunum);
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("�������������");
		this.name = sc.nextLine();

	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		while(true){
		System.out.println("�������������");
		this.age = sc.nextInt();
		if (this.age>=14 && this.age<=22 ){
			break;
			}
		System.out.println("������һ����Ч��ֵ");
	}
	}
	
	public int getClassnum() {
		return classnum;
	}
	
	public void setClassnum(int classnum) {
		System.out.println("������༶");
		this.classnum = sc.nextInt();
	}
	
	public int getStunum() {
		return stunum;
	}
	public void setStunum(int stunum) {
		while(true){
		System.out.println("������ѧ����");
		this.stunum = sc.nextInt();
		if(this.stunum >=1 && this.stunum <=36){
			break;
		}
	}
	}
		
	public void showinfo(){
		getName();
		getAge();
		getClassnum();
		getStunum();
		System.out.println(name+"  "+age+"  "+classnum + " " + stunum);
		
	}
}

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
		System.out.println("请输入你的姓名");
		this.name = sc.nextLine();

	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		while(true){
		System.out.println("请输入你的年龄");
		this.age = sc.nextInt();
		if (this.age>=14 && this.age<=22 ){
			break;
			}
		System.out.println("请输入一个有效的值");
	}
	}
	
	public int getClassnum() {
		return classnum;
	}
	
	public void setClassnum(int classnum) {
		System.out.println("请输入班级");
		this.classnum = sc.nextInt();
	}
	
	public int getStunum() {
		return stunum;
	}
	public void setStunum(int stunum) {
		while(true){
		System.out.println("请输入学生号");
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

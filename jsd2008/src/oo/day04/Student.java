package oo.day04;

public class Student extends Person {
	String stuId; //ѧ��
	Student(String name,int age,String address,String stuId){
		super(name,age,address);
		this.stuId = stuId;
	}
	void sayHi(){
		System.out.println("��Һã��ҽ�"+name+"������"+age+"���ˣ���ס"+address+",ѧ��Ϊ��"+stuId);
	}
}
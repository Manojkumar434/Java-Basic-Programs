package manojkumar.m.hotel;
import java.util.Scanner;

public class maanavan implements studentdefault
{
	studentdetails [] ksr=new studentdetails[6];
	Scanner scan =new Scanner(System.in);
	public maanavan()
	{
		ksr[0]=new studentdetails(001,"MANOJKUMAR M","7/149-1,ELACHIPALAYAM-637202",9789355930L, "goverment higher secondary school","KSRangasamy college of artsb and science", 434, 889,(float)82.6, "BACHELOR F COMPUTER APPLICATION");
		ksr[1]=new studentdetails(002,"JOSVANTH S.K","2-224,HOSUR-637578",9842121682L,"ASHOKLEYLAND SCHOOL","KUMARASAMY ENGINEER COLLEGE",459,556,(float)78.5,"BE-EEE");
		ksr[2]=new studentdetails(003,"VIJAYASARATHY N","32-342\2,Saampalli-638291",9944752679L,"GOVERMENT HIGHERSECONDARY SCHOOL","KSRangasamy college of arts and science",439,897,(float)76.5,"BACHELOR OF COMPUTER APPLICATIONS");
		ksr[3]=new studentdetails(004,"NANDHAKUMER J","443\112-2,aayathakuttai,trichengode-637608",9876878223L,"SVB","PAAVAI COLLEGE OF ARTS AND SCIENCE",426,856,(float)66.9,"BE_ECE");
		ksr[4]=new studentdetails(006,"PAVITHRA M","23\1234-21,CHENNAI-639893",9500685759L,"KSRanagsamy matric higher secondary school","mahentra college of arts and science(autonomous)",449,1069,(float)85.9,"BSC MATHEMATICS");
	}
	public static void main(String[] args) 
	{
		studentdetails f1=new studentdetails();
		f1.setIdnumber(005);
		f1.setStudentname("MANIKANDAN G");
		f1.setAddress("13\34-sathyanagar,elchipalayam-637202");
		f1.setMobileno(8972671600L);
		f1.setSchoolname("sri vinayaga matric higher secondary school");
		f1.setCollegename("MUTHAYAMMAL coLLEGE OF ARTS AND SCIENCE");
		f1.setTenthmark(333);
		f1.setTwelvethmark(756);
		f1.setCollegepercentage((float)89.2);
		f1.setDegree("BSC MATHS");
		maanavan maan=new maanavan();
		/*
		 * maan.addnewstudentdetil(f1); 
		 * maan.listallstudentdetail();
		 */
		/*
		 * maan.addnewstudentdetil(f1); maan.listallstudentdetail();
		 */
			maan.addnewstudentdetil(f1);
			/* maan.updatestduentdetail("MANOJKUMAR M"); */
			maan.listallstudentdetail();
			maan.searchstudentdetail(6);
		
	}

	@Override
	public String addnewstudentdetil(studentdetails details) 
	{
		// TODO Auto-generated method stub
		for(int index=0;index<ksr.length;index++)
		{
			if(ksr[index]==null)
			{
				ksr[index]=details;
				return details.getStudentname()+"has added successfully";
			}
		}
		return details.getStudentname()+"hasn't  added successfully";
	}
	

	@Override
	public void listallstudentdetail() {
		// TODO Auto-generated method stub
		for(studentdetails s:ksr)
		{
			System.out.println(s);
		}
		
	}

	@Override
	public void deletestudentdetail(String studentname) {
		// TODO Auto-generated method stub
		for(int index=0;index<ksr.length;index++)
		{
			if(ksr[index]==null)
			continue;
			if(ksr[index].getStudentname().equalsIgnoreCase(studentname))
			{
				ksr[index]=null;
				System.out.println(studentname+" deleted is good");
				return;
			}
				System.out.println(studentname+"this student name is not deleted sucessfully");
		}
		
	}

	@Override
	public void searchstudentdetail(int idno) {
		// TODO Auto-generated method stub
		System.out.println(" Matching the Idnumber "+idno+" is executed successfully");
		for(int index=0;index<ksr.length;index++)
		{
			if(ksr[index]==null)
				continue;
			if(ksr[index].getIdnumber()>=idno)
			{
				System.out.println(ksr[index]);
				return;
			}
		}
		System.out.println(idno+" This id number hasn't found anywhere");
	}

	@Override
	public void sortstudentdetails() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updatestduentdetail(String studentname) {
		// TODO Auto-generated method stub
		for(int index=0;index<ksr.length;index++)
		{
			if(ksr[index]==null)
				continue;
			if(ksr[index].getStudentname().equalsIgnoreCase(studentname))
			{
				System.out.println(ksr[index]);
				System.out.println("tell us which part is update");
				String what=scan.nextLine();
				switch(what)
				{
				case "studentname":
					System.out.println("tell us a update student name ");
					String nm=scan.next();
					ksr[index].setStudentname(studentname);
					break;
				case "idnumber":
					System.out.println("Tell us a update idnumber: ");
					int id=scan.nextInt();
					ksr[index].setIdnumber(id);
					break;
				case "address":
					System.out.println("tell us a update new address");
					String add=scan.next();
					ksr[index].setAddress(add);
					break;
				case "mobileno":
					System.out.println("tell us a update your mobbileno ");
					long mob=scan.nextLong();
					ksr[index].setMobileno(mob);
					break;
				case "schoolname":
					System.out.println(" tell us a update school name");
					String scl=scan.next();
					ksr[index].setSchoolname(scl);
					break;
				case "collegename":	
					System.out.println("tell us a update college name");
					String clg=scan.next();
					ksr[index].setCollegename(clg);
					break;
				case "tenthmark":
					System.out.println("tell us a update tenthmark");
					int ten=scan.nextInt();
					ksr[index].setTenthmark(ten);
					break;
				case "twelvethmark":
					System.out.println("tell us a update twelvethmark");
					int twelve=scan.nextInt();
					ksr[index].setTwelvethmark(twelve);
					break;
				case "collegepercentage":
					System.out.println("tell us a update college percentage");
					float per=scan.nextFloat();
					ksr[index].setCollegepercentage(per);
					break;
				case "degree":
					System.out.println("tell us a update degree name");
					String deg=scan.next();
					ksr[index].setDegree(deg);
					break;
				}
			}
		}
		
	}

}

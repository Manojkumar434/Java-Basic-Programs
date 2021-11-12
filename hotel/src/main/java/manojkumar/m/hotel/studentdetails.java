package manojkumar.m.hotel;

public class studentdetails {
	private int idnumber;
	private String studentname;
	private String address;
	private long mobileno;
	private String schoolname;
	private String collegename;
	private int tenthmark;
	private int twelvethmark;
	private float collegepercentage;
	private String degree;
	public int getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(int idnumber) {
		this.idnumber = idnumber;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public int getTenthmark() {
		return tenthmark;
	}
	public void setTenthmark(int tenthmark) {
		this.tenthmark = tenthmark;
	}
	public int getTwelvethmark() {
		return twelvethmark;
	}
	public void setTwelvethmark(int twelvethmark) {
		this.twelvethmark = twelvethmark;
	}
	public float getCollegepercentage() {
		return collegepercentage;
	}
	public void setCollegepercentage(float collegepercentage) {
		this.collegepercentage = collegepercentage;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	@Override
	public String toString() {
		return "studentdetails [idnumber=" + idnumber + ", studentname=" + studentname + ", address=" + address
				+ ", mobileno=" + mobileno + ", schoolname=" + schoolname + ", collegename=" + collegename
				+ ", tenthmark=" + tenthmark + ", twelvethmark=" + twelvethmark + ", collegepercentage="
				+ collegepercentage + ", degree=" + degree + "]";
	}
	public studentdetails(int idnumber, String studentname, String address, long mobileno, String schoolname,
			String collegename, int tenthmark, int twelvethmark, float collegepercentage, String degree) {
		super();
		this.idnumber = idnumber;
		this.studentname = studentname;
		this.address = address;
		this.mobileno = mobileno;
		this.schoolname = schoolname;
		this.collegename = collegename;
		this.tenthmark = tenthmark;
		this.twelvethmark = twelvethmark;
		this.collegepercentage = collegepercentage;
		this.degree = degree;
	}
	public studentdetails() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	}

	
	
	
	



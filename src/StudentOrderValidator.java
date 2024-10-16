public class StudentOrderValidator {
	public static void main(String[] args) {
		checkAll();
	}

	static void checkAll(){
		StudentOrder so = readStudentOrder();

		AnswerCityRegister cityAnswer = checkCityRegister(so);
		AnswerIsMarried isMarriedAnswer = checkIsMarried(so);
		AnswerIsKids isKidsAnswer = checkIsKids(so);
		AnswerIsStudent isStudentAnswer = checkIsStudent(so);

		sendMail(so);
	}

	static StudentOrder readStudentOrder(){
		StudentOrder studentOrder = new StudentOrder();
		return studentOrder;
	}

	static AnswerCityRegister checkCityRegister(StudentOrder studentOrder){
		System.out.println("CityRegister is running");
		return new AnswerCityRegister();
	}

	static AnswerIsMarried checkIsMarried(StudentOrder studentOrder){
		System.out.println("Married is running");
		return new AnswerIsMarried();
	}

	static AnswerIsKids checkIsKids(StudentOrder studentOrder){
		System.out.println("Kids is running");
		return new AnswerIsKids();
	}

	static AnswerIsStudent checkIsStudent(StudentOrder studentOrder){
		System.out.println("Student is running");
		return new AnswerIsStudent();
	}

	static void sendMail(StudentOrder studentOrder){
		System.out.println("Mail is running");
	}
}

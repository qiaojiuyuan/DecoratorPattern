
public class FatherMain {

	public static void main(String[] args) {
		SchoolReport sr = new FouthGradeSchoolReport();
		sr = new HightScoreDecorator(sr);
		sr.report();
		sr.sign("张三");
	}
}


public class FouthGradeSchoolReport extends SchoolReport{

	private final static String TAG = FouthGradeSchoolReport.class.getSimpleName();
	@Override
	public void report() {
		System.out.println(TAG+"==真实试卷==语文:64,数学:80,英语:36");
	}

	@Override
	public void sign(String name) {
		System.out.println(TAG+"===家长签名:"+name);
	}

}

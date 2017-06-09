
public class FatherMain {

	public static void main(String[] args) {
//		SchoolReport sr = new FouthGradeSchoolReport();
//		//一层装饰，先报分数高的科目
//		sr = new HightScoreDecorator(sr);
//		//二层装饰，先报班级排名
//		sr = new SortDecorator(sr);
		//也可以写成下面这样的形式，这个跟IO流的写法就很一样了，就能明白装饰模式
		SchoolReport sr = new SortDecorator(new HightScoreDecorator(new FouthGradeSchoolReport()));
		sr.report();
		sr.sign("张三");
	}
}

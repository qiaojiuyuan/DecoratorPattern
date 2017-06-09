
public class SortDecorator extends Decorator{

	public SortDecorator(SchoolReport sr) {
		super(sr);
	}
	
	private void mySort() {
		System.out.println("我的班级排名是25名");
	}
	
	@Override
	public void report() {
		mySort();
		super.report();
	}

}

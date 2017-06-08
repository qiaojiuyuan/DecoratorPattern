
/**
 * 装饰类
 * @author qiaojy
 *
 */
public class HightScoreDecorator extends Decorator{

	private final static String TAG = HightScoreDecorator.class.getSimpleName();
	
	public HightScoreDecorator(SchoolReport sr) {
		super(sr);
	}
	
	private void reportHighScore(){
		System.out.println(TAG+"==装饰类先报分数高的===数学:80,语文60,英语:36");
	}
	
	@Override
	public void report() {
		reportHighScore();
		super.report();
	}

}

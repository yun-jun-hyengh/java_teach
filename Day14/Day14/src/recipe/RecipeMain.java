package recipe;

public class RecipeMain {
	public static void main(String[] args) {
		// 추상 클래스는 직접 객체를 생성할 수 없다.
		//Receipt receipt = new Receipt();
		
		PastaReceipt pr = new PastaReceipt("최연석");
		pr.info();
		pr.makeSource();
		
		System.out.println();
		
		StakeReceipt sr = new StakeReceipt("이현복");
		sr.info();
		sr.grillStake();
		
	}
}

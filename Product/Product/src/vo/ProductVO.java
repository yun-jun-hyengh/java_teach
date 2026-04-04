package vo;

/***
 * CREATE TABLE PRODUCT(
	PRODUCT_CODE INT primary KEY,
    PRODUCT_NAME VARCHAR(100),
    PRODUCT_PRICE INT,
    PRODUCT_COUNT INT,
    PRODUCT_FACTORY VARCHAR(50),
    PRODUCT_DATE date
);
 */

public class ProductVO {
	private int product_code; // 상품코드
	private String product_name; // 상품이름
	private int product_price; // 상품가격
	private int product_count; // 재고수량
	private String product_factory; // 제조사
	private String product_date; // 입고날짜 
	
	public ProductVO() {
		
	}
	
	public ProductVO(int product_code, String product_name,
			int product_price, int product_count, String product_factory, String product_date) {
		this.product_code = product_code;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_count = product_count;
		this.product_factory = product_factory;
		this.product_date = product_date;
	}
	
	
	public ProductVO(int product_price, int product_count, int product_code) {
		this.product_price = product_price;
		this.product_count = product_count;
		this.product_code = product_code;
	}

	public int getProduct_code() {
		return product_code;
	}

	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getProduct_price() {
		return product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	public int getProduct_count() {
		return product_count;
	}

	public void setProduct_count(int product_count) {
		this.product_count = product_count;
	}

	public String getProduct_factory() {
		return product_factory;
	}

	public void setProduct_factory(String product_factory) {
		this.product_factory = product_factory;
	}

	public String getProduct_date() {
		return product_date;
	}

	public void setProduct_date(String product_date) {
		this.product_date = product_date;
	}
	
	

}

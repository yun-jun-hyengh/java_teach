package controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import dao.ProductDao;
import vo.ProductVO;

public class ProductController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductDao dao = new ProductDao();
		
		while(true) {
			System.out.println("-------------------- 재고관리 프로그램 --------------------");
			System.out.println("1.제품등록|2.제품조회|3.제품검색|4.제품삭제|5.제품수정|6.종료");
			System.out.println("1. 제품등록");
			System.out.println("2. 제품조회");
			System.out.println("3. 제품검색");
			System.out.println("4. 제품삭제");
			System.out.println("5. 제품수정");
			System.out.println("6. 프로그램 종료");
			System.out.println("-------------------------------------------------------");
			System.out.println("메뉴를 선택해 주세요 >> ");
			
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("제품코드등록 >> ");
				int code = sc.nextInt();
				
				System.out.println("제품이름등록 >> ");
				String name = sc.next();
				
				System.out.println("제품가격등록 >> ");
				int price = sc.nextInt();
				
				System.out.println("제품수량등록 >> ");
				int count = sc.nextInt();
				
				System.out.println("제조사등록 >> ");
				String factory = sc.next();
				
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				Date now = new Date();
				String time = format.format(now);
				
				ProductVO vo = new ProductVO(code, name, price, count, factory, time);
				if(dao.insert(vo) > 0) {
					System.out.println("성공");
				} else {
					System.out.println("실패");
				}
			} else if(choice == 2) {
				List<ProductVO> list = dao.select();
				for(ProductVO vo : list) {
					System.out.println("◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇");
					System.out.println("제품코드 : " + vo.getProduct_code());
					System.out.println("제품이름 : " + vo.getProduct_name());
					System.out.println("제품가격 : " + vo.getProduct_price());
					System.out.println("재고수량 : " + vo.getProduct_count());
					System.out.println("제조사 : " + vo.getProduct_factory());
					System.out.println("입고날짜 : " + vo.getProduct_date());
					System.out.println("◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇");
					
				}
				
			} else if(choice == 3) {
				System.out.println("검색할 상품을 입력해주세요 >> ");
				String str = sc.next();
				List<ProductVO> search_List = dao.search(str);
				
				for(ProductVO vo : search_List) {
					System.out.println("◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇");
					System.out.println("제품코드 : " + vo.getProduct_code());
					System.out.println("제품이름 : " + vo.getProduct_name());
					System.out.println("제품가격 : " + vo.getProduct_price());
					System.out.println("재고수량 : " + vo.getProduct_count());
					System.out.println("제조사 : " + vo.getProduct_factory());
					System.out.println("입고날짜 : " + vo.getProduct_date());
					System.out.println("◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇◇");
				}
			} else if(choice == 4) {
				System.out.println("삭제할 제품코드를 입력해주세요 >> ");
				int code = sc.nextInt();
				dao.delete(code);
			} else if(choice == 5) {
				System.out.println("수정할 제품코드를 입력해주세요 >> ");
				int code = sc.nextInt();
				
				System.out.println("제품가격을 입력해주세요 >> ");
				int update_price = sc.nextInt();
				
				System.out.println("제품수량을 입력해주세요 >> ");
				int update_count = sc.nextInt();
				
				ProductVO updatevo = new ProductVO(update_price, update_count, code);
				dao.update(updatevo);
				
			} else if(choice == 6) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		}
	}
}

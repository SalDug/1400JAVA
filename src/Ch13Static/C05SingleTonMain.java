package Ch13Static;

class Product
{
	String PName;
	int amount;
	@Override
	public String toString() {
		return "Product [PName=" + PName + ", amount=" + amount + "]";
	}
	Product(String PName, int amount){
		super();
		this.PName = PName;
		this.amount = amount;
		
	}
	
	
}
class Refrigerator
{
	private static Refrigerator instance;
	public static Refrigerator getinstance() {
		if(instance == null) {
			instance = new Refrigerator();
		}
		return instance;
	}
	private Refrigerator() {}

	Product [] list = new Product[100];  //->컬렉션으로 처리시 메모리 허용범위내에서 확장가능
	int ProductNum = 0;
	void SetProduct(Product product) {
		if(ProductNum <= 99) {
			list[ProductNum] = product;
			//list  ProductNum번째 idx에 외부에서 생성된 Product가 연결
			ProductNum++;
		}
		else {
			System.out.println("냉장고 용량이 초과되었습니다.");
		}
	}
	Product getProduct(String search,int amount) {
		//반복문과 문자열 검색 처리를 통해서 list에 저장된 search 객체 꺼내와서 요청 개수만큼 차감
		for (int i = 0;i<ProductNum;i++) {
			if(list[i].PName.equals(search)) {	
				//일치하는 제품이 있다면
				if(list[i].amount > amount) {
					//수량이 더 많음
					list[i].amount -= amount;
					return new Product(list[i].PName, amount);
				}
				else if(list[i].amount == amount) {
					Product prod = list[i];
			
					for(int j = i+1;j<ProductNum;j++) {
						list[j-1] = list[j]; 
					}
					list[ProductNum-1] = null;
					ProductNum--;
					return prod;
				}
				else if(list[i].amount < amount) {
					return null;
				}
			}
		}
		return null;
	}
}
public class C05SingleTonMain {

	public static void main(String[] args) {
		
		
		//냉장고 객체 가져오기(싱글톤 패턴)
		Refrigerator refrigerator= Refrigerator.getinstance();
		
		//상품정보객체 생성 
		Product prod = new Product("콜라",5);
		Product prod2 = new Product("사이다",5);
		//냉장고에 상품저장
		refrigerator.SetProduct(prod);
		refrigerator.SetProduct(prod2);
		//냉장고에 상품반환
		Product prod1 =refrigerator.getProduct("콜라",5); 
				
		System.out.println("get Item : " + prod1.toString());
		for(int i = 0;i<refrigerator.ProductNum;i++) {
			System.out.println(refrigerator.list[i].toString());
		}
				
	}

}

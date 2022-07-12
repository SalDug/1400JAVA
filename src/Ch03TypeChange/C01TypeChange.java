package Ch03TypeChange;

public class C01TypeChange {

	public static void main(String[] args) {
		//형변환
		//데이터 연산(처리)시 자료형이 다른값들을 일치시키는 작업
		//형변환의 종류
		//자동 형변환(암시적 형변환) : 컴파일러에 의해서 자동으로 자료형이 일치, 데이터의 손실염려 X
		//ex) 큰공간 = 작은공간의 값
		//강제 형변환(명시적 형변환) : 프로그래머에 의해서 강제적으로 자료형을 일치, 데이터의 손실염려 O
		//ex) 작은공간 = 큰공간
		
		//1.자동형변환
		//byte<short,char<int<long<float<double
	    byte byteval = 10;
	    int intval = byteval; //자동형변환
	    System.out.println("intval : " + intval);
	    
	    char charval = '가';
	    intval = charval; //자동형변환
	    System.out.println("intval : " + intval);
	    
	    long longval = intval; //자동형변환
	    System.out.println("longval : " + longval);
	    
	    float floatval = longval; //자동형변환
	    System.out.println("floatval : " + floatval);
	    
	    double doubleval = floatval; //자동형변환
	    System.out.println("doubleval : " + doubleval);
		
	    
	    
	    

	}

}

package info.chodev.algorithm.hanyeontak.sixth;

public class PrintTriangle {
	    public String printTriangle(int num){
	    String result = "";
	        int n = 2;
	        for(int i=0; i<num; ++i){
	            result += n+"\n";
	            n += 1;
	        }
	        return result;
	    }

	    // 아래는 테스트로 출력해 보기 위한 코드입니다.
	    public static void main(String[] args) {
	        PrintTriangle pt = new PrintTriangle();
	        System.out.println( pt.printTriangle(5) );
	        
	    }
	}

	



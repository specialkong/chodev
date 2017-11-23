package info.chodev.algorithm.seohae.fifth;
/**
 * 자릿수 더하기
 * @author seohae
 * @since 2017. 11. 19
 * 
sum_digit함수는 자연수를 전달 받아서 숫자의 각 자릿수의 합을 구해서 return합니다.
예를들어 number = 123이면 1 + 2 + 3 = 6을 return하면 됩니다.
sum_digit함수를 완성해보세요.
 *
 */
public class IndexAdd {
	
	/**
	 * 자릿수 더하기 
	 * @param num
	 * @return
	 */
	public int Add(int num){
		int result = 0;
		int length = (int)(Math.log10(num)+1);
		
		for(int i=0; i<length; i++){
			result += num%10;
	         num /= 10;
		}
		return result;
	}
	public static void main(String[] args) {
		IndexAdd indexAdd = new IndexAdd();
		System.out.println(indexAdd.Add(123));
		System.out.println(indexAdd.Add(1238929));
	}
}

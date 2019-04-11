import com.youbaoplus.tee.Pair;


public class PairTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str[]={"dusugnag","zhangweiyang","lixiaolei"};
		Pair<String> mm=Arrayalg.minmax(str);
		System.err.println(mm.getFirst());
		System.err.println(mm.getSecond());
	}
	
	static class Arrayalg{
		public  static Pair<String> minmax(String parmStr[]){
			String min=parmStr[0];
			String max=parmStr[0];
			
			for (int i = 0; i < parmStr.length; i++) {
				if(parmStr==null||parmStr.length==0) return null;
				if(parmStr[i].compareTo(min)<0){
					min=parmStr[i];
				}
				if(parmStr[i].compareTo(max)>0){
					max=parmStr[i];
				}
			}
			return new Pair<String>(min, max) ;
		}
		
	}

}

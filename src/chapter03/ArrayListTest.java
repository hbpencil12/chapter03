package chapter03;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add( "둘리" );
		list.add( "마이콜" );
		list.add( "고길동" );
		list.add( 2, "도우넛" );
		list.remove( 1 );
		
		list.remove( 1 );
		
		int count = list.size();
		
		
		//순회1
		for(int i = 0; i < count; i++){
			String s = list.get( i );
			System.out.println( s );
		}
		
		//순회3
		for( String s : list ){
			System.out.println( "순회3: " + s );
		}
		
		}

}

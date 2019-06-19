package consolevb0701;

import java.util.ArrayList;

public class Lesrooster {
	private final ArrayList<Les> lijst;

	public Lesrooster() {
		super();
		this.lijst = new ArrayList<>() ;
	}
	public void voegtoe(Les les) {
		lijst.add(les);
	}
	public void print() {
		lijst.forEach(les ->
		System.out.println(les));
	}
	@Override
	public String toString() {
		StringBuilder buffer = new StringBuilder();
		lijst.forEach(les ->{
			buffer.append(les);
			buffer.append("\n");
		});
		return buffer.toString();
	}

}

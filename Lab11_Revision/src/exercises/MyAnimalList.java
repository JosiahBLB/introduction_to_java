package exercises;

import java.util.ArrayList;

public class MyAnimalList {

	public static void main(String[] args) {
		DomesticCat dc1 = new DomesticCat();
		DomesticCat dc2 = new DomesticCat();
		DomesticCat dc3 = new DomesticCat();
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		Tiger t3 = new Tiger();
		ArrayList<Feline> catList = new ArrayList<Feline>();
		catList.add(dc1);
		catList.add(dc2);
		catList.add(dc3);
		catList.add(t1);
		catList.add(t2);
		catList.add(t3);

		for (Feline f : catList) {
			f.soundsLike();
		}
	}
}

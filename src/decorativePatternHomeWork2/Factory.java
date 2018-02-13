package decorativePatternHomeWork2;

import java.io.IOException;
import java.util.HashMap;

public class Factory {
	private HashMap<Integer, ISorter> map = new HashMap<Integer, ISorter>();

	public Factory() {

		map.put(0, new NameComparer());
		map.put(1, new AgeComparer());
		map.put(2, new RollComparer());

		// new Sorter(new NameComparer(new AgeComparer(new RollComparer())));
		// new Sorter(map.get(option));
	}

	public HashMap<Integer, ISorter> getObjectMapList() {
		return map;
	}

}

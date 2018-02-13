package decorativePatternHomeWork;

import java.io.IOException;
import java.util.HashMap;


public class Factory {
	
		public Factory(int option) throws IOException{
			
			HashMap<Integer, ISorter> map = new HashMap<Integer, ISorter>();
			map.put(1, new NameComparer());
			map.put(2, new AgeComparer());
			map.put(3, new RollComparer());
			
			new Sorter(new NameComparer(new AgeComparer(new RollComparer())));
			//new Sorter(map.get(option));
		}
}

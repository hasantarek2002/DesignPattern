package strategyObject;

import java.io.IOException;
import java.util.HashMap;


public class Factory {

		public Factory(int option) throws IOException{
			
			HashMap<Integer, ITransformer> map = new HashMap<Integer, ITransformer>();
			
			map.put(1, new CSV());
			map.put(2, new TSV());
			map.put(3, new XML());
			
			new Converter(map.get(option));
		}
}

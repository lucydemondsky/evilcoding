package outofmemory;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {
	static class OOMObject{
		public String[] list = new String[1024 * 32];
	}
	public static void main(String[] args) {
		List<OOMObject> memory = new ArrayList<>();
		while(true) {
			memory.add(new OOMObject());
		}
	}

}

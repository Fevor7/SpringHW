package by.it.beancollect;

import java.util.Map;

public class MapBean {

	private Map<Long, String> nameMap;

	public Map<Long, String> getNameMap() {
		return nameMap;
	}

	public void setNameMap(Map<Long, String> nameMap) {
		this.nameMap = nameMap;
	}

	@Override
	public String toString() {
		return "MapBean [nameMap=" + nameMap + "]";
	}
	
}

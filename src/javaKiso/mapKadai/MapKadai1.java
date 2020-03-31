package javaKiso.mapKadai;

import java.util.HashMap;
import java.util.Map;

public class MapKadai1 {

	public static void main(String[] args) {
		Map<String, String> stringMap = new HashMap<String, String>();

		stringMap.put("北海道", "札幌市");
		stringMap.put("宮城県", "仙台市");
		stringMap.put("島根県", "松江市");

		System.out.println("keyが北海道のときのvalueは" + stringMap.get("北海道"));
		System.out.println("keyが宮城県のときのvalueは" + stringMap.get("宮城県"));
		System.out.println("keyが島根県のときのvalueは" + stringMap.get("島根県"));
		System.out.println();

		System.out.println("key=北海道は" + stringMap.containsKey("北海道"));
		System.out.println("key=沖縄県は" + stringMap.containsKey("沖縄県"));
		System.out.println();

		System.out.println("keyが沖縄県のときのvalueは" + stringMap.get("沖縄県"));

	}

}

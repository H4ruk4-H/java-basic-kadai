package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	HashMap<String,String>  dictionaryMap = new HashMap<String,String>();
	
	public Dictionary_Chapter21() {
		
	dictionaryMap.put("apple","りんご");
	dictionaryMap.put("peach","桃");
	dictionaryMap.put("banana","バナナ");
	dictionaryMap.put("lemon","レモン");
	dictionaryMap.put("pear","梨");
	dictionaryMap.put("kiwi","キウイ");
	dictionaryMap.put("strawberry","いちご");
	dictionaryMap.put("grape","ぶどう");
	dictionaryMap.put("muscat","マスカット");
	dictionaryMap.put("cherry","さくらんぼ");
	
	}
	public void search(String[] wordArray){
		for(int i = 0; i < wordArray.length; i++) {
			String searchWord = wordArray[i];
			if(dictionaryMap.containsKey(searchWord)){
			System.out.println(searchWord + "の意味は" + dictionaryMap.get(searchWord));
			} else {
				System.out.println(searchWord + "は未登録です");
			}
		}
	}
}
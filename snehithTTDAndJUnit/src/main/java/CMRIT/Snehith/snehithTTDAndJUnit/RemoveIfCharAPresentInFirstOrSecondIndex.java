package CMRIT.Snehith.snehithTTDAndJUnit;

public class RemoveIfCharAPresentInFirstOrSecondIndex {

	public String removeCharA(String string) {
		String result = null;
		int stringLength = string.length();
		if(stringLength >= 2 && string.charAt(0) == 'A' && string.charAt(1) == 'A') {
			result = string.substring(2); 
		}
		else if(stringLength >= 2 && string.charAt(0) == 'A' && string.charAt(1) != 'A') {
			result = string.substring(1);
		}
		else if(stringLength >= 2 && string.charAt(0) != 'A' && string.charAt(1) == 'A') {
			result = string.charAt(0) + string.substring(2);
		}
		else if(stringLength == 1 && string.charAt(0) == 'A'){
			result = "";
		}
		else {
			result = string;
		}
		return result;
	}
}

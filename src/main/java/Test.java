
import static Java.Programs.RandomNumberString.random;

public class Test {

	public static String convertToUUID(String hexString) {
		return (hexString.substring(0, 8) + "-" +
				hexString.substring(8, 12) + "-" +
				hexString.substring(12, 16) + "-" +
				hexString.substring(16, 20) + "-" +
				hexString.substring(20))
				.toLowerCase();
	}
	public static void main(String[] args) {

		String hexString = "BE990A006E7B46838EAEE85646FCD50C";
		String uuid = convertToUUID(hexString);
		System.out.println(uuid);

	}
	/*0806D0AB80214D9AA19BCC1EFA788871
79B4F6CAF054472A88ACAE0174B94AC0
803963EBF83A46A1969EA28F2C6224CC
77EFC18656D8469F85B8EFEAF2862E8F*/


 /*   +----------------------------------+
            | 72E14419457345D1BEA4045C1D18EF75 |
            | F4C9775A54F4454E8DB22698D959D69C |
            | 010906F158954AF485F012AD4AE14A29 |
            | 68676775C6264D7F8EE7A0FE8332B1CA |
            | 56801DB458B043E9AE54E71BED8D8D98 |
            | DE8977AD86064D23893E4A82634CC75F |*/
}

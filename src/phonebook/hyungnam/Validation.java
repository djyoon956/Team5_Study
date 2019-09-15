package phonebook.hyungnam;

public class Validation {
	public static final String REG_EXP_PHONE = "^01[016789]-\\d{4}-\\d{4}$";
	public static final String REG_EXP_HOME = "^(0(2|3[1-3]|4[1-4]|5[1-5]|6[1-4]))-(\\d{3,4})-(\\d{4})$";
	public static final String REG_EXP_Serial = "^\\d{4}$";
	public static final String REG_EXP_Name = "^[가-힣]*$";
}

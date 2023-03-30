package Phase2.PythonBasics.Activity.InheritanceActivity.Q4;

public class AccountBO {
	public FixedAccount getAccountDetail(String detail) {
		//fill the code
		String[] arr = detail.split(",");
		FixedAccount obj = new FixedAccount(arr[0], Double.parseDouble(arr[1]), arr[2], Double.parseDouble(arr[3]), Integer.parseInt(arr[4]));
		return obj;
	}
}


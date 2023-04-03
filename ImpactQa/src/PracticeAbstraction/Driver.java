package PracticeAbstraction;

public class Driver extends S_B_I 
{

	@Override
	public void onlineWithdraw() {

			System.out.println("this service provided by  s.b.i");
		
	}

	@Override
	public void onlineDeposit() {

System.out.println("this service  provided by  sbi ");
		
	}

	@Override
	public void creatAccount() {

		System.out.println("this service provided by R.B.I");
		
	}

	@Override
	public void deposit() {
		
		System.out.println("this service provided by R.B.I");
	}

}

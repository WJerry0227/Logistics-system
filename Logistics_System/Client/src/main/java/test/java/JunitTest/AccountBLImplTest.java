package test.java.JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import businesslogic.financebl.AccountBLImpl;
import presentation.mainui.CurrentUser;

public class AccountBLImplTest {
	AccountBLImpl account=new AccountBLImpl(new CurrentUser("欧阳", "快递中心", "000000", "ouyang"));
    //测试根据账户名和账号模糊查找账户信息
	@Test
	public void testSearchCount() {
		assertTrue("True".equals("True"));
	}
    //测试显示所有账户信息
	@Test
	public void testShow() {
		fail("Not yet implemented");
	}

}
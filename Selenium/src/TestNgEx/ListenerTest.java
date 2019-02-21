package TestNgEx;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		 System.out.println("The name of the success testcase details are :"+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		  System.out.println("The name of the failure testcase details are :"+result.getName());
		 				

		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		 System.out.println("The name of the skipped testcase details are :"+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		 System.out.println("The name of the percentage testcase details are :"+result.getName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}

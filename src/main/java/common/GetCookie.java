package common;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCookie {
	
	public static Cookie session;
	
	public static  Cookie getCookie(WebDriver Driver) {
	
	 
	 Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
/*	 try {
		Login_test.clickForLogin(PraUsernamesername, PraPassword);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch blockd
		e.printStackTrace();
	}
	*/
    //获取cookie，上面一跳出循环我认为就登录成功了，当然上面的判断不太严格，可以再进行修改
/*    Set<Cookie> cookies = Driver.manage().getCookies();
    Cookie cookie=new Cookie("java","eclipse","/",null);
    
    
    
    System.out.println("cookie总数为"+cookies.size());

    String cookieStr = "";
    for (Cookie cookie : cookies) {
        cookieStr += cookie.getName() + "=" + cookie.getValue() + "; ";
         
    }
    
    System.out.println("获取的cookie:" + cookieStr);
    
    System.out.println("----------------------------------------");
    return cookieStr;*/
	 
	 session = Driver.manage().getCookieNamed("ASP.NET_SessionId");	 
	 System.out.println("获取的用户为:" + session.getValue());
	 
	 return session;
	 
	 
     

	}
}

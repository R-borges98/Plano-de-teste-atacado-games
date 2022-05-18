package atacadogames;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.webDriver;
import org.openqa.selenium.webElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class TesteLoginAtacadogames {
	private webDriver driver;
	
	
	@Before
	public void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver, "C:\\arquivos de programa\\chromedriver\\chromedriver.exe");
				driver = new ChromeDriver();
	}
	


}

    @Test
    public void testeNavegador() {
    	driver.get("http://localhost:4200/login");
    	driver.manage().timeouts().implicitlyWait(3, TimesUnit.SECONDS);
    	
    	webElement inputEmail = driver.findElement(By.id("email"));
    	webElement inputSenha = driver.findElement(By.id("senha"));
    	webElement botaoLogin = driver.findElement(By.id("botao-enviar"));
    	
    	
    	
    	String[] listaSenhas = {"senhaum", "outrasenha", "senhaerrada", "Sol1998"};
    	for(int tentativas = 0; tentativas < listaSenhas.length; tentativas++) {
    		try {
    		inputEmail.Clear();
    		inputSenha.clear();
    		
    		inputEmail.sendKeys("raquelborges@gmail.com");
        	inputSenha.sendKeys(listaSenhas[tentativas]);
        	botaoLogin.click();
        	
        	Thread.sleep(3000);
        	
        	
    		}catch (InterruptedException e) {
    			e.printStackTrace();
    		}
        	
    	}
    }
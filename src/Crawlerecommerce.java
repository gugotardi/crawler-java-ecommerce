import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Crawlerecommerce {
	public static void main(String[] args) throws InterruptedException, IOException {
		/*O webdriver gecko é obrigatório no seleniun para evitar o uso da ferramenta em ataques hackers*/
		System.setProperty("webdriver.gecko.driver","c:/your/path/to/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		/*Acessando a página de catálogo de smartphones*/
		driver.get("https://www.magazineluiza.com.br/smartphone/celulares-e-smartphones/s/te/tcsp/");
		
		/*Ordenando para exibir os mais vendidos na página de catálogo de smartphones*/
		WebElement campoBusca = driver.findElement(By.id("sort"));
		Thread.sleep(1000);
		campoBusca.sendKeys("Mais");
		Thread.sleep(3000);
		
		/*Salvando os elementos ordenados em uma lista*/
		List<WebElement> nomeprodutos = driver.findElements(By.cssSelector("a[data-css-rx7mj]"));
		
		/*Percorrendo a lista para imprimir os produtos capturados*/
		for(WebElement produto:nomeprodutos) {
			System.out.println(produto.getText());
			System.out.println("-----------------");
		}
		
		System.out.println("Programa finalizado");
		/*Fim da execução do programa*/
		
		
	}
	

}

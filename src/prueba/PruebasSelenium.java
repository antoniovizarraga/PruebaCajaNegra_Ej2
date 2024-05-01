package prueba;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class PruebasSelenium {
	
	static WebDriver driver1;

	@BeforeAll
	static void setURL() {
		driver1 = new ChromeDriver();
		
	}

	@Test
	void test1() {
		driver1.get("https://elenarivero.github.io/Ejercicio2/index.html");
		WebElement numeroBox = driver1.findElement(By.id("numero"));        
        WebElement direccionBox = driver1.findElement(By.id("directivo"));
        
        numeroBox.sendKeys("005");
        direccionBox.sendKeys("-");
        
        
        WebElement submitButton = driver1.findElement(By.linkText("Enviar"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean texto = errorNumero.isDisplayed();
        assertFalse(texto);
        
        WebElement errorDireccion = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDireccion = errorDireccion.isDisplayed();
        assertFalse(textoDireccion);
        
        WebElement direccionCorrecta = driver1.findElement(By.cssSelector("h3"));
        String textoResultado = direccionCorrecta.getText();
        assertEquals("EMPLEADO AÑADIDO CORRECTAMENTE", textoResultado);
        
	}
	
	@Test
	void test2() {
		driver1.get("https://elenarivero.github.io/ejercicio1/index.html");
		WebElement numeroBox = driver1.findElement(By.id("numero"));        
        WebElement direccionBox = driver1.findElement(By.id("directivo"));
        
        numeroBox.sendKeys("");
        direccionBox.sendKeys("-");
        
        
        WebElement submitButton = driver1.findElement(By.linkText("Enviar"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean texto = errorNumero.isDisplayed();
        assertTrue(texto);
        
        WebElement errorDireccion = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDireccion = errorDireccion.isDisplayed();
        assertFalse(textoDireccion);
        
	}
	
	@Test
	void test3() {
		driver1.get("https://elenarivero.github.io/ejercicio1/index.html");
		WebElement numeroBox = driver1.findElement(By.id("numero"));        
        WebElement direccionBox = driver1.findElement(By.id("directivo"));
        
        numeroBox.sendKeys("0");
        direccionBox.sendKeys("-");
        
        
        WebElement submitButton = driver1.findElement(By.linkText("Enviar"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean texto = errorNumero.isDisplayed();
        assertTrue(texto);
        
        WebElement errorDireccion = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDireccion = errorDireccion.isDisplayed();
        assertFalse(textoDireccion);
        
	}
	
	@Test
	void test4() {
		driver1.get("https://elenarivero.github.io/ejercicio1/index.html");
		WebElement numeroBox = driver1.findElement(By.id("numero"));        
        WebElement direccionBox = driver1.findElement(By.id("directivo"));
        
        numeroBox.sendKeys("00" + -1);
        direccionBox.sendKeys("-");
        
        
        WebElement submitButton = driver1.findElement(By.linkText("Enviar"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean texto = errorNumero.isDisplayed();
        assertTrue(texto);
        
        WebElement errorDireccion = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDireccion = errorDireccion.isDisplayed();
        assertFalse(textoDireccion);
        
	}
	
	@Test
	void test5() {
		driver1.get("https://elenarivero.github.io/ejercicio1/index.html");
		WebElement numeroBox = driver1.findElement(By.id("numero"));        
        WebElement direccionBox = driver1.findElement(By.id("directivo"));
        
        numeroBox.sendKeys("006");
        direccionBox.sendKeys("");
        
        
        WebElement submitButton = driver1.findElement(By.linkText("Enviar"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean texto = errorNumero.isDisplayed();
        assertFalse(texto);
        
        WebElement errorDireccion = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDireccion = errorDireccion.isDisplayed();
        assertTrue(textoDireccion);
        
	}
	
	@Test
	void test6() {
		driver1.get("https://elenarivero.github.io/ejercicio1/index.html");
		WebElement numeroBox = driver1.findElement(By.id("numero"));        
        WebElement direccionBox = driver1.findElement(By.id("directivo"));
        
        numeroBox.sendKeys("006");
        direccionBox.sendKeys("aads");
        
        
        WebElement submitButton = driver1.findElement(By.linkText("Enviar"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean texto = errorNumero.isDisplayed();
        assertFalse(texto);
        
        WebElement errorDireccion = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDireccion = errorDireccion.isDisplayed();
        assertTrue(textoDireccion);
        
	}
	
	@Test
	void test7() {
		driver1.get("https://elenarivero.github.io/ejercicio1/index.html");
		WebElement numeroBox = driver1.findElement(By.id("numero"));        
        WebElement direccionBox = driver1.findElement(By.id("directivo"));
        
        numeroBox.sendKeys("51");
        direccionBox.sendKeys("+");
        
        
        WebElement submitButton = driver1.findElement(By.linkText("Enviar"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean texto = errorNumero.isDisplayed();
        assertTrue(texto);
        
        WebElement errorDireccion = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDireccion = errorDireccion.isDisplayed();
        assertFalse(textoDireccion);
        
	}
	
	@Test
	void test8() {
		driver1.get("https://elenarivero.github.io/ejercicio1/index.html");
		WebElement numeroBox = driver1.findElement(By.id("numero"));        
        WebElement direccionBox = driver1.findElement(By.id("directivo"));
        
        numeroBox.sendKeys("1234");
        direccionBox.sendKeys("+");
        
        
        WebElement submitButton = driver1.findElement(By.linkText("Enviar"));
        submitButton.click();
        
        WebElement errorNumero = driver1.findElement(By.id("errorNumero"));
        boolean texto = errorNumero.isDisplayed();
        assertTrue(texto);
        
        WebElement errorDireccion = driver1.findElement(By.id("errorDirectivo"));
        boolean textoDireccion = errorDireccion.isDisplayed();
        assertFalse(textoDireccion);
        
	}
	
	
	/*
	@AfterAll
	static void exitDriver() {
		driver1.quit();
	}*/
}

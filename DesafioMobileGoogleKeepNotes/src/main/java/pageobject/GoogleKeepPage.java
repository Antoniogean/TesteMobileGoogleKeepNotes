package pageobject;

import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GoogleKeepPage {
//New text note botao mais content-desc
	public GoogleKeepPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(accessibility = "New text note")
	private MobileElement botaoMais;
	
	@AndroidFindBy(id = "com.google.android.keep:id/editable_title")
	private MobileElement campoTitle;
	
	@AndroidFindBy(id = "com.google.android.keep:id/edit_note_text")
	private MobileElement campoNote;
	
	@AndroidFindBy(accessibility = "Open navigation drawer")
	private MobileElement botaoVoltar;
	
	@AndroidFindBy(id = "com.google.android.keep:id/open_search_bar_text_view")
	private MobileElement campoSearch;
	
	//com.google.android.keep:id/open_search_bar_text_view
	@AndroidFindBy(id = "com.google.android.keep:id/search_actionbar_query_text")
	private MobileElement campoEscritaSearch;
	
	@AndroidFindBy(id = "com.google.android.keep:id/new_list_button")//com.google.android.keep:id/description
	private MobileElement campoCheck;
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@index='2'][1]")
	private MobileElement inserirItem;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@index='2']")
	private MobileElement adicionarNovoItem;
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@index='2'][3]" )
	private MobileElement inserirItemNovo;
	
	@AndroidFindBy(accessibility = "Delete")
	private MobileElement botaoDeleteItem;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@index='0']")
	private MobileElement botaoMenu;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Reminders']")
	private MobileElement botaoReminder;
	
	@AndroidFindBy(accessibility = "Single-column view")
	private MobileElement adicionarLembreteANota;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Tomorrow morning']")
	private MobileElement definiCaoLembrete;
	

	
	public void adicionarNota() {
		botaoMais.click();
	}
	public void inserirTituloNota(String titulo) {
		campoTitle.sendKeys(titulo);
	}
	public void inserirCampoNota(String nota) {
		campoNote.sendKeys(nota);
	}
	public void clicarBotaoAddNota() {
		botaoVoltar.click();
	}
	public void pesquisarNota(String titulo) {
		campoSearch.click();
		campoEscritaSearch.sendKeys(titulo);
		
	}
	public void clicarNotaPesquisada(String titulo) {
		MobileElement clicarPesquisa = (MobileElement) driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='"+titulo+"'][1]"));
		clicarPesquisa.click();
	}
	public void adicionarChecklist() {
		campoCheck.click();
		
	}
	public void inserirTituloCheckList(String titulo) {
		campoTitle.sendKeys(titulo);
	}
	public void inserirItem (String item) {
		inserirItem.sendKeys(item);
	}
	public void adicionarItemNovoALista(String itemNovo) {
		adicionarNovoItem.click();
		//inserirItemNovo.sendKeys(itemNovo);
	}
	public void clicarMenu() {
		botaoMenu.click();
	}
	public void adicionarLembrete() {
		adicionarLembreteANota.click();
	}
	public void definirHora() {
		definiCaoLembrete.click();
	}
	public void checarlembrete(String titulo) {
		botaoMenu.click();
		botaoReminder.click();
		
		MobileElement clicarPesquisa = (MobileElement) driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='"+titulo+"'][1]"));
		assertEquals(titulo, clicarPesquisa.getText());
		
	}
	
	
	
}

package steps;

import static utils.Utils.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import pageobject.GoogleKeepPage;

public class GoogleKeepNotesSteps {
	
	GoogleKeepPage c = new GoogleKeepPage(driver);
	@Dado("que usuario clique no botao Mais")
	public void queUsuarioCliqueNoBotaoMais() {
		c.adicionarNota();
	    
	}

	@E("insira um titulo {string}")
	public void insiraUmTitulo(String titulo) {
	    c.inserirTituloNota(titulo);
	}

	@E("adicione uma nota {string}")
	public void adicioneUmaNota(String nota) {
	   c.inserirCampoNota(nota);
	}

	@Entao("o app adiciona uma nova nota")
	public void oAppAdicionaUmaNovaNota() {
	    c.clicarBotaoAddNota();
	}
	@Dado("clique no campo pesquisa insira um titulo {string}")
	public void cliqueNoCampoPesquisaInsiraUmTitulo(String string) {
	    c.pesquisarNota(string);
	}

	@Entao("o cliente ira clicar na nota com o {string}")
	public void oClienteIraClicarNaNotaComO(String string) {
	  c.clicarNotaPesquisada(string);
	}
	
	
	@Dado("clique no campo adicionar Checklist")
	public void cliqueNoCampoAdicionarChecklist() {
		c.adicionarChecklist();
	}

	@Dado("insira um titulo {string} para a check lista")
	public void insiraUmTituloParaACheckLista(String string) {
		 c.inserirTituloCheckList(string);
	}

	@Dado("insira um texto {string} paara o item")
	public void insiraUmTextoPaaraOItem(String string) {
		c.inserirItem(string);
	}

	@Dado("entao clique em adicionar mais um item e insira um texto {string} para o item novo")
	public void entaoCliqueEmAdicionarMaisUmItemEInsiraUmTextoParaOItemNovo(String string) {
	    c.adicionarItemNovoALista(string);
	}

	@Entao("sera adicionado a lista")
	public void seraAdicionadoALista() {
		c.clicarBotaoAddNota();
	}
	
	@Dado("adicione uma nota de lembrete para amanha as {int} da manha")
	public void adicioneUmaNotaDeLembreteParaAmanhaAsDaManha(Integer int1) {
	    c.adicionarLembrete();
	    c.definirHora();
	    c.clicarBotaoAddNota();
	}

	
	@Entao("podemos ver o lembrete no campo reminder e pesquisar pelo titulo {string}")
	public void podemosVerOLembreteNoCampoReminderEPesquisarPeloTitulo(String string) {
	    c.checarlembrete(string);
	}



}

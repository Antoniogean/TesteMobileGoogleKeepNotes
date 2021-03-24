#language: pt
#enconding: UTF-8
Funcionalidade: Google Keep Notes
  
  Eu como usuario gostaria de criar notas em um app para eu possa me organizar melhor no meu dia e tambem fazer todas as interacoes tradicionais que um app faz

  @Criar
  Cenario: Adicionar uma nota
    Dado que usuario clique no botao Mais
    E insira um titulo "Titulo"
    E adicione uma nota "Mensagem de teste da nota"
    Entao o app adiciona uma nova nota

  @Pesquisar
  Cenario: Pesquisar uma nota
    Dado clique no campo pesquisa insira um titulo "Titulo"
    Entao o cliente ira clicar na nota com o "Titulo"
    
   @Checklist 
   Cenario: Criar CheckList
    Dado clique no campo adicionar Checklist
    E insira um titulo "Titulo" para a check lista
    E insira um texto "item1" paara o item
    E entao clique em adicionar mais um item e insira um texto "item2" para o item novo
    Entao sera adicionado a lista

		@Lembrete
  	Cenario: Criar um lembrete
    Dado que usuario clique no botao Mais
    E insira um titulo "Lembrete"
    E adicione uma nota de lembrete para amanha as 8 da manha
    Entao podemos ver o lembrete no campo reminder e pesquisar pelo titulo "Lembrete"
   

1. Qual o comando para obter a vers�o instalada do Git?
	git version

2. Qual o efeito da execu��o de cada um dos comandos abaixo?
	a- Mostra um resumo r�pido de comandos do Git.
	b- Mostra um resumo e funcionalidades do comando git checkout
	c- Mostra um resumo e funcionalidades do comando git merge
	d- Cria um reposit�rio local na pasta corrente 
	e- Adiciona todos os arquivos para staging 
	f- Adiciona modifica��es, mas ignora novos arquivos adicionados. 
	g- Mostra as configura��es definidas no reposit�rio local 
	h- Renomeia o arquivo a.txt para b.txt 
	i- Remove todos os commits locais. 
	j- Mostra os �ltimos 27 commits.

3.O fluxo �cl�ssico� de intera��o com o Git � algo como �alterar um ou mais arquivos�, �acrescentar essas mudan�as para serem contemplados no pr�ximo commit� e, finalmente, executar um �commit�. Quais os comandos necess�rios para realizar os dois �ltimos �passos� desse fluxo?
	git add . e git commit -m

4. Qual o comando deve ser executado para identificar o que foi alterado desde o �ltimo �commit�?
	git show

5. Em um dado reposit�rio, arquivos simplesmente copiados para l�, ou seja, untracked, podem ser exibidos/identificados com que comando?
	git status ou git diff

6. Qual o comando para efetuar um commit?
	git commit -m

7. Qual o comando que devemos empregar para descartar mudan�as ocorridas no arquivo teste.txt, por exemplo?
	git checkout

8. O que deve ser feito para que um determinado diret�rio do seu reposit�rio seja ignorado pelo Git? Fa�a uma busca por .gitignore.
	O caminho do arquivo deve ser inserido no arquivo .gitignore


9. O que acontece se o seu reposit�rio local for acidentalmente removido?
	O reposit�rio local � perdido.

10. 
	git clone url_do_repositorio

11.
	git log --oneline

12.
	No arquivo .gitconfig

13.
	git init

14.
	.git

15.
	git add . ou git add --all

16.
	O SHA-1 � utilizado para gerar c�digos de identifica��o para os commits. O SHA-1 se trata de uma fun��o de hash.

17.
	git log -1

18.
	N�o.

19.
	Ambos removem os commits locais feitos no reposit�rio.

20.
	git clean -fd

21.
	.gitignore

22.
	Deve se inserir a seguinte linha no arquivo .gitignore: nome_da_pasta/*.class.

23.
	Feito.

24.
	Mostra a lista de quantidade de commits por contribuidor do reposit�rio.

25.
	Mostra a URL do reposit�rio remoto

26.
	git tag

27.
	git tag 2.0*

28.
	Adiciona a tag 3.4-gold ao �ltimo commit.

29.
	Mostra o nome e a descri��o da tag 3.4-gold e qual commit est� associado a esta tag.

30.
	Enviaria a tag 3.4-gold para o reposit�rio remoto.

31.
	Altera o commit anterior adicionando as novas modifica��es feitas desde o commit anterior, podendo modificar a mensagem do commit ou n�o.

32.
	Reseta o arquivo x.txt para �ltimo commit realizado.

33.
	Remove as altera��es feitas no arquivo a.txt

34.
	O reset altera o estado do reposit�rio para o �ltimo commit. J� o checkout remove as altera��es feitas.
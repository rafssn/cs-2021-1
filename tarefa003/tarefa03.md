1. Qual o comando para obter a versão instalada do Git?
	git version

2. Qual o efeito da execução de cada um dos comandos abaixo?
	a- Mostra um resumo rápido de comandos do Git.
	b- Mostra um resumo e funcionalidades do comando git checkout
	c- Mostra um resumo e funcionalidades do comando git merge
	d- Cria um repositório local na pasta corrente 
	e- Adiciona todos os arquivos para staging 
	f- Adiciona modificações, mas ignora novos arquivos adicionados. 
	g- Mostra as configurações definidas no repositório local 
	h- Renomeia o arquivo a.txt para b.txt 
	i- Remove todos os commits locais. 
	j- Mostra os últimos 27 commits.

3.O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo?
	git add . e git commit -m

4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?
	git show

5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, untracked, podem ser exibidos/identificados com que comando?
	git status ou git diff

6. Qual o comando para efetuar um commit?
	git commit -m

7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo?
	git checkout

8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por .gitignore.
	O caminho do arquivo deve ser inserido no arquivo .gitignore


9. O que acontece se o seu repositório local for acidentalmente removido?
	O repositório local é perdido.

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
	O SHA-1 é utilizado para gerar códigos de identificação para os commits. O SHA-1 se trata de uma função de hash.

17.
	git log -1

18.
	Não.

19.
	Ambos removem os commits locais feitos no repositório.

20.
	git clean -fd

21.
	.gitignore

22.
	Deve se inserir a seguinte linha no arquivo .gitignore: nome_da_pasta/*.class.

23.
	Feito.

24.
	Mostra a lista de quantidade de commits por contribuidor do repositório.

25.
	Mostra a URL do repositório remoto

26.
	git tag

27.
	git tag 2.0*

28.
	Adiciona a tag 3.4-gold ao último commit.

29.
	Mostra o nome e a descrição da tag 3.4-gold e qual commit está associado a esta tag.

30.
	Enviaria a tag 3.4-gold para o repositório remoto.

31.
	Altera o commit anterior adicionando as novas modificações feitas desde o commit anterior, podendo modificar a mensagem do commit ou não.

32.
	Reseta o arquivo x.txt para último commit realizado.

33.
	Remove as alterações feitas no arquivo a.txt

34.
	O reset altera o estado do repositório para o último commit. Já o checkout remove as alterações feitas.
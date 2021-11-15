1. Qual o nome do branch padr�o do Git?
master

2. O que o comando git branch nome realiza?
Cria uma branch com nome informado.

3. Como criar um branch a partir de um commit espec�fico?
git branch nome commit

4. Em um reposit�rio, qual o efeito do comando git checkout -b bugfix/234?
Cria uma branch e alterna para ele tornando-se a branch atual.

5. Qual o comando para se alternar para um branch de nome experimento2?
git branch -m experimento2 novo_nome

6. Em um reposit�rio com dois branches, b1 e b2, onde b1 � o corrente, qual o efeito do comando git branch?
Mostra ambas as branch, mas b1 ter� um asterico na frente.

7. O que o comando git checkout -b nome faz?
Cria uma nova branch e torna-o corrente.

8. Qual a fun��o do comando git branch -d teste?
Deleta branch de nome teste.

9. Durante o desenvolvimento de um software � comum, por exemplo, utilizar um novo recurso por meio de experimenta��o. Talvez uma nova tecnologia, uma nova biblioteca que pode ser �til ao que est� em desenvolvimento, ou at� mesmo uma nova vers�o de um produto j� empregado. Para que o uso deste novo recurso n�o interfira com o que � considerado pronto, um branch pode ser criado para a experimenta��o. C�digo que for criado para a experimenta��o existir� apenas no branch criado. Se eventualmente o experimento demonstrar um resultado satisfat�rio, as altera��es realizadas no branch poder�o ser incorporadas no que � considerado pronto, ou seja, no branch principal (master). Esta �ltima a��o � conhecida por merge. Neste item, crie uma sequ�ncia de comandos que simula um caso simples de cria��o e uso seguido de merge empregando um branch para ilustrar uma experimenta��o conforme acima. A sequ�ncia deve incluir, obrigatoriamente: (a) cria��o de um ou mais branches; (b) chaveamento para pelo menos dois branches e (c) merge.
A orderm seria branch �feature�: � git checkout master � git checkout -b feature � git add teste.txt � git commit -m �inserir dados� � git push origin feature � git checkout master � git pull origin master � git merge feature � git push origin master
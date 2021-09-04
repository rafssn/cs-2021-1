1. Qual o nome do branch padrão do Git?
master

2. O que o comando git branch nome realiza?
Cria uma branch com nome informado.

3. Como criar um branch a partir de um commit específico?
git branch nome commit

4. Em um repositório, qual o efeito do comando git checkout -b bugfix/234?
Cria uma branch e alterna para ele tornando-se a branch atual.

5. Qual o comando para se alternar para um branch de nome experimento2?
git branch -m experimento2 novo_nome

6. Em um repositório com dois branches, b1 e b2, onde b1 é o corrente, qual o efeito do comando git branch?
Mostra ambas as branch, mas b1 terá um asterico na frente.

7. O que o comando git checkout -b nome faz?
Cria uma nova branch e torna-o corrente.

8. Qual a função do comando git branch -d teste?
Deleta branch de nome teste.

9. Durante o desenvolvimento de um software é comum, por exemplo, utilizar um novo recurso por meio de experimentação. Talvez uma nova tecnologia, uma nova biblioteca que pode ser útil ao que está em desenvolvimento, ou até mesmo uma nova versão de um produto já empregado. Para que o uso deste novo recurso não interfira com o que é considerado pronto, um branch pode ser criado para a experimentação. Código que for criado para a experimentação existirá apenas no branch criado. Se eventualmente o experimento demonstrar um resultado satisfatório, as alterações realizadas no branch poderão ser incorporadas no que é considerado pronto, ou seja, no branch principal (master). Esta última ação é conhecida por merge. Neste item, crie uma sequência de comandos que simula um caso simples de criação e uso seguido de merge empregando um branch para ilustrar uma experimentação conforme acima. A sequência deve incluir, obrigatoriamente: (a) criação de um ou mais branches; (b) chaveamento para pelo menos dois branches e (c) merge.
A orderm seria branch “feature”: • git checkout master • git checkout -b feature • git add teste.txt • git commit -m “inserir dados” • git push origin feature • git checkout master • git pull origin master • git merge feature • git push origin master
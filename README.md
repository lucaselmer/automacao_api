# automacao_api

# RESPOSTAS QUESTIONARIO 
1- ultilizaria os seguintes cenários para cada bandeira de cartão

- 5x Debito Aprovada
- 5x Debito Recusada sem saldo
- 5x Credito Aproada
- 5x Credito Parcelado
- 5x Credito Recusada sem limite
- 5x Valor Maior que o limite 
- 5x Valor zerado
- Tentar passar outra bandeira que não é para aceitar
- Validar se aceita o mesmo valor duas vezes em um curto periodo de tempo

Totalizando 37 cenários de teste.

2- Letra D

3- Abordagem escolhida foi a Scrum, que acredito ser a mais utilizada ultimamente.
onde conseguimos controlar toda parte de backlog e pode dar prioridade para demandas que
precisam de urgencia que são discutidas e alinhadas nas cerimonias (Planning,Daily,Review, Retrospective)
tendo um PO que vai fazer toda a parte de prioridade com base no que o cliente precisa
o SM que vai facilitar e resolver qualquer tipo de impedimento para equipe de desenvolvimento, e enfim a equipe
de desenvolvimento (DEV, QA, e UX dependendo da equipe) para desenvolver e entregar a demanda.

4- CI: Intregração Continua / CD : Entrega Continua
Resumindo é uma forma de desenvolver a esteira de codigo mais eficiente na formação das builds e junto com teste automatizados.

5- TDD, BDD e ATDD são formas para melhorar o processo de qualidade em um desenvolvimento.
TDD são cenarios de testes automatizados escritos antes do desenvolimento do codigo para facilitar o entendimento de cada demanda, sendo mais facil verificar cada parte do codigo.
BDD é uma forma de descrever os cenarios de teste baseado na descrição do componente sendo testado apontando o comportamento e o retorno da funcionalidade.
ATDD é baseada na TDD porem são testes de aceitação focados em criterio de aceitação mais especificos solicitada pelo cliente que são escritos antes de ser desenvolvido o codigo, para que o DEV realmente desenvolva aquele cenario de aceite.

6- Realizar um teste de uma função principal usando caixa preta focado em validar os dados de entrada e saida.
Front : Executaria os cenários de testes como um usuário real fazendo o preenchimento de todos os campos de formulario validando botões e navegação.
Back : Faria a validação dos dados enviados pelo front se estão recebendo os mesmos valores e também faria novas requisições e preenchimento diretamente do back para validar se também esta passando os dados corretamente.

7- Ferramentas de automação:
Desktop: Autoit / Selenium para Desktop
Web: Selenium / Cypress
API: Postman
Mobile: Appium

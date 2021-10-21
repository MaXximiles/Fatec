## ENDURANCE - 4º SEMESTRE

<p align="center"><img src="https://github.com/MaXximiles/API-4SEM/raw/main/Documenta%C3%A7%C3%A3o/logo%20com%20nome.png" width="220" height="150"></>

O sistema Endurance tem como objetivo principal o gerenciamento de eventos, possibilitando a criação e o controle aos colaboradores da empresa. O público externo poderá ser cadastrado no sistema para participar dos eventos, seguindo as restrições sanitárias devido a pandemia e a validação do comprovante de vacinação contra SARS-CoV-2, tanto para dose única quanto para demais doses. Os usuários cadastrados serão notificados sobre novos eventos e atualizações via e-mail.
<br>
  
  <p align="center"><img src="https://user-images.githubusercontent.com/68132461/136485547-51caf0b7-0706-42d6-a387-58362765f071.gif"></img></p>
  
____________________________________________________________________________________________________________________________________________________________________________

<br>

### RESUMO DO PROJETO

<p>  O sistema Endurance foi desenvolvido para suprir a necessidade apresentada pelo Cliente, que possui um local para eventos que conta com dois espaços diferentes para tal. O primeiro espaço possui 10 vagas e o segundo 50 vagas, o controle dessas vagas deve seguir o espaçamento adotado pelas medidas de segurança contra COVID-19.</p>
<p>  O sistema possui uma hierarquia de usuarios onde existe o convidado, colaborador e administradores.<br>
  Os usuarios se dividem em:</p>
  
  * Convidado: Usuario externo ao da empresa, ou seja, pessoas que desejam participar dos eventos mas não trabalham na empresa. Devem ter suas carteiras de vacinação em dia cadastradas no sistema para participar dos eventos.
  * Colaborador: Responsavel por criar os eventos, depois de criado o evento é solicitado aos administradores que o mesmo seja agendado. Os colaboradores se dividem em dois niveis, SNB e Enterprise. Essa divisão permite que em caso de conflito de agenda, ou seja dois eventos marcados no mesmo dia, o usuario que for de nivel Enterprise tenha precedencia sobre o SNB.
  * Administrador: Responsavel por agendar de fato os eventos, é responsavel tambem por gerenciar os usuarios, e aprovar cadastros de convidados. Possui em seu perfil a opção de gerar relatórios que facilitam o controle das informações do sistema.
  
  <p> O projeto foi divido em módulos, sendo eles: </p>
  
  * Eventos: Tela com calendário de eventos, que permite a criação edição e cancelamento de eventos.
  * Usuarios: Tela para cadastro, edição, alteração e desativação de usuarios, visivel somente pelo usuario administrador.
  * Relatórios: Tela com os relatórios de eventos, de participantes, usuarios e acessos, visivel somente pelo usuario administrador.
  * Fornecedores: Tela para cadastro, edição alteração e exclusão de fornecedores, visivel somente pelo usuario administrador e colaborador.  
  * Perfil: Tela para edição do perfil do usuário logado.
  
  Abaixo algumas imagens do sistema:
  
  Tela de Calendario de Eventos | Tela de Edição de Eventos
  --------- | --------
  ![](https://user-images.githubusercontent.com/68132461/136475075-b8016d6f-556f-43af-8a74-4a076591f8df.png) | ![](https://user-images.githubusercontent.com/68132461/136475363-83c18e00-6c6d-44a6-abdc-fec48efb1400.png)

____________________________________________________________________________________________________________________________________________________________________________  

<br>

### TECNOLOGIAS UTILIZADAS

No projeto as tecnologias que utilizamos foram:

<p align="center"><img src="https://github.com/MaXximiles/Fatec/blob/master/4Semestre%20-%20Endurance/src/programas.png" height="600" width="900"></p>

____________________________________________________________________________________________________________________________________________________________________________

<br>

### CONTRIBUIÇÕES INDIVIDUAIS

Neste projeto desempenhei a função de Scrum Master do grupo onde pude desenvolver habilidades como:
	
 * Liderança:
 	* Fui responsavel por definir tarefas voltadas a cada sprint;
 	* Atribuição das atividades a cada membro do grupo;
 	* Planejamento e cobrança de prazos e resultados;
 	* Presidindo reuniões com o grupo para manter a comunicação da evolução do projeto e dificuldades encontradas;
 * Funções de Gerenciamento:
 	* Controle do Backlog do projeto, utilizando a ferramenta Trello;
 	* Controle da planilha Burndown, entregue a cada sprint ao Professor M2 do projeto;
 * FrontEnd:
 	* Elaboração do layout;
 	* Elaboração de idéias das paginas;
 	* Paleta de cores;
 * BackEnd:
 	* Integração com flyway;
 	* Idéias de funções de validação de formulários, como cadastros de usuarios, fornecedores e eventos;
 * Banco de Dados:
 	* Elaboração do banco de dados;
 	* Modelo conceitual e lógico do banco;
 * Administração e integração com ferramenta Heroku;
 
 Abaixo algumas contribuições como mencionado acima:
 
 

____________________________________________________________________________________________________________________________________________________________________________

<br>

### INSTALAÇÃO DO SISTEMA

Requisitos:

- Java  16 ou superior
- Node.js 14.17.6 ou superior
- NPM 4.17.1 ou superior

#### 1º Passo 
Acesse os links abaixo, e clique no botão download para baixa-los: 

- [Backend](https://github.com/MaXximiles/API-4SEM/blob/main/C%C3%B3digo/Instala%C3%A7%C3%A3o/Back.rar) 
- [Frontend](https://github.com/MaXximiles/API-4SEM/blob/main/C%C3%B3digo/Instala%C3%A7%C3%A3o/Front.rar)
	
#### 2º Passo 
Crie uma pasta com o nome de "endurance" onde desejar, extraia os dois arquivos para dentro desta pasta.
	
#### 3º Passo
Com a pasta aberta aperte e segure o botão SHIFT e clique com o botão direito do mouse para abrir as opções, em seguida selecione a opção de abrir prompt de comando aqui, e digite o seguinte comando para rodar o backend:

	java -jar .\endurance-0.0.1-SNAPSHOT.jar
  
#### 4º Passo
Entre na pasta Front, com a pasta aberta aperte e segure o botão SHIFT e clique com o botão direito do mouse para abrir as opções, em seguida selecione a opção de abrir prompt de comando aqui, e digite o seguinte comando para rodar o Frontend:  
	
	ng serve -o

#### 5º Passo
A janela do seu navegador abrirá no sistema pronto para uso.
Para fins de testes:

    Usuário - jefh.neves@gmail.com
    Senha - 12345
    
____________________________________________________________________________________________________________________________________________________________________________

<br>

### LINK DO PROJETO COMPLETO
No botão abaixo é possivel ver o Github com o projeto completo:
  
<p align="center"><a href="https://github.com/MaXximiles/API-4SEM"> <img src= "https://github.com/MaXximiles/Fatec/blob/master/src/acesseaquiendurance.fw.png" width="200" height="80"></a></p> <br>

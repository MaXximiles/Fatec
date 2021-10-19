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

Neste projeto contamos com um grupo de 6 pessoas sendo divididas da seguinte forma:

<a href="https://www.linkedin.com/in/maxx-barcelos-aaa106b2"> <img src= "https://img.shields.io/badge/Maximiles%20Barcelos%20--%20Scrum%20Master-Linkedin-blue"></a> <br>
 Master do grupo responsavel por:
 
 * Planejamento das tarefas voltadas para cada sprint;
 * Definir prazos para entregas das tarefas dos integrantes;
 * Agendar reuniões entre o grupo para definir tarefas e visualizar os resultados entregues;
 * Controlar o Backlog do Grupo utilizando a ferramenta Trello para isso;
 * Controle da planilha Burndown;
 * Comunicação com professores M2 e P2 do projeto;

<a href="https://www.linkedin.com/in/mateus-senne"> <img src= "https://img.shields.io/badge/Mateus%20Senne%20--%20Product%20Owner-Linkedin-blue"></a> <br>
Product Owner do grupo responsavel por:

  * Comunicação com o cliente;
  * Apresentar porpostas para o grupo seguindo mudanças solicitadas pelo cliente;
  * Responsavel pelo PACER do grupo;
  * Criação dos Wireframes iniciais e validação com o cliente;

<a  href="https://www.linkedin.com/in/rodrigo-tenorio-a56641174"> <img src="https://img.shields.io/badge/Rodrigo%20Amancio%20-Linkedin-blue"></a> <br>
Programador Front-End responsavel por:

  * Criação da parte visual do projeto;
  * Integração com a API criada pelo grupo;
  * Instalação e configuração de framework's;
  * Configuração de formularios e layout do sistema;

<a href="https://www.linkedin.com/in/jeferson-tadeu-das-neves-a98343190/"> <img src= "https://img.shields.io/badge/Jeferson%20Neves-Linkedin-blue"></a> <br>
Programador Back-End responsavel por:

  * Criação da API do projeto;
  * Implementação de funções de acordo a necessidade do sistema;
  * Segurança de informações como senhas criptrogafadas e dados sensiveis;
  * Criação das query's no banco de dados;

<a href="https://www.linkedin.com/in/bahij-noureddine-941b681b7/"> <img src= "https://img.shields.io/badge/Bahij%20Noureddine-Linkedin-blue"></a><br>
Programador de banco de dados responsavel por:

  * Criação de tabelas de acordo com o sistema;
  * Criação do modelo lógico e conceitual do banco;
  * Teste dos dados;
  * Validação do banco e comunicação com a API;
  * Documentar no Github do grupo todas as alterações e modificações do projeto;

<a href="https://www.linkedin.com/in/leonardo-gabriel-silva-11b8b8178/"> <img src= "https://img.shields.io/badge/Leonardo%20Gabriel-Linkedin-blue"></a> <br>
Programador de banco de dados responsavel por:

  * Criação da parte visual do projeto;
  * Integração com a API criada pelo grupo;
  * Instalação e configuração de framework's;
  * Configuração de formularios e layout do sistema;
  * Documentar no Github do grupo todas as alterações e modificações do projeto;
____________________________________________________________________________________________________________________________________________________________________________

<br>

### APRENDIZADOS EFETIVOS

____________________________________________________________________________________________________________________________________________________________________________

<br>

### LINK DO PROJETO COMPLETO
No botão abaixo é possivel ver o Github com o projeto completo, baixar e excuta-lo tambem:
  
<p align="center"><a href="https://github.com/MaXximiles/API-4SEM"> <img src= "https://github.com/MaXximiles/Fatec/blob/master/src/acesseaquiendurance.fw.png" width="200" height="80"></a></p> <br>

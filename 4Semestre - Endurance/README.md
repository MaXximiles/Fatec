## <h1 id="topo">ENDURANCE - 4º SEMESTRE</h1>

<p align="center"><img src="https://github.com/MaXximiles/API-4SEM/raw/main/Documenta%C3%A7%C3%A3o/logo%20com%20nome.png" width="220" height="150"></>

O sistema Endurance tem como objetivo principal o gerenciamento de eventos, possibilitando a criação e o controle aos colaboradores da empresa. O público externo poderá ser cadastrado no sistema para participar dos eventos, seguindo as restrições sanitárias devido a pandemia e a validação do comprovante de vacinação contra SARS-CoV-2, tanto para dose única quanto para demais doses. Os usuários cadastrados serão notificados sobre novos eventos e atualizações via e-mail.
<br>
  
  <p align="center"><img src="https://user-images.githubusercontent.com/68132461/136485547-51caf0b7-0706-42d6-a387-58362765f071.gif"></img></p>
  
 ____________________________________________________________________________________________________________________________________________________________________________

<br>
  
  ### INDICE
  
  1. <a href="#resumo">RESUMO DO PROJETO</a>
  2. <a href="#instalacao">INSTALAÇÃO DO SISTEMA</a>
  3. <a href="#link">LINK DO PROJETO COMPLETO</a>
  4. <a href="#tecnologias">TECNOLOGIAS UTILIZADAS</a>
  5. <a href="#contribuicoes">CONTRIBUIÇÕES INDIVIDUAIS</a>
  6. <a href="#aprendizado">APRENDIZADO EFETIVO</a>
  
____________________________________________________________________________________________________________________________________________________________________________

<br>

### <h3 id="resumo">RESUMO DO PROJETO</h3>

<p>  O sistema Endurance foi desenvolvido para suprir a necessidade apresentada pelo Cliente que neste caso foi a empresa Oracle, que possui um local para eventos que conta com dois espaços diferentes para tal. O primeiro espaço possui 10 vagas e o segundo 50 vagas, o controle dessas vagas deve seguir o espaçamento adotado pelas medidas de segurança contra COVID-19.</p>
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

### <h3 id="instalacao">INSTALAÇÃO DO SISTEMA</h3>

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

### <h3 id="link">LINK DO PROJETO COMPLETO</h3>
Clicando no botão abaixo é possivel ver o Github do projeto completo, acompanhar as entregas das sprint's, conhecer os demais integrantes do grupo e ver a evolução do sistema:
  
<p align="center"><a href="https://github.com/MaXximiles/API-4SEM"> <img src= "https://github.com/MaXximiles/Fatec/blob/master/src/acesseaquiendurance.fw.png" width="200" height="80"></a></p> <br>

____________________________________________________________________________________________________________________________________________________________________________

<br>

### <h3 id="tecnologias">TECNOLOGIAS UTILIZADAS</h3>

<p align="center"><img src="https://github.com/MaXximiles/Fatec/blob/master/4Semestre%20-%20Endurance/src/programas.png" height="600" width="900"></p>

As tecnologias utilizadas no projeto foram: 
 * Linguagem Java 
 * Springboot Maven
 * Angular
 * Bootstrap
 * HTML
 * CSS3
 * Typescript
 * Javascript
 * Oracle Database
 * Oracle Cloud
 * Node
 * React
 
Decidimos optar por utilizar Java com Springboot para o Backend do projeto, pois, este framework é muito utilizado no mercado de trabalho trazendo experiência para os integrantes. 

Para o Frontend trabalhamos com o framework Angular que também é muito utilizado atualmente, utilizando biliotecas como Bootstrap e Materialize para o visual ficar mais bonito e robusto.

Nosso banco de dados foi o Oracle, e hospedamos no sistema Cloud, proporcionando assim a utilização do sistema de modo remoto sem que fosse necessário a instalação local em um servidor.

____________________________________________________________________________________________________________________________________________________________________________

<br>

### <h3 id="contribuicoes">CONTRIBUIÇÕES INDIVIDUAIS</h3>

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
 
 Exemplo de Burndown | Trello(Backlog) 
 ------------------- | --------------- 
 <img src="https://github.com/MaXximiles/Fatec/blob/master/4Semestre%20-%20Endurance/src/burndown.JPG"> | <img src="https://github.com/MaXximiles/Fatec/blob/master/4Semestre%20-%20Endurance/src/trello.JPG"> 
 
Prazos e tarefas | Heroku
---------------- | ------
 <img src="https://github.com/MaXximiles/Fatec/blob/master/4Semestre%20-%20Endurance/src/tarefas.JPG"> | <img src="https://github.com/MaXximiles/Fatec/blob/master/4Semestre%20-%20Endurance/src/heroku.JPG">
 
 
 Banco de Dados |
 -------------- |
 <img src="https://github.com/MaXximiles/Fatec/blob/master/4Semestre%20-%20Endurance/src/conceitual%201.1.jpg"> |
 
 ~~~sql
	CREATE TABLE usuarios
	(
	    usuario_id LONG, 
	    usuario_nome VARCHAR(30),
	    usuario_cpf VARCHAR(20),
	    usuario_rg VARCHAR(20),
	    usuario_email VARCHAR(35),
	    usuario_senha VARCHAR(255),
	    usuario_tipo INTEGER
	);

	CREATE TABLE tipo_usuario
	(
	    tipo_id LONG,
	    tipo_nome VARCHAR(30)
	);

	CREATE TABLE admin
	(
	    usuario_id LONG,
	    tipo_usuario INTEGER,
	    admin_setor VARCHAR(30),
	    admin_funcao VARCHAR(30)
	);

	CREATE TABLE colaborador_oracle
	(
	    usuario_id LONG,
	    tipo_usuario INTEGER,
	    colaborador_setor VARCHAR(30),
	    colaborador_funcao VARCHAR(30),
	    colaborador_tipo INTEGER
	);

	CREATE TABLE tipo_oracle
	(
	    oracle_id LONG,
	    oracle_nome VARCHAR(30),
	    oracle_prioridade INTEGER
	);

	CREATE TABLE convidado
	(
	    usuario_id LONG,
	    tipo_usuario INTEGER,
	    convidado_endereco VARCHAR(30),
	    convidado_bairro VARCHAR(30),
	    convidado_cep VARCHAR(25),
	    convidado_cidade VARCHAR(30),
	    convidado_estado CHAR,
	    convidado_pais VARCHAR(25)
	);

	CREATE TABLE convidado_vacina
	(
	    vacina_id LONG,
	    usuario_id INTEGER,
	    vacina_arquivo VARCHAR(255),
	    vacina_data_upload DATE,
	    vacina_hora_upload VARCHAR(10),
	    vacina_descricao VARCHAR(30)
	);

	CREATE TABLE eventos
	(
	    evento_id LONG,
	    evento_data DATE,
	    evento_hora_inicio DATE,
	    evento_hora_fim VARCHAR(10),
	    evento_local VARCHAR(30),
	    evento_assunto VARCHAR(30),
	    evento_descricao VARCHAR(30),
	    evento_observacoes VARCHAR(30),
	    usuario_id INTEGER,
	    evento_data_criacao DATE,
	    evento_hora_criacao VARCHAR(10),
	    evento_status VARCHAR(15)
	);

	CREATE TABLE eventos_status
	(
	    status_id LONG,
	    status_descricao VARCHAR(30)
	);

	CREATE TABLE participantes
	(
		evento_id LONG,
		convidado_id INTEGER
	);  
~~~	


Neste projeto pude desenvolver conhecimentos em Frontend, tais como integração com o Backend, Typescrypt, Node e React.
Através disto pude participar da criação do protótipo do sistema, implementando o framework Angular.

Abaixo temos o protótipo da pagina inicial index.html:

~~~html

<!doctype html>
<html lang="pt-br">
<head>
  <meta charset="utf-8">
  <title>Endurance</title>
  <base href="/">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="icon" type="image/x-icon" href="favicon.ico">

// Integrando Bootstrap por cache no projeto
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
// *************************************************************************

</head>
<body>
  <app-root></app-root>

  <script>
    // Função para abrir pagina de usuarios a partir do tipo selecionado no modal
    function abrirPagina()
    {
      var i = document.formModal.pesq_tipo_usuario.selectedIndex; 
      if(i == "1"){window.location.href = "usuarios-admin/usuarios-admin.component";}
      if(i == "2"){window.location.href = "usuarios-colaborador/usuarios-colaborador.component";}
      if(i == "3"){window.location.href = "usuarios-convidado/usuarios-convidado.component";}
      if(i == ""){alert("Erro: selecione um tipo de usuario!")}
    }
    // ***************************************************************************

    // FUNÇÃO PARA AUTOMATIZAR CEP

    function limpa_formulário_cep() {
            //Limpa valores do formulário de cep.
            document.getElementById('rua').value=("");
            document.getElementById('bairro').value=("");
            document.getElementById('cidade').value=("");
            document.getElementById('uf').value=("");
            document.getElementById('ibge').value=("");
    }

    function meu_callback(conteudo) {
        if (!("erro" in conteudo)) {
            //Atualiza os campos com os valores.
            document.getElementById('convidado_endereco').value=(conteudo.logradouro);
            document.getElementById('convidado_bairro').value=(conteudo.bairro);
            document.getElementById('convidado_cidade').value=(conteudo.localidade);
            document.getElementById('convidado_estado').value=(conteudo.uf);
        } //end if.
        else {
            //CEP não Encontrado.
            limpa_formulário_cep();
            alert("CEP não encontrado.");
        }
    }
        
    function pesquisacep(valor) {

        //Nova variável "cep" somente com dígitos.
        var cep = valor.replace(/\D/g, '');

        //Verifica se campo cep possui valor informado.
        if (cep != "") {

            //Expressão regular para validar o CEP.
            var validacep = /^[0-9]{8}$/;

            //Valida o formato do CEP.
            if(validacep.test(cep)) {

                //Preenche os campos com "..." enquanto consulta webservice.
                document.getElementById('convidado_endereco').value="...";
                document.getElementById('convidado_bairro').value="...";
                document.getElementById('convidado_cidade').value="...";
                document.getElementById('convidado_estado').value="...";
                //Cria um elemento javascript.
                var script = document.createElement('script');

                //Sincroniza com o callback.
                script.src = 'https://viacep.com.br/ws/'+ cep + '/json/?callback=meu_callback';

                //Insere script no documento e carrega o conteúdo.
                document.body.appendChild(script);

            } //end if.
            else {
                //cep é inválido.
                limpa_formulário_cep();
                alert("Formato de CEP inválido.");
            }
        } //end if.
        else {
            //cep sem valor, limpa formulário.
            limpa_formulário_cep();
        }
    };

    //FIM FUNÇÃO CEP

// Integração de Bootstrap no projeto
  </script>
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
// *******************************************************************************
 
</body>
</html>

~~~~
 
 ____________________________________________________________________________________________________________________________________________________________________________

### <h3 id="aprendizado">APRENDIZADO EFETIVO</h3>

Através deste API e dos realizados nos semestres anteriores foi possivel desenvolver habilidades em programação Java, conhecer o framework Springboot, e diversas ferramentas e bibliotecas como JavaFx, Jasper Reports, Flyway, Lombok, Hibernate, Maven, focados no Backend.
Com conhecimento nesses recursos foi possivel desenvolver e compreender os trabalhos realizados no 2º 3º semestre e neste 4º.

Porém neste projeto procurei aprender mais sobre Backend, onde pude conhecer o framework Angular, e bibliotecas como Bootstrap e Materialize que não só deixam o visual mais bonito e agradavel como facilitam a criação de layout do sistema.

Além desses conhecimentos tambem pude me aprofundar no uso do banco de dados da Oracle, que possui diversas ferramentas e recursos, como Procedures, Trigger's e Function's, essas que automatizavam o funcionamento de funções do banco.


<a href="#topo">Voltar ao topo</a>

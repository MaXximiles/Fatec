### ENDURANCE - 4º SEMESTRE

<p align="center"><img src="https://github.com/MaXximiles/API-4SEM/raw/main/Documenta%C3%A7%C3%A3o/logo%20com%20nome.png" width="220" height="150"></>

O sistema Endurance tem como objetivo principal o gerenciamento de eventos, possibilitando a criação e o controle aos colaboradores da empresa. O público externo poderá ser cadastrado no sistema para participar dos eventos, seguindo as restrições sanitárias devido a pandemia e a validação do comprovante de vacinação contra SARS-CoV-2, tanto para dose única quanto para demais doses. Os usuários cadastrados serão notificados sobre novos eventos e atualizações via e-mail.
<br>
  
  <p align="center"><img src="https://user-images.githubusercontent.com/68132461/136485547-51caf0b7-0706-42d6-a387-58362765f071.gif"></img></p>


#### RESUMO DO PROJETO

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

  
#### TECNOLOGIAS UTILIZADAS

No projeto as tecnologias que utilizamos foram:





#### CONTRIBUIÇÕES INDIVIDUAIS


#### APRENDIZADOS EFETIVOS


#### LINK DO PROJETO COMPLETO
No botão abaixo é possivel ver o Github com o projeto completo, baixar e excuta-lo tambem:
  
<p align="center"><a href="https://github.com/MaXximiles/API-4SEM"> <img src= "https://github.com/MaXximiles/Fatec/blob/master/src/acesseaquiendurance.fw.png" width="100" height="40"></a></p> <br>

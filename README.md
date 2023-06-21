# Vollmed_API
<p align="center">
  <a href="#">
    <img src="Pdfs\Vollmed_API.png" width="300" alt="">
  </a>
</p>




Vollmed_API é uma aplicação Java que implementa um sistema de cadastro de pacientes e médicos. Utiliza o framework Spring para o desenvolvimento do backend.

# Requisitos
Certifique-se de ter as seguintes ferramentas instaladas em seu ambiente de desenvolvimento:

- Java Development Kit (JDK) 8 ou superior
- Maven
- IDE de sua escolha (recomendado: VSCode com as extensões do Spring Boot)
 
# Configuração

1. Clone o repositório Vollmed_API para o seu ambiente de desenvolvimento:
```
git clone https://github.com/seu-usuario/vollmed_api.git
```
2. Importe o projeto em sua IDE (por exemplo, o VSCode).

3. Configure o arquivo application.properties no diretório src/main/resources com as configurações do seu banco de dados. Por exemplo:
```
spring.datasource.url=jdbc:mysql://localhost:3306/vollmed_db
spring.datasource.username=seu-usuario
spring.datasource.password=sua-senha
```
4. Execute a aplicação a partir da classe VollmedApiApplication localizada em src/main/java/com/seu-usuario/vollmedapi.

# Endpoints
A Vollmed_API oferece os seguintes endpoints para o cadastro de pacientes e médicos:

# Pacientes
- POST /pacientes: Cadastra um novo paciente no sistema. Os dados do paciente devem ser fornecidos no corpo da requisição no formato JSON.
- GET /pacientes: Retorna a lista de todos os pacientes cadastrados no sistema.
- PUT `/pacientes/{id}`: Atualiza as informações de um paciente existente. Os dados atualizados do paciente devem ser fornecidos no corpo da requisição no formato JSON.
- DELETE `/pacientes/{id}`: Exclui um paciente do sistema com base no seu ID.


# Médicos
- POST /medicos: Cadastra um novo médico no sistema. Os dados do médico devem ser fornecidos no corpo da requisição no formato JSON.
- GET /medicos: Retorna a lista de todos os médicos cadastrados no sistema.
- PUT `/medicos/{id}`: Atualiza as informações de um médico existente. Os dados atualizados do médico devem ser fornecidos no corpo da requisição no formato JSON.
- DELETE `/medicos/{id}`: Exclui um médico do sistema com base no seu ID.
# Contribuição
Contribuições são bem-vindas! Se você deseja contribuir para o projeto Vollmed_API, siga as etapas abaixo:

1. Faça um fork do repositório.
2. Crie uma branch com a sua feature ou correção de bug: git checkout -b minha-feature.
3. Faça as alterações necessárias e adicione os testes apropriados, se aplicável.
4. Envie suas alterações: git push origin minha-feature.
5. Abra um pull request no repositório original.

# Licença
Este projeto é licenciado sob os termos da licença MIT. Consulte o arquivo LICENSE para mais informações.

# Contato
Se você tiver alguma dúvida ou sugestão em relação ao projeto Vollmed_API, sinta-se à vontade para entrar em contato comigo em marcotonho38@gmail.com.

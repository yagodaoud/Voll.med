### Voll.med - Gerenciamento de Consultas Médicas

O Voll.med é um aplicativo fictício desenvolvido em Java com Spring Boot para gerenciamento de consultas médicas.
Este projeto fornece toda a aplicacção back-end para uma API exclusiva com diversas funcionalidades.

#### Funcionalidades

- Agendamento de consultas com médicos de diversas especialidades.
- Verificação de disponibilidade de médicos em horários específicos.
- Cadastro e atualização de pacientes.
- Controle de status de médicos (ativo/inativo).
- Validação de regras de negócio para agendamento de consultas.

#### Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- MySQL

#### Endpoints da API
A API do Voll.med oferece os seguintes endpoints principais:

POST /consultas: Agendar uma nova consulta.
POST /medicos/{id}: Apagar um médico por id (mudar o status de ativo para inativo).
DELETE /paciente/{id}: Apagar um paciente por id.
GET /medicos: Obter a lista de médicos cadastrados.
GET /pacientes: Obter a lista de pacientes cadastrados.

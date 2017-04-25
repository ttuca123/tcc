# tcc
Repositório Destinado á publicação de código que será referência para o trabalho de conclusão de curso


Objetivo Principal: elaborar dois projetos de automatização de testes, um com o uso da API Reflection do Java, e outro sem essa 
API.
Problema: o principal problema a ser resolvido com essa abordagem é mostrar a reutilização de testes
utilizando a mesma estrutura arquitetural em todo o projeto. 
Principais pontos do projeto: 

- Centralização do ponto de execução dos testes através da classe pai chamada Base.
- Utilização das Annotations sobre a classe de teste para realizar a configuração e também guiar a execução dos passos
executados pelo teste.
- Possibilidade de diminuir a complexidade da criação dos testes, já que basta configurar as anotações nas classes de teste.
- Possibilidade de acrescentar ou diminuir passos de teste apenas adcionando ou removendo o passo que será executado.

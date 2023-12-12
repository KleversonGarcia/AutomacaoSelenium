# automation_selenium
Exemplo de automação em Selenium:

Este é um projeto exemplo para ter um exemplo de fácil compreensão de
Injeção de Dependência de um driver web Selenium com configuração Spring, apenas com anotações. A execução do projeto consiste apenas em testes unitários para executar com Cucumber, baseados em alguns recursos escritos em Gherkin.

O objetivo deste projeto é reutilizar um driver web através de 
diferentes classes que implementam as diferentes etapas das funcionalidades do Gherkin.

Alguns recursos extras simples e úteis para um projeto Selenium também estão implementados e
prontos para uso:
usar Maven e propriedades globais para o comportamento da aplicação;

Para executar o projeto abra o terminal e execute o comando: mvn clean test -Dwebbrowser=chrome
Caso for utilizar outro navegador, favor alterar onde está o chrome, pelo navegador desejado.
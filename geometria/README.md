# Projeto Geometria

Este projeto implementa uma aplicação para manipulação de objetos geométricos, organizada em pacotes para melhor modularização e manutenção.

## Estrutura do Projeto

- **front**: Pacote responsável pela interação com o usuário. Contém a classe `QuadroNegro` com o método `main` para execução da aplicação.
- **back.negocio**: Pacote que contém a interface `iFachada` e a classe `Fachada`, que abstraem as funcionalidades da aplicação, facilitando o uso das funcionalidades.
- **back.dado**: Pacote que contém as classes básicas e a hierarquia de objetos geométricos, utilizando conceitos de herança e polimorfismo.

## Como Compilar

Navegue até o diretório `geometria/ObjetoGeometrico/src` e execute o comando:

```bash
javac front/QuadroNegro.java back/negocio/*.java back/dado/*.java
```

## Como Executar

Após compilar, execute a aplicação com o comando:

```bash
java front.QuadroNegro
```

## Funcionalidades

- Criação de objetos geométricos: Quadrado, Retângulo, Triângulo e Circunferência.
- Cálculo de área e perímetro para cada objeto.
- Definição e exibição da cor de cada objeto.
- Interface `iFachada` e classe `Fachada` para abstração das funcionalidades.

## Observações

- A estrutura do projeto segue as orientações para uso de interfaces, hierarquia de classes e organização em pacotes.
- A classe `QuadroNegro` utiliza a fachada para interagir com os objetos geométricos, promovendo desacoplamento e facilidade de manutenção.

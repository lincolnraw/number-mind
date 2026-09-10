# Number Mind

Jogo simples de adivinhação de números em Java. O programa sorteia um número aleatório entre 0 e 100, e o jogador tem até 5 tentativas para acertar, recebendo dicas se o palpite foi maior ou menor que o número secreto.

## Como funciona

- Um número é gerado aleatoriamente entre 0 e 100.
- O jogador digita um palpite pelo terminal.
- A cada tentativa, o programa informa se o número é maior ou menor.
- Ao acertar, é calculado um score com base no número de tentativas (quanto menos tentativas, maior a pontuação).
- Se as 5 tentativas se esgotarem sem acerto, o número secreto é revelado.

## Como executar

Compile e rode o arquivo `src/Main.java` com o JDK (Java 21+, já que usa o método `main` sem classe explícita):

```bash
java src/Main.java
```

## Tecnologias

- Java

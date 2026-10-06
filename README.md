# Personagem RPG

Exercicio de hierarquia de classes em Java.

A classe `Personagem` guarda os atributos comuns (nome, classe, vida, nivel e
moedas) e os metodos de acao. As classes `Guerreiro`, `Mago` e `Arqueiro`
herdam dela e cada uma tem os seus proprios atributos e uma acao especial.

## Como rodar

```
javac -d out src/*.java
java -cp out Main
```

O `Main` cria um personagem de cada classe, mostra o estado deles, executa as
acoes especiais e testa os metodos de dano, cura, moedas e subida de nivel.

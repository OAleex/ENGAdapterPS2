# Adaptador PS2 para USB

Este é um projeto Java que demonstra o padrão de design do adaptador. Ele consiste em um adaptador que permite que um teclado PS2 se conecte a uma porta USB.

## Classes

O projeto consiste em quatro classes principais:

1. `TecladoPS2`: Esta classe representa um teclado PS2 com um método para conectar o teclado.

2. `GabineteUSB`: Esta classe implementa a interface `IUSB` e representa um gabinete com uma porta USB.

3. `AdaptadorPS2ParaUSB`: Esta classe também implementa a interface `IUSB` e serve como um adaptador que permite que um teclado PS2 se conecte a uma porta USB.

4. `Main`: Esta classe contém o método principal onde o adaptador é usado para conectar o teclado PS2 à porta USB.

## Uso

Para usar este projeto, basta clonar o repositório e executar a classe `Main`. Isso criará um novo objeto `AdaptadorPS2ParaUSB` e usará o método `conectarUSB` para conectar o teclado PS2 à porta USB.

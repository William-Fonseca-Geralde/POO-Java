# Métodos Especiais

Na programação orientada a objeto, existe dois métodos importantes que dão acesso ou modificam um atributo, e eles são conhecidos como **_Getters_** e **_Setters_**. Esses métodos são importantes para dar mais segurança no código.

## Definição desses Métodos

### Getters

O método _get_ serve para acessar algum atributo de sua classe, e já que esse atributo pode ser _private_, fazendo com que outras classes não acessem aquele atributo diretamente de daquela classe.

### Setters

O método _set_ serve para modificar o atributo de sua classe, fazendo com que outras classes não modifiquem aquele atributo daquela classe.

### Construct

Existe também os _métodos construtores_, que serve para quando instanciar um objeto, esse método vai ser executado, assim já podendo modificar os atributos de uma classe, sem a necessidade de chamar os métodos _Getters_ e _Setters_ na classe _main_, e sim na própria classe do objeto instanciado.
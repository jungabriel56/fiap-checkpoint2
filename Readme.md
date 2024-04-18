# CP2
Aplicação Java com container e Banco de dados


## Pré-requisitos

- Java 17 +
- Docker 
- Acesso a internet
- Acesso ao docker Hub

## Instalação

#### Clone

```
git clone https://github.com/jungabriel56/fiap-checkpoint2.git
```


## Execução


#### Docker

Criação de imagem

```
docker build -t checkpoint2 .
```

###executar container 

```
Executar em DEV
docker run -d -p 8080:8080 -e PROFILE=dev jungabriel56/fiap-checkpoint2

Executar em STG
docker run -d -p 8080:8080 -e PROFILE=stg jungabriel56/fiap-checkpoint2

Executar em PRD
docker run -d -p 8080:8080 -e PROFILE=prd jungabriel56/fiap-checkpoint2
```



#### Navegação

* Base

	http://localhost:8080

* Endpoint que retorna a tela do banco de dados H2

	http://localhost:8080/h2-console


#### Features

* Multíplos profiles (dinamicamente)



## Alunos

- Gustavo Nascimento - rm93292
- Gabriel Itikawa - rm93540
- Rafael Souza - rm92876


## Fontes

https://www.springcloud.io/post/2022-09/spring-boot-profiles/#gsc.tab=0

https://www.baeldung.com/spring-profiles

https://www.woolha.com/tutorials/spring-boot-get-active-profiles-programmatically
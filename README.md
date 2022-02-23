# pandascore-csgo

Uma lib Java para consumir https://api.pandascore.co/csgo/ utilizando RestTemplate do Spring.

## Dependências

| Dependência                   | Versão |
| -----------------             | -------|
| Java                          | 8      |
| spring-web                    | 5.3.13 |
| jackson-databind              | 2.13.0 |
| jackson-datatype-jsr310       | 2.11.0 |
| lombok                        | 1.18.20|


## Documentação da LIB

Utilizar o token fornecido pela <i>pandascore.go</i> para ser utilizado no header <b>Authorization</b>.

#### 

Exemplo de utilização:

```java
  //Buscar todos os times
  
  TokenSingleton.init("<BEARER-TOKEN>")

  TeamsRequest request = TeamsRequest.builder()
                .build();
  
  List<Team> allTeams = new LinkedList<>();

  Team[] teams = request.get().getBody();
  while (teams.length > 0) {
    allTeams.addAll(Arrays.asList(teams));

    teams = request.nextPage().getBody();
  }
```

### Classes

- <i>AbstractRequest</i>: consultas simples
- <i>AbstractPageRequest</i>: consultas paginadas (tamanho da página default de 100 itens)
- <i>CustomPageable</i>: alterar os parâmetros de requisições paginadas
- <i>ParamType</i>: define o tipo do parâmetro se é filtro ou intervalo
- <i>ParamTuple</i>: filtro e valor


Autor: [@oigorrudel](https://www.github.com/oigorrudel)
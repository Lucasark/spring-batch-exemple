Spring Batch

Batch para sair de um csv e ir para um H2

Metadados serão armazenados em outro H2

==SETUP===

- Executar o DockerCompose (já existe um exemplar, porem pode usar um de preferencia)


- Entra nos dois H2 e executar: 

```
touch /opt/h2-data/test.mv.db
```

- Fazer credencia do H2 em alguma plataforma de SQL e colocar o H2 no modo legacy, os scripst do 2.1.X foram feitos para bancos "da época", logo:

```
SET MODE LEGACY
```

Obs.: H2 já disponiliza uma Plataforma localhost:81 e localhost:82 para o docker de exemplo.

- Executar o SQL para criar a tabela no banco de destino:

```
people.sql
```

- Executar o projeto




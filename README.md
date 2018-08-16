# peeaSpringBoot


## Construcción de la imagen

Construir la aplicación spring boot utilizando maven y posteriormente generar la imagen Docker

```
  mvn clean install -Dmaven.test.skip=true 
  docker build -t peea . 
```

## Ejecución

Es posible iniciar el proyecto de las siguientes maneras

* Con Docker Compose
```
  docker-compose -f stack.yml up
```

* Con Docker Stack
```
  docker stack deploy -c stack.yml peea
```

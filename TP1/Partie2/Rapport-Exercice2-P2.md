```java
    do n++ while (n<10); // instruction 1
```
Il manque le ; après n++ pour que cela fonctonne

```java
    do while (n!=10); // instruction 2
```
Il manque le ; après le do cause une boucle infinis car aucune action est effectuer sur n


```java
    do ; while (true); // instruction 3
```
Boucle infinis pas d'action dans le do et while true

```java
    do { } while (false); // instruction 4
```
Il faut enlever les {} car on ne fait rien a l'intérieur


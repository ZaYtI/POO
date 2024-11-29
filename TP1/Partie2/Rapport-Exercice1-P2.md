```java
    if(a<b) System.out.println (‘‘ascendant‘‘)
    else System.out.println (‘‘non ascendant‘‘)
```
Manque le ; a la fin des lignes


```java
    if(a<b) { System.out.println (‘‘ascendant‘‘) ; max = b }
```

Manque le ; a la fin au moment de max = b


```java
    int n, p ;
    ….
    switch (n) {
    case 2 : System.out.println ("petit"); break;
    case p : System.out.println ("limite"); break;
    }
```
Le case p ne fonctionne pas car c'est une variable et nous nous cherchons les cas pour n


```java
    int n;
    final int LIMITE = 20
    ….
    switch (n) {
    case LIMITE - 1 : System.out.println (‘‘trop petit‘‘); break;
    case LIMITE : System.out.println (‘‘OK‘‘);
    case LIMITE + 1 : System.out.println (‘‘trop grand‘‘); break;
    }
```
On ne peut pas change ici LIMITE qui est déclarer comme final

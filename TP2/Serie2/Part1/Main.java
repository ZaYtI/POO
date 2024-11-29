package TP2.Serie2.Part1;

class Main {
    public static void main(String[] args) {
        Impair nb = new Impair();
        System.out.println(nb.premier());
        while (nb.ilEnReste()) {
            System.out.println(nb.suivant());
        }
    }
}

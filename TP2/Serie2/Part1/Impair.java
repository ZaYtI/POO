package TP2.Serie2.Part1;

import TP2.Serie2.Utils.Entiers;

//version sans l'extends de Entiers
// public class Impair {
//     private int impairCourant;
//     private boolean appelPremier;

//     // Constructeur
//     public Impair() {
//         this.appelPremier = false;
//         this.impairCourant = 1;
//     }

//     public int premier() {
//         this.appelPremier = true;
//         this.impairCourant = 1;
//         return this.impairCourant;
//     }

//     public int suivant() {
//         if (appelPremier) {
//             appelPremier = false;
//             return impairCourant + 2;
//         } else {
//             impairCourant += 2;
//             return impairCourant;
//         }
//     }

//     public boolean ilEnReste() {
//         return impairCourant < 199;
//     }
// }

public class Impair extends Entiers {
    private int impairCourant;
    private boolean appelPremier;

    // Constructeur
    public Impair() {
        this.appelPremier = false;
        this.impairCourant = 1;
    }

    @Override
    public int premier() {
        this.appelPremier = true;
        this.impairCourant = 1;
        return this.impairCourant;
    }

    @Override
    public int suivant() {
        if (appelPremier) {
            appelPremier = false;
            return impairCourant + 2;
        } else {
            impairCourant += 2;
            return impairCourant;
        }
    }

    @Override
    public boolean ilEnReste() {
        return impairCourant < 199;
    }
}

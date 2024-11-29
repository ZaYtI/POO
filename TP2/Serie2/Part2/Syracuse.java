package TP2.Serie2.Part2;

import TP2.Serie2.Utils.Entiers;

// copie de l'ancienne version de Syracuse (exercice 3)
// public class Syracuse {
//     private int termeCourant;
//     private int termeInitial;
//     private boolean appelPremier;

//     public Syracuse(int U0) {
//         this.termeInitial = U0;
//         this.termeCourant = U0;
//         this.appelPremier = false;
//     }

//     public int premier() {
//         appelPremier = true;
//         termeCourant = termeInitial;
//         return termeCourant;
//     }

//     public int suivant() {
//         if (!appelPremier) {
//             throw new IllegalStateException("la méthode premier() doit etre appeler avant la méthode suivant().");
//         }
//         if (termeCourant == 1) {
//             return 1;
//         }
//         termeCourant = (termeCourant % 2 == 0) ? termeCourant / 2 : 3 * termeCourant + 1;
//         return termeCourant;
//     }

//     public boolean ilEnReste() {
//         return termeCourant != 1;
//     }
// }

public class Syracuse extends Entiers {
    private int termeCourant;
    private int termeInitial;
    private boolean appelPremier;

    public Syracuse(int U0) {
        this.termeInitial = U0;
        this.termeCourant = U0;
        this.appelPremier = false;
    }

    @Override
    public int premier() {
        appelPremier = true;
        termeCourant = termeInitial;
        return termeCourant;
    }

    @Override
    public int suivant() {
        if (!appelPremier) {
            throw new IllegalStateException("la méthode premier() doit etre appeler avant la méthode suivant().");
        }
        if (termeCourant == 1) {
            return 1;
        }
        termeCourant = (termeCourant % 2 == 0) ? termeCourant / 2 : 3 * termeCourant + 1;
        return termeCourant;
    }

    @Override
    public boolean ilEnReste() {
        return termeCourant != 1;
    }
}


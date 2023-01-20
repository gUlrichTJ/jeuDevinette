package games;

public interface Description {

    //Le CalculMath demande à l'utilisateur de trouver le résultat d'un calcul demandé par l'ordinateur
    //Pour la partie deviner, elle sert à trouver un mot deviné par l'ordinateur et enfin
    //la partie MotsMeles consiste à mélanger un mot entré par un premier utilistateur et demander à
    //un second de le trouver.

    /**
     * On présente le menu à l'utilisateur et on lui demande de choisir ce qu'il veut,
     * on pourrait avoir :
     * 1-) Instructions,
     * 2-) Jeux
     * 3-) À propos
     * */

    /**
     * Ensuite, dans la partie 2, on pourrait avoir les differents jeux que propose ce module
     * comme :
     * 1-) Jeu de calcul,
     * 2-) Jeu de devinette,
     * 3-) Mots mêlés
     * */

    /**
     * Dans chaque cas, on aura une partie "Instructions" où l'utilisateur aura des instructions
     * sur le jeu qu'il souhaite effectuer.
     * */
    /**Nous aurons quelque chose de ce genre
     *1-) Instructions,
     *2-) Jeux
     *3-) À propos
     *  1-) Donne les instructions globales sur les jeux et invite l'utilisateur à consulter les
     *  instructions des différents jeux
     *  2-) Dans le 2, on a encore niveaux cas :
     *      1-) Calcul mathématique,
     *      2-) Jeu de devinette
     *      3-) Mots mêlés.
     *      */

    /**
     * Calcul math :
     * Nous créons des méthodes qui calculent et nous les appelons dans tous les differents cas.
     * Nous aurons le cas addition, soustraction, division, multiplication, division entière, ... ,
     * et un calcul décidé par l'ordinateur.*/
        /**
         * Nous pourrons écrire par exemple
         * Entrez :
         * + pour la multiplication,
         * - pour la soustraction,
         * / pour la division,
         * * pour la multiplication,
         * % pour la division entière,
         * a pour une opération décidée par l'ordinateur.*/

        /**
         * Opération décidée par l'ordinateur
         * pour l'opération décidée par l'ordinateur, on pourra générer un nombre pseudo-aléatioire
         * entre 1 et le nombre total d'opérations, récupérer l'indice de l'un des caractères dans
         * un tableau de char contenant les differents caractères (+, -, /, *, %) puis faire
         * l'opération en fonction de du caractère saisi.*/
}

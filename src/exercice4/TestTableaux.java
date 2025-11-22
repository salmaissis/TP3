package exercice4;

public class TestTableaux {

	public static void main(String[] args) {

        double[][] t1 = {
            {1, 2},
            {3, 4}
        };

        double[][] t2 = {
            {5, 3},
            {4, 1}
        };

        System.out.println("Affichage t1 :");
        TableauxDoubles.affiche(t1);
        System.out.println("Affichage t2 :");
        TableauxDoubles.affiche(t2);

        System.out.println("\nLe tableau t1 est-il régulier ? " + TableauxDoubles.regulier(t1));

        System.out.println("\nSommes des lignes de t1 :");
        double[] s = TableauxDoubles.sommeLignes(t1);
        for (double x : s) System.out.println(x);

        System.out.println("\nSomme de t1 + t2 :");
        double[][] t3 = TableauxDoubles.somme(t1, t2);
        if (t3 == null)
            System.out.println("Somme impossible");
        else
        	TableauxDoubles.affiche(t3);
    }
}
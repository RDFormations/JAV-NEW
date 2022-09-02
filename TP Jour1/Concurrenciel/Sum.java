import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class Sum extends RecursiveTask<Long>
{

	int low;
	int high;
	int[] array;
	static final int SEQUENTIAL_THRESHOLD = 50;


	Sum(int[] arr, int lo, int hi)
	{
		array = arr;
		low = lo;
		high = hi;
	}

	protected Long compute()
	{
		if ((high - low) <= SEQUENTIAL_THRESHOLD)
		{
			long sum = 0;
			for(int i = low; i < high; ++i)
			{
				sum += array[i];
			}
			return sum;
		}
		else
		{
			int mid = low + (high - low) / 2;
			Sum left = new Sum(array, low, mid);
			Sum right = new Sum(array, mid, high);
			left.fork();
			Long rightAns = right.compute();
			Long leftAns = left.join();
			return leftAns + rightAns;
		}
	}

	static long sumArray(int[] array)
	{
		return ForkJoinPool.commonPool().invoke(new Sum(array, 0, array.length));
	}
}

// On donne à un objet Sum un tableau et une plage de ce tableau. La méthode de calcul additionne les éléments de cette plage.
//Si la plage contient moins de SEQUENTIAL_THRESHOLD éléments, elle utilise une simple boucle for comme vous l'avez appris en introduction à la programmation.
//Sinon, elle crée deux objets Sum pour les problèmes de taille moitié moindre. Il utilise fork pour calculer la moitié gauche en parallèle avec le calcul de la moitié droite, que cet objet effectue lui-même en appelant right.compute().
// Pour obtenir la réponse de la partie gauche, il appelle left.join().
// Pourquoi avons-nous un SEQUENTIAL_THRESHOLD ? Il serait plutôt correct de continuer à réciter jusqu'à ce que high==low+1 et de
// retourner ensuite array[low]. Mais cela crée beaucoup plus d'objets Sum et d'appels à fork, donc cela finira par être beaucoup moins efficace
// malgré la même complexité asymptotique.
// Pourquoi créer plus d'objets Sum qu'il n'y a de processeurs ? Parce que c'est le rôle du framework de faire en sorte qu'un nombre
// raisonnable de tâches parallèles s'exécutent efficacement et de les ordonnancer de manière adéquate. En ayant beaucoup de tâches
// parallèles assez petites, il peut faire un meilleur travail, surtout si le nombre de processeurs disponibles pour votre programme change
// pendant l'exécution (par exemple, parce que le système d'exploitation exécute également d'autres programmes) ou si les tâches finissent par
// prendre des temps différents.

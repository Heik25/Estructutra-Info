
package grafo.ciudad;

  public class Dijkstra {
	static int MAX = 10000;
 static int inicio=0;
	public static void main(String[] args) {
		// matriz de adyacencia
		int[][] weight = { { 0, 1, 5, MAX, MAX, MAX, MAX, MAX, MAX },
				{ 1, 0, 3, 7, 5, MAX, MAX, MAX, MAX },
				{ 5, 3, 0, MAX, 1, 7, MAX, MAX, MAX },
				{ MAX, 7, MAX, 0, 2, MAX, 3, MAX, MAX },
				{ MAX, 5, 1, 2, 0, 3, 6, 9, MAX },
				{ MAX, MAX, 7, MAX, 3, 0, MAX, 5, MAX },
				{ MAX, MAX, MAX, 3, 6, MAX, 0, 2, 7 },
				{ MAX, MAX, MAX, MAX, 9, 5, 2, 0, 4 },
				{ MAX, MAX, MAX, MAX, MAX, MAX, 7, 4, 0 } };
		int start = 0;
		int[] shortPath = dijsktra(weight, start);
		System.out.println("=====================================");
		for (int i = 0; i < shortPath.length; i++) {
			 System.out.println ("La distancia más corta de" + inicio + "a" + i + "es:" + shortPath [i]);
		}
	}
 
	 // Acepta la matriz de peso de un gráfico y un inicio de punto de origen (numerados desde 0, los vértices se almacenan en la matriz)
	 // Devuelve una matriz int [], que representa la ruta más corta desde el inicio hasta el punto i
	public static int[] dijsktra(int[][] matrix, int start) {
		 int n = matrix.length; // Hay un total de n vértices
		 int [] shortPath = new int [n]; // shortPath [i] almacena la longitud de ruta más corta desde el inicio hasta el punto i
		 Cadena [] ruta = new Cadena [n]; // ruta [i] representa la representación de cadena de ruta más corta desde el principio hasta el punto i
		 Boolean []  visitado = new Boolean [n]; // visitado [i] indica si se determina la ruta más corta desde el inicio hasta el vértice i
 
		shortPath[start] = 0;
		visitado[start] = true;
		for (int i = 0; i < n; i++) {
			ruta[i] = start + "-->" + i;
		}
 
		 // Para n vértices, se necesitan n-1 ciclos. Cada ciclo encuentra el vértice sin marcar más cercano al inicio del vértice inicial y utiliza este vértice como punto intermedio para actualizar la longitud de ruta más corta de otros puntos
		for (int count = 1; count < n; count++) {
			 // Seleccione un vértice sin marcar más cercano a Pos más cercano al inicio del vértice inicial
			int nearestPos = -1;
			int nearestLen = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				if (!visitado[i] && matrix[start][i] < nearestLen) {
					nearestLen = matrix[start][i];
					nearestPos = i;
				}
			}
			 // Marque el vértice recién seleccionado como el camino más corto encontrado, y el camino más corto para comenzar es el más cercanoLen
			shortPath[nearestPos] = nearestLen;
			visitado[nearestPos] = true;
			 // Usando los puntos más cercanos como punto medio, modifique la distancia desde el inicio hasta los puntos no visitados
			for (int i = 0; i < n; i++) {
				if (!visitado[i] && matrix[start][nearestPos] + matrix[nearestPos][i] < matrix[start][i]) {
					matrix[start][i] = matrix[start][nearestPos] + matrix[nearestPos][i];
					ruta[i] =ruta[nearestPos] + "-->" + i;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			 System.out.println ("La ruta más corta de" + inicio + "a" + i + "es:" + ruta [i]);
		}
		return shortPath;
	}
 
}
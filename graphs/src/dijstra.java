 class dijstra {
    static  int minKey (int key[], boolean mstSet[]){

        int min  = Integer.MAX_VALUE;
        int min_index = -1;

        for (int i = 0; i < key.length; i++) {
            if(mstSet[i] == false && key[i] <= min) {
                min = key[i];
                min_index = i;
            }
        }
        return min_index;
    }


    static int V = 9;
    static void printsss(int dist[]){
        for (int i = 0; i < V ; i++) {
            System.out.println(dist[i]);
        }
    }

    static void path(int[][] graph) {
        int[] dist = new int[V];
        boolean[] splsets = new boolean[V];


        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            splsets[i] = false;
        }

        dist[0] = 0;

        for (int i = 0; i < V - 1; i++) {


            int u = minKey(dist, splsets);

            splsets[u] = true;

            for (int v = 0; v < V; v++) {

                if (!splsets[v] && graph[u][v] != 0
                        && dist[u] != Integer.MAX_VALUE
                        && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
        printsss(dist);

    }
     public static void main(String[] args) {
         int graph[][]
                 = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                 { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                 { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                 { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                 { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                 { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                 { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                 { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                 { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
         path(graph);

     }
}



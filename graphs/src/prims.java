 class Primsww {


    static int V = 5;

   static  int minKey (int key[], boolean mstSet[]){

        int min  = Integer.MAX_VALUE;
        int min_index = -1;

        for (int i = 0; i < key.length; i++) {
             if(mstSet[i] == false && key[i] < min) {
                min = key[i];
                min_index = i;
             }
        }
        return min_index;
    }


    static void prints(int parent[], int graph[][]){
        System.out.println("Edge \tWeight");
        for (int i = 0; i < V ; i++) {
            System.out.println(parent[i] + "-" + i);

        }
    }

    static void findMst(int graph[][]){


        int parent[] = new int[V];

        int key[] = new int[V];

        boolean mstSet[] = new boolean[V];


        for (int i = 0; i <V ; i++) {
         key[i] = Integer.MAX_VALUE;
         mstSet[i] = false;
        }

        key[0]=0;
        parent[0] = -1;

        for (int i = 0; i < V-1; i++) {

            int u = minKey(key,mstSet);

            mstSet[u] = true;

            for (int v = 0;  v< V ; v++) {
                if(graph[u][v] !=0 && mstSet[v] ==false && graph[u][v] < key[v]){
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }
        prints(parent,graph);
    }
}

public class prims {
    public static void main(String[] args) {
        Primsww t = new Primsww();

        int graph[][] = new int[][] { { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 } };

        t.findMst(graph);
    }
}
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Vertex<T> {
    boolean isVisited;
    public T Data;
    List<Vertex<T>>  adj = new LinkedList<>();
    Vertex(T _data) {
        Data = _data;
        isVisited = false;
    }
    public List<Vertex<T>> getAdj(){
        return adj;
    }
}

class Bfs<T>  {
    Vertex<T> startVertex;
    Queue<Vertex<T>> queue = new LinkedList<>();
    Bfs(  Vertex<T>  _startVertex){
        startVertex = _startVertex;
        queue.add(startVertex);
    }

    public void Traversal (){
         while(!queue.isEmpty()){
            Vertex<T> current = queue.poll();
            if(!current.isVisited){
                current.isVisited = true;
                System.out.println(current.Data);
                List<Vertex<T>>  neg = current.getAdj();
                queue.addAll(neg);
            }
         }
    }
}


public class Graph {
    public static void main(String[] args) {
        Vertex v1 = new Vertex(0);
        Vertex v2 = new Vertex(1);
        Vertex v3 = new Vertex(5);
        Vertex v4 = new Vertex(6);
        Vertex v5 = new Vertex(3);
        Vertex v6 = new Vertex(4);
        Vertex v7 = new Vertex(2);


        v1.adj.addAll(List.of(v2,v3,v4));
        v2.adj.addAll(List.of(v5,v3,v6));
        v4.adj.addAll(List.of(v1));
        v6.adj.addAll(List.of(v7,v4));

        new Bfs<>(v1).Traversal();
    }
}
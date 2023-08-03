import java.util.*;
class VertexDfs<T> {
    T data;
    boolean isVisited;
    List<VertexDfs<T>> neighbors = new ArrayList<>();

    VertexDfs(T _data) {
        data = _data;
    }

    public List<VertexDfs<T>> getNeighbors() {
        return neighbors;
    }
}

class Dfs<T> {

    public void traverse( VertexDfs<T> startVertex) {
        Deque<VertexDfs<T>> stack = new LinkedList<>();
        stack.push(startVertex);
        while (!stack.isEmpty()) {
            VertexDfs<T> current = stack.pop();
            if (current != null && !current.isVisited) {
                current.isVisited = true;
                System.out.println(current.data);
                current.getNeighbors().forEach(stack::push);
            }
        }
    }
    public void recT(VertexDfs<T> vertex){
        vertex.isVisited= true;
        System.out.println(vertex.data);
        vertex.getNeighbors().forEach(e->{
            if(!e.isVisited){
                recT(e);
            }
        });
    }
}

public class DfsGraph {
    public static void main(String[] args) {
        VertexDfs<Integer> v1 = new VertexDfs<>(0);
        VertexDfs<Integer> v2 = new VertexDfs<>(1);
        VertexDfs<Integer> v3 = new VertexDfs<>(5);
        VertexDfs<Integer> v4 = new VertexDfs<>(6);
        VertexDfs<Integer> v5 = new VertexDfs<>(3);
        VertexDfs<Integer> v6 = new VertexDfs<>(4);
        VertexDfs<Integer> v7 = new VertexDfs<>(2);

        v1.neighbors.addAll(List.of(v2, v3, v4));
        v2.neighbors.addAll(List.of(v5, v3, v6));
        v4.neighbors.add(v1);
        v6.neighbors.addAll(List.of(v7, v4));

        Dfs<Integer> d =  new Dfs<>();
        d.recT(v1);
    }
}

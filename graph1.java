import java.util.*;
public class graph1 {
    static class edge{
        int src;
        int des;

        public edge(int s,int d){
            this.des=d;
            this.src=s;
        }
    }
    public static void creategraph(ArrayList<edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<edge>();
        }
        graph[0].add(new edge(0,2));
        graph[0].add(new edge(0,1));
        graph[1].add(new edge(1,3));
        graph[2].add(new edge(2,3));
    }
    public static boolean iscycledirected(ArrayList<edge>graph[],boolean vis[],int curr,boolean rec[]){
        vis[curr]=true;
        rec[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            edge e=graph[curr].get(i);

            if(rec[e.des]==true){
                return true;
            }
            else if(!vis[e.des]){
                if(iscycledirected(graph, vis, e.des, rec)){
                    return true;
                }
            }
        }
        rec[curr]=false;
        return false;
    }
    public static void main(String args[]){
        int V=4;
        ArrayList<edge>graph[]=new ArrayList[V];
        creategraph(graph);
        System.out.println(iscycledirected(graph, new boolean[V], 0, new boolean[V]));
    }
}

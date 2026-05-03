/*import java.util.*;
public class graph {
    static class edge{
        int src;
        int des;
        int weight;

        public edge(int s,int d,int w){
            this.src=s;
            this.des=d;
            this.weight=w;
        }
    }

    public static void createGraph(ArrayList<edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<edge>();// to create empty arrayList from the null array.
        }
        graph[0].add(new edge(0,2,2));
        graph[1].add(new edge(1,2,10));
        graph[1].add(new edge(1,3,0));
        graph[2].add(new edge(2,3,1));
        graph[2].add(new edge(2,1,10));
        graph[2].add(new edge(2,0,2));
        graph[3].add(new edge(3,2,1));
        graph[3].add(new edge(3,1,0));

    }
    public static void main(String args[]){
        int V=4;

        ArrayList<edge>graph[]=new ArrayList[V];
        createGraph(graph);
        //print 2's neighbour.
        for(int i=0;i<graph[3].size();i++){
            edge e=graph[3].get(i);
            System.out.println(e.des+","+e.weight+" ");
        }
    }

}*/

//for the bfs
/*import java.util.*;
public class graph {
    static class edge{
        int src;
        int des;
        

        public edge(int s,int d){
            this.src=s;
            this.des=d;
            
        }
    }

    public static void createGraph(ArrayList<edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<edge>();// to create empty arrayList from the null array.
        }
        graph[0].add(new edge(0,1));
        graph[0].add(new edge(0,2));

        graph[1].add(new edge(1,0));
        graph[1].add(new edge(1,3));

        graph[2].add(new edge(2,4));
        graph[2].add(new edge(2,0));

        graph[3].add(new edge(3,4));
        graph[3].add(new edge(3,1));
        graph[3].add(new edge(3,5));

        graph[4].add(new edge(4,5));
        graph[4].add(new edge(5,3));
        graph[4].add(new edge(4,2));

        graph[5].add(new edge(5,3));
        graph[5].add(new edge(5,4));
        graph[5].add(new edge(5,6));

        graph[6].add(new edge(6,5));

    }

    public static void bfs(ArrayList<edge>graph[],int V){
        Queue<Integer>q =new LinkedList<>();
        boolean visit[]=new boolean[V];
        q.add(0);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(visit[curr]==false){
                System.out.println(curr+" ");
                visit[curr]=true;

                for(int i=0;i<graph[curr].size();i++){
                    edge e=graph[curr].get(i);
                    q.add(e.des);
                    
                }
            }
        }
    }
    public static void main(String args[]){
        int V=7;

        ArrayList<edge>graph[]=new ArrayList[V];
        createGraph(graph);
        bfs(graph,V);
        
    }

}*/


//for dfs
/*import java.util.*;
public class graph {
    static class edge{
        int src;
        int des;
        

        public edge(int s,int d){
            this.src=s;
            this.des=d;
            
        }
    }

    public static void createGraph(ArrayList<edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<edge>();// to create empty arrayList from the null array.
        }
        graph[0].add(new edge(0,1));
        graph[0].add(new edge(0,2));

        graph[1].add(new edge(1,0));
        graph[1].add(new edge(1,3));

        graph[2].add(new edge(2,4));
        graph[2].add(new edge(2,0));

        graph[3].add(new edge(3,4));
        graph[3].add(new edge(3,1));
        graph[3].add(new edge(3,5));

        graph[4].add(new edge(4,5));
        graph[4].add(new edge(5,3));
        graph[4].add(new edge(4,2));

        graph[5].add(new edge(5,3));
        graph[5].add(new edge(5,4));
        graph[5].add(new edge(5,6));

        graph[6].add(new edge(6,5));

    }

    public static void dfs(ArrayList<edge>graph[],int curr,boolean visit[]){
        System.out.println(curr+" ");
        visit[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            edge e=graph[curr].get(i);
            if(visit[e.des]==false)
            dfs(graph,e.des,visit);
        }
    }
    public static void main(String args[]){
        int V=7;

        ArrayList<edge>graph[]=new ArrayList[V];
        createGraph(graph);
        boolean visit[]=new boolean[V];
        dfs(graph,0, visit);
        
    }

}*/

/*import java.util.*;
public class graph {
    static class edge{
        int src;
        int des;
        

        public edge(int s,int d){
            this.src=s;
            this.des=d;
            
        }
    }

    public static void createGraph(ArrayList<edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<edge>();// to create empty arrayList from the null array.
        }
        graph[0].add(new edge(0,1));
        graph[0].add(new edge(0,2));

        graph[1].add(new edge(1,0));
        graph[1].add(new edge(1,3));

        graph[2].add(new edge(2,4));
        graph[2].add(new edge(2,0));

        graph[3].add(new edge(3,4));
        graph[3].add(new edge(3,1));
        graph[3].add(new edge(3,5));

        graph[4].add(new edge(4,5));
        graph[4].add(new edge(5,3));
        graph[4].add(new edge(4,2));

        graph[5].add(new edge(5,3));
        graph[5].add(new edge(5,4));
        graph[5].add(new edge(5,6));

        graph[6].add(new edge(6,5));

    }

    public static void printAllpath(ArrayList<edge>graph[],boolean visit[],int curr,int target,String str){
        if(curr==target){
            System.out.println(str);
            return;
        }
        for(int i=0;i<graph[curr].size();i++){
            edge e=graph[curr].get(i);
            if(!visit[e.des]){
                visit[curr]=true;
                printAllpath(graph,visit,e.des,target,str+e.des);
                visit[curr]=false;
            }
        }
    }
    public static void main(String args[]){
        int V=7;

        ArrayList<edge>graph[]=new ArrayList[V];
        createGraph(graph);
        int src=0;
        int target=5;
        printAllpath(graph,new boolean[V], src, target,"0");
        
    }

}*/


//Assignment 1---- Rotten orange.

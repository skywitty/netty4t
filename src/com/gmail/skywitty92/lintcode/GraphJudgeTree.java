package com.gmail.skywitty92.lintcode;


/**
 * @Description TODO Judge a graph as tree?
 * @Author Gunther Meng
 * @Version 1.0
 */
public class GraphJudgeTree {

    //输入: n = 5 edges = [[0, 1], [1, 2], [2, 3], [1, 3], [1, 4]]
    //输出: false.
    //输入: n = 5 edges = [[0, 1], [0, 2], [0, 3], [1, 4]]
    //输出: true.

    public static void main(String[] args) {
        Graph graph = new GraphJudgeTree().new Graph(new int[][]{{0, 1}, {1, 2}, {2, 3}, {1, 3}, {1, 4}});
        System.out.println(isTree(graph));
    }

    // if tree, means no cycle
    public static boolean isTree(Graph graph){
        boolean isTree = true;
        int edges[][] = graph.edges;
        for (int i = 0; i < edges.length; i++) {
            int[] node = edges[i];
            if(node[0] == node[1]){
                isTree = false;
                break;
            }

        }
        return isTree;
    }

    class Graph{
        int edges[][] = null;
        public Graph(int[][] gEdges){
            this.edges = gEdges;
        }
    }

}

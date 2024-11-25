import java.util.*;

//크루스칼 알고리즘, Union-Find 자료구조 사용
class Solution {

    //Union-Find 자료구조 사용
    static class UnionFind {
        int[] parent;

        public UnionFind(int n) {
            parent = new int[n];
            for(int i = 0; i<n; i++){
                parent[i] = i;
            }
        }

        // 두 섬이 같은 집합에 속하는 지 확인
        public int find(int x){
            if(parent[x] != x){
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        // 두 섬을 하나의 집합으로 합침
        public void union(int x, int y){
            int rootX = find(x);
            int rootY = find(y);
            if (rootX != rootY) {
                parent[rootX] = rootY; // 두 집합을 합침
            }
        }

    }

    public int solution(int n, int[][] costs) {

        // 다리의 비용을 오름차순으로 정렬
        Arrays.sort(costs, (a, b) -> a[2] - b[2]);

        UnionFind uf = new UnionFind(n);
        int answer = 0;

        // 비용이 작은 다리부터 차례대로 선택
        for(int[] cost: costs){
            int island1 = cost[0];
            int island2 = cost[1];
            int bridgeCost = cost[2];

            // 두 섬이 연결되어 있지 않다면 다리 건설
            if (uf.find(island1) != uf.find(island2)){
                uf.union(island1, island2);
                answer += bridgeCost; //최소 비용에 다리 비용 추가
            }
        }

        return answer;
    }

}
class Solution {

    public int maxCount = 0;

    public int solution(int k, int[][] dungeons) {

        // visited 배열 만들기
        boolean[] visited = new boolean[dungeons.length];

        // dfs 진행
        dfs(k, visited, dungeons, 0);
        return maxCount;
    }

    public void dfs(int k, boolean[] visited, int[][] dungeons, int count){

        maxCount = Math.max(maxCount, count);

        for(int i = 0; i<dungeons.length; i++){
            if(!visited[i] && k >= dungeons[i][0]){
                visited[i] = true;
                dfs(k - dungeons[i][1], visited, dungeons, count+1);
                visited[i] = false; // 백트래킹
            }
        }
    }
}
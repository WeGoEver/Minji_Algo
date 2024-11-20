import java.util.*;

class Solution {

    public HashSet<Integer> sosu = new HashSet<>(); // 소수 저장

    public int solution(String numbers) {
        boolean[] visited = new boolean[numbers.length()];
        dfs(numbers, visited, "");
        return sosu.size();
    }

    public void dfs(String numbers, boolean[] visited, String temp){
        for(int i = 0; i<numbers.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                String newTemp = temp + numbers.charAt(i);
                int num = Integer.parseInt(newTemp);

                //소수인지 확인
                if(isPrime(num)){
                    sosu.add(num);
                }

                dfs(numbers, visited, newTemp);
                visited[i] = false; // 백트레킹
            }
        }
    }

    public boolean isPrime(int n) {
        if(n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}
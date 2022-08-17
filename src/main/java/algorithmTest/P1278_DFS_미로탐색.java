package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1278_DFS_미로탐색 {
/*
* dx, dy(상하좌우를 탐색하기 위한 define값 정의변수)
* A(데이터 저장 2차원 행렬)
*
* N(ROW),M(COLUMN)
* VISITED(방문기록 저장배열)
* A 배열 초기화하기
* FOR(N의 개수만큼 반복하기){
*    FOR(M의 개수만큼 반복하기){
*     A배열에 데이터 저장하기
*   }
* }
* BFS(0,0)실행하기
* BFS{
*   큐 자료구조에 시작노드 삽입하기(add 연산)
*   visited 배열에 현재 노드방문 기록하기
*   while(큐가 비어있을때까지){
*    큐에서 노드데이터를 가져오기(poll연산)
*    for(상하좌우 탐색){
*     if(유효한 좌표){ // 1. 배열을 빠져나가면 안됨
*       if(이동할 수 있는 칸이면서 방문하지 않은 노드){ // 2. 0이어야하고, 방문하지 않아야함.
*          visited 배열에 방문 기록하기
*          A배열에 depth를 현재 노드의 depth+1로 업데이트하기         }
*          큐에 데이터 삽입하기(add연산)
*       }
*     }
*   }
* }
*
* */
    static int[] dx = {0,1,0,-1}; // 아래,오른,위,왼쪽
    static int[] dy = {1,0,-1,0}; // 아래,오른,위,왼쪽
    static boolean[][] visited;
    static int[][] A;
    static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new int[N][M];
        visited = new boolean[N][M];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for(int j = 0; j < M; j++){
                A[i][j] = Integer.parseInt(line.substring(j,j+1));
            }
        }
        BFS(0,0);
        System.out.println(A[N-1][M-1]); //idx가 0부터 시작하니까
    }

    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {i,j});
        while(!queue.isEmpty()){
            int now[] = queue.poll();
            visited[i][j] = true;
            for(int k = 0; k < 4; k++ ){ // 상하좌우 탐색
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if(x >= 0 && y >= 0 && x < N && y < M ){ // 배열을 넘으면 안됨.
                    if(A[x][y]!=0 && !visited[x][y]){ // 0이여서 갈 수 없거나 기방문
                        // 이제 갈 수 잇는 곳.
                        visited[x][y] = true;
                        A[x][y] = A[now[0]][now[1]] +1; //핵심
                        queue.add(new int[]{x,y});
                    }
                }
            }
        }

    }


}

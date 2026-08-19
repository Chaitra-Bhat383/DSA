class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int cnt = 0;
        int rows = 0;
        Arrays.sort(reservedSeats, (a, b) -> Integer.compare(a[0], b[0]));
        HashSet<Integer> s = new HashSet<>();
        for(int i = 0; i < reservedSeats.length; ++i) {
            s.add(reservedSeats[i][1]);
            if(i == reservedSeats.length - 1 || reservedSeats[i + 1][0] != reservedSeats[i][0]){
                int no1 = 1, no2 = 1, no3 = 1;
                if(s.contains(2) || s.contains(3)) no1 = 0;
                if(s.contains(8) || s.contains(9)) no3 = 0;
                if(s.contains(4) || s.contains(5)){
                    no1 = 0;
                    no2 = 0;
                }  
                if (s.contains(6) || s.contains(7)) {
                    no2 = 0;
                    no3 = 0;
                }
                if (no1 == 1 && no3 == 1) cnt += 2;
                else if (no1 == 1 || no2 == 1 || no3 == 1) cnt++;
                s = new HashSet<>();
                rows++;
            }
        }
        cnt += (n - rows) * 2;
        return cnt;
    }
}
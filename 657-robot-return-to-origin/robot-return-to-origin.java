class Solution {
    public boolean judgeCircle(String moves) {
        int up = 0;
        int side = 0;
        for(int i = 0; i < moves.length(); ++i) {
            if(moves.charAt(i) == 'U') {
                up++;
            } else if(moves.charAt(i) == 'D') {
                up--;
            } else if(moves.charAt(i) == 'L') {
                side++;
            } else {
                side--;
            }
        }
        return up==0 && side==0;
    }
}


function solution(N) {
    var stringN = (N.toString(2))
    var count,max;
    count =0;max=0
    for(i=0;i<stringN.length;i++){
        if(stringN[i]==0) count++;
        else {
            max = count>max?count:max;
        count=0;
        }
    }
    return max;
}
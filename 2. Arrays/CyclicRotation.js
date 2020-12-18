function solution(A, K) {
    if(K===A.length||K%A.length===0||K===0) return A;
    var maxLength =  A.length;
    var maxIndex = maxLength-1;
    var routated = new Array();

    var rotations = K>maxLength?K%maxLength:K;
    A.forEach((num,i)=>{
        const newIndex=(i+rotations)>maxIndex?i+rotations-maxIndex-1:i+rotations;
        routated[newIndex]=num; 
    })
    return routated;
 }
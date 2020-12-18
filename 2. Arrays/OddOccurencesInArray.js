
function solution(A) {
    var map = new Map();
    A.forEach(num=>{
    if(map.has(num))map.delete(num);
    else map.set(num,1);
    })
    return map.entries().next().value[0];
}
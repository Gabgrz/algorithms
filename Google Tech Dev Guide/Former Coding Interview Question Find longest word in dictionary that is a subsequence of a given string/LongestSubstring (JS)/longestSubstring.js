var S = "abppplee"
var D = ["able", "ale", "apple", "bale", "kangaroo"];
var W;
var index = 0;
var maxWord = "";
var splitS = S.split('');
var maxLen = 0;
var ok = false;

D.sort(function(a, b){
  // ASC  -> a.length - b.length
  // DESC -> b.length - a.length
  return b.length - a.length;
  console.log("value: "+a);
});

console.log(D);



for(var i = 0, len = D.length; i < len; i++){

	var wordSplit = D[i].split('');
  var count = 0;

	for(var i2 = 0, len2 = wordSplit.length; i2 < len2; i2++){
    index = 0;
  	for(var i3 = index, len3 = splitS.length; i3 < len3; i3++){
    	if(wordSplit[i2] == splitS[i3]){
      	index = i3+1;
      	count++;
        break;
      }
    }
    
    if(count == wordSplit.length){
    	if(wordSplit.length > maxLen){
      	maxLen = wordSplit.length;
        maxWord = wordSplit.join('');
      }
    }
  }
}


console.log('The longest word that is a subsequence of the set of words is: '+maxWord);

/*


for(var i = 0, len = D.length; i < len; i++){

	var wordSplit = D[i].split('');
  var count = 0;

	for(var i2 = 0, len2 = wordSplit.length; i2 < len2; i2++){
    index = 0;
  	for(var i3 = index, len3 = splitS.length; i3 < len3; i3++){
    	if(wordSplit[i2] == splitS[i3]){
      	index = i3+1;
      	count++;
        break;
      }
    }
    
    if(count == wordSplit.length){
        maxWord = wordSplit.join('');
        ok = true;
    }
  }
  
  if(ok === true){
  console.log("Iteration # "+i);
  	break;
  }
  
  
  
}

console.log('The longest word that is a subsequence of the set of words is: '+maxWord);

*/
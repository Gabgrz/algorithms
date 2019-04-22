/* 
Given a non-empty string like "Code" return a string like "CCoCodCode".''
stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
*/

function stringSplosion(string){

	var originalStr = string.split('');
	var newStr = '';
  
  console.log("ORIGINAL STRING: "+originalStr);
  
  for (var i = 1; i <= originalStr.length; i++){
  	
    var str = string.split('');
    var piece = str.splice(0,i).join("")
    // console.log(piece);
    newStr += piece
  }
 // console.log(newStr)
 return newStr;

}

var result = stringSplosion('Ola')
console.log('StringSplosion!\n'+result)
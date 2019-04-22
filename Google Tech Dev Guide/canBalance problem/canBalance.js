/* 
Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
More details at the end of the file.

canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
*/

function canBalance() {

  var arr = [20, 15, 10, 8, 10, 10, 7, 8, 7, 3, 6, 2];
  var sum = 0;
  var div;
  var acc = 0;

  for (var i = 0, len = arr.length; i < len; i++) {
    sum += arr[i];
    console.log(sum);
  }

  if ((sum % 2) === 0) {
    div = sum / 2;
    for (i = 0, len = arr.length; i < len; i++) {
      acc += arr[i];
      if (acc === div) {
        return true;
      } else if (acc > div) {
        return false;
      }
    }
  } else {
    return false;
  }
}

console.log(canBalance());

/*
FACTS
1. The sum of all numbers has to be even.

EXAMPLE
20,15,10,8, 10,10,7,8,7,3,6,2

PSEUDOCODE
ACC = Accumulative sum.
1. Sum all numbers in array.
2. If even, run code.
3. Divide the SUM by two. The result is DIV
3. Run a FOR. 
	Stop the moment ACC reaches DIV. TRUE
  Or Stop the momENT ACC is greater than DIVE. Return FALSE.
  3.1 If 
*/
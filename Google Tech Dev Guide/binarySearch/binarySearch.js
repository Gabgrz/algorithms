var N = [1,21,4,88,14,52,35,28,6,8,3,99,7,9,12,24,64,31,23,56,33,77]
var bool = false;
var len = (N.length)-1;
var mid = 0;
var count = 0
var msg = ''

N.sort(function(a,b){
	return a - b
})

console.log(N);

// New, evised code

function binarySearch(array, value){
	count++;
	var mid = Math.floor(array.length/2); // Rounds down
  console.log ('Mid is: '+mid)
  
  if(value == array[mid]){
  	msg = 'Search successful! '+'Matched '+value+' with '+array[mid];
    console.log(msg)
  	return msg
  }
  else if(value < array[mid] && array.length > 1){
  	return binarySearch(array.splice(0,mid), value)
  }
  else if(value > array[mid] && array.length > 1){
  	return binarySearch(array.splice(mid),value)
  }
  else{
  	console.log(value+ " IS NOT IN THE ARRAY")
    return;
  }
}

binarySearch(N, 28);
console.log("Number of iterations: "+count);

/*
Original, flawed code

console.log(N);
console.log(len);
console.log(len/2);
console.log(parseInt(len/2));
console.log(N[parseInt(len/2)]);

console.log(N);

function findValue (value){
	
  	mid = parseInt(len/2);
    
	  while (count < 21){
    
  	if(value == N[mid]){
  		bool = true;
  		return 'Found '+N[mid]+'!';
  	}
    else if(value > N[mid]){
    	
      len = mid+1;
      mid = mid+parseInt(len/2);
      console.log('Mid pos. if higher '+mid);
      console.log('Value: '+N[mid]);
    }
    else{
    
    	len = mid;
    	mid = parseInt(len/2);
      console.log("Mid pos. if shorter: "+mid);
    
    }

    count++
  }
}

// console.log(findValue(88));
// console.log("No. of iterations: "+count);

*/

/* Copied binary search:

function binarySearch(arr, i) {
    var mid = Math.floor(arr.length / 2);
    console.log('Comparing '+arr[mid]+' with '+i);
    
    if (arr[mid] === i) {
        console.log('match', arr[mid], i);
        count++
        return arr[mid];
    } else if (arr[mid] < i && arr.length > 1) {
        console.log('mid lower', arr[mid], i);
        count++
        return binarySearch(arr.splice(mid), i);
    } else if (arr[mid] > i && arr.length > 1) {
        console.log('mid higher', arr[mid], i);
        count++
        return binarySearch(arr.splice(0, mid), i);
    } else {
        console.log('not here', i);
        count++
        return -1;
    }
    
}
var result = binarySearch(N, 77);
console.log(result);
console.log('No. of iterations: '+count);

*/
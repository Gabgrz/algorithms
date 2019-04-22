nction HashTable(size){
  this.buckets = Array(size);
  this.numBuckets = this.buckets.length;
}

let myHT = new HashTable(30);

function HashNode(key, value, next){
  
  this.key = key;
  this.value = value;
  this.next = next || null;
}

HashTable.prototype.hash = function(key){
  
  let total = 0;
  for (let i = 0; i < key.length; i++){
    total += key.charCodeAt(i);
    console.log(total);
  }
  let bucket = total % this.numBuckets;
  return bucket;
}

function a(){
  console.log(myHT);
}

a();
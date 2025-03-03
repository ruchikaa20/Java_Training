//import from math.js

//import using import
import {add, sub, PI } from './math.js';

//import using alias names
import {add as sum, sub as difference } from './math.js'

//import default export
import greet from './utility.js';

//import both types
//import greetMath, {add, PI} from './math.js';

//import everything
import * as MathUtils from './math.js';


console.log(add(12, 20));
console.log(sub(89, 20));
console.log(PI);

console.log(sum(12, 20));
console.log(difference(89, 20));

console.log(greet("Ruchika"));
//console.log(greetMath("riya"));
console.log(MathUtils.add(23, 12));


















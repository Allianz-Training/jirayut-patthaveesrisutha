let text;
text = 'Hello';
console.log(text.length);
console.log(text.charAt(0));
console.log(text[0]);
console.log(text.concat(' World'));
console.log('========== Lab 2 =========');
console.log('microsoft excel'.toUpperCase());
console.log('GOOGLE AND APPLE'.toLowerCase());
let hello = 'hello world';
console.log("H" + hello.slice(1, 6) + 'W' + hello.slice(7));
console.log('\n========== Lab 3 =========');
let hello2 = 'Hello World';
console.log(hello2);
console.log('Start With Hello ' + hello2.startsWith('Hello'));
console.log('Start With World ' + hello2.startsWith('World'));
console.log('End With Hello ' + hello2.endsWith('Hello'));
console.log('End With World ' + hello2.endsWith('World'));
console.log('Computer -> ' + 'Computer'.slice(3, 6));
console.log('Death Race -> ' + 'Death Race'.slice(0, 5));
console.log('Republican -> ' + 'Republican'.slice(2, 8));
console.log('\n========== Lab 4 =========');
console.log('1,000,000 ', 1e6);
console.log('10,000,000 ', 1e7);
console.log('43,000,000,000 ', 43e9);
console.log('0.000012 ', 1.2e-5);
console.log('0.0000001234 ', 1.234e-7);
console.log('1e10 = ', Math.pow(10, 10));
console.log('2e5 = ', 2 * Math.pow(10, 5));
console.log('122e8 = ', 122 * Math.pow(10, 8));
console.log('1e-8 = ', Math.pow(10, -8));
console.log('12e-5 = ', (1.2 * Math.pow(10, -4)).toFixed(5));
console.log('\n========== Lab 5 =========');
let nums = [100, 111, 55, 21, 99];
nums.map(e => console.log(`${e} to Octa => ${e.toString(8)}`));
nums.map(e => console.log(`${e} to Hexa => ${e.toString(16)}`));

console.log("HW1")
    array1 = [1,2,30,400]
    array2 = array1.map(item => item*2 )
    console.log(array2)

    array1 = [1,2,3,4]
    array2 = array1.map(item => `${item}` )
    console.log(array2)

    array1 = [1,"1",2,{}]
    array2 = array1.map(item => typeof item)
    console.log(array2)
    
    array1 = ["apple","banana","orange"]
    array2 = array1.map(item => item.toUpperCase())
    console.log(array2)

    array1 = [{name: "apple", age: 14},
    {name: "banana", age: 18},
    {name: "watermelon", age: 32}]
    array2 = array1.map(item => item.name)
    console.log(array2)
    
    array1 = [{name: "apple", age: 14},
    {name: "banana", age: 18},
    {name: "watermelon", age: 32}]
    array2 = array1.map(item => item.age)
    console.log(array2)

    array1 = [{name: "apple", surname: "London"},
    {name: "banana",  surname: "Bangkok"},
    {name: "watermelon",  surname: "Singapore"}]
    array2 = array1.map(item => item.name + " " + item.surname)
    console.log(array2)

    array1 = [1,3,4,5,6,7,8]
    array2 = array1.map(item => (item%2 == 1) ? "odd": "even" )
    console.log(array2)

    array1 = [1,-3,2,8,-4,5]
    array2 = array1.map(item => (item < 0) ? -item: item )
    console.log(array2)

    array1 = [100,200.25,300.84,400.3]
    array2 = array1.map(item => `${item}` )
    console.log(array2)

    array1 = [{name: "apple", birth: "2000-01-01"},
    {name: "banana",  birth: "1990-10-01"},
    {name: "watermelon",  birth: "1985-12-01"}]
    array2 = array1.map(item => {
        temp = item.birth.split("-")
        return {name: item.name,birth: item.birth,age: 2019-temp[0]}
    })
    console.log(array2)

    array1 = [{name: "apple", birth: "2000-01-01"},
    {name: "banana",  birth: "1990-10-01"},
    {name: "watermelon",  birth: "1985-12-01"}]
    array2 = array1.map(item => {
        return `"<tr> <td>${item.name}</td> <td>${new Date(item.birth).toUTCString().slice(5,16).toLowerCase()}</td> </tr>"`
    })
    console.log(array2)

    console.log("HW2")
    array1 = [1,2,30,400]
    array2 = array1.filter(item => item > 10)
    console.log(array2)

    array1 = [1,2,3,4]
    array2 = array1.filter(item => item %2 ==1)
    console.log(array2)

    array1 = [1,"1",2,{}]
    array2 = array1.filter(item => typeof item == "number")
    console.log(array2)
    
    array1 = ["apple","banana","orange","pineapple","watermelon"]
    array2 = array1.filter(item => item.length > 6)
    console.log(array2)

    array1 = [{name: "apple", age: 14},
    {name: "banana", age: 18},
    {name: "watermelon", age: 32},
    {name: "pineapple", age: 16},
    {name: "peach", age: 24}]
    array2 = array1.filter(item => item.age < 18)
    console.log(array2)
    
    array1 = [{name: "apple", age: 14},
    {name: "banana", age: 18},
    {name: "watermelon", age: 32},
    {name: "pineapple", age: 16},
    {name: "peach", age: 24}]
    array2 = array1.filter(item => item.age == 32)
    console.log(array2)

    array1 = [1,-3,2,8,-4,5]
    array2 = array1.filter(item => item > 0 )
    console.log(array2)

    array1 = [1,3,4,5,6,7,8]
    array2 = array1.filter(item => item % 3 == 0 )
    console.log(array2)

    array1 = ["peach", 1, -3, "2", {},[]]
    array2 = array1.filter(item => typeof item == "string")
    console.log(array2)

    array1 = ["APPLE", "applE", "PEACH", "PEach"]
    array2 = array1.filter(item => item == item.toUpperCase())
    console.log(array2)

    array1 = [{name: "apple", birth: "2000-01-01"},
    {name: "banana",  birth: "1990-10-01"},
    {name: "watermelon",  birth: "1985-12-30"},
    {name: "peach",  birth: "2002-10-13"}]
    array2 = array1.filter(item => item.birth.split("-")[1] == 10)
    console.log(array2)

    array1 = [{name: "apple", birth: "2000-01-01"},
    {name: "banana",  birth: "1990-10-01"},
    {name: "watermelon",  birth: "1985-12-30"},
    {name: "peach",  birth: "2002-10-13"}]
    array2 = array1.filter(item => item.birth.split("-")[0] < 2000)
    console.log(array2)
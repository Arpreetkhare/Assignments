 # Question 1: Write a shell script that prints "Hello, World!" to the terminal. 

 ```bash
 echo Hello World 
 ```
# Question 2: Declare a variable named "name" and assign the value "CDAC Mumbai" to it. Print the 
value of the variable. 

```bash
name="CDAC Mumbai"
echo $name
```
# Question 3: Write a shell script that takes a number as input from the user and prints it. 
```bash
echo Enter the number
read num
echo $num
```


# Question 4: Write a shell script that performs addition of two numbers (e.g., 5 and 3) and prints the 
result. 
```bash
num1=5
num2=3
echo $((num1+num2))
```
# Question 5: Write a shell script that takes a number as input and prints "Even" if it is even, otherwise 
prints "Odd". 
```bash
echo Enter the number
read num

if [ $((num %2)) -eq 0 ]
    then
    echo $num is even
else
    echo $num is odd
fi
```
# Question 6: Write a shell script that uses a for loop to print numbers from 1 to 5. 
```bash
for i in {1..5}
    do
    echo $i
done
```
# Question 7: Write a shell script that uses a while loop to print numbers from 1 to 5.
```bash
i=1
while (( i <= 5 ))
    do
    echo $i
    (( i++ ))
done
```

# Question 8: Write a shell script that checks if a file named "file.txt" exists in the current directory. If it does, print "File exists", otherwise, print "File does not exist". 
```bash
if [ -f "file.txt" ]
    then
    echo File exists
else
    echo File does not exist
fi
```
# Question 9: Write a shell script that uses the if statement to check if a number is greater than 10 and 
prints a message accordingly. 
```bash
echo Enter the number
read num
if (( num > 10 ))
    then
    echo The number is greater than 10
else
    echo The number is less than or equal to 10
fi
```

# Question 10: Write a shell script that uses nested for loops to print a multiplication table for numbers 
```bash
for i in {1..5}
    do
    for j in {1..5}
        do
        echo $i "*" $j = $(( i * j ))
        
    done
     echo "__________________"
done
```
from 1 to 5. The output should be formatted nicely, with each row representing a number and each column representing the multiplication result for that number.


# Question 11: Write a shell script that uses a while loop to read numbers from the user until the user enters 
a negative number. For each positive number entered, print its square. Use the break statement to exit the 
loop when a negative number is entered. 
```bash




echo Enter the number
read num
while true
    do
    if (( num < 0))
        then
        break
    else
    echo $(( num * num ))

    fi

    echo Enter the number 
    read num 



done
```
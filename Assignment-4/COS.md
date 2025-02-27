

---

## Problem 1: Linux Commands and Operations

### a) Navigate and List

```bash
mkdir LinuxAssignment
cd LinuxAssignment           
ls     #use in dir to list all content in it        

       
```

---

### b) File Management

```bash
touch file1.txt      
cat file1.txt         
echo "Hello, Linux!" > file1.txt 
```

---

### c) Directory Management

```bash
mkdir docs
```

---

### d) Copy and Move Files

```bash
cp file1.txt docs/file2.txt  # copy and move curr dir file to docs dir as file2.txt  
```

---

### e) Permissions and Ownership

```bash
chmod 744 docs/file2.txt  #allowed for read write only             
sudo chown $(whoami):$(whoami) docs/file2.txt   # whoami cmd for get the curr user
```

---

### f) Final Checklist

```bash
ls           
ls  /                          
```


docs                
file.txt       
file1.txt      
---

### g) File Searching

```bash
find . -type f -name "*.txt"          

grep "Linux" file1.txt               
```
./output.txt
./docs/file3.txt
./data.txt
./numbers.txt
./file4.txt
./input.txt
./duplicate.txt
./fruit.txt
./file.txt
./file1.txt
---

### h) System Information

```bash
date         
```

---

### i) 

```bash
ip a                 
ping -c 4 google.com           
```

---

### j) 

```bash
zip -r docs.zip docs
unzip docs.zip -d docs_new      
```

---

### k) File Editing

```bash
echo " i am good." >> file1.txt    
sed -i 's/Linux/Unix/g' file1.txt       
        #can aslo use with "nano"        
```

---

## Problem 2: File Content Manipulation

### a) Display first 10 lines of "data.txt"

```bash
head -n 10 data.txt
```
hey you are
are y there
nonano
her
ji
pass
g
t
road
jaam
---

### b) Display last 5 lines of "data.txt"

```bash
tail -n 5 data.txt
```
pass
g
t
road
jaam
---

### c) Display first 15 lines of "numbers.txt"

```bash
head -n 15 numbers.txt
```
1
2
3
4
5
6
7
8
7
6
6
6666
6
6
66666666666666666
---

### d) Display last 3 lines of "numbers.txt"

```bash
tail -n 3 numbers.txt
```
6
6
66666666666666666
---

### e) Translate lowercase to uppercase in "input.txt"

```bash
tr 'a-z' '1-Z' < input.txt > output.txt
```

---

### f) Display unique lines from "duplicate.txt"

```bash
sort duplicate.txt | uniq
```
aka
anu
anuanu
pok

---

### g) Count unique fruits in "fruit.txt"

```bash
sort fruit.txt | uniq -c
```

2 banana
2 mango
1 papaya
---

![Screenshot of Output](Output/Screenshot 2025-02-27 115251.png)



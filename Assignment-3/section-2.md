### Snippet 1: NestedLoopOutput
```java
public class NestedLoopOutput {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.print(i + " " + j + " ");
            }
            System.out.println();
        }
    }
}
```
**Dry Run:**
- i=1: j=1 -> print "1 1 "; j=2 -> print "1 2 "; newline
- i=2: j=1 -> print "2 1 "; j=2 -> print "2 2 "; newline
- i=3: j=1 -> print "3 1 "; j=2 -> print "3 2 "; newline

**Output:**
```
1 1 1 2
2 1 2 2
3 1 3 2
```

---

### Snippet 2: DecrementingLoop
```java
public class DecrementingLoop {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 5; i > 0; i--) {
            total += i;
            if (i == 3) continue;
            total -= 1;
        }
        System.out.println(total);
    }
}
```
**Dry Run:**
- i=5: total=0+5=5, total=5-1=4
- i=4: total=4+4=8, total=8-1=7
- i=3: total=7+3=10 (continue skips -1)
- i=2: total=10+2=12, total=12-1=11
- i=1: total=11+1=12, total=12-1=11

**Output:**
```
11
```

---

### Snippet 3: WhileLoopBreak
```java
public class WhileLoopBreak {
    public static void main(String[] args) {
        int count = 0;
        while (count < 5) {
            System.out.print(count + " ");
            count++;
            if (count == 3) break;
        }
        System.out.println(count);
    }
}
```
**Dry Run:**
- count=0: print "0 ", count=1
- count=1: print "1 ", count=2
- count=2: print "2 ", count=3 (breaks loop)

**Output:**
```
0 1 2 3
```

---

### Snippet 4: DoWhileLoop
```java
public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < 5);
        System.out.println(i);
    }
}
```
**Dry Run:**
- i=1,2,3,4 printed in loop
- After loop, i=5

**Output:**
```
1 2 3 4 5
```

---

### Snippet 5: ConditionalLoopOutput
```java
public class ConditionalLoopOutput {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 4; i++) {
            if (i % 2 == 0) {
                num += i;
            } else {
                num -= i;
            }
        }
        System.out.println(num);
    }
}
```
**Dry Run:**
- i=1 (odd): num=1-1=0
- i=2 (even): num=0+2=2
- i=3 (odd): num=2-3=-1
- i=4 (even): num=-1+4=3

**Output:**
```
3
```

---

### Snippet 6: IncrementDecrement
```java
public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 5;
        int y = ++x - x-- + --x + x++;
        System.out.println(y);
    }
}
```
**Dry Run:**
- ++x = 6
- 6 - 6 + 4 + 4 = 8

**Output:**
```
8
```

---

### Snippet 7: NestedIncrement
```java
public class NestedIncrement {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int result = ++a * b-- - --a + b++;
        System.out.println(result);
    }
}
```
**Dry Run:**
- ++a=11
- 11 * 5=55
- --a=10
- b--=5 (then b=4), b++=4 (then b=5)
- 55 - 10 + 4 = 49

**Output:**
```
49
```

---

### Snippet 8: LoopIncrement
```java
public class LoopIncrement {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            count += i++ - ++i;
        }
        System.out.println(count);
    }
}
```
**Dry Run:**
- i=0: count += (0 - 2) = -2 (i=3 after loop increment)
- i=3: count += (3 - 4) = -3

**Output:**
```
-3
```

---

### Final Outputs Summary:
1. Snippet 1:
```
1 1 1 2
2 1 2 2
3 1 3 2
```

2. Snippet 2:
```
11
```

3. Snippet 3:
```
0 1 2 3
```

4. Snippet 4:
```
1 2 3 4 5
```

5. Snippet 5:
```
3
```

6. Snippet 6:
```
8
```

7. Snippet 7:
```
49
```

8. Snippet 8:
```
-3
```


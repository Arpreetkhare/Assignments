
---



for (int i = 0; i >= 0; i++) {
    System.out.println(i);
}
```

**Error:** The loop continues endlessly because the termination condition (`i >= 0`) always evaluates to true.

**Correction:** Modify the loop condition to ensure it becomes false at some point:

for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

---



for (int i = 0; i <= 10; i++) {
    System.out.println(i);
}
```

**Error:** The loop runs one extra iteration because the condition allows `i` to reach 10 instead of stopping at 9.

**Correction:** Adjust the loop condition to prevent the additional iteration:

for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

---



for (int i = 10; i < 0; i--) {
    System.out.println(i);
}
```

**Error:** The loop body never executes because the initial condition `i < 0` is false at the start.

**Correction:** Change the loop condition to match the intended logic:

for (int i = 10; i >= 0; i--) {
    System.out.println(i);
}
```

---



for (int i = 0; i < 5; ) {
    System.out.println(i);
}
```

**Error:** The loop runs indefinitely because there’s no increment operation to change the loop variable `i`.

**Correction:** Include an increment statement to ensure the loop progresses:

for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

---



for (int i = 0; i < 5; i++);
{
    System.out.println("Loop executed");
}
```

**Error:** A semicolon right after the loop declaration causes it to terminate immediately without executing the block as intended.

**Correction:** Remove the semicolon after the loop header:

for (int i = 0; i < 5; i++) {
    System.out.println("Loop executed");
}
```

---



for (int i = 0; i < 3; i++) {
    for (int j = 3; j >= 0; j++) {
        System.out.println("i: " + i + ", j: " + j);
    }
}
```

**Error:** The inner loop runs more times than expected due to incorrect end condition.

**Correction:** Adjust the inner loop's condition to achieve the intended iteration pattern:

for (int i = 0; i < 3; i++) {
    for (int j = 2; j >= 0; j--) {
        System.out.println("i: " + i + ", j: " + j);
    }
}
```

---


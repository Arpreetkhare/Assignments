# Process Scheduling and Fork System Call

## 1. First-Come, First-Served (FCFS) Scheduling

### Given Processes:
| Process | Arrival Time | Burst Time |
|---------|--------------|------------|
| P1      | 0           | 5          |
| P2      | 1           | 3          |
| P3      | 2           | 6          |

### Calculations:
- **Response Time**: P1 - 0, P2 - 4, P3 - 6  
- **Completion Time (CT)**: P1 - 5, P2 - 8, P3 - 14  
- **Turnaround Time (TAT)**: P1 - 5, P2 - 7, P3 - 12  
- **Waiting Time (WT)**: P1 - 0, P2 - 4, P3 - 6  

### Average Waiting Time:
avg = 3 (round off)

---

## 2. Shortest Job First (SJF) Scheduling

### Given Processes:
| Process | Arrival Time | Burst Time |
|---------|--------------|------------|
| P1      | 0           | 3          |
| P2      | 1           | 5          |
| P3      | 2           | 1          |
| P4      | 3           | 4          |

### Calculations:
- **Completion Time (CT)**: P1 - 3, P2 - 13, P3 - 4, P4 - 8  
- **Waiting Time (WT)**: 0, 7, 1, 1  
- **Turnaround Time (TAT)**: 3, 12, 2, 5  

### Average Turnaround Time:
avg tat = 5 (round off)

---

## 3. Priority Scheduling (Lower number = Higher priority)

### Given Processes:
| Process | Arrival Time | Burst Time | Priority |
|---------|--------------|------------|----------|
| P1      | 0           | 6          | 3        |
| P2      | 1           | 4          | 1        |
| P3      | 2           | 7          | 4        |
| P4      | 3           | 2          | 2        |

### Calculations:
- **Waiting Time (WT)**: 7, 0, 11, 2  

### Average Waiting Time:
avg = 5 (round off)

---

## 4. Round Robin Scheduling (Time Quantum = 2)

### Given Processes:
| Process | Arrival Time | Burst Time |
|---------|--------------|------------|
| P1      | 0           | 4          |
| P2      | 1           | 5          |
| P3      | 2           | 2          |
| P4      | 3           | 3          |

### Average Turnaround Time:
avg tat = 9 (round off)

---

## 5. `fork()` System Call

### Given Scenario:
Consider a program that uses the `fork()` system call to create a child process. Initially, the parent process has a variable `x` with a value of `5`. After forking, both the parent and child processes increment the value of `x` by `1`.

### Answer:
ans = it will also affect the parent class the value of x will get incremented by 1.

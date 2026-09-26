
# Homework 3 — Abstract Data Types: Stacks and Queues

**Name:** Shah Rayan
**Programming Language:** Java
**IDE / Editor:** IntelliJ IDEA
**GitHub:** https://github.com/shahraiyan042-creator/HomeWork-3---ADTs_Stacks_Queues

## Part 2 — ADT Questions

### Question 1

ADT means **Abstract Data Type**.

### Question 2

An Abstract Data Type is a blueprint or interface which specifies what the data structure does.

### Question 3

**What is the difference between an ADT and its implementation?**

The ADT describes what the data structure does . While, The implementation describes how the data structure is actually built in a program.

### Question 4

**Can two programmers create different implementations of the same ADT? Explain your answer.**

Yes. Two programmers can use different ways to build the same ADT. For example, programmers can implement queue using a fixed size array(front and back pointers to insert/remove) or they might use a singly linked list(head and tail nodes).Both are implementing a queue using 2 different ways.

### Question 5

Yes. They are both Stacks because they follow the same Stack behavior, which is LIFO(Last In First Out). The array and linked list are just different ways of implementing the Stack.

## Part 8 — Stack Questions

### Question 6

**What does LIFO mean?**

LIFO means **Last In, First Out**.

### Question 7

**Why did 55 get removed before 15?**
A Stack follows LIFO ; since 55 was added last, the last item has to be removed first.

### Question 8

**If the Stack contains A, B, C, D and D was added last, which item should pop() remove first?**

pop() should remove D first since it was added last.

### Question 9

**Give one real-world or software example where a Stack could be useful. Explain your example.**

A Stack can be used for an undo button in a text editor like google docs/ word. The most recent change is pushed onto a stack and pressing undo pops/reverses the most recent action.

## Part 14 — Queue Questions

### Question 10

**What does FIFO mean?**

FIFO means **First In, First Out**.

### Question 11

**Why was 15 removed before 55?**
A Queue follows FIFO , meaning the front item is removed first. In this case, 15 was added to the queue first so the first added item is removed first.

### Question 12

**If customers enter a line in this order: Alex, Maria, John, Sarah, who should leave the Queue first?**
It follows a FIFO structure. **Alex** should leave the Queue first because Alex entered the line first.

### Question 13

**Give one real-world or software example where a Queue could be useful. Explain your answer.**

A Ticket Queue System ( eg. TicketMaster) : when people form a virtual waiting line for buying concert tickets, the system processes the ticket purchase strictly in the order people joined the queue to ensure fair access.

## Part 15 — Stack vs Queue

### Scenario 1 — Undo Feature

**Stack**
A text editor will undo the most recent action first. This follows LIFO behavior. Which is a Stack.

### Scenario 2 — Printer

**Queue**
The first document submitted will print first. This follows FIFO behavior (Queue).

### Scenario 3 — Browser Back Button

The page that should appear first is **GitHub**.

This is a **Stack** because the most recent page is returned first when using the Back button.

### Scenario 4 — Customer Service

**Queue**

The customer who arrived first will be helped first. This follows FIFO behavior (Queue).

### Scenario 5 — Plates

**Stack**

A stack of plates represents a Stack because the last plate placed on top is removed first.

## Part 16 — Predict the Output

### Question 14

**What does pop() return?**

18 

### Question 15

**What does the final peek() return?**

22

### Question 16

**What does dequeue() return?**

7

### Question 17

**What does the final peek() return?**

12

## Part 17 — Compare the ADTs

| Feature            | Stack           | Queue            |
| ------------------ | --------------- | ---------------- |
| Rule               | LIFO            | FIFO             |
| Add operation      | push()          | enqueue()        |
| Remove operation   | pop()           | dequeue()        |
| View next item     | peek()          | peek()           |
| First item removed | Last item added | First item added |

## Part 18 — Connect the ADT to the Implementation

### Question 18

**If you implement a Stack using an array, which part is the ADT?**

In a Stack, push(), pop(), peek(), and isEmpty(), are the ADT.

### Question 19

**Which part is the implementation?**
The array and the code used to make the Stack work as intended are the implementation.

### Question 20

**If you replace the array with a linked list but keep the same Stack operations, did the ADT change? Explain.**

No, the ADT did not change. The Stack still follows LIFO and has the same operations. Only the implementation  of the Stack changes.

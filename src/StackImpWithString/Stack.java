package StackImpWithString;

public class Stack {

    int lenghtOfStack ;
    int top = 0;
    int [] stack ;
    public Stack(int lenghtOfStack) {
        this.stack = new int[lenghtOfStack];
        this.lenghtOfStack = lenghtOfStack;
    }

    //int [] stack = new int[lenghtOfStack];

    public void push(int data) {

        if (top != lenghtOfStack) {
            stack[top] = data;
            top++;
        }else {
            System.out.println(" Stack is Full ");

        }


    }

    public void pop() {

        if(top <= 0 ) {
            System.out.println("Stack is Empty");
        }
        System.out.println("Item popped");
        top--;

    }


    public void peek() {
        System.out.println(stack[top-1]);


    }

    public boolean isEmpty() {
        return (top==0);

    }


}




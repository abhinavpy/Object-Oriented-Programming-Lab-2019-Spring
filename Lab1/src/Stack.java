import java.util.Scanner;

public class Stack {
    int top = -1;
    int size = 3;
    int arr[] = new int[size];

    void push(int x) {
        if(top == size-1) {
            System.out.println("stack is already full!!");
        }
        else {
            top = top + 1;
            arr[top] = x;
        }
    }

    void pop() {
        if(top == -1) {
            System.out.println("Stack is already empty!!");
        }
        else {
            System.out.println("Popped element is \n"+arr[top]);
            top--;
        }
    }

   /* int topOfStack() {
        return top;
    }*/

    public static void main(String[] args) {
        int ele;
        Scanner myVar = new Scanner(System.in);    //myVar scanner object instantiated
        System.out.println("Enter size of stack to be implemented\n");
        //int size = myVar.nextInt();
        Stack S1 = new Stack();
        System.out.println("Enter a number to perform an operation:\n1.Push\n2.Pop\n3.Top\n4.Exit");
        int option = myVar.nextInt();
        while(option != 4)
        {
            switch (option) {
                case 1: {
                    System.out.println("Enter the number to be pushed into the stack:\n");
                    ele = myVar.nextInt();
                    S1.push(ele);
                    break;
                }
                case 2: {
                    S1.pop();
                    break;
                }
                case 3: {
                    System.out.println(S1.arr[S1.top]);
                    break;
                }
                default: {
                    break;
                }
            }
            System.out.println("Enter a number to perform an operation:\n1.Push\n2.Pop\n3.Top\n4.Exit");
            option = myVar.nextInt();
        }
    }
}

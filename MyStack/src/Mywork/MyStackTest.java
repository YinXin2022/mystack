package Mywork;

/**
 * @author YinXin
 * @creat 2022--05--09
 */
class customer{
    String name;
    int age;
    public customer(){

    }

    public customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class MyStackTest {
    public static void main(String[] args) {
        MyStack<customer> customerMyStack = new MyStack<>();
        customerMyStack.push(new customer("tom",56));
        customerMyStack.push(new customer("sir",36));
        customerMyStack.push(new customer("jim",26));
        customerMyStack.push(new customer("tr",96));
        customer top = customerMyStack.top();
        System.out.println(top);
        customerMyStack.pop();
        System.out.println(customerMyStack.top());
    }
}

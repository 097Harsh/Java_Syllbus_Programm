class A{
    int a;
    void set_a(int i){
        a=i;
    }
    void show_a(){
        System.out.println("the value of a:"+a);
    }
}
class B extends A{
    int b;
    void set_b(int i){
        b=i;
    }
    void show_b(){
        System.out.println("the value of b:"+b);
    }
    void mul(){
        int c;
        c = a * b;
        System.out.println("the value of c :"+c);
    }
}
class main{
    A obj_A = new A();
    B obj_B = new B();
    obj_B.set_a(10);
    obj_B.set_b(20);
    obj_B.show_b();
    obj_B.mul();
}

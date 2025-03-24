// exp1:- x->x*2; 
// exp2:- (a,b)->a+b; 
// exp3:- x->"Even" x%2==0 else"odd";
//  exp4:- (x,y)-> x if x > y else y; 
// exp5:- n->(n*n(n+1))//2; 
// exp6:- 1st->[x**2 for x in 1st]; 
// exp7:- s->s.lower().count('a'); 
// exp8: - word->sorted(words, key=len) 
// Type help() for more information.


// Defining functional interfaces
@FunctionalInterface
interface Y {
    int check(int x);
}

@FunctionalInterface
interface X {
    int add(int a, int b);
}

@FunctionalInterface
interface X1 {
    boolean even(int c);
}

@FunctionalInterface
interface X2 {
    int greater(int d, int e);
}

@FunctionalInterface
interface X3 {
    int fun(int n);
}

@FunctionalInterface
interface X4 {
    int fun1(int m);
}

@FunctionalInterface
interface X5 {
    int fun2(String s);
}

@FunctionalInterface
interface X6 {
    String fun3(String word);
}

class interface1 {
    public static void main(String[] args) {
        Y ob = x -> x * 2;
        System.out.println("Double of 2: " + ob.check(2));
        X o1 = (a, b) -> a + b;
        System.out.println("Sum of 2 and 3: " + o1.add(2, 3));

        X1 o2 = c -> c % 2 == 0;
        System.out.println("Is 3 even? " + o2.even(3));
        X2 o3 = (d, e) -> (d > e) ? d : e;
        System.out.println("Greater number between 3 and 4: " + o3.greater(3, 4));
        X4 o4 = n -> (n * n * (n + 1)) / 2;
        System.out.println("Computed value for n=2: " + o4.fun1(2));
    }
}

package couple;

public class fb {
    public static int f(int n){
        if(n<=2)
            return 1;
        else
            return f(n-1)+f(n-2);
    }
}

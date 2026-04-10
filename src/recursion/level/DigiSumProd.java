public class DigiSumProd {
    public static void main(String[] args) {
        int ans = prod(505);
        int sum = sum(6789);
        System.out.println(ans);
        System.out.println(sum);
    }

    static int prod(int n){
        if(n%10 == n){   //onedigit is zero
            return n;
        }
        return (n%10) * prod(n/10);
    }

    static int sum(int n){
        if(n == 0){   //onedigit is zero
            return 0;
        }
        return (n%10) + sum(n/10);
    }
}

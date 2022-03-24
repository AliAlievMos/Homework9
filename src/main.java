public class main {
    public static void main(String[]args){
        Lambda lambda = new Lambda() {
            @Override
            public int lambda(int x, int y) {
                return x + y;
            }
        };
        Lambda lambda1 = new Lambda() {
            @Override
            public int lambda(int x, int y) {
                return x * y;
            }
        };
        int [] mas = new int[]{1,2,3,4,5};
        int [] mas1 = new int[]{1,2,3,4,500};

        reduce.reduce(lambda, mas);
        reduce.reduce(lambda1, mas1);


    }
}

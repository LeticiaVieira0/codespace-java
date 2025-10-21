public class App {
    public static void main(String[] args) throws Exception {

        //exercicio 1
        double nums[] = {1.0, 2.0, 1.5, 6, 9, 7, 4.5, 3.3, 10};
        double bigger = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] > bigger){
                bigger = nums[i];
            }
        }
        System.out.println("o maior numero da lista é "+bigger);


        //exercicio 2

        //num of the elements you want to get
        int n = 10;

        int fibonnaci[] = new int[n];
        fibonnaci[0] = 1;
        fibonnaci[1] = 1;

        for(int j=2; j<n; j++){
            fibonnaci[j]= fibonnaci[j-1] + fibonnaci[j-2];
        }
        System.out.println("n de fibbonacci escolhido"+fibonnaci[n-1]);
        //fibonnaci[2] = fibonnaci[1] + fibonnaci[0];

        //exercicio 3
    }
}

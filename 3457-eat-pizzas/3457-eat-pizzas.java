class Solution {
    public long maxWeight(int[] pizzas) {
        Arrays.sort(pizzas);
        int n =  pizzas.length;
        int days = n/4;
        long ans  = 0;

        int odd_days = (days+1)/2;
        int even_days = days-odd_days;

        for(int i = n-odd_days;i<n;i++){
            ans+=pizzas[i];
        }
        for(int i = n-odd_days-2;even_days>0;even_days--){
            ans +=pizzas[i];
            i-=2;
        }
        return ans;
        
    }
}
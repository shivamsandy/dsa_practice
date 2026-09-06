class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       

        int totalgas  =   0 ;
        int totalcost  =   0 ;
         

        for(int i  =0 ;i<gas.length;i++){
            totalcost +=  cost[i];
            totalgas  +=  gas[i];
        }
        if(totalgas<totalcost){
            System.out.println("journey  not possiblle");
            return -1;
        }

        
        int current_gas  = 0;  
        int strt_index  =  0;

        for(int i =0 ;i<gas.length;i++){
            current_gas +=gas[i] - cost[i];

            if(current_gas<0){
                current_gas =0;
                strt_index  = i+1;
            }

        }
        return strt_index;
        
    }
}
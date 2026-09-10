class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> a=new ArrayList<>();
        HashSet<Integer> h=new HashSet<>();
        for(int num:nums){
            h.add(num);

        }
        for(int i=0;i<nums.length;i++){
            if(!h.contains(i+1)){
                a.add(i+1);
            }
        }
        return a;


         
        }
    }

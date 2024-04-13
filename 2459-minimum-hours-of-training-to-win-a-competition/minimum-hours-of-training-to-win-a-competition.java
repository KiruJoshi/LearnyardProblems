class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {

     int ans=0, total_energy=0;
     for(int ele:energy){
         total_energy+=ele;
     }
     int ans_exp=initialExperience;
     int ans_energy=(total_energy+1)-initialEnergy; //6
     if(total_energy<initialEnergy){
        ans_energy=0;
     }
     int requiredHours = ans_energy;
     for(int i=0;i<experience.length;i++){
         if(initialExperience > experience[i])
                initialExperience += experience[i];
            else {
                int reqquired = experience[i] - initialExperience +1;
                requiredHours += reqquired;
                initialExperience += experience[i] + reqquired ;
            }
        }
        return requiredHours;
    }
}   
/*
11-5=8
16<1
energy=1+4+3+2=10
11-5=6(total energy -initial energy)//6+2=8
3<2//11-1=10
3+2=5
5<6//10-4=6
7+6=13
13<3
13+3=16//6-3=3
16<1
16+1=17//3-1=2
*/



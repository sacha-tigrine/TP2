package fr.umontpellier.iut.exercice1;

public class FizzBuzz {

    public String getValue(int i) {
            if(i%3==0){
                if(i%5==0){
                    return "FizzBuzz";
                }
                return "Fizz";
            }else if(i%5==0){
                return "Buzz";
            }else {
                return ""+i;
            }
    }

    public String[] computeList(int n) {
        String[] chaine =new String[n];
        for(int i=0;i<n;i++){
            chaine[i] = getValue(i+1);
        }
        return chaine;
    }
}

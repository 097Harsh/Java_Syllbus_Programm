/*
 * Write a Java application which takes several command line arguments, which are 
supposed to be names of students and prints output as given below:
(Suppose we enter 3 names then output should be as 
follows).. Number of arguments = 3
1.: First Student Name is = Arun
2.: Second Student Name is = Hiren
3.Third Student Name is = Hitesh
 */
public class q10 {
    public static void main(String args[]){
        int num = args.length;

        System.out.println("Number of argunment:"+num);

        for(int i=0;i<num;i++)
        {
            System.out.println((i+1)+":"+"Studebt name is="+args[i]);
        }
    }
}

/*Output : 
 * C:\Users\91971\Documents\mca\sem - 1\java>java q10 harsh het khebdi
Number of argunment:3
1:Studebt name is=harsh
2:Studebt name is=het
3:Studebt name is=khebdi
 */

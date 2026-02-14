class Studentt{
    public int Rollno, m1,m2,m3,t,p;
            String name;

    public void inputt(int r, String n, int a, int b, int c) {
        Rollno = r;
        name = n;
        m1 = a;
        m2 = b;
        m3 = c;
    }

    public void result(){
        t=m1+m2+m3;
        p=t/3;
        System.out.println("Rollno of Student:-"+Rollno+ "\tName of Student:-"+name+"\n First Subject Marks :-"+m1+ "\t Second Subject Marks:-"+m2+"\t Third Subject Marks:-"+m3+"\n Total Marks :-"+t+"\t Percentage:-"+p);

    }
}
public class array_of_object_eg {
    public static void main(String[] args){
         Studentt s[] = new Studentt[2];

        s[0] = new Studentt();
        s[1] = new Studentt();

        
        s[0].inputt(19, "Vinod", 50, 69, 86);
        s[1].inputt(20, "Rahul", 60, 70, 80);

        s[0].result();
        s[1].result();
    }
}

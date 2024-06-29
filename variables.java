package basics;

public class variables {
    String favfood = "shawarma";  //global
    static int csecount = 180; //static

    public void sam() //local
    {
        int cosmo = 65;
        String name = "Gokul";
        System.out.println(cosmo);
        System.out.println(name);
        System.out.println(favfood);
        System.out.println(csecount);
    }

    public static void main(String[] args) {
        System.out.println("Annamalai");
        //Local variable:
        //Object Creation
        //classname objectname=new classname();
        //Calling method
        //objectname.methodname()
        variables va = new variables();
        va.sam();
        System.out.println(csecount);
        String favplace = "Manali"; //Instance
        System.out.println(favplace);
    }
}

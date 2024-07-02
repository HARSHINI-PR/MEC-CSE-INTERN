package basics;
class students {
    public int stdid;
    public String stdname;
    public String collegename;
    public String place;

    public int getstdid() {
        return stdid;
    }

    public void setstdid(int stdid) {
        stdid = stdid;
    }

    public String getstdname() {
        return stdname;
    }

    public void setstdname(String ename) {
        stdname = ename;
    }

    public String getcollegename() {
        return collegename;
    }

    public void setcollegename(String collegename) {
        this.collegename = collegename;
    }

    public String getLocation() {
        return place;
    }

    public void setplace(String place) {
        place = place;
    }
}
public class encapsulation{
    public static void main(String[] args) {
        students ss= new students();
        ss.setstdid(084);
        ss.setstdname("Harshini");
        ss.setcollegename("MEC");
        ss.setplace("Rasipuram");


        students ss1= new students();
        ss1.setstdid(117);
        ss1.setstdname("Nandhana");
        ss1.setcollegename("KSR");
        ss1.setplace("Harur");

        System.out.println(ss.getstdid()+"\n"+ss.getstdname()+"\n"+ss.getcollegename()+"\n"+ss.getplace());
        System.out.println(ss1.getstdid()+"\n"+ss1.getstdname()+"\n"+ss1.getcollegename()+"\n"+ss1.getplace());


    }
}

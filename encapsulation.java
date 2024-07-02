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
        ss.setstdid(501);
        ss.setstdname("Gowthami Priya");
        ss.setcollegename("TCS");
        ss.setplace("Chennai");


        students ss1= new students();
        ss1.setstdid(502);
        ss1.setstdname("Annamalai");
        ss1.setcollegename("ZEALOUS");
        ss1.setplace("Salem");

        System.out.println(ss.getstdid()+"\n"+ss.getstdname()+"\n"+ss.getcollegename()+"\n"+ss.getLocation());
        System.out.println(ss1.getstdid()+"\n"+ss1.getstdname()+"\n"+ss1.getcollegename()+"\n"+ss1.getLocation());


    }
}

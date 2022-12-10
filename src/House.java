
public class House {

     private int floorsNumber;
     private String address;
     private String[] residentsName;

    public House(){
        System.out.println("This is a house");
    }

    public int getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getResidentsName() {
        return residentsName;
    }

    public void setResidentsName(String[] residentsName) {
        this.residentsName = residentsName;
    }
}

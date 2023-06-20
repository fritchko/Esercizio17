//Creo la classe House
public class House{

    //Creo le variabili floorsNumber, address e residentsNames
    private int floorsNumber;
    private String address;
    private String[] residentsNames;

    // Getter e setter per floorsNumber
    public int getFloorsNumber(){
        return floorsNumber;
    }

    public void setFloorsNumber(int floorsNumber){
        this.floorsNumber = floorsNumber;
    }

    // Getter e setter per address

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    //Getter e setter per residentsNames
    public String[] getResidentsName() {
        return residentsNames;
    }

    public void setResidentsNames(String names) {
        this.residentsNames = names.split(",");
    }
}
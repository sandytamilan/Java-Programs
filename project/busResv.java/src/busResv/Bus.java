package busResv;

class Bus { 

    private int busNo;
    private boolean ac;
    private int capacity;

Bus(int no, boolean ac, int cap){
    this.busNo = no;
    this.ac = ac;
    this.capacity = cap;
}
public int getBusNo() {
    return busNo;
}
public int getcapacity(){
    return capacity;
}
public boolean isAc(){
    return ac;
}
public void setAc(boolean val){
    ac = val;
}
public void setCapacity(int cap){
    capacity = cap;
}
public void setBusNo(int no){
    busNo = no;
}
public void displayBusInfo(){
    System.out.println("Bus No: "+ busNo + " Ac: " + ac + " Total Capacity: "+ capacity);
}

}





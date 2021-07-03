package Staff;

public class Staff {
    String staffID, staffName,StaffAddress;
    int staffAge;
    String staffPhone;


    public Staff(String staffID, String staffName, String staffAddress, int staffAge, String staffPhone) {
        this.staffID = staffID;
        this.staffName = staffName;
        StaffAddress = staffAddress;
        this.staffAge = staffAge;
        this.staffPhone = staffPhone;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffID='" + staffID + '\'' +
                ", staffName='" + staffName + '\'' +
                ", StaffAddress='" + StaffAddress + '\'' +
                ", staffAge=" + staffAge +
                ", staffPhone='" + staffPhone + '\'' +
                '}';
    }
}

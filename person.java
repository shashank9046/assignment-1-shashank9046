public class person {
    private String firstname;
    private String Secondname;
    private String contactno;

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    private String address;
    private String mailid;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return Secondname;
    }

    public void setSecondname(String secondname) {
        Secondname = secondname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "firstname = " + firstname + "\n" + "Secondname = " + Secondname + "\n" + "contactno = " + contactno + "\n"
                + "address = " + address + "\n" + "mailid = " + mailid+"\n"+"\n";
    }

    public String getMailid() {
        return mailid;
    }

    public void setMailid(String mailid) {
        this.mailid = mailid;
    }
}

public class People {
    private String fname;
    private String lname;
    private String email;


    @Override
    public String toString() {
        return "{" +
            " fname='" + fname + "'" +
            ", lname='" + lname + "'" +
            ", email='" + email + "'" +
            "}";
    }

    public People() {
    }


    public People(String fname, String lname, String email) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
    }

    public String getFname() {
        return this.fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return this.lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}

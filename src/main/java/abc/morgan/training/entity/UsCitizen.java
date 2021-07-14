package abc.morgan.training.entity;

public class UsCitizen {
    private String name;
    private String ssn;

    public UsCitizen(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public boolean equals(Object that){
        String thisSsn = this.ssn;
        String thatSsn =((UsCitizen)that).ssn;
        return thisSsn.equals(thatSsn);
    }


    @Override
    public String toString(){
        return "I am "+ name +", my SSN is "+ ssn;
    }
}

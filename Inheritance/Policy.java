package Practice.singleInheritance;

import java.time.LocalDate;

public class Policy {

    private Long policy_Number;

    private String policyName;

    private LocalDate startDate;
    private LocalDate endDate;

    
    public Long getPolicy_Number() {
        return policy_Number;
    }


    public void setPolicy_Number(Long policy_Number) {
        this.policy_Number = policy_Number;
    }


    public String getPolicyName() {
        return policyName;
    }


    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }


    public LocalDate getStartDate() {
        return startDate;
    }


    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }


    public LocalDate getEndDate() {
        return endDate;
    }


    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Policy()
    {
        
    }


    public Policy(Long policy_Number, String policyName, LocalDate startDate, LocalDate endDate) {
        this.policy_Number = policy_Number;
        this.policyName = policyName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public boolean isActive()
    {
        if(endDate.isAfter(startDate))
        {
            return true;
        }
        else
            return false;
    }
 
}

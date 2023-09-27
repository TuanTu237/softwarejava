import java.util.Calendar;

public class Insurance{
    private String insuranceID;
    private String purchaser;
    private String beneficiary;
    private String insuranceType;
    private Long contractValue;
    private Calendar startContract;
    private Calendar endContract;
    private Calendar purchaseDay;


    public String getInsuranceID() {
        return insuranceID;
    }
    public void setInsuranceID(){
        this.insuranceID = insuranceID;
    }
    public String getPurchaser(){
        return purchaser;
    }
    public void setPurchaser(){
        this.purchaser = purchaser;
    }
    public String getBeneficiary(){
        return beneficiary;
    }
    public void serBeneficiary(){
        this.beneficiary=beneficiary;
    }
    public String getInsuranceType(){
        return insuranceType;
    }
    public void setInsuranceType(){
        this.insuranceType= insuranceType;
    }
    public Long getContractValue(){
        return contractValue;
    }
    public void setContractValue(){
        this.contractValue=contractValue;
    }
    public Calendar getStartContract(){
        return startContract;
    }
    public void setStartContract(){
        this.startContract= startContract;
    }
    public Calendar getEndContract(){
        return endContract;
    }
    public void setEndContract(){
        this.endContract= endContract;
    }
    public Calendar getPurchaseDay(){
        return purchaseDay;
    }
    public void setPurchaseDay(){
        this.purchaseDay=purchaseDay;
    }
    
    



}
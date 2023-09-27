import java.util.Calendar;

public class Insurance{
    private int insuranceID;
    private String purchaser;
    private String beneficiary;
    private String insuranceType;
    private Long contractValue;
    private Calendar startContract;
    private Calendar endContract;
    private Calendar purchaseDay;


    public int getInsuranceID() {
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
    //constructor
    public Insurance( int insuranceID, String purchaser, String beneficiary, String insuranceType, Long contractValue, Calendar startContract, Calendar endContract, Calendar purchaseDay){
        this.insuranceID = insuranceID;
        this.purchaser = purchaser;
        this.beneficiary= beneficiary;
        this.insuranceType = insuranceType;
        this.contractValue = contractValue;
        this.startContract = startContract;
        this.endContract = endContract;
        this.purchaseDay = Calendar.getInstance();

    }
    // cap nhat nguoi mua
    public Boolean updatePurchaser(String newPurchaser){
        updatePurchaser(newPurchaser);
        return true;
    }
    // cap nhat nguoi huong loi
    public Boolean updateBeneficiary(String newBeneficiare){
        updateBeneficiary(newBeneficiary);
        return true;
    }
    // cap nhat gia tri hop dong
    public Boolean updateContractValue(Long newContractValue){
        updateContractValue(newContractValue);
        return true;
    }
    // cap nhat ngay bat dau bao hiem
    public Boolean updateStartContract(Calendar newStartContract){
        updateStartContract(newStartContract);
        return true;
    }
    //


}
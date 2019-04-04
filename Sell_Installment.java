public class Sell_Installment extends Invoice{
        private InvoiceType INVOICE_TYPE = InvoiceType.Sell;
        private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
        private int installmentPeriod;
        private int installmentPrice;
        private static Customer customer;
        
        
        public Sell_Installment(int id, Item item, int totalItem, int installmentPeriod, Customer customer){
            super(id, item,totalItem);
            this.installmentPeriod = installmentPeriod;
            this.customer = customer;
        }
        
        public InvoiceStatus getInvoiceStatus()
        {
            return INVOICE_STATUS;
        }
        
        public InvoiceType getInvoiceType()
        {
            return INVOICE_TYPE;
        }
        
        public int getInstallmentPeriod()
        {
            return installmentPeriod;
        }
        
        public int getInstallmentPrice()
        {
            return installmentPrice;
        }
        
        public Customer getCustomer()
        {
            return customer;
        }
        
        public void setInstallmentPrice()
        {
            double installmentPrice = (totalPrice/installmentPeriod) * 1.02;
            this.installmentPrice = (int) installmentPrice;
        }
        
        public void setTotalPrice(int totalPrice)
        {
            this.totalPrice = installmentPrice * installmentPeriod;
        }
        
        public void setCustomer(Customer customer)
        {
            this.customer = customer;
        }
        
        public void setInvoiceStatus(InvoiceStatus status)
    {
    }
             public String toString() 
    { 
       return ""; 
    }
 }
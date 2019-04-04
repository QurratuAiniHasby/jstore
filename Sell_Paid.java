public class Sell_Paid extends Invoice{
        private InvoiceType INVOICE_TYPE = InvoiceType.Sell;
        private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
        private static Customer customer;
        
        public Sell_Paid(int id, Item item, int totalItem, Customer customer){
            super(id, item, totalItem);
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
        
        public Customer getCustomer()
        {
            return customer;
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
public class Buy_Paid extends Invoice{
        public InvoiceType INVOICE_TYPE = InvoiceType.Buy;
        public InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
        
        public Buy_Paid(int id, Item item, int totalItem){
            super(id, item, totalItem);
        }
        
        public InvoiceStatus getInvoiceStatus()
        {
            return INVOICE_STATUS;
        }
        
        public InvoiceType getInvoiceType()
        {
            return INVOICE_TYPE;
        }
        
        
        
         public String toString() 
    { 
       return ""; 
    }
    }
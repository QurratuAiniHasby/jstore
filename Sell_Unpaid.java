import java.util.*; 
 public class Sell_Unpaid extends Invoice{
       private InvoiceType INVOICE_TYPE = InvoiceType.Sell;
        private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Unpaid;
        private Calendar dueDate;
        private static Customer customer;
        
        public Sell_Unpaid(int id, Item item, int totalItem, Customer customer){
            super(id, item, totalItem);
            this.customer = customer;
            
            this.dueDate = new GregorianCalendar();
            dueDate.add((GregorianCalendar.DATE), 1);
            
        }
        
        public InvoiceStatus getInvoiceStatus()
        {
            return INVOICE_STATUS;
        }
        
        public InvoiceType getInvoiceType()
        {
            return INVOICE_TYPE;
        }
        
        public Calendar getDueDate()
        {
            return dueDate;
        }
        
        public Customer getCustomer()
        {
            return customer;
        }
        
        public void setCustomer(Customer customer)
        {
            this.customer = customer;
        }
        
        public void setDueDate(Calendar dueDate)
        {
            this.dueDate = dueDate;
        }
        
        public void setInvoiceStatus(InvoiceStatus status)
    {
    }
    
         public String toString() { 
             return ""; 
            }
        
    }
        
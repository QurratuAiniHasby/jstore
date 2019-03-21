public class Sell_Unpaid extends Invoice{
        private InvoiceType INVOICE_TYPE = InvoiceType.Sell;
        private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Unpaid;
        private String dueDate;
        
        public Sell_Unpaid(int id, Item item, String date, int totalItem, int totalPrice, String dueDate){
            super(id, item, date, totalPrice, totalItem);
            this.dueDate = dueDate;
        }
        
        public InvoiceStatus getInvoiceStatus()
        {
            return INVOICE_STATUS;
        }
        
        public InvoiceType getInvoiceType()
        {
            return INVOICE_TYPE;
        }
        
        public String getDueDate()
        {
            return dueDate;
        }

        public void printData()
        {
        System.out.println("=====INVOICE===== ");
        System.out.println("ID " + super.getId());
        System.out.println("Item " + super.getItem());
        System.out.println("Date " + super.getDate());
        System.out.println("Total Item " + super.getTotalItem());
        System.out.println("Total Price " + super.getTotalPrice());
        System.out.println("Status: " + getInvoiceStatus());
        System.out.println("Invoice Type: " + getInvoiceType());
        System.out.println("DueDate " + dueDate);
        }
        
    }
        
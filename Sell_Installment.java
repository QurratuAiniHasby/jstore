public class Sell_Installment extends Invoice{
        private InvoiceType INVOICE_TYPE = InvoiceType.Sell;
        private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
        private int installmentPeriod;
        private int installmentPrice;
        
        public Sell_Installment(int id, Item item, String date, int totalItem, int totalPrice, int installmentPeriod, int installmentPrice){
            super(id, item, date, totalItem, totalPrice);
            this.installmentPeriod = installmentPeriod;
            this.installmentPrice = installmentPrice;
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
        
        public void setInstallmentPrice()
        {
            double installmentPrice = (totalPrice/installmentPeriod) * 1.02;
            this.installmentPrice = (int) installmentPrice;
        }
        
        public void setTotalPrice(int totalPrice)
        {
            this.totalPrice = installmentPrice * installmentPeriod;
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
        System.out.println("installmentPeriod : " + installmentPeriod);
        System.out.println("installmentPrice : " + installmentPrice);
        }
    }
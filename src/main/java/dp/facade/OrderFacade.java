package dp.facade;

public class OrderFacade {
	
	
	public void placeOrder ( ) {
		
		Product product = new Product();
		product.getProductDetails();
		
		Payment Payment = new Payment();
		Payment.makePayment();
		
		Invoice invoice = new Invoice();
	    invoice.sendInvoice();
		
	    
	}

}

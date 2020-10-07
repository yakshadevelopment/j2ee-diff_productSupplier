package diff_productSupplier;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String value=request.getParameter("hidden");
		switch(value)
		{
		case "1":productPurchase(request,response);break;
		case "2":productIssue(request,response);break;
		}
	
	}
	
	public void productPurchase(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String supplierName=request.getParameter("supplierPerson").toUpperCase();
		String productName=request.getParameter("productName").toUpperCase();
		String purchasePrice=request.getParameter("purchasePrice");
		String salesPrice=request.getParameter("salesPrice");
		double stock=Double.parseDouble(request.getParameter("purchaseQuantity"));
		if(ProductData.getAllProducts().containsKey(productName))
		{
			Product product=ProductData.getAllProducts().get(productName);
			stock=stock+Double.parseDouble(product.getStock());
			product.setPurchasePrice(purchasePrice);
			product.setSalesPrice(salesPrice);
			product.setStock(""+stock);
			ProductData.updateProduct(product);
		}
		else
		{
			Product product=new Product(productName, purchasePrice, salesPrice, ""+stock);
			ProductData.addProduct(product);	
		}
		SupplierData.getSuppliers().add(supplierName);
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.print("<center><h4><font color='lightgreen'><i>Item added and Stock updated</i></font></h4></center>");
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.include(request,response);
	}
	public void productIssue(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
		String customerName=request.getParameter("customerName");
		double totalAmount=0.0;
		List<String> itemList=new ArrayList<>();
		 for(int i=1;i<=5;i++)
		    {
		    	String productName="productName"+i;
		    	String quantity="quantity"+i;
		    	String pname=request.getParameter(productName).toUpperCase();
		    	double qty=Double.parseDouble(request.getParameter(quantity));
		    	if(!pname.equals("--"))
		    	{
		    		Product product=ProductData.getProduct(pname);
		    		double amount=qty*Double.parseDouble(product.getSalesPrice());
		    		totalAmount=totalAmount+amount;
		    		String bill=product.getProductName()+","+product.getSalesPrice()+","+qty+","+amount;
		    		itemList.add(bill);
		    		double remainStock=Double.parseDouble(product.getStock())-qty;
		    		product.setStock(""+remainStock);
		    		ProductData.updateProduct(product);
		    	}
		    	else if(pname.equals("--"))
		    	break;
		    }// end of loop
		 request.setAttribute("totalAmount",totalAmount);
		 request.setAttribute("customerName",customerName);
		 request.setAttribute("itemList",itemList);
		 RequestDispatcher rd=request.getRequestDispatcher("IssueBill.jsp");
			rd.forward(request,response);
		}catch(Exception e)
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.print("<center><h4><font color='red'><i>Product Not Available</i></font></h4></center>");
			RequestDispatcher rd=request.getRequestDispatcher("IssueProduct.jsp");
			rd.include(request,response);
		}
	}
}

package diff_productSupplier;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontServlet
 */
public class FrontServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String value=request.getParameter("val");
		switch (value)
		{
		case "1":showAllProducts(request,response);break;
		case "2": showPurchaseForm(request,response);break;
		}
	}
	
	public void showAllProducts(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	 Set<String> set=ProductData.getAllProducts().keySet();
	 List<Product> productList=new ArrayList<>();
	 for(String str:set)
	 {
		 productList.add(ProductData.getAllProducts().get(str));
	 }
	request.setAttribute("productList",productList);
	RequestDispatcher rd=request.getRequestDispatcher("ShowProduct.jsp");
	rd.forward(request,response);
	}
	
	
	public void showPurchaseForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	List<String> supplierList=new ArrayList<>(SupplierData.getSuppliers());
	request.setAttribute("supplierList",supplierList);
	RequestDispatcher rd=request.getRequestDispatcher("PurchaseProduct.jsp");
	rd.forward(request,response);
	}

}

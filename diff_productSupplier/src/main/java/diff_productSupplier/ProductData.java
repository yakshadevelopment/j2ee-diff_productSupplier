package diff_productSupplier;
import java.util.HashMap;
import java.util.Map;

public class ProductData {
	static Map<String,Product> productMap=new HashMap<String,Product>();
	static
	{
		productMap.put("WHEAT",new Product("WHEAT","15","25","200"));
		productMap.put("RICE",new Product("RICE","25","35","150"));
		productMap.put("SUGAR",new Product("SUGAR","35","45","175"));
		productMap.put("SALT",new Product("SALT","5","10","250"));
		productMap.put("MUSTARD",new Product("MUSTARD","45.00","60.00","100"));
		productMap.put("BUTTER",new Product("BUTTER","45.00","55.00","120"));
		productMap.put("CHEESE",new Product("CHEESE","60.00","75.00","50"));
	}
	public static Map<String,Product> getAllProducts()
	{
		return productMap;
	}
	public static void addProduct(Product product)
	{
		productMap.put(product.getProductName(),product);
	}
	public static void updateProduct(Product product)
	{
		productMap.remove(product.getProductName());
		productMap.put(product.getProductName(),product);
	}
	public static Product getProduct(String productName)
	{
		return productMap.get(productName);
				
	}

}

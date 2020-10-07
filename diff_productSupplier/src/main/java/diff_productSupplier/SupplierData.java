package diff_productSupplier;
import java.util.HashSet;
import java.util.Set;

public class SupplierData {
	static Set<String> supplierSet=new HashSet<>();
	static
	{
		supplierSet.add("PQR & COMPANY");
		supplierSet.add("KLM & COMPANY");
		supplierSet.add("ABC & COMPANY");
		supplierSet.add("EFG & COMPANY");
		supplierSet.add("RST & COMPANY");
	}
	public static Set getSuppliers()
	{
		return supplierSet;
	}
	public static void addSupplier(String supplier)
	{
        supplierSet.add(supplier);
	}
}

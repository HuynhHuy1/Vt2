// import java.util.ArrayList;
// import java.util.List;

// import controller.AbstractManager;
// import model.Bill;
// import model.Product;

// public class SalesManager extends AbstractManager<Product>{
//     private List<Product> cart;

//     public SalesManager() {
//         this.cart = new ArrayList<>();
//     }

//     public void addToCart(Product product, int quantity) {
//         for (int i = 0; i < quantity; i++) {
//             cart.add(product);
//         }
//     }
//     public  void createAndSaveBill() {
//         if (!cart.isEmpty()) {
//             double totalAmount = 0;
//             for (Product product:
//                  cart) {
//                 totalAmount += product.getPrice();
//             }

//             Bill bill = new Bill(cart, totalAmount);
//         }
//     }

//     @Override
//     public void exportToExcel() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'exportToExcel'");
//     }

//     @Override
//     public void importFromExcel() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'importFromExcel'");
//     }
// }

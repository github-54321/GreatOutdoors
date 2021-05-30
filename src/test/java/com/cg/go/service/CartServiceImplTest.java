package com.cg.go.service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import com.cg.go.GreatOutdoorApplication;
import com.cg.go.controller.CartController;
import com.cg.go.entity.CartItemEntity;
import com.cg.go.entity.ProductEntity;
import com.cg.go.entity.Userdata;
import com.cg.go.exception.CartException;
import com.cg.go.pojo.Cart;

//useful when we need to bootstrap the entire container ,can be used as an alternative to the standard spring-test
@SpringBootTest
public class CartServiceImplTest {

	//allow us to inject mocked dependencies in the annotated class mocked object
	@InjectMocks
	CartController control;

	//It is used to mock the objects that helps in minimizing the repetitive mock objects
	@Mock
	CartServiceImpl service;
	
	@Test
	void contextLoads() {
	}
	

	//tells JUnit that the public void method to which it is attached can be run as a test case
	@Test
	public void addCartTest() throws CartException {
		ProductEntity product=new ProductEntity();
		product.setProductId("300");
		Map<ProductEntity,Integer> productList=new HashMap<ProductEntity,Integer>();
		productList.put(product, 5);
		Userdata user=new Userdata(5000, "Rakesh", "Rakesh123", "retailer");
		Cart cart=new Cart();
		cart.setUserId(5000);
		cart.setProductId("300");
		cart.setProductQuantity(10);
		CartItemEntity cartItem=new CartItemEntity();
		cartItem.setUserId(user);
		cartItem.setCartId(200);
		List<CartItemEntity> cartList=new ArrayList<CartItemEntity>();
		cartList.add(cartItem);
		Mockito.when(service.addCartItem(cart)).thenReturn(cartList);
	}
	
	
	@Test
	public void getByUserIdTest() throws CartException {
		CartItemEntity cartItem=new CartItemEntity();
		Mockito.when(service.findCartlist(200)).thenReturn(cartItem);
	}	
	
	
	@Test
	public void updateCartItemTest() throws CartException {
		ProductEntity product=new ProductEntity();
		product.setProductId("300");
		//Map<ProductEntity,Integer> productList=new HashMap<ProductEntity,Integer>();
		//productList.put(product, 5);
		Userdata user=new Userdata(5000, "Rakesh", "Rakesh123", "retailer");
		Cart cart=new Cart();
		cart.setUserId(5000);
		cart.setProductId("300");
		cart.setProductQuantity(10);
		CartItemEntity cartItem=new CartItemEntity();
		Mockito.when(service.updateCartItem(cart)).thenReturn(cartItem);
	}
	
	
	@Test
	public void findCartItemTest() throws CartException {
		CartItemEntity cartItem=new CartItemEntity();
		Mockito.when(service.findCartItem("300", 5000)).thenReturn(cartItem);
	}
	
	
	@Test
	public void deletecartTest() throws CartException {
		List<CartItemEntity> cartItem=new ArrayList<CartItemEntity>();
		Mockito.when(service.deleteCartlist(5000)).thenReturn(cartItem);
	}
	
	
	@Test
	public void deleteCartItemTest() throws CartException {
		List<CartItemEntity> cartItem=new ArrayList<CartItemEntity>();
		Mockito.when(service.deleteCartItem((long)5000, "300")).thenReturn(cartItem);
	}
}
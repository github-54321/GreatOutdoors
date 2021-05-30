package com.cg.go.entity;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="WishList")
public class Wishlist {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "WISH_SEQ")
    @SequenceGenerator(sequenceName = "wish_seq", allocationSize = 1, name = "WISH_SEQ")
    private long wishlistId;
    @OneToOne
    private Customer customer;    
    @ManyToMany
    private List<ProductEntity> productIds=new ArrayList<ProductEntity>();
	public long getWishlistId() {
		return wishlistId;
	}
	public void setWishlistId(long wishlistId) {
		this.wishlistId = wishlistId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<ProductEntity> getProductIds() {
		return productIds;
	}
	public void setProductIds(List<ProductEntity> productIds) {
		this.productIds = productIds;
	}
    
}
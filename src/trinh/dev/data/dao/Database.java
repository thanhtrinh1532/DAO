package trinh.dev.data.dao;

import trinh.dev.data.impl.CategoryImpl;
import trinh.dev.data.impl.OrderImpl;
import trinh.dev.data.impl.OrderItemImpl;
import trinh.dev.data.impl.ProductImpl;
import trinh.dev.data.impl.UserImpl;

public class Database extends DatabaseDao {

    
    @Override
    public CategoryDao getCategoryDao() {
        // TODO Auto-generated method stub
        return new CategoryImpl();
    }
    @Override
    public OrderItemDao getOrderItemDao() {
        // TODO Auto-generated method stub
        return new OrderItemImpl();
    }
    @Override
    public OrderDao getOrderDao() {
        // TODO Auto-generated method stub
        return new OrderImpl();
    }
    @Override
    public UserDao getUserDao() {
        // TODO Auto-generated method stub
        return new UserImpl();
    }
	@Override
	public ProductDao getProductDao() {
		// TODO Auto-generated method stub
		return new ProductImpl();
	}

}
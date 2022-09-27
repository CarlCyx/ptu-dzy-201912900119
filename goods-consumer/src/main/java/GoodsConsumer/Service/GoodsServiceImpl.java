package GoodsConsumer.Service;

import model.Cart;
import model.Goods;
import model.Userorder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GoodsServiceImpl implements GoodsService{
    @Override
    public List<Goods> getAllgoods() {
        return null;
    }

    @Override
    public List<Goods> getOnegoods(String gname) {
        return null;
    }

    @Override
    public Goods getOnegid(int gid) {
        return null;
    }

    @Override
    public int updateCart(int number, int id) {
        return 0;
    }

    @Override
    public int intcart(String goodsname, int number, int price, int goodid, int uid) {
        return 0;
    }

    @Override
    public List<Cart> getAllcart(int uid) {
        return null;
    }

    @Override
    public int deleteCart(int gid) {
        return 0;
    }

    @Override
    public int insertOrder(String goodsname, int number, int price, int uid) {
        return 0;
    }

    @Override
    public List<Userorder> getAllorder(int uid) {
        return null;
    }
}

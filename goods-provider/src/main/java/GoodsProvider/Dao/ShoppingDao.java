package GoodsProvider.Dao;

import model.Cart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ShoppingDao {
    List<Cart> getAllcart(@Param(value = "uid") int uid);

    int intcart(@Param(value = "goodsname") String goodsname,
                @Param(value = "number") int number,
                @Param(value = "price") int price,
                @Param(value = "goodid") int goodid,
                @Param(value = "uid") int uid
                );

    int updateCart(@Param(value = "number") int number,
                   @Param(value = "id") int id
    );
    int deleteCart(@Param(value = "id") int id);

}

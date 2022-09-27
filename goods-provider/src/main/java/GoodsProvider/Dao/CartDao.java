package GoodsProvider.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CartDao {

    int deleteCart(@Param(value = "gid") int gid);
    int insertOrder(@Param(value = "goodsname") String goodsname,
                    @Param(value = "number") int number,
                    @Param(value = "price") int price,
                    @Param(value = "uid") int uid
    );
}

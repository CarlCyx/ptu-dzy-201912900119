package GoodsProvider.Dao;

import model.Userorder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderDao {
    List<Userorder> getAllorder(@Param(value = "uid") int uid);
}

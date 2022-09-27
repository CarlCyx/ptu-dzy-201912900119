package GoodsProvider.Dao;

import model.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoodsDao {
    List<Goods> getAllgoods();

    List<Goods> getOnegoods(@Param(value = "gname") String gname);

    Goods getOnegid(@Param(value = "gid") int gid);
}

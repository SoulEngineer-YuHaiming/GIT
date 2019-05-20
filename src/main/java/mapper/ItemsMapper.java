package mapper;


import org.apache.ibatis.annotations.Param;
import pojo.EasyuiPage;
import pojo.Items;
import pojo.ItemsExample;

import java.util.List;

public interface ItemsMapper <T>{

    //通过关键字分页查询，返回总记录数
    public Integer selectPageCountUseDyc(EasyuiPage<T> page);

    public List<T> selectPageListUseDyc(EasyuiPage<T> page);

    int countByExample(ItemsExample example);

    int deleteByExample(ItemsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Items record);

    int insertSelective(Items record);

    List<Items> selectByExampleWithBLOBs(ItemsExample example);

    List<Items> selectByExample(ItemsExample example);

    Items selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Items record, @Param("example") ItemsExample example);

    int updateByExampleWithBLOBs(@Param("record") Items record, @Param("example") ItemsExample example);

    int updateByExample(@Param("record") Items record, @Param("example") ItemsExample example);

    int updateByPrimaryKeySelective(Items record);

    int updateByPrimaryKeyWithBLOBs(Items record);

    int updateByPrimaryKey(Items record);
}
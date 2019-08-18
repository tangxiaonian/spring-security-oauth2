package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author ASUS
 * @create 2019-08-14 21:28
 */
public interface MyMapper<T> extends MySqlMapper<T>,Mapper<T> {
}

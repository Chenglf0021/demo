package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

import com.example.demo.dto.MetaDto;
import com.example.demo.entity.vo.MetaVo;
import com.example.demo.entity.vo.MetaVoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface MetaVoMapper {
    long countByExample(MetaVoExample example);

    int deleteByExample(MetaVoExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(MetaVo record);

    int insertSelective(MetaVo record);

    List<MetaVo> selectByExample(MetaVoExample example);

    MetaVo selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") MetaVo record, @Param("example") MetaVoExample example);

    int updateByExample(@Param("record") MetaVo record, @Param("example") MetaVoExample example);

    int updateByPrimaryKeySelective(MetaVo record);

    int updateByPrimaryKey(MetaVo record);

    List<MetaDto> selectFromSql(Map<String, Object> paraMap);

    MetaDto selectDtoByNameAndType(@Param("name") String name, @Param("type") String type);

    Integer countWithSql(Integer mid);
}
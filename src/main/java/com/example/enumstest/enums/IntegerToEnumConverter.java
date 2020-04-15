package com.example.enumstest.enums;


import cn.hutool.core.util.ObjectUtil;
import com.google.common.collect.Maps;
import org.springframework.core.convert.converter.Converter;

import java.util.HashMap;
import java.util.Map;

/**
 * create by sunzhongwei on 2020/04/15
 * Desc:
 */
public class IntegerToEnumConverter<T extends BaseEnum> implements Converter<Integer, T> {

    private Map<Integer, T> enumMap = Maps.newHashMap();

    public IntegerToEnumConverter(Class<T> enumType) {
        T[] enums = enumType.getEnumConstants();
        for (T e : enums) {
            enumMap.put(e.getCode(), e);
        }
    }



    @Override
    public T convert(Integer code) {
        T t = enumMap.get(code);
        if (ObjectUtil.isNull(t)) {
            String name = t.getClass().getName();
            System.out.println(name);
            throw new IllegalArgumentException("无法匹配对应的枚举类型");
        }
        return t;

    }
}

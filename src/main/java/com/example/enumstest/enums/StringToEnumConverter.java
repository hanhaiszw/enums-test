package com.example.enumstest.enums;

import cn.hutool.core.util.ObjectUtil;
import com.google.common.collect.Maps;
import org.springframework.core.convert.converter.Converter;

import java.util.Map;

/**
 * create by sunzhongwei on 2020/04/15
 * Desc:
 */
public class StringToEnumConverter <T extends BaseEnum> implements Converter<String, T> {
    private Map<String, T> enumMap = Maps.newHashMap();

    public StringToEnumConverter(Class<T> enumType) {
        T[] enums = enumType.getEnumConstants();
        for (T e : enums) {
            enumMap.put(e.getCode().toString(), e);
        }
    }

    @Override
    public T convert(String source) {
        T t = enumMap.get(source);
        if (ObjectUtil.isNull(t)) {
            // 值域有误
            String name = t.getClass().getName();
            System.out.println(name);
            throw new IllegalArgumentException("无法匹配对应的枚举类型");
        }
        return t;
    }
}

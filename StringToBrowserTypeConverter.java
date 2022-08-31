package com.utility.config;

import com.utility.driver.enums.BrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToBrowserTypeConverter implements Converter<BrowserType> {
  @Override
  public BrowserType convert(Method method, String value) {
    return BrowserType.valueOf(value.toUpperCase());
  }
}

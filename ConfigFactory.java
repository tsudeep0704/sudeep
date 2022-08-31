package com.utility.config;

import org.aeonbits.owner.ConfigCache;

public final class ConfigFactory {

  private ConfigFactory() {}

  public static synchronized FrameworkConfig getConfig() {
    return ConfigCache.getOrCreate(FrameworkConfig.class);
  }
}

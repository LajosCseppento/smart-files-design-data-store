package dev.lajoscseppento.smartfiles.design.datastore.core;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("smart-files.design.MockFileSystemGenerator")
@Data
public class MockFileSystemGeneratorProperties {
  private int defaultMaxDepth = 6;
  private int minSubdirectories = 4;
  private int maxSubdirectories = 10;
  private int minFiles = 0;
  private int maxFiles = 8;

  public void validate() {
    // TODO Validate
  }
}
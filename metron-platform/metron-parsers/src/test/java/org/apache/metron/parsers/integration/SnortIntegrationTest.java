/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.metron.parsers.integration;

import org.apache.metron.TestConstants;

public class SnortIntegrationTest extends ParserIntegrationTest {

  @Override
  public String getFluxPath() {
    return "./src/main/flux/snort/test.yaml";
  }

  @Override
  public String getSampleInputPath() {
    return TestConstants.SAMPLE_DATA_INPUT_PATH + "SnortOutput";
  }

  @Override
  public String getSampleParsedPath() {
    return TestConstants.SAMPLE_DATA_PARSED_PATH + "SnortParsed";
  }

  @Override
  public String getSensorType() {
    return "snort";
  }

  @Override
  public String getFluxTopicProperty() {
    return "spout.kafka.topic.snort";
  }
}

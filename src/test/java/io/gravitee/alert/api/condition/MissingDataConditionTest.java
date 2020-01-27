/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.alert.api.condition;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * Missing data condition is based on a time window and must be define with a duration.
 *
 *  @author David BRASSELY (david.brassely at graviteesource.com)
 *  @author GraviteeSource Team
 */
public class MissingDataConditionTest {

    /**
     * Check that there is no event during a given duration.
     */
    @Test
    public void shouldBuildMissingDataCondition() {
        MissingDataCondition condition = MissingDataCondition.duration(10, TimeUnit.SECONDS).build();

        Assert.assertNotNull(condition);
        Assert.assertEquals(10, condition.getDuration());
        Assert.assertEquals(TimeUnit.SECONDS, condition.getTimeUnit());
    }

}
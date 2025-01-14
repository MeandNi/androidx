/*
 * Copyright 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.appactions.interaction.capabilities.serializers.types

import androidx.appactions.builtintypes.types.Person
import androidx.appactions.interaction.capabilities.serializers.stringValue
import androidx.appactions.interaction.protobuf.Struct
import org.junit.Assert.assertThrows
import org.junit.Test

class SerializeTest {
    @Test
    fun serialize_ThrowsNotImplementedError() {
        val person = Person.Builder().setName("Jane").setEmail("jane@gmail.com").build()
        assertThrows(NotImplementedError::class.java) { serialize(person) }
    }

    @Test
    fun deserialize_ThrowsNotImplementedError() {
        val struct = Struct.newBuilder()
            .putFields("@type", stringValue("Person"))
            .putFields("name", stringValue("Jane"))
            .putFields("email", stringValue("jane@gmail.com"))
            .build()
        assertThrows(NotImplementedError::class.java) { deserialize(struct) }
    }
}

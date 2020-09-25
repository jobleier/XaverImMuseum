/*
 * Copyright (C) 2020 - museum x, Karlsruhe
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package x.museum.user.config.db

import org.springframework.data.mongodb.core.mapping.event.ReactiveBeforeConvertCallback
import reactor.kotlin.core.publisher.toMono
import x.museum.user.entity.CustomUser
import java.util.*

fun generateUserId() = ReactiveBeforeConvertCallback<CustomUser> {
    user, _ ->
    if (user.id == null) {
        CustomUser(
                id = UUID.randomUUID(),
                username = user.username,
                password = user.password,
                authorities = user.authorities
        )
    } else {
        user
    }.toMono()
}
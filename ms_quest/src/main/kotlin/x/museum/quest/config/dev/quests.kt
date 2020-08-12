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

package x.museum.quest.config.security.dev

import kotlinx.coroutines.flow.flowOf
import x.museum.quest.entity.Quest
import x.museum.quest.entity.QuestId

val quests = flowOf(
        Quest(
                id = QuestId.fromString("00000000-0000-0000-0000-000000000000"),
                username = "Xaver",
                title = "Hallo Xaver!",
                description = "Das ist meine erste Aufgabe für Dich!"
        )
)
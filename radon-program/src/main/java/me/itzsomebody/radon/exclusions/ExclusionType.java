/*
 * Copyright (C) 2018 ItzSomebody
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package me.itzsomebody.radon.exclusions;

/**
 * All the valid exclusion types in an {@link Enum} representation.
 *
 * @author ItzSomebody
 */
public enum ExclusionType {
    GLOBAL,
    EXTENDS, // TODO
    IMPLEMENTS, // TODO
    STRING_ENCRYPTION,
    REFERENCE_OBFUSCATION,
    FLOW_OBFUSCATION,
    NUMBER_OBFUSCATION,
    HIDE_CODE,
    CRASHER,
    EXPIRATION,
    OPTIMIZER,
    SHRINKER,
    SHUFFLER,
    RENAMER,
    ANTI_TAMPER;

    public String getName() {
        return name().toLowerCase();
    }
}

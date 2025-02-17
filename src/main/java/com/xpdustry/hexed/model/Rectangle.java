/*
 * HexedReloaded, a reimplementation of the hexed gamemode from Anuke,
 * with more features and better performances.
 *
 * Copyright (C) 2025  Xpdustry
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
package com.xpdustry.hexed.model;

record Rectangle(int identifier, int x, int y, int w, int h) implements Hex {

    @Override
    public int getIdentifier() {
        return this.identifier;
    }

    @Override
    public int getTileX() {
        return this.x;
    }

    @Override
    public int getTileY() {
        return this.y;
    }

    @Override
    public int getTileDiameter() {
        return (this.w + this.h) / 2;
    }

    @Override
    public boolean contains(final int x, final int y) {
        final var hw = (this.w / 2);
        final var hh = (this.h / 2);
        return x >= this.x - hw && x < this.x + hw && y >= this.y - hh && y < this.y + hh;
    }
}

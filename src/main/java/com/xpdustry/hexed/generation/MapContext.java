/*
 * HexedPluginReloaded, A reimplementation of the hexed gamemode, with more features and better performances.
 *
 * Copyright (C) 2023  Xpdustry
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
package com.xpdustry.hexed.generation;

import mindustry.game.Rules;

public interface MapContext {

    void resize(final int width, final int height);

    int getWidth();

    int getHeight();

    MapTile getTile(int x, int y);

    Rules getRules();

    void setRules(final Rules rules);

    String getMapName();

    void setMapName(final String name);

    void forEachTile(final TileConsumer action);

    void forEachTile(int x, int y, int w, int h, final TileConsumer action);
}

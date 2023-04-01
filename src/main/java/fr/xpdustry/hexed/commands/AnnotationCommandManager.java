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
package fr.xpdustry.hexed.commands;

import cloud.commandframework.annotations.AnnotationParser;
import fr.xpdustry.distributor.api.command.ArcCommandManager;
import fr.xpdustry.distributor.api.command.sender.CommandSender;
import fr.xpdustry.distributor.api.plugin.MindustryPlugin;
import java.util.function.Function;
import org.checkerframework.checker.nullness.qual.MonotonicNonNull;

public final class AnnotationCommandManager extends ArcCommandManager<CommandSender> {

    private @MonotonicNonNull AnnotationParser<CommandSender> annotationParser = null;

    public AnnotationCommandManager(final MindustryPlugin plugin) {
        super(plugin, Function.identity(), Function.identity(), false);
    }

    public AnnotationParser<CommandSender> getAnnotationParser() {
        if (this.annotationParser == null) {
            this.annotationParser = this.createAnnotationParser(CommandSender.class);
        }
        return this.annotationParser;
    }
}

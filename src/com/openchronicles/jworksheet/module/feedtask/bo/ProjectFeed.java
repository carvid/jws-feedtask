/**
 * FeedTask - jWorkSheet's module to import tasks from a RSS/Atom source
 * Copyright (C) 2009, Carlos David González Abraham
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package com.openchronicles.jworksheet.module.feedtask.bo;

import org.ujoframework.UjoProperty;
import org.ujoframework.implementation.map.MapUjo;

public class ProjectFeed extends MapUjo {

    public static final UjoProperty<ProjectFeed,Integer> PROJ_ID
        = newProperty("ProjectID", Integer.class);
    public static final UjoProperty<ProjectFeed,String>  URL
        = newProperty("Url",  "");
    public static final UjoProperty<ProjectFeed,String>  NAME
        = newProperty("Name", "");
}

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

package com.openchronicles.jworksheet.module.feedtask;

import com.openchronicles.jworksheet.module.feedtask.gui.FeedPanel;

import java.util.Calendar;
import java.util.Date;

import net.ponec.jworksheet.module.ModuleApiImpl;
import net.ponec.jworksheet.module.JwsContext;

/**
 * 
 * @author Carlos David González Abraham 
 * &lt;<a href="mailto:carlosdavid@gonzalez-abraham.com.mx">carlosdavid@gonzalez-abraham.com.mx</a>&gt;
 */
public class FeedTask extends ModuleApiImpl {

    // GUI components
    private FeedPanel pFeed;
    
    // -- Module Api Implementation
    public void eventListener(boolean start) {
        if (start) {
            System.out.println(toString() + ": START FeedTask");
        } else {
            System.out.println(toString() + ": FINISH FeedTask");
        }

        pFeed = new FeedPanel();
        getJwsContext().getTabbedPane().addTab("Feeds", pFeed);
    }

    /** An module Name */
    public String getName() {
        return "FeedTask";
    }

    public String getDescription() {
        return "A RSS/Atom task importer module";
    }

    public String getRelease() {
        return "0.00";
    }

    /** Date of creation */
    public Date getCreated() {
        Calendar c = Calendar.getInstance();
        c.set(2009, Calendar.MAY, 17);
        return c.getTime();
    }

    /** An summary information */
    @Override
    public String toString() {
        return getName() + " release " + getRelease();
    }

    /** Pring an summary information */
    public static void main(String[] args) {
        System.out.println(new FeedTask());
    }
}

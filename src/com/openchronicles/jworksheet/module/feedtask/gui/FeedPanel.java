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

package com.openchronicles.jworksheet.module.feedtask.gui;

import com.openchronicles.jworksheet.module.feedtask.gui.model.FeedTableModel;

import javax.swing.ListSelectionModel;

import net.ponec.jworksheet.bo.Project;
import net.ponec.jworksheet.bo.Parameters;
import net.ponec.jworksheet.bo.WorkSpace;
import net.ponec.jworksheet.core.ApplContext;
import net.ponec.jworksheet.module.JwsContext;
import net.ponec.jworksheet.gui.component.UjoTable;
import net.ponec.jworksheet.gui.models.ProjectTableModel;

/**
 *
 * @author Carlos David González Abraham 
 * &lt;<a href="mailto:carlosdavid@gonzalez-abraham.com.mx">carlosdavid@gonzalez-abraham.com.mx</a>&gt;
 */
public class FeedPanel extends javax.swing.JPanel {

    // JWS components
    private ApplContext applContext;
    private JwsContext jwsContext;
    private UjoTable projectTable;
    private UjoTable feedTable;

    public FeedPanel(JwsContext jwsContext) {

        this.jwsContext = jwsContext;
        applContext     = (ApplContext) jwsContext;

        projectTable = new UjoTable();
        feedTable    = new UjoTable();

        initComponents();

        // project table
        projectTable.enableSorting(applContext);
        projectTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        projectTable.getModel().addTableModelListener(applContext);
        projectTable.getTableColumn(Project.P_ID  ).setMaxWidth(48);
        projectTable.getTableColumn(Project.P_PRIVATE).setMaxWidth(58);
        projectTable.getTableColumn(Project.P_DEFAULT).setMaxWidth(58);
        projectTable.getTableColumn(Project.P_FINISHED ).setMaxWidth(58);
        projectTable.showSortedColumn(Parameters.P_SORT_PROJ_COLUMN.of(jwsContext.getParameters()));

        // feed table
        feedTable.enableSorting(applContext);
        feedTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        feedTable.getModel().addTableModelListener(applContext);

        // fill project table
        projectTable.getModel().setRows(WorkSpace.P_PROJS.getList(applContext.getWorkSpace()));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jSplitPane1 = new javax.swing.JSplitPane();
        pProjectFeeds = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        pProjects = new javax.swing.JPanel();
        spProjects = new javax.swing.JScrollPane();
        $projectTable = projectTable;
        pFeeds = new javax.swing.JPanel();
        spFeeds = new javax.swing.JScrollPane();
        $feedTable = feedTable;
        pFeedButtons = new javax.swing.JPanel();
        bFeedNew = new javax.swing.JButton();
        bFeedDelete = new javax.swing.JButton();
        pItems = new javax.swing.JPanel();
        spItems = new javax.swing.JScrollPane();
        $itemTable = new javax.swing.JTable();
        pItemButtons = new javax.swing.JPanel();
        bItemImport = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setMinimumSize(new java.awt.Dimension(540, 216));
        setPreferredSize(new java.awt.Dimension(544, 477));
        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane1.setResizeWeight(0.5);
        jSplitPane1.setName("jSplitPane1"); // NOI18N
        jSplitPane1.setOneTouchExpandable(true);

        pProjectFeeds.setName("pProjectFeeds"); // NOI18N
        pProjectFeeds.setLayout(new java.awt.BorderLayout());

        jSplitPane2.setResizeWeight(0.5);
        jSplitPane2.setName("jSplitPane2"); // NOI18N
        jSplitPane2.setOneTouchExpandable(true);

        pProjects.setName("pProjects"); // NOI18N
        pProjects.setLayout(new java.awt.GridBagLayout());

        spProjects.setName("spProjects"); // NOI18N

        $projectTable.setModel(new ProjectTableModel(applContext));
        $projectTable.setName("$projectTable"); // NOI18N
        spProjects.setViewportView($projectTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 0);
        pProjects.add(spProjects, gridBagConstraints);

        jSplitPane2.setLeftComponent(pProjects);

        pFeeds.setName("pFeeds"); // NOI18N
        pFeeds.setLayout(new java.awt.GridBagLayout());

        spFeeds.setName("spFeeds"); // NOI18N

        $feedTable.setModel(new FeedTableModel(jwsContext));
        $feedTable.setName("$feedTable"); // NOI18N
        spFeeds.setViewportView($feedTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 0);
        pFeeds.add(spFeeds, gridBagConstraints);

        pFeedButtons.setName("pFeedButtons"); // NOI18N
        pFeedButtons.setPreferredSize(new java.awt.Dimension(52, 116));
        pFeedButtons.setLayout(new java.awt.GridBagLayout());

        bFeedNew.setText("New"); // NOI18N
        bFeedNew.setName("bFeedNew"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 0);
        pFeedButtons.add(bFeedNew, gridBagConstraints);

        bFeedDelete.setText("Delete"); // NOI18N
        bFeedDelete.setName("bFeedDelete"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 0);
        pFeedButtons.add(bFeedDelete, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        pFeeds.add(pFeedButtons, gridBagConstraints);

        jSplitPane2.setRightComponent(pFeeds);

        pProjectFeeds.add(jSplitPane2, java.awt.BorderLayout.CENTER);

        jSplitPane1.setTopComponent(pProjectFeeds);

        pItems.setName("pItems"); // NOI18N
        pItems.setLayout(new java.awt.GridBagLayout());

        spItems.setName("spItems"); // NOI18N

        $itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        $itemTable.setName("$itemTable"); // NOI18N
        spItems.setViewportView($itemTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 0);
        pItems.add(spItems, gridBagConstraints);

        pItemButtons.setLayout(new java.awt.GridBagLayout());

        bItemImport.setText("Import"); // NOI18N
        bItemImport.setName("bItemImport"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 0);
        pItemButtons.add(bItemImport, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        pItems.add(pItemButtons, gridBagConstraints);

        jSplitPane1.setRightComponent(pItems);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable $feedTable;
    private javax.swing.JTable $itemTable;
    private javax.swing.JTable $projectTable;
    private javax.swing.JButton bFeedDelete;
    private javax.swing.JButton bFeedNew;
    private javax.swing.JButton bItemImport;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JPanel pFeedButtons;
    private javax.swing.JPanel pFeeds;
    private javax.swing.JPanel pItemButtons;
    private javax.swing.JPanel pItems;
    private javax.swing.JPanel pProjectFeeds;
    private javax.swing.JPanel pProjects;
    private javax.swing.JScrollPane spFeeds;
    private javax.swing.JScrollPane spItems;
    private javax.swing.JScrollPane spProjects;
    // End of variables declaration//GEN-END:variables

}

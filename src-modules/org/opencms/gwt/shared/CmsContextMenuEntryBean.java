/*
 * File   : $Source: /alkacon/cvs/opencms/src-modules/org/opencms/gwt/shared/Attic/CmsContextMenuEntryBean.java,v $
 * Date   : $Date: 2010/12/21 10:23:32 $
 * Version: $Revision: 1.2 $
 *
 * This library is part of OpenCms -
 * the Open Source Content Management System
 *
 * Copyright (C) 2002 - 2009 Alkacon Software (http://www.alkacon.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * For further information about Alkacon Software, please see the
 * company website: http://www.alkacon.com
 *
 * For further information about OpenCms, please see the
 * project website: http://www.opencms.org
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.opencms.gwt.shared;

import org.opencms.gwt.client.util.CmsCollectionUtil;

import java.util.List;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * A context menu entry bean.<p>
 */
public class CmsContextMenuEntryBean implements IsSerializable {

    /** Signals if the menu entry is active. */
    private boolean m_active;

    /** Stores the image path for the icon in front of the label. */
    private String m_imagePath;

    /** Stores the JSP path for the JSP that is called by the command. */
    private String m_jspPath;

    /** Stores the label for the menu entry. */
    private String m_label;

    /** The name of the menu entry. */
    private String m_name;

    /** The reason for de-activation of the menu entry. */
    private String m_reason;

    /** Signals if the entry is a separator. */
    private boolean m_separator;

    /** The items from the sub menu. */
    private List<CmsContextMenuEntryBean> m_subMenu;

    /** Signals if the menu entry is visible. */
    private boolean m_visible;

    /**
     * Default Constructor.<p>
     */
    public CmsContextMenuEntryBean() {

        // noop
    }

    /**
     * Constructor.<p>
     * 
     * @param active signals if this menu entry is active
     * @param visible signals if this menu entry is visible
     * @param imagePath the image path for the icon in front of the label
     * @param jspPath the JSP path for the command 
     * @param label the label for the menu entry
     * @param name the name for the menu entry
     * @param reason the reason why this item is deactivated
     * @param separator signals if this entry is a separator
     * @param subMenu contains the sub menu of the entry
     */
    public CmsContextMenuEntryBean(
        boolean active,
        boolean visible,
        String imagePath,
        String jspPath,
        String label,
        String name,
        String reason,
        boolean separator,
        List<CmsContextMenuEntryBean> subMenu) {

        m_active = active;
        m_visible = visible;
        m_imagePath = imagePath;
        m_jspPath = jspPath;
        m_label = label;
        m_name = name;
        m_reason = reason;
        m_separator = separator;
        m_subMenu = subMenu;
    }

    /**
     * Returns the image path of the menu entry.<p>
     * 
     * @return the image path
     */
    public String getImagePath() {

        return m_imagePath;
    }

    /**
     * Returns the jsp path of the menu entry.<p>
     * 
     * @return the jsp path
     */
    public String getJspPath() {

        return m_jspPath;
    }

    /**
     * Returns the label of the menu entry.<p>
     * 
     * @return the label
     */
    public String getLabel() {

        return m_label;
    }

    /**
     * Returns the name of the entry.<p>
     * 
     * @return the name of the entry
     */
    public String getName() {

        return m_name;
    }

    /**
     * Returns the reason for de-activation of the menu entry.<p>
     *  
     * @return the reason
     */
    public String getReason() {

        return m_reason;
    }

    /**
     * Returns the sub menu entries.<p>
     * 
     * @return the entries of the sub menu
     */
    public List<CmsContextMenuEntryBean> getSubMenu() {

        return m_subMenu;
    }

    /**
     * Returns <code>true</code> if this menu entry has a sub menu <code>false</code> otherwise.<p>
     * 
     * @return <code>true</code> if this menu entry has a sub menu <code>false</code> otherwise
     */
    public boolean hasSubMenu() {

        if (!CmsCollectionUtil.isEmptyOrNull(m_subMenu)) {
            return true;
        }
        return false;
    }

    /**
     * Returns <code>true</code> if this menu entry is active, <code>false</code> otherwise.<p>
     * 
     * @return <code>true</code> if this menu entry is active, <code>false</code> otherwise
     */
    public boolean isActive() {

        return m_active;
    }

    /**
     * Returns <code>true</code> if this menu entry is a separator, <code>false</code> otherwise.<p>
     * 
     * @return <code>true</code> if this menu entry is a separator, <code>false</code> otherwise
     */
    public boolean isSeparator() {

        return m_separator;
    }

    /**
     * Returns <code>true</code> if this menu entry is visible, <code>false</code> otherwise.<p>
     * 
     * @return <code>true</code> if this menu entry is visible, <code>false</code> otherwise
     */
    public boolean isVisible() {

        return m_visible;
    }

    /**
     * Sets the active.<p>
     *
     * @param active the active to set
     */
    public void setActive(boolean active) {

        m_active = active;
    }

    /**
     * Sets the imagePath.<p>
     *
     * @param imagePath the imagePath to set
     */
    public void setImagePath(String imagePath) {

        m_imagePath = imagePath;
    }

    /**
     * Sets the jspPath.<p>
     *
     * @param jspPath the jspPath to set
     */
    public void setJspPath(String jspPath) {

        m_jspPath = jspPath;
    }

    /**
     * Sets the label.<p>
     *
     * @param label the label to set
     */
    public void setLabel(String label) {

        m_label = label;
    }

    /**
     * Sets the name of the entry.<p>
     * 
     * @param name the name to set
     */
    public void setName(String name) {

        m_name = name;
    }

    /**
     * Sets the reason.<p>
     *
     * @param reason the reason to set
     */
    public void setReason(String reason) {

        m_reason = reason;
    }

    /**
     * Sets the separator.<p>
     *
     * @param separator the separator to set
     */
    public void setSeparator(boolean separator) {

        m_separator = separator;
    }

    /**
     * Sets the subMenu.<p>
     *
     * @param subMenu the subMenu to set
     */
    public void setSubMenu(List<CmsContextMenuEntryBean> subMenu) {

        m_subMenu = subMenu;
    }

    /**
     * Sets the visible flag.<p>
     *
     * @param visible the enabled to set
     */
    public void setVisible(boolean visible) {

        m_visible = visible;
    }
}

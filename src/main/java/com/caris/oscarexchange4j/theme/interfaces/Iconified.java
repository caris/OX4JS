/**
 * CARIS oscar - Open Spatial Component ARchitecture
 *
 * Copyright 2014 CARIS <http://www.caris.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.caris.oscarexchange4j.theme.interfaces;

/*
 * WEB-999 - Interface added to define methods for icons associated to layers.
 */

/**
 * @author tcoburn
 * 
 */
public interface Iconified {
    /**
     * This method will return the image associated with this layer.
     * 
     * @return String - The image associated with this layer.
     */
    public abstract String getIcon();

    /**
     * This method will set hte image associated with this layer.
     * 
     * @param icon
     *            - Sets the image associated with this layer.
     */
    public abstract void setIcon(String icon);

}

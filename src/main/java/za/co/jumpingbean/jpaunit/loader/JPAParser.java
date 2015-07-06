/* 
 * Copyright (C) 2015 mark
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package za.co.jumpingbean.jpaunit.loader;

import java.util.List;
import za.co.jumpingbean.jpaunit.DataSetEntry;
import za.co.jumpingbean.jpaunit.exception.ParserException;

/**
 *
 * @author mark
 */
public interface JPAParser {
    public List<DataSetEntry> getDataEnties();
    public void process(String fileName,String modelPackageName) throws ParserException;
}

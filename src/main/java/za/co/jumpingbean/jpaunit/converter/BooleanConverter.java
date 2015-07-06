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
package za.co.jumpingbean.jpaunit.converter;

import za.co.jumpingbean.jpaunit.exception.CannotConvertException;

/**
 *
 * @author mark
 */
public class BooleanConverter implements Converter<Boolean> {

    @Override
    public Boolean convert(String elm) throws CannotConvertException {
        switch (elm) {
            case "1":
                elm = "true";
                break;
            case "0":
                elm = "false";
                break;
            case "false":
            case "true":
                break;
            default:
                throw  new CannotConvertException(Boolean.class, elm);
        }
        return  elm.equals("true")? Boolean.TRUE: Boolean.FALSE;
    }

}

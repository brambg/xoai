/*
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */

package org.dspace.xoai.dataprovider.exceptions;

/**
 * @author Development @ Lyncode
 * @version 3.1.0
 */
public class DoesNotSupportSetsException extends HandlerException {

    /**
     *
     */
    private static final long serialVersionUID = -7008970964208110045L;

    /**
     * Creates a new instance of <code>DoesNotSupportSetsException</code>
     * without detail message.
     */
    public DoesNotSupportSetsException() {
    }

    /**
     * Constructs an instance of <code>DoesNotSupportSetsException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public DoesNotSupportSetsException(String msg) {
        super(msg);
    }
}

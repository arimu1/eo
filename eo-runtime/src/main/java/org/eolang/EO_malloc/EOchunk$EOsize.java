/*
 * SPDX-FileCopyrightText: Copyright (c) 2016-2026 Objectionary.com
 * SPDX-License-Identifier: MIT
 */

/*
 * @checkstyle PackageNameCheck (4 lines)
 * @checkstyle TrailingCommentCheck (3 lines)
 */
package org.eolang.EO_malloc; // NOPMD

import org.eolang.Atom;
import org.eolang.Data;
import org.eolang.Expect;
import org.eolang.Heaps;
import org.eolang.PhDefault;
import org.eolang.Phi;
import org.eolang.XmirObject;

/**
 * Malloc.chunk.size object.
 * @since 0.57
 * @checkstyle TypeNameCheck (5 lines)
 */
@XmirObject(oname = "malloc.chunk.size")
@SuppressWarnings("PMD.AvoidDollarSigns")
public final class EOchunk$EOsize extends PhDefault implements Atom {

    @Override
    public Phi lambda() {
        return new Data.ToPhi(
            Heaps.INSTANCE.size(
                new Expect.Natural(Expect.at(this.take(Phi.RHO), "id")).it()
            )
        );
    }
}

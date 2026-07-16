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
import org.eolang.AtVoid;
import org.eolang.Attr;
import org.eolang.Attrs;
import org.eolang.Data;
import org.eolang.Dataized;
import org.eolang.Expect;
import org.eolang.Heaps;
import org.eolang.PhDefault;
import org.eolang.Phi;
import org.eolang.XmirObject;

/**
 * Malloc.chunk.write object.
 * @since 0.57
 * @checkstyle TypeNameCheck (5 lines)
 */
@XmirObject(oname = "malloc.chunk.write")
@SuppressWarnings("PMD.AvoidDollarSigns")
public final class EOchunk$EOwrite extends PhDefault implements Atom {

    /**
     * Ctor.
     */
    public EOchunk$EOwrite() {
        super(new Attrs(
            new Attr("offset", new AtVoid("offset")),
            new Attr("data", new AtVoid("data"))
        ));
    }

    @Override
    public Phi lambda() {
        Heaps.INSTANCE.write(
            new Expect.Natural(Expect.at(this.take(Phi.RHO), "id")).it(),
            new Expect.Natural(Expect.at(this, "offset")).it(),
            new Dataized(this.take("data")).take()
        );
        return new Data.ToPhi(true);
    }
}

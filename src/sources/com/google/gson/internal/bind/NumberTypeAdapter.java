package com.google.gson.internal.bind;

import defpackage.fr3;
import defpackage.hs3;
import defpackage.ie2;
import defpackage.p61;
import defpackage.pc6;
import defpackage.rq3;
import defpackage.vg8;
import defpackage.yi8;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class NumberTypeAdapter extends com.google.gson.b {
    public static final vg8 b = d(2);
    public final int a;

    public NumberTypeAdapter(int i) {
        this.a = i;
    }

    public static vg8 d(int i) {
        return new vg8() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // defpackage.vg8
            public final com.google.gson.b a(com.google.gson.a aVar, yi8 yi8Var) {
                if (yi8Var.a == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.b
    public final Object b(rq3 rq3Var) throws IOException {
        int iC0 = rq3Var.c0();
        int iB = p61.B(iC0);
        if (iB == 5 || iB == 6) {
            return pc6.b(this.a, rq3Var);
        }
        if (iB == 8) {
            rq3Var.X();
            return null;
        }
        throw new fr3("Expecting number, got: " + ie2.r(iC0) + "; at path " + rq3Var.p());
    }

    @Override // com.google.gson.b
    public final void c(hs3 hs3Var, Object obj) throws IOException {
        hs3Var.a0((Number) obj);
    }
}

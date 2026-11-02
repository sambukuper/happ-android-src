package com.google.gson;

import defpackage.hs3;
import defpackage.rq3;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public final b a() {
        return !(this instanceof TypeAdapter$NullSafeTypeAdapter) ? new b() { // from class: com.google.gson.TypeAdapter$NullSafeTypeAdapter
            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) throws IOException {
                if (rq3Var.c0() != 9) {
                    return this.a.b(rq3Var);
                }
                rq3Var.X();
                return null;
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) throws IOException {
                if (obj == null) {
                    hs3Var.u();
                } else {
                    this.a.c(hs3Var, obj);
                }
            }

            public final String toString() {
                return "NullSafeTypeAdapter[" + this.a + "]";
            }
        } : this;
    }

    public abstract Object b(rq3 rq3Var);

    public abstract void c(hs3 hs3Var, Object obj);
}

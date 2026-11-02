package com.google.gson.internal;

import com.google.gson.a;
import com.google.gson.b;
import defpackage.bt;
import defpackage.dh3;
import defpackage.ec6;
import defpackage.hs3;
import defpackage.p61;
import defpackage.rq3;
import defpackage.vg8;
import defpackage.yi8;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class Excluder implements vg8, Cloneable {
    public static final Excluder Z = new Excluder();
    public final List X;
    public final List Y;

    public Excluder() {
        List list = Collections.EMPTY_LIST;
        this.X = list;
        this.Y = list;
    }

    @Override // defpackage.vg8
    public final b a(final a aVar, final yi8 yi8Var) {
        Class cls = yi8Var.a;
        final boolean zB = b(cls, true);
        final boolean zB2 = b(cls, false);
        if (zB || zB2) {
            return new b() { // from class: com.google.gson.internal.Excluder.1
                public volatile b a;

                @Override // com.google.gson.b
                public final Object b(rq3 rq3Var) throws IOException {
                    if (zB2) {
                        rq3Var.v();
                        return null;
                    }
                    b bVarF = this.a;
                    if (bVarF == null) {
                        bVarF = aVar.f(Excluder.this, yi8Var);
                        this.a = bVarF;
                    }
                    return bVarF.b(rq3Var);
                }

                @Override // com.google.gson.b
                public final void c(hs3 hs3Var, Object obj) throws IOException {
                    if (zB) {
                        hs3Var.u();
                        return;
                    }
                    b bVarF = this.a;
                    if (bVarF == null) {
                        bVarF = aVar.f(Excluder.this, yi8Var);
                        this.a = bVarF;
                    }
                    bVarF.c(hs3Var, obj);
                }
            };
        }
        return null;
    }

    public final boolean b(Class cls, boolean z) {
        if (!z && !Enum.class.isAssignableFrom(cls)) {
            dh3 dh3Var = ec6.a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z ? this.X : this.Y).iterator();
        if (it.hasNext()) {
            throw p61.k(it);
        }
        return false;
    }

    public final Object clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            bt.g(e);
            return null;
        }
    }
}

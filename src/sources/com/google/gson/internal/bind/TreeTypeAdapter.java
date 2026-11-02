package com.google.gson.internal.bind;

import defpackage.bo3;
import defpackage.hs3;
import defpackage.iq3;
import defpackage.mb6;
import defpackage.rq3;
import defpackage.u52;
import defpackage.vg8;
import defpackage.ww2;
import defpackage.xp3;
import defpackage.yi8;
import defpackage.yn3;
import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {
    public final ww2 a;
    public final yn3 b;
    public final com.google.gson.a c;
    public final yi8 d;
    public final vg8 e;
    public final boolean f;
    public volatile com.google.gson.b g;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static final class SingleTypeFactory implements vg8 {
        public final yi8 X;
        public final boolean Y;
        public final ww2 Z;
        public final yn3 f0;

        public SingleTypeFactory(Object obj, yi8 yi8Var, boolean z) {
            ww2 ww2Var = obj instanceof ww2 ? (ww2) obj : null;
            this.Z = ww2Var;
            yn3 yn3Var = obj instanceof yn3 ? (yn3) obj : null;
            this.f0 = yn3Var;
            if (ww2Var == null && yn3Var == null) {
                u52.m("Type adapter ", obj.getClass().getName(), " must implement JsonSerializer or JsonDeserializer");
                throw null;
            }
            this.X = yi8Var;
            this.Y = z;
        }

        @Override // defpackage.vg8
        public final com.google.gson.b a(com.google.gson.a aVar, yi8 yi8Var) {
            yi8 yi8Var2 = this.X;
            if (!yi8Var2.equals(yi8Var) && (!this.Y || yi8Var2.b != yi8Var.a)) {
                return null;
            }
            return new TreeTypeAdapter(this.Z, this.f0, aVar, yi8Var, this, true);
        }
    }

    public TreeTypeAdapter(ww2 ww2Var, yn3 yn3Var, com.google.gson.a aVar, yi8 yi8Var, vg8 vg8Var, boolean z) {
        this.a = ww2Var;
        this.b = yn3Var;
        this.c = aVar;
        this.d = yi8Var;
        this.e = vg8Var;
        this.f = z;
    }

    public static vg8 e(yi8 yi8Var, Object obj) {
        return new SingleTypeFactory(obj, yi8Var, yi8Var.b == yi8Var.a);
    }

    @Override // com.google.gson.b
    public final Object b(rq3 rq3Var) {
        yn3 yn3Var = this.b;
        if (yn3Var == null) {
            com.google.gson.b bVarF = this.g;
            if (bVarF == null) {
                bVarF = this.c.f(this.e, this.d);
                this.g = bVarF;
            }
            return bVarF.b(rq3Var);
        }
        bo3 bo3VarU = mb6.U(rq3Var);
        if (this.f) {
            bo3VarU.getClass();
            if (bo3VarU instanceof xp3) {
                return null;
            }
        }
        return yn3Var.a(bo3VarU, this.d.b);
    }

    @Override // com.google.gson.b
    public final void c(hs3 hs3Var, Object obj) throws IOException {
        if (this.a == null) {
            com.google.gson.b bVarF = this.g;
            if (bVarF == null) {
                bVarF = this.c.f(this.e, this.d);
                this.g = bVarF;
            }
            bVarF.c(hs3Var, obj);
            return;
        }
        if (this.f && obj == null) {
            hs3Var.u();
            return;
        }
        Type type = this.d.b;
        Double d = (Double) obj;
        Double dValueOf = d != null ? Double.valueOf(d.doubleValue() % 1.0d) : null;
        iq3 iq3Var = (dValueOf == null || dValueOf.doubleValue() != 0.0d) ? new iq3(d) : new iq3(Integer.valueOf((int) d.doubleValue()));
        JsonElementTypeAdapter.a.getClass();
        JsonElementTypeAdapter.f(iq3Var, hs3Var);
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public final com.google.gson.b d() {
        if (this.a != null) {
            return this;
        }
        com.google.gson.b bVar = this.g;
        if (bVar != null) {
            return bVar;
        }
        com.google.gson.b bVarF = this.c.f(this.e, this.d);
        this.g = bVarF;
        return bVarF;
    }
}

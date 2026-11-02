package com.google.gson.internal.bind;

import defpackage.em7;
import defpackage.mj0;
import defpackage.nr4;
import defpackage.vg8;
import defpackage.wm3;
import defpackage.ww2;
import defpackage.yi8;
import defpackage.yn3;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements vg8 {
    public static final vg8 Z;
    public static final vg8 f0;
    public final mj0 X;
    public final ConcurrentHashMap Y = new ConcurrentHashMap();

    static {
        int i = 0;
        Z = new DummyTypeAdapterFactory(i);
        f0 = new DummyTypeAdapterFactory(i);
    }

    public JsonAdapterAnnotationTypeAdapterFactory(mj0 mj0Var) {
        this.X = mj0Var;
    }

    @Override // defpackage.vg8
    public final com.google.gson.b a(com.google.gson.a aVar, yi8 yi8Var) {
        wm3 wm3Var = (wm3) yi8Var.a.getAnnotation(wm3.class);
        if (wm3Var == null) {
            return null;
        }
        return b(this.X, aVar, yi8Var, wm3Var, true);
    }

    public final com.google.gson.b b(mj0 mj0Var, com.google.gson.a aVar, yi8 yi8Var, wm3 wm3Var, boolean z) {
        com.google.gson.b bVarA;
        Object objD = mj0Var.P(new yi8(wm3Var.value()), true).d();
        boolean zNullSafe = wm3Var.nullSafe();
        if (objD instanceof com.google.gson.b) {
            bVarA = (com.google.gson.b) objD;
        } else if (objD instanceof vg8) {
            vg8 vg8Var = (vg8) objD;
            if (z) {
                vg8 vg8Var2 = (vg8) this.Y.putIfAbsent(yi8Var.a, vg8Var);
                if (vg8Var2 != null) {
                    vg8Var = vg8Var2;
                }
            }
            bVarA = vg8Var.a(aVar, yi8Var);
        } else {
            boolean z2 = objD instanceof ww2;
            if (!z2 && !(objD instanceof yn3)) {
                em7.i("Invalid attempt to bind an instance of ", objD.getClass().getName(), " as a @JsonAdapter for ", nr4.W(yi8Var.b), ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                return null;
            }
            TreeTypeAdapter treeTypeAdapter = new TreeTypeAdapter(z2 ? (ww2) objD : null, objD instanceof yn3 ? (yn3) objD : null, aVar, yi8Var, z ? Z : f0, zNullSafe);
            zNullSafe = false;
            bVarA = treeTypeAdapter;
        }
        return (bVarA == null || !zNullSafe) ? bVarA : bVarA.a();
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class DummyTypeAdapterFactory implements vg8 {
        private DummyTypeAdapterFactory() {
        }

        @Override // defpackage.vg8
        public final com.google.gson.b a(com.google.gson.a aVar, yi8 yi8Var) {
            throw new AssertionError("Factory should not be used");
        }

        public /* synthetic */ DummyTypeAdapterFactory(int i) {
            this();
        }
    }
}

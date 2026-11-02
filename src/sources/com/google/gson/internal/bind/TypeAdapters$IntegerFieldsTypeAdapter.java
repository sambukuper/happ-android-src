package com.google.gson.internal.bind;

import defpackage.hs3;
import defpackage.rq3;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
abstract class TypeAdapters$IntegerFieldsTypeAdapter<T> extends com.google.gson.b {
    public final List a;

    public TypeAdapters$IntegerFieldsTypeAdapter(String... strArr) {
        this.a = Arrays.asList(strArr);
    }

    @Override // com.google.gson.b
    public final Object b(rq3 rq3Var) throws IOException {
        if (rq3Var.c0() == 9) {
            rq3Var.X();
            return null;
        }
        rq3Var.F0();
        List list = this.a;
        long[] jArr = new long[list.size()];
        while (rq3Var.c0() != 4) {
            int iIndexOf = list.indexOf(rq3Var.e0());
            if (iIndexOf >= 0) {
                jArr[iIndexOf] = rq3Var.nextLong();
            } else {
                rq3Var.v();
            }
        }
        rq3Var.j0();
        return d(jArr);
    }

    @Override // com.google.gson.b
    public final void c(hs3 hs3Var, Object obj) throws IOException {
        if (obj == null) {
            hs3Var.u();
            return;
        }
        hs3Var.F0();
        long[] jArrE = e(obj);
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                hs3Var.j0();
                return;
            } else {
                hs3Var.m((String) list.get(i));
                hs3Var.X(jArrE[i]);
                i++;
            }
        }
    }

    public abstract Object d(long[] jArr);

    public abstract long[] e(Object obj);
}

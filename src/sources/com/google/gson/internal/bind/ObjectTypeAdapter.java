package com.google.gson.internal.bind;

import defpackage.bt;
import defpackage.hs3;
import defpackage.ie2;
import defpackage.p61;
import defpackage.pc6;
import defpackage.rq3;
import defpackage.vg8;
import defpackage.ya4;
import defpackage.yi8;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectTypeAdapter extends com.google.gson.b {
    public static final vg8 c = new AnonymousClass1(1);
    public final com.google.gson.a a;
    public final int b;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    class AnonymousClass1 implements vg8 {
        public final /* synthetic */ int X;

        public AnonymousClass1(int i) {
            this.X = i;
        }

        @Override // defpackage.vg8
        public final com.google.gson.b a(com.google.gson.a aVar, yi8 yi8Var) {
            if (yi8Var.a == Object.class) {
                return new ObjectTypeAdapter(aVar, this.X);
            }
            return null;
        }
    }

    public ObjectTypeAdapter(com.google.gson.a aVar, int i) {
        this.a = aVar;
        this.b = i;
    }

    public static vg8 d(int i) {
        return i == 1 ? c : new AnonymousClass1(i);
    }

    @Override // com.google.gson.b
    public final Object b(rq3 rq3Var) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        int iC0 = rq3Var.c0();
        int iB = p61.B(iC0);
        if (iB == 0) {
            rq3Var.Q0();
            arrayList = new ArrayList();
        } else if (iB != 2) {
            arrayList = null;
        } else {
            rq3Var.F0();
            arrayList = new ya4(true);
        }
        if (arrayList == null) {
            return e(iC0, rq3Var);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (rq3Var.hasNext()) {
                String strE0 = arrayList instanceof Map ? rq3Var.e0() : null;
                int iC1 = rq3Var.c0();
                int iB2 = p61.B(iC1);
                if (iB2 == 0) {
                    rq3Var.Q0();
                    arrayList2 = new ArrayList();
                } else if (iB2 != 2) {
                    arrayList2 = null;
                } else {
                    rq3Var.F0();
                    arrayList2 = new ya4(true);
                }
                boolean z = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = e(iC1, rq3Var);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strE0, arrayList2);
                }
                if (z) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    rq3Var.K0();
                } else {
                    rq3Var.j0();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.b
    public final void c(hs3 hs3Var, Object obj) throws IOException {
        if (obj == null) {
            hs3Var.u();
            return;
        }
        Class<?> cls = obj.getClass();
        com.google.gson.a aVar = this.a;
        aVar.getClass();
        com.google.gson.b bVarE = aVar.e(new yi8(cls));
        if (!(bVarE instanceof ObjectTypeAdapter)) {
            bVarE.c(hs3Var, obj);
        } else {
            hs3Var.F0();
            hs3Var.j0();
        }
    }

    public final Serializable e(int i, rq3 rq3Var) throws IOException {
        int iB = p61.B(i);
        if (iB == 5) {
            return rq3Var.r();
        }
        if (iB == 6) {
            return pc6.b(this.b, rq3Var);
        }
        if (iB == 7) {
            return Boolean.valueOf(rq3Var.R());
        }
        if (iB == 8) {
            rq3Var.X();
            return null;
        }
        bt.i("Unexpected token: ".concat(ie2.r(i)));
        return null;
    }
}

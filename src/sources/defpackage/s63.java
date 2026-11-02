package defpackage;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s63 {
    public final Context a;
    public t63 b;
    public Object c;
    public r18 d;
    public final Map e;
    public s61 f;
    public s61 g;
    public s61 h;
    public ab7 i;
    public pw6 j;
    public tr5 k;
    public Object l;

    public s63(v63 v63Var, Context context) {
        this.a = context;
        this.b = v63Var.t;
        this.c = v63Var.b;
        this.d = v63Var.c;
        this.e = v63Var.d;
        u63 u63Var = v63Var.s;
        this.f = u63Var.a;
        this.g = u63Var.b;
        this.h = u63Var.c;
        this.i = u63Var.d;
        this.j = u63Var.e;
        this.k = u63Var.f;
        this.l = v63Var.r;
    }

    public final v63 a() {
        s72 s72Var;
        Object obj = this.c;
        if (obj == null) {
            obj = a75.a;
        }
        Object obj2 = obj;
        r18 r18Var = this.d;
        Boolean bool = Boolean.FALSE;
        Map mapP = this.e;
        if (dh3.f(mapP, bool)) {
            mapP.getClass();
            mapP = w51.P(ci8.f(mapP));
        } else if (mapP == null) {
            throw new AssertionError();
        }
        Map map = mapP;
        map.getClass();
        t63 t63Var = this.b;
        s92 s92Var = t63Var.a;
        kc0 kc0Var = t63Var.e;
        kc0 kc0Var2 = t63Var.f;
        kc0 kc0Var3 = t63Var.g;
        s61 s61Var = this.f;
        if (s61Var == null) {
            s61Var = t63Var.b;
        }
        s61 s61Var2 = s61Var;
        s61 s61Var3 = this.g;
        if (s61Var3 == null) {
            s61Var3 = t63Var.c;
        }
        s61 s61Var4 = s61Var3;
        s61 s61Var5 = this.h;
        if (s61Var5 == null) {
            s61Var5 = t63Var.d;
        }
        s61 s61Var6 = s61Var5;
        ve7 ve7Var = ve7.o0;
        ab7 ab7Var = this.i;
        if (ab7Var == null) {
            ab7Var = t63Var.k;
        }
        ab7 ab7Var2 = ab7Var;
        pw6 pw6Var = this.j;
        if (pw6Var == null) {
            pw6Var = t63Var.l;
        }
        pw6 pw6Var2 = pw6Var;
        tr5 tr5Var = this.k;
        if (tr5Var == null) {
            tr5Var = t63Var.m;
        }
        tr5 tr5Var2 = tr5Var;
        Object obj3 = this.l;
        if (obj3 instanceof r72) {
            s72Var = new s72(w51.P(((r72) obj3).a));
        } else {
            if (!(obj3 instanceof s72)) {
                throw new AssertionError();
            }
            s72Var = (s72) obj3;
        }
        return new v63(this.a, obj2, r18Var, map, s92Var, s61Var2, s61Var4, s61Var6, kc0Var, kc0Var2, kc0Var3, ve7Var, ve7Var, ve7Var, ab7Var2, pw6Var2, tr5Var2, s72Var, new u63(this.f, this.g, this.h, this.i, this.j, this.k), this.b);
    }

    public s63(Context context) {
        this.a = context;
        this.b = t63.o;
        this.c = null;
        this.d = null;
        this.e = e02.X;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = s72.b;
    }
}

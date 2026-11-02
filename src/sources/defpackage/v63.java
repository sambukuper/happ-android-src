package defpackage;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v63 {
    public final Context a;
    public final Object b;
    public final r18 c;
    public final Map d;
    public final s92 e;
    public final s61 f;
    public final s61 g;
    public final s61 h;
    public final kc0 i;
    public final kc0 j;
    public final kc0 k;
    public final gn2 l;
    public final gn2 m;
    public final gn2 n;
    public final ab7 o;
    public final pw6 p;
    public final tr5 q;
    public final s72 r;
    public final u63 s;
    public final t63 t;

    public v63(Context context, Object obj, r18 r18Var, Map map, s92 s92Var, s61 s61Var, s61 s61Var2, s61 s61Var3, kc0 kc0Var, kc0 kc0Var2, kc0 kc0Var3, gn2 gn2Var, gn2 gn2Var2, gn2 gn2Var3, ab7 ab7Var, pw6 pw6Var, tr5 tr5Var, s72 s72Var, u63 u63Var, t63 t63Var) {
        this.a = context;
        this.b = obj;
        this.c = r18Var;
        this.d = map;
        this.e = s92Var;
        this.f = s61Var;
        this.g = s61Var2;
        this.h = s61Var3;
        this.i = kc0Var;
        this.j = kc0Var2;
        this.k = kc0Var3;
        this.l = gn2Var;
        this.m = gn2Var2;
        this.n = gn2Var3;
        this.o = ab7Var;
        this.p = pw6Var;
        this.q = tr5Var;
        this.r = s72Var;
        this.s = u63Var;
        this.t = t63Var;
    }

    public static s63 a(v63 v63Var) {
        Context context = v63Var.a;
        v63Var.getClass();
        return new s63(v63Var, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v63)) {
            return false;
        }
        v63 v63Var = (v63) obj;
        return dh3.f(this.a, v63Var.a) && this.b.equals(v63Var.b) && dh3.f(this.c, v63Var.c) && this.d.equals(v63Var.d) && dh3.f(this.e, v63Var.e) && dh3.f(this.f, v63Var.f) && dh3.f(this.g, v63Var.g) && dh3.f(this.h, v63Var.h) && this.i == v63Var.i && this.j == v63Var.j && this.k == v63Var.k && dh3.f(this.l, v63Var.l) && dh3.f(this.m, v63Var.m) && dh3.f(this.n, v63Var.n) && dh3.f(this.o, v63Var.o) && this.p == v63Var.p && this.q == v63Var.q && this.r.equals(v63Var.r) && this.s.equals(v63Var.s) && dh3.f(this.t, v63Var.t);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        r18 r18Var = this.c;
        return this.t.hashCode() + ((this.s.hashCode() + ((this.r.a.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((iHashCode + (r18Var == null ? 0 : r18Var.hashCode())) * 29791)) * 961)) * 29791)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImageRequest(context=" + this.a + ", data=" + this.b + ", target=" + this.c + ", listener=null, memoryCacheKey=null, memoryCacheKeyExtras=" + this.d + ", diskCacheKey=null, fileSystem=" + this.e + ", fetcherFactory=null, decoderFactory=null, interceptorCoroutineContext=" + this.f + ", fetcherCoroutineContext=" + this.g + ", decoderCoroutineContext=" + this.h + ", memoryCachePolicy=" + this.i + ", diskCachePolicy=" + this.j + ", networkCachePolicy=" + this.k + ", placeholderMemoryCacheKey=null, placeholderFactory=" + this.l + ", errorFactory=" + this.m + ", fallbackFactory=" + this.n + ", sizeResolver=" + this.o + ", scale=" + this.p + ", precision=" + this.q + ", extras=" + this.r + ", defined=" + this.s + ", defaults=" + this.t + ")";
    }
}

package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pd5 {
    public final Context a;
    public final ta7 b;
    public final pw6 c;
    public final tr5 d;
    public final String e;
    public final s92 f;
    public final kc0 g;
    public final kc0 h;
    public final kc0 i;
    public final s72 j;

    public pd5(Context context, ta7 ta7Var, pw6 pw6Var, tr5 tr5Var, String str, s92 s92Var, kc0 kc0Var, kc0 kc0Var2, kc0 kc0Var3, s72 s72Var) {
        this.a = context;
        this.b = ta7Var;
        this.c = pw6Var;
        this.d = tr5Var;
        this.e = str;
        this.f = s92Var;
        this.g = kc0Var;
        this.h = kc0Var2;
        this.i = kc0Var3;
        this.j = s72Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd5)) {
            return false;
        }
        pd5 pd5Var = (pd5) obj;
        return dh3.f(this.a, pd5Var.a) && dh3.f(this.b, pd5Var.b) && this.c == pd5Var.c && this.d == pd5Var.d && dh3.f(this.e, pd5Var.e) && dh3.f(this.f, pd5Var.f) && this.g == pd5Var.g && this.h == pd5Var.h && this.i == pd5Var.i && dh3.f(this.j, pd5Var.j);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        return this.j.a.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.a + ", size=" + this.b + ", scale=" + this.c + ", precision=" + this.d + ", diskCacheKey=" + this.e + ", fileSystem=" + this.f + ", memoryCachePolicy=" + this.g + ", diskCachePolicy=" + this.h + ", networkCachePolicy=" + this.i + ", extras=" + this.j + ")";
    }
}

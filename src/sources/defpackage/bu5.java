package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bu5 implements e37 {
    public final String a;
    public final zt5 b;

    public bu5(String str, zt5 zt5Var) {
        zt5Var.getClass();
        this.a = str;
        this.b = zt5Var;
    }

    @Override // defpackage.e37
    public final String a() {
        return this.a;
    }

    public final void b() {
        throw new IllegalStateException(oi0.p(new StringBuilder("Primitive descriptor "), this.a, " does not have elements"));
    }

    @Override // defpackage.e37
    public final int d(String str) {
        str.getClass();
        b();
        throw null;
    }

    @Override // defpackage.e37
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu5)) {
            return false;
        }
        bu5 bu5Var = (bu5) obj;
        return this.a.equals(bu5Var.a) && dh3.f(this.b, bu5Var.b);
    }

    @Override // defpackage.e37
    public final String f(int i) {
        b();
        throw null;
    }

    @Override // defpackage.e37
    public final List g(int i) {
        b();
        throw null;
    }

    @Override // defpackage.e37
    public final e37 h(int i) {
        b();
        throw null;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.e37
    public final boolean j(int i) {
        b();
        throw null;
    }

    @Override // defpackage.e37
    public final nr4 r() {
        return this.b;
    }

    public final String toString() {
        return oi0.o(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}

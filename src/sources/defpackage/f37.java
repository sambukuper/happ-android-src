package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f37 implements e37, tc0 {
    public final e37 a;
    public final String b;
    public final Set c;

    public f37(e37 e37Var) {
        e37Var.getClass();
        this.a = e37Var;
        this.b = e37Var.a() + '?';
        this.c = wl7.o(e37Var);
    }

    @Override // defpackage.e37
    public final String a() {
        return this.b;
    }

    @Override // defpackage.tc0
    public final Set b() {
        return this.c;
    }

    @Override // defpackage.e37
    public final boolean c() {
        return true;
    }

    @Override // defpackage.e37
    public final int d(String str) {
        str.getClass();
        return this.a.d(str);
    }

    @Override // defpackage.e37
    public final int e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f37) {
            return dh3.f(this.a, ((f37) obj).a);
        }
        return false;
    }

    @Override // defpackage.e37
    public final String f(int i) {
        return this.a.f(i);
    }

    @Override // defpackage.e37
    public final List g(int i) {
        return this.a.g(i);
    }

    @Override // defpackage.e37
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // defpackage.e37
    public final e37 h(int i) {
        return this.a.h(i);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.e37
    public final boolean i() {
        return this.a.i();
    }

    @Override // defpackage.e37
    public final boolean j(int i) {
        return this.a.j(i);
    }

    @Override // defpackage.e37
    public final nr4 r() {
        return this.a.r();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}

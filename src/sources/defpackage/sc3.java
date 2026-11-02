package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sc3 extends zp5 {
    public final boolean l;

    public sc3(String str, dq2 dq2Var) {
        super(str, dq2Var, 1);
        this.l = true;
    }

    @Override // defpackage.zp5
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sc3) {
            e37 e37Var = (e37) obj;
            if (this.a.equals(e37Var.a())) {
                sc3 sc3Var = (sc3) obj;
                if (sc3Var.l && Arrays.equals((e37[]) this.j.getValue(), (e37[]) sc3Var.j.getValue())) {
                    int iE = e37Var.e();
                    int i = this.c;
                    if (i == iE) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (dh3.f(h(i2).a(), e37Var.h(i2).a()) && dh3.f(h(i2).r(), e37Var.h(i2).r())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.zp5
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // defpackage.e37
    public final boolean i() {
        return this.l;
    }
}

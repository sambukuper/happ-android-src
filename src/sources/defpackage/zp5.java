package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class zp5 implements e37, tc0 {
    public final String a;
    public final dq2 b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final g44 i;
    public final g44 j;
    public final g44 k;

    public zp5(String str, dq2 dq2Var, int i) {
        this.a = str;
        this.b = dq2Var;
        this.c = i;
        String[] strArr = new String[i];
        final byte b = 0;
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.g = new boolean[i3];
        this.h = e02.X;
        dn2 dn2Var = new dn2(this) { // from class: yp5
            public final /* synthetic */ zp5 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b2 = b;
                zp5 zp5Var = this.Y;
                switch (b2) {
                    case 0:
                        dq2 dq2Var2 = zp5Var.b;
                        return dq2Var2 != null ? dq2Var2.c() : z68.i;
                    case 1:
                        return wl7.u(zp5Var.b != null ? new ArrayList(0) : null);
                    default:
                        return Integer.valueOf(dh3.z(zp5Var, (e37[]) zp5Var.j.getValue()));
                }
            }
        };
        w74 w74Var = w74.X;
        this.i = x97.P(w74Var, dn2Var);
        final byte b2 = 1;
        this.j = x97.P(w74Var, new dn2(this) { // from class: yp5
            public final /* synthetic */ zp5 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b3 = b2;
                zp5 zp5Var = this.Y;
                switch (b3) {
                    case 0:
                        dq2 dq2Var2 = zp5Var.b;
                        return dq2Var2 != null ? dq2Var2.c() : z68.i;
                    case 1:
                        return wl7.u(zp5Var.b != null ? new ArrayList(0) : null);
                    default:
                        return Integer.valueOf(dh3.z(zp5Var, (e37[]) zp5Var.j.getValue()));
                }
            }
        });
        final byte b3 = 2;
        this.k = x97.P(w74Var, new dn2(this) { // from class: yp5
            public final /* synthetic */ zp5 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b4 = b3;
                zp5 zp5Var = this.Y;
                switch (b4) {
                    case 0:
                        dq2 dq2Var2 = zp5Var.b;
                        return dq2Var2 != null ? dq2Var2.c() : z68.i;
                    case 1:
                        return wl7.u(zp5Var.b != null ? new ArrayList(0) : null);
                    default:
                        return Integer.valueOf(dh3.z(zp5Var, (e37[]) zp5Var.j.getValue()));
                }
            }
        });
    }

    @Override // defpackage.e37
    public final String a() {
        return this.a;
    }

    @Override // defpackage.tc0
    public final Set b() {
        return this.h.keySet();
    }

    @Override // defpackage.e37
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.e37
    public final int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zp5) {
            e37 e37Var = (e37) obj;
            if (this.a.equals(e37Var.a()) && Arrays.equals((e37[]) this.j.getValue(), (e37[]) ((zp5) obj).j.getValue())) {
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
        return false;
    }

    @Override // defpackage.e37
    public final String f(int i) {
        return this.e[i];
    }

    @Override // defpackage.e37
    public final List g(int i) {
        List list = this.f[i];
        return list == null ? d02.X : list;
    }

    @Override // defpackage.e37
    public final List getAnnotations() {
        return d02.X;
    }

    @Override // defpackage.e37
    public e37 h(int i) {
        return ((ow3[]) this.i.getValue())[i].d();
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // defpackage.e37
    public final boolean j(int i) {
        return this.g[i];
    }

    public final void k(String str, boolean z) {
        str.getClass();
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = map;
        }
    }

    @Override // defpackage.e37
    public nr4 r() {
        return pm7.M;
    }

    public String toString() {
        return dh3.U(this);
    }
}

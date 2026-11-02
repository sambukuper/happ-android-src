package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fp4 extends hp4 implements Iterator, qv3 {
    public final /* synthetic */ byte g0;

    public fp4(ip4 ip4Var, byte b) {
        this.g0 = b;
        this.f0 = ip4Var;
        this.Y = -1;
        this.Z = ip4Var.j0;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.g0) {
            case 0:
                b();
                int i = this.X;
                ip4 ip4Var = (ip4) this.f0;
                if (i >= ip4Var.h0) {
                    bt.n();
                    return null;
                }
                this.X = i + 1;
                this.Y = i;
                gp4 gp4Var = new gp4(ip4Var, i);
                c();
                return gp4Var;
            case 1:
                b();
                int i2 = this.X;
                ip4 ip4Var2 = (ip4) this.f0;
                if (i2 >= ip4Var2.h0) {
                    bt.n();
                    return null;
                }
                this.X = i2 + 1;
                this.Y = i2;
                Object obj = ip4Var2.X[i2];
                c();
                return obj;
            default:
                b();
                int i3 = this.X;
                ip4 ip4Var3 = (ip4) this.f0;
                if (i3 >= ip4Var3.h0) {
                    bt.n();
                    return null;
                }
                this.X = i3 + 1;
                this.Y = i3;
                Object[] objArr = ip4Var3.Y;
                objArr.getClass();
                Object obj2 = objArr[this.Y];
                c();
                return obj2;
        }
    }
}

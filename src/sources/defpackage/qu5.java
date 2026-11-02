package defpackage;

import io.sentry.c2;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qu5 implements Iterator {
    public final /* synthetic */ byte X;
    public final Iterator Y;
    public Object Z;
    public final /* synthetic */ wu5 f0;

    public qu5(wu5 wu5Var, byte b) {
        this.X = b;
        switch (b) {
            case 1:
                this.f0 = wu5Var;
                this.Y = wu5Var.X.values().iterator();
                break;
            case 2:
                this.f0 = wu5Var;
                this.Y = wu5Var.X.keySet().iterator();
                break;
            default:
                this.f0 = wu5Var;
                this.Y = wu5Var.X.values().iterator();
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.X) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.Y.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.X;
        Iterator it = this.Y;
        switch (b) {
            case 0:
                this.Z = (su5) it.next();
                return new vu5(this.f0, (su5) this.Z);
            case 1:
                su5 su5Var = (su5) it.next();
                this.Z = su5Var;
                return su5Var.a();
            default:
                Object next = it.next();
                this.Z = next;
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        byte b = this.X;
        wu5 wu5Var = this.f0;
        switch (b) {
            case 0:
                su5 su5Var = (su5) this.Z;
                z = su5Var != null;
                int i = wu5.q0;
                if (!z) {
                    c2.g();
                } else {
                    wu5Var.remove(su5Var.X);
                    this.Z = null;
                }
                break;
            case 1:
                su5 su5Var2 = (su5) this.Z;
                z = su5Var2 != null;
                int i2 = wu5.q0;
                if (!z) {
                    c2.g();
                } else {
                    wu5Var.remove(su5Var2.X);
                    this.Z = null;
                }
                break;
            default:
                Object obj = this.Z;
                z = obj != null;
                int i3 = wu5.q0;
                if (!z) {
                    c2.g();
                } else {
                    wu5Var.remove(obj);
                    this.Z = null;
                }
                break;
        }
    }
}

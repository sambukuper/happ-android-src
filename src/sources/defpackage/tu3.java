package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class tu3 implements fz3 {
    public static final gz3 c = new gz3(yb6.a.b(tu3.class));
    public boolean a;
    public final ArrayList b = new ArrayList();

    @Override // defpackage.fz3
    public final gz3 c() {
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!tu3.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        tu3 tu3Var = (tu3) obj;
        return this.a == tu3Var.a && this.b.equals(tu3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}

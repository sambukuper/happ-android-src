package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sf3 implements lh8 {
    public final Set X;
    public final vz7 Y;

    public sf3(Set set) {
        ch8.Y.getClass();
        ch8 ch8Var = ch8.Z;
        ch8Var.getClass();
        dh3.O(u32.a(o32.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), ch8Var, this, d02.X, false);
        this.Y = new vz7(new tz(this));
        this.X = set;
    }

    @Override // defpackage.lh8
    public final boolean B() {
        return false;
    }

    @Override // defpackage.lh8
    public final Collection c() {
        return (List) this.Y.getValue();
    }

    @Override // defpackage.lh8
    public final zz3 f() {
        throw null;
    }

    @Override // defpackage.lh8
    public final List g() {
        return d02.X;
    }

    public final String toString() {
        return "IntegerLiteralType".concat("[" + wv0.y0(this.X, ",", null, null, cl1.k0, 30) + ']');
    }

    @Override // defpackage.lh8
    public final ot0 x() {
        return null;
    }
}

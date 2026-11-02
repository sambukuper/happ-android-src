package defpackage;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class ml5 extends b2 {
    public static final ml5 Z = new ml5(jf8.e, 0);
    public final jf8 X;
    public final int Y;

    public ml5(jf8 jf8Var, int i) {
        this.X = jf8Var;
        this.Y = i;
    }

    @Override // defpackage.b2
    public final Set a() {
        return new yl5(this, (byte) 0);
    }

    @Override // defpackage.b2
    public final Set b() {
        return new yl5(this, (byte) 1);
    }

    @Override // defpackage.b2
    public final int c() {
        return this.Y;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.X.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // defpackage.b2
    public final Collection e() {
        return new eq4(this, (byte) 1);
    }

    public final ml5 f(Object obj, bb4 bb4Var) {
        h70 h70VarU = this.X.u(obj != null ? obj.hashCode() : 0, 0, obj, bb4Var);
        return h70VarU == null ? this : new ml5((jf8) h70VarU.Z, this.Y + (h70VarU.Y ? 1 : 0));
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.X.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}

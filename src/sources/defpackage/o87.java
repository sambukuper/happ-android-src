package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o87 {
    public final boolean a;
    public final gn2 b;
    public ta2 c;
    public final t5 d;
    public ta2 e;
    public ta2 f;

    public o87(boolean z, dn2 dn2Var, dn2 dn2Var2, p87 p87Var, gn2 gn2Var) {
        this.a = z;
        this.b = gn2Var;
        if (z && p87Var == p87.Z) {
            bt.q("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
            throw null;
        }
        this.c = m87.a;
        this.d = new t5(p87Var, new xo(dn2Var, (byte) 6), dn2Var2, new hr5(this, (byte) 20), gn2Var);
        this.e = new cd7();
        this.f = new cd7();
    }

    public static Object a(o87 o87Var, p87 p87Var, ta2 ta2Var, uy7 uy7Var) {
        Object objB = o87Var.d.b(p87Var, f15.X, new n87(o87Var, ((nh5) o87Var.d.l0).l(), ta2Var, null), uy7Var);
        return objB == c71.X ? objB : dn8.a;
    }

    public final Object b(uy7 uy7Var) {
        Object objA;
        gn2 gn2Var = this.b;
        p87 p87Var = p87.Y;
        return (((Boolean) gn2Var.B(p87Var)).booleanValue() && (objA = a(this, p87Var, this.e, uy7Var)) == c71.X) ? objA : dn8.a;
    }

    public final Object c(uy7 uy7Var) {
        Object objA;
        gn2 gn2Var = this.b;
        p87 p87Var = p87.X;
        return (((Boolean) gn2Var.B(p87Var)).booleanValue() && (objA = a(this, p87Var, this.f, uy7Var)) == c71.X) ? objA : dn8.a;
    }

    public final boolean d() {
        return ((rh5) this.d.i0).getValue() != p87.X;
    }

    public final Object e(uy7 uy7Var) {
        Object objA;
        if (this.a) {
            bt.i("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
            return null;
        }
        gn2 gn2Var = this.b;
        p87 p87Var = p87.Z;
        return (((Boolean) gn2Var.B(p87Var)).booleanValue() && (objA = a(this, p87Var, this.f, uy7Var)) == c71.X) ? objA : dn8.a;
    }

    public final Object f(uy7 uy7Var) {
        Object objA;
        Map map = this.d.d().a;
        p87 p87Var = p87.Z;
        if (!map.containsKey(p87Var)) {
            p87Var = p87.Y;
        }
        return (((Boolean) this.b.B(p87Var)).booleanValue() && (objA = a(this, p87Var, this.e, uy7Var)) == c71.X) ? objA : dn8.a;
    }
}

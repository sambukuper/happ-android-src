package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mo2 extends nd0 implements bo2, pv3 {
    private final int arity;

    public mo2(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
    }

    @Override // defpackage.nd0
    public final xu3 S() {
        return yb6.a.a(this);
    }

    @Override // defpackage.nd0
    public final xu3 V() {
        return (pv3) super.V();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mo2) {
            mo2 mo2Var = (mo2) obj;
            return getName().equals(mo2Var.getName()) && a().equals(mo2Var.a()) && dh3.f(this.receiver, mo2Var.receiver) && dh3.f(U(), mo2Var.U());
        }
        if (obj instanceof pv3) {
            return obj.equals(f());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode() + ((getName().hashCode() + (U() == null ? 0 : U().hashCode() * 31)) * 31);
    }

    @Override // defpackage.pv3
    public final boolean i() {
        return ((pv3) super.V()).i();
    }

    @Override // defpackage.pv3
    public final boolean k() {
        return ((pv3) super.V()).k();
    }

    @Override // defpackage.pv3
    public final boolean o() {
        return ((pv3) super.V()).o();
    }

    @Override // defpackage.pv3
    public final boolean s() {
        return ((pv3) super.V()).s();
    }

    @Override // defpackage.bo2
    public final int t() {
        return this.arity;
    }

    public final String toString() {
        xu3 xu3VarF = f();
        if (xu3VarF != this) {
            return xu3VarF.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}

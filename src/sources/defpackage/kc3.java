package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kc3 implements pk {
    public final hx1 a;
    public final be6 b;

    public kc3(hx1 hx1Var, be6 be6Var) {
        this.a = hx1Var;
        this.b = be6Var;
        if (hx1Var instanceof sg8) {
            sg8 sg8Var = (sg8) hx1Var;
            if (sg8Var.a != 0 || sg8Var.b != 0) {
                return;
            }
        } else if (!(hx1Var instanceof cd7) && (!(hx1Var instanceof ay3) || ((ay3) hx1Var).a.a != 0)) {
            return;
        }
        bt.q("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    @Override // defpackage.pk
    public final ju8 a(ug8 ug8Var) {
        return new e86(this.a.a(ug8Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kc3)) {
            return false;
        }
        kc3 kc3Var = (kc3) obj;
        return kc3Var.a.equals(this.a) && kc3Var.b == this.b;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}

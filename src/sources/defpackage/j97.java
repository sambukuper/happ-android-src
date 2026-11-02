package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class j97 implements rj2 {
    public final rj2 a;
    public final h97 b;

    public j97(rj2 rj2Var, h97 h97Var) {
        rj2Var.getClass();
        this.a = rj2Var;
        this.b = h97Var;
    }

    @Override // defpackage.rj2
    public final void a(Object obj, StringBuilder sb, boolean z) {
        Character ch = (z || !((Boolean) this.b.B(obj)).booleanValue()) ? '+' : '-';
        sb.append(ch.charValue());
        this.a.a(obj, sb, z || ch.charValue() == '-');
    }
}

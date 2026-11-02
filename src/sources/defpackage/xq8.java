package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xq8 implements me6 {
    public final /* synthetic */ br8 X;

    public xq8(br8 br8Var) {
        this.X = br8Var;
    }

    @Override // defpackage.me6
    public final void J(te6 te6Var, long j, de deVar) {
        Integer num;
        if (this.X.q.a == 0 || (num = (Integer) te6Var.b(e18.b)) == null) {
            return;
        }
        br8 br8Var = this.X;
        int iIntValue = num.intValue();
        synchronized (br8Var.c) {
            kt ktVar = br8Var.f;
            while (!ktVar.isEmpty() && ((yq8) ktVar.first()).a <= iIntValue) {
                ((yq8) ktVar.first()).b.V(dn8.a);
                bw0.i0(ktVar);
                this.X.q.a();
            }
        }
    }

    @Override // defpackage.me6
    public final void X(te6 te6Var, long j, se6 se6Var) {
        Integer num;
        if (this.X.q.a == 0 || (num = (Integer) te6Var.b(e18.b)) == null) {
            return;
        }
        br8 br8Var = this.X;
        int iIntValue = num.intValue();
        synchronized (br8Var.c) {
            kt ktVar = br8Var.f;
            Throwable th = new Throwable("Failed in framework level".concat(" with CaptureFailure.reason = " + se6Var.R()));
            while (!ktVar.isEmpty() && ((yq8) ktVar.first()).a <= iIntValue) {
                ((yq8) ktVar.first()).b.l0(th);
                bw0.i0(ktVar);
                this.X.q.a();
            }
        }
    }
}

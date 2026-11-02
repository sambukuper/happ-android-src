package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qk implements lh7 {
    public final ug8 X;
    public final rh5 Y;
    public wk Z;
    public long f0;
    public long g0;
    public boolean h0;

    public qk(ug8 ug8Var, Object obj, wk wkVar, long j, long j2, boolean z) {
        wk wkVarP;
        this.X = ug8Var;
        this.Y = z51.H(obj);
        if (wkVar != null) {
            wkVarP = ci8.p(wkVar);
        } else {
            wkVarP = (wk) ug8Var.a.B(obj);
            wkVarP.d();
        }
        this.Z = wkVarP;
        this.f0 = j;
        this.g0 = j2;
        this.h0 = z;
    }

    public final Object a() {
        return this.X.b.B(this.Z);
    }

    @Override // defpackage.lh7
    public final Object getValue() {
        return this.Y.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.Y.getValue() + ", velocity=" + a() + ", isRunning=" + this.h0 + ", lastFrameTimeNanos=" + this.f0 + ", finishedTimeNanos=" + this.g0 + ")";
    }

    public /* synthetic */ qk(ug8 ug8Var, Object obj, wk wkVar, int i) {
        this(ug8Var, obj, (i & 4) != 0 ? null : wkVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}

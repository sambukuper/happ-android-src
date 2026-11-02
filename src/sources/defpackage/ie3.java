package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ie3 extends jx4 implements ye8 {
    public v09 q0;
    public v09 r0;

    public ie3() {
        wc2 wc2Var = w51.p;
        this.q0 = wc2Var;
        this.r0 = wc2Var;
    }

    @Override // defpackage.jx4
    public void Q0() {
        ts7.g(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new he3(this, (byte) 1));
        Z0();
    }

    @Override // defpackage.jx4
    public void R0() {
        this.r0 = this.q0;
        ts7.i(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new he3(this, (byte) 0));
    }

    @Override // defpackage.jx4
    public final void S0() {
        this.q0 = w51.p;
    }

    public abstract v09 Y0(v09 v09Var);

    public void Z0() {
        this.r0 = Y0(this.q0);
        ts7.i(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new he3(this, (byte) 0));
    }

    @Override // defpackage.ye8
    public final Object o() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }
}

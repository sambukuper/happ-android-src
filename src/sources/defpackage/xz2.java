package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xz2 extends m31 {
    public m31[] q0 = new m31[4];
    public int r0 = 0;

    public final void R(int i, i09 i09Var, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.r0; i2++) {
            m31 m31Var = this.q0[i2];
            ArrayList arrayList2 = i09Var.a;
            if (!arrayList2.contains(m31Var)) {
                arrayList2.add(m31Var);
            }
        }
        for (int i3 = 0; i3 < this.r0; i3++) {
            w51.z(this.q0[i3], i, arrayList, i09Var);
        }
    }

    public void S() {
    }
}

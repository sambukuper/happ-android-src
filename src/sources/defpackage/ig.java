package defpackage;

import androidx.compose.material.ripple.RippleNode;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ig extends RippleNode {
    public gl6 A0;
    public el6 z0;

    @Override // defpackage.jx4
    public final void R0() throws InterruptedException {
        el6 el6Var = this.z0;
        if (el6Var != null) {
            this.A0 = null;
            z68.W(this);
            xd6 xd6Var = el6Var.i0;
            gl6 gl6Var = (gl6) ((LinkedHashMap) xd6Var.Y).get(this);
            if (gl6Var != null) {
                gl6Var.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) xd6Var.Y;
                gl6 gl6Var2 = (gl6) linkedHashMap.get(this);
                if (gl6Var2 != null) {
                }
                linkedHashMap.remove(this);
                el6Var.h0.add(gl6Var);
            }
        }
    }
}

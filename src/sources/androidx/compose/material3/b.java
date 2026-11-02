package androidx.compose.material3;

import defpackage.dl6;
import defpackage.dw0;
import defpackage.fw0;
import defpackage.hi5;
import defpackage.hl6;
import defpackage.j41;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements fw0 {
    public final /* synthetic */ DelegatingThemeAwareRippleNode a;

    public b(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        this.a = delegatingThemeAwareRippleNode;
    }

    @Override // defpackage.fw0
    public final long a() {
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.a;
        long jA = delegatingThemeAwareRippleNode.color.a();
        if (jA != 16) {
            return jA;
        }
        dl6 dl6Var = (dl6) hi5.W(delegatingThemeAwareRippleNode, hl6.a);
        if (dl6Var != null) {
            long j = dl6Var.a;
            if (j != 16) {
                return j;
            }
        }
        return ((dw0) hi5.W(delegatingThemeAwareRippleNode, j41.a)).a;
    }
}

package androidx.compose.material3;

import defpackage.dl6;
import defpackage.dn2;
import defpackage.dn8;
import defpackage.hi5;
import defpackage.hl6;
import defpackage.ig;
import defpackage.il6;
import defpackage.sg8;
import defpackage.w51;
import defpackage.xz4;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ DelegatingThemeAwareRippleNode Y;

    public /* synthetic */ a(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode, byte b) {
        this.X = b;
        this.Y = delegatingThemeAwareRippleNode;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.Y;
        switch (b) {
            case 0:
                dl6 dl6Var = (dl6) hi5.W(delegatingThemeAwareRippleNode, hl6.a);
                ig igVar = delegatingThemeAwareRippleNode.v0;
                if (dl6Var == null) {
                    if (igVar != null) {
                        delegatingThemeAwareRippleNode.Z0(igVar);
                    }
                    delegatingThemeAwareRippleNode.v0 = null;
                } else if (igVar == null) {
                    b bVar = new b(delegatingThemeAwareRippleNode);
                    a aVar = new a(delegatingThemeAwareRippleNode, (byte) 1);
                    xz4 xz4Var = delegatingThemeAwareRippleNode.s0;
                    boolean z = delegatingThemeAwareRippleNode.t0;
                    float f = delegatingThemeAwareRippleNode.u0;
                    sg8 sg8Var = il6.a;
                    ig igVar2 = new ig(xz4Var, z, f, bVar, aVar);
                    delegatingThemeAwareRippleNode.Y0(igVar2);
                    delegatingThemeAwareRippleNode.v0 = igVar2;
                }
                return dn8.a;
            default:
                return w51.o;
        }
    }
}

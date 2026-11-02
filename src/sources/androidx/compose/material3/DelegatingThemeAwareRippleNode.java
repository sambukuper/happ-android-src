package androidx.compose.material3;

import defpackage.ch3;
import defpackage.fw0;
import defpackage.ig;
import defpackage.jl6;
import defpackage.oh1;
import defpackage.s01;
import defpackage.w85;
import defpackage.xz4;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material3/DelegatingThemeAwareRippleNode;", "Loh1;", "Ls01;", "Lw85;", "Lfw0;", "color", "Lfw0;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DelegatingThemeAwareRippleNode extends oh1 implements s01, w85 {
    private final fw0 color;
    public final xz4 s0;
    public final boolean t0;
    public final float u0;
    public ig v0;

    public DelegatingThemeAwareRippleNode(xz4 xz4Var, boolean z, float f, jl6 jl6Var) {
        this.s0 = xz4Var;
        this.t0 = z;
        this.u0 = f;
        this.color = jl6Var;
    }

    @Override // defpackage.jx4
    public final void Q0() {
        ch3.N(this, new a(this, (byte) 0));
    }

    @Override // defpackage.w85
    public final void q0() {
        ch3.N(this, new a(this, (byte) 0));
    }
}

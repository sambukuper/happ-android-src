package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zb extends s51 {
    public /* synthetic */ Object f0;
    public final /* synthetic */ AndroidComposeView g0;
    public int h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(AndroidComposeView androidComposeView, s51 s51Var) {
        super(s51Var);
        this.g0 = androidComposeView;
    }

    @Override // defpackage.r10
    public final Object q(Object obj) {
        this.f0 = obj;
        this.h0 |= Integer.MIN_VALUE;
        this.g0.H(null, this);
        return c71.X;
    }
}

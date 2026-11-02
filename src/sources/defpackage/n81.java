package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n81 extends h12 {
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n81(g12 g12Var, byte b) {
        super(g12Var);
        this.e = b;
    }

    @Override // defpackage.h12
    public void q() {
        switch (this.e) {
            case 0:
                g12 g12Var = this.b;
                g12Var.t0 = null;
                CheckableImageButton checkableImageButton = g12Var.l0;
                checkableImageButton.setOnLongClickListener(null);
                ue3.W(checkableImageButton, null);
                break;
        }
    }
}

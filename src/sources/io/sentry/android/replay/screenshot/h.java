package io.sentry.android.replay.screenshot;

import android.graphics.Canvas;
import android.graphics.Matrix;
import defpackage.dn2;
import defpackage.g24;
import io.sentry.android.replay.d0;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends g24 implements dn2 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ i Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, byte b) {
        super(0);
        this.Y = b;
        this.Z = iVar;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.Y;
        i iVar = this.Z;
        switch (b) {
            case 0:
                Matrix matrix = new Matrix();
                d0 d0Var = iVar.c;
                matrix.preScale(d0Var.c, d0Var.d);
                return matrix;
            default:
                return new Canvas(iVar.g);
        }
    }
}

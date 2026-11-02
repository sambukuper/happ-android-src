package io.sentry.android.replay.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import defpackage.d02;
import defpackage.g44;
import defpackage.hg;
import defpackage.w74;
import defpackage.x97;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Closeable {
    public final g44 X;
    public final g44 Y;
    public final g44 Z;

    public f() {
        d dVar = d.Z;
        w74 w74Var = w74.Y;
        this.X = x97.P(w74Var, dVar);
        this.Y = x97.P(w74Var, new hg(this, (byte) 8));
        this.Z = x97.P(w74Var, d.f0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g44 g44Var = this.X;
        if (!g44Var.d() || ((Bitmap) g44Var.getValue()).isRecycled()) {
            return;
        }
        ((Bitmap) g44Var.getValue()).recycle();
    }

    public final List g(Bitmap bitmap, io.sentry.android.replay.viewhierarchy.g gVar, Matrix matrix) {
        bitmap.getClass();
        if (bitmap.isRecycled()) {
            return d02.X;
        }
        ArrayList arrayList = new ArrayList();
        Canvas canvas = new Canvas(bitmap);
        if (matrix != null) {
            canvas.setMatrix(matrix);
        }
        gVar.a(new e(this, bitmap, matrix, arrayList, canvas));
        return arrayList;
    }
}

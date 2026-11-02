package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y28 extends a38 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ TextPaint b;
    public final /* synthetic */ a38 c;
    public final /* synthetic */ z28 d;

    public y28(z28 z28Var, Context context, TextPaint textPaint, a38 a38Var) {
        this.d = z28Var;
        this.a = context;
        this.b = textPaint;
        this.c = a38Var;
    }

    @Override // defpackage.a38
    public final void d(int i) {
        this.c.d(i);
    }

    @Override // defpackage.a38
    public final void e(Typeface typeface, boolean z) {
        this.d.f(this.a, this.b, typeface);
        this.c.e(typeface, z);
    }
}

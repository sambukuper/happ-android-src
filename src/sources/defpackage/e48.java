package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e48 {
    public float c;
    public final WeakReference e;
    public z28 f;
    public final TextPaint a = new TextPaint(1);
    public final qr0 b = new qr0(this, 1);
    public boolean d = true;

    public e48(d48 d48Var) {
        this.e = new WeakReference(null);
        this.e = new WeakReference(d48Var);
    }

    public final float a(String str) {
        if (!this.d) {
            return this.c;
        }
        TextPaint textPaint = this.a;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = false;
        return this.c;
    }

    public final void b(z28 z28Var, Context context) {
        if (this.f != z28Var) {
            this.f = z28Var;
            WeakReference weakReference = this.e;
            if (z28Var != null) {
                TextPaint textPaint = this.a;
                qr0 qr0Var = this.b;
                z28Var.e(context, textPaint, qr0Var);
                d48 d48Var = (d48) weakReference.get();
                if (d48Var != null) {
                    textPaint.drawableState = d48Var.getState();
                }
                z28Var.d(context, textPaint, qr0Var);
                this.d = true;
            }
            d48 d48Var2 = (d48) weakReference.get();
            if (d48Var2 != null) {
                d48Var2.a();
                d48Var2.onStateChange(d48Var2.getState());
            }
        }
    }
}

package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class du6 {
    public final ys6 a;
    public boolean b;
    public boolean c;
    public final Paint d;
    public final Paint e;
    public r05 f;
    public r05 g;
    public boolean h;

    public du6(du6 du6Var) {
        this.b = du6Var.b;
        this.c = du6Var.c;
        this.d = new Paint(du6Var.d);
        this.e = new Paint(du6Var.e);
        r05 r05Var = du6Var.f;
        if (r05Var != null) {
            this.f = new r05(r05Var);
        }
        r05 r05Var2 = du6Var.g;
        if (r05Var2 != null) {
            this.g = new r05(r05Var2);
        }
        this.h = du6Var.h;
        try {
            this.a = (ys6) du6Var.a.clone();
        } catch (CloneNotSupportedException unused) {
            this.a = ys6.a();
        }
    }

    public du6() {
        Paint paint = new Paint();
        this.d = paint;
        paint.setFlags(193);
        paint.setHinting(0);
        paint.setStyle(Paint.Style.FILL);
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setFlags(193);
        paint2.setHinting(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setTypeface(typeface);
        this.a = ys6.a();
    }
}

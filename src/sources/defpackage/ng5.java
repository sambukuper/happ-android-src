package defpackage;

import android.graphics.Color;
import androidx.leanback.widget.PagingIndicator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ng5 {
    public float a;
    public int b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h = 1.0f;
    public float i;
    public final /* synthetic */ PagingIndicator j;

    public ng5(PagingIndicator pagingIndicator) {
        this.j = pagingIndicator;
        this.i = pagingIndicator.f0 ? 1.0f : -1.0f;
    }

    public final void a() {
        int iRound = Math.round(this.a * 255.0f);
        PagingIndicator pagingIndicator = this.j;
        this.b = Color.argb(iRound, Color.red(pagingIndicator.u0), Color.green(pagingIndicator.u0), Color.blue(pagingIndicator.u0));
    }

    public final void b() {
        this.c = 0.0f;
        this.d = 0.0f;
        PagingIndicator pagingIndicator = this.j;
        this.e = pagingIndicator.g0;
        float f = pagingIndicator.h0;
        this.f = f;
        this.g = f * pagingIndicator.A0;
        this.a = 0.0f;
        a();
    }
}

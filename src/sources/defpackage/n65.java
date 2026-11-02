package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class n65 {
    public final Bundle a;
    public IconCompat b;
    public final fd6[] c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final CharSequence g;
    public final PendingIntent h;

    public n65(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, fd6[] fd6VarArr, boolean z, boolean z2) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null && iconCompat.d() == 2) {
            this.f = iconCompat.c();
        }
        this.g = r65.c(charSequence);
        this.h = pendingIntent;
        this.a = bundle;
        this.c = fd6VarArr;
        this.d = z;
        this.e = z2;
    }
}

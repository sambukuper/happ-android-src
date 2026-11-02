package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r65 {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public int j;
    public s65 l;
    public byte m;
    public int n;
    public String p;
    public Bundle q;
    public String t;
    public final boolean u;
    public final Notification v;
    public final ArrayList w;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean k = true;
    public boolean o = false;
    public int r = 0;
    public int s = 0;

    public r65(Context context, String str) {
        Notification notification = new Notification();
        this.v = notification;
        this.a = context;
        this.t = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.w = new ArrayList();
        this.u = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void a(int i, PendingIntent pendingIntent, String str) {
        this.b.add(new n65(i != 0 ? IconCompat.b(null, _UrlKt.FRAGMENT_ENCODE_SET, i) : null, str, pendingIntent, new Bundle(), null, true, true));
    }

    public final Notification b() {
        Bundle bundle;
        z47 z47Var = new z47(this);
        r65 r65Var = (r65) z47Var.f0;
        s65 s65Var = r65Var.l;
        if (s65Var != null) {
            s65Var.a(z47Var);
        }
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) z47Var.Z;
        Notification notificationBuild = i >= 26 ? builder.build() : builder.build();
        if (s65Var != null) {
            r65Var.l.getClass();
        }
        if (s65Var != null && (bundle = notificationBuild.extras) != null) {
            if (s65Var.a) {
                bundle.putCharSequence("android.summaryText", (CharSequence) s65Var.d);
            }
            CharSequence charSequence = (CharSequence) s65Var.c;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", s65Var.b());
        }
        return notificationBuild;
    }

    public final void d(int i, boolean z) {
        Notification notification = this.v;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void e(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(f36.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(f36.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.b = bitmap;
            iconCompat = iconCompat2;
        }
        this.h = iconCompat;
    }

    public final void f(s65 s65Var) {
        if (this.l != s65Var) {
            this.l = s65Var;
            if (((r65) s65Var.b) != this) {
                s65Var.b = this;
                f(s65Var);
            }
        }
    }
}

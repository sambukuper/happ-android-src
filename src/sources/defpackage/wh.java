package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import io.sentry.util.l;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wh extends ThreadLocal {
    public final /* synthetic */ byte a;

    public /* synthetic */ wh(byte b) {
        this.a = b;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    yh yhVar = new yh(choreographer, z91.p(looperMyLooper));
                    return g33.K(yhVar, yhVar.n0);
                }
                bt.i("no Looper on this thread");
                return null;
            case 1:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(ks8.d);
                return simpleDateFormat;
            case 2:
                return new Random();
            case 3:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return km4.J();
                }
                if (Looper.myLooper() != null) {
                    return new lv2(new Handler(Looper.myLooper()));
                }
                return null;
            case 4:
                return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT));
            default:
                return new l();
        }
    }
}

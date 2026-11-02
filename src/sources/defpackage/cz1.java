package defpackage;

import android.os.Trace;
import androidx.leanback.widget.SearchEditText;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cz1 implements Runnable {
    public final /* synthetic */ byte X = 0;

    public /* synthetic */ cz1() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                try {
                    Method method = wc8.b;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (yy1.d()) {
                        yy1.a().e();
                        break;
                    }
                    return;
                } finally {
                    Method method2 = wc8.b;
                    Trace.endSection();
                }
            default:
                return;
        }
    }

    public cz1(SearchEditText searchEditText) {
    }

    private final void a() {
    }
}

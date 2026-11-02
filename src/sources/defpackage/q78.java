package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q78 {
    public final View a;
    public final f63 b;
    public final ob c;
    public final c15 d;
    public fl6 e;

    public q78(View view, AndroidComposeView androidComposeView, ob obVar) {
        f63 f63Var = new f63(view);
        this.a = view;
        this.b = f63Var;
        this.c = obVar;
        ct7.d(new ql(_UrlKt.FRAGMENT_ENCODE_SET).Y.length(), f88.b);
        int i = s73.g;
        new ArrayList();
        x97.P(w74.Y, new v38((Object) this, (byte) 2));
        new CursorAnchorInfo.Builder();
        new Matrix();
        this.d = new c15(0, new p78[16]);
    }

    public final void a(p78 p78Var) {
        this.d.b(p78Var);
        if (this.e == null) {
            fl6 fl6Var = new fl6((Object) this, (byte) 12);
            this.c.execute(fl6Var);
            this.e = fl6Var;
        }
    }
}

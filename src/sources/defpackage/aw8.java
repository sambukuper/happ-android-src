package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class aw8 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static t41 b(View view, t41 t41Var) {
        ContentInfo contentInfoE = t41Var.a.e();
        Objects.requireNonNull(contentInfoE);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoE);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoE ? t41Var : new t41(new p41(contentInfoPerformReceiveContent));
    }
}

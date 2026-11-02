package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ci {
    public final /* synthetic */ byte a;

    public /* synthetic */ ci(byte b) {
        this.a = b;
    }

    public final dq8 a(Object obj, pd5 pd5Var) {
        switch (this.a) {
            case 0:
                return rq7.m(((Uri) obj).toString());
            case 1:
                return rq7.f(((File) obj).getPath());
            case 2:
                return rq7.f(((oi5) obj).X.t());
            case 3:
                int iIntValue = ((Number) obj).intValue();
                Context context = pd5Var.a;
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) != null) {
                        return rq7.m("android.resource://" + context.getPackageName() + "/" + iIntValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            default:
                return rq7.m((String) obj);
        }
    }
}

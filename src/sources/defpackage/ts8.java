package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ts8 {
    public static final Pattern a = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static ts8 b;

    public ts8(we5 we5Var) {
    }

    public final boolean a(bz bzVar) {
        return TextUtils.isEmpty(bzVar.c) || bzVar.f + bzVar.e < (System.currentTimeMillis() / 1000) + 3600;
    }
}

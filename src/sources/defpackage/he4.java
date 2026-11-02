package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class he4 {
    public static final he4 b = new he4(new ie4(new LocaleList(new Locale[0])));
    public final ie4 a;

    public he4(ie4 ie4Var) {
        this.a = ie4Var;
    }

    public static he4 a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(strArrSplit[i]);
        }
        return new he4(new ie4(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof he4) {
            return this.a.equals(((he4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ne6 {
    public final List a;
    public final Map b;
    public final Map c;
    public final List d;
    public final we6 e;

    public ne6(List list, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, ArrayList arrayList, we6 we6Var, int i) {
        int i2 = i & 2;
        e02 e02Var = e02.X;
        Map map = i2 != 0 ? e02Var : linkedHashMap;
        Map map2 = (i & 4) != 0 ? e02Var : linkedHashMap2;
        List list2 = (i & 8) != 0 ? d02.X : arrayList;
        we6Var = (i & 16) != 0 ? null : we6Var;
        map.getClass();
        map2.getClass();
        list2.getClass();
        this.a = list;
        this.b = map;
        this.c = map2;
        this.d = list2;
        this.e = we6Var;
    }

    public final String toString() {
        String str;
        we6 we6Var = this.e;
        if (we6Var == null) {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        } else {
            str = ", template=" + ((Object) we6.b(we6Var.a));
        }
        return "Request(streams=" + this.a + str + ")@" + Integer.toHexString(hashCode());
    }
}

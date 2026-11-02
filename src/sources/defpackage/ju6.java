package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ju6 {
    public static final HashMap a;

    static {
        HashMap map = new HashMap(9);
        a = map;
        map.put("xx-small", new ks6(7, 0.694f));
        map.put("x-small", new ks6(7, 0.833f));
        map.put("small", new ks6(7, 10.0f));
        map.put("medium", new ks6(7, 12.0f));
        map.put("large", new ks6(7, 14.4f));
        map.put("x-large", new ks6(7, 17.3f));
        map.put("xx-large", new ks6(7, 20.7f));
        map.put("smaller", new ks6(9, 83.33f));
        map.put("larger", new ks6(9, 120.0f));
    }
}

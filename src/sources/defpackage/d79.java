package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d79 {
    public static final hb3 a = new hb3(null, null);
    public static final vz7 b = new vz7(new i69(13));

    public static final void a(Object obj, String str) {
        if (obj == null) {
            throw new dc1(pc6.q("Can not create a ", str, " from the given input: the field ", str, " is missing"));
        }
    }
}

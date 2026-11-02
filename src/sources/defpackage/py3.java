package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class py3 extends xy3 {
    public abstract Object a();

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append('(');
        if (this instanceof sy3) {
            string = "\"" + ((Object) ((sy3) this).a) + '\"';
        } else {
            string = a().toString();
        }
        return oi0.o(sb, string, ')');
    }
}

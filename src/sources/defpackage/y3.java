package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y3 extends v3 {
    public static y3 c;

    @Override // defpackage.v3
    public final int[] h(int i) {
        int length = m().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && m().charAt(i) == '\n' && (m().charAt(i) == '\n' || (i != 0 && m().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !y(i2)) {
            i2++;
        }
        return l(i, i2);
    }

    @Override // defpackage.v3
    public final int[] p(int i) {
        int length = m().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && m().charAt(i - 1) == '\n' && !y(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && (m().charAt(i2) == '\n' || (i2 != 0 && m().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return l(i2, i);
    }

    public final boolean y(int i) {
        if (i <= 0 || m().charAt(i - 1) == '\n') {
            return false;
        }
        return i == m().length() || m().charAt(i) == '\n';
    }
}

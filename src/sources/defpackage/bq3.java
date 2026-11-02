package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bq3 extends bo3 {
    public final ya4 X;

    public bq3() {
        l71 l71Var = ya4.k0;
        this.X = new ya4(false);
    }

    public final void e(String str, bo3 bo3Var) {
        if (bo3Var == null) {
            bo3Var = xp3.X;
        }
        this.X.put(str, bo3Var);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof bq3) && ((bq3) obj).X.equals(this.X);
        }
        return true;
    }

    public final void f(Number number, String str) {
        e(str, number == null ? xp3.X : new iq3(number));
    }

    public final void h(String str, Boolean bool) {
        e(str, new iq3(bool));
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    public final void i(String str, String str2) {
        e(str, str2 == null ? xp3.X : new iq3(str2));
    }

    public final bo3 j(String str) {
        return (bo3) this.X.get(str);
    }

    public final bq3 l(String str) {
        return (bq3) this.X.get(str);
    }
}

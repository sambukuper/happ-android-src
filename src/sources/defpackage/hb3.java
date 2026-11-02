package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class hb3 implements x69, h61 {
    public Integer a;
    public Integer b;

    public hb3(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    @Override // defpackage.h61
    public final Object a() {
        return new hb3(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hb3)) {
            return false;
        }
        hb3 hb3Var = (hb3) obj;
        return dh3.f(this.a, hb3Var.a) && dh3.f(this.b, hb3Var.b);
    }

    @Override // defpackage.x69
    public final void f(Integer num) {
        this.b = num;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // defpackage.x69
    public final Integer i() {
        return this.a;
    }

    @Override // defpackage.x69
    public final void r(Integer num) {
        this.a = num;
    }

    @Override // defpackage.x69
    public final Integer s() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Object obj = this.a;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append('-');
        Integer num = this.b;
        sb.append(num != null ? num : "??");
        return sb.toString();
    }
}

package defpackage;

import j$.time.LocalTime;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class eb3 implements ca8, h61 {
    public Integer a;
    public Integer b;
    public a9 c;
    public Integer d;
    public Integer e;
    public Integer f;

    public eb3(Integer num, Integer num2, a9 a9Var, Integer num3, Integer num4, Integer num5) {
        this.a = num;
        this.b = num2;
        this.c = a9Var;
        this.d = num3;
        this.e = num4;
        this.f = num5;
    }

    @Override // defpackage.h61
    public final Object a() {
        return new eb3(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    @Override // defpackage.ca8
    public final a9 c() {
        return this.c;
    }

    @Override // defpackage.ca8
    public final void d(Integer num) {
        this.b = num;
    }

    @Override // defpackage.ca8
    public final void e(Integer num) {
        this.f = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eb3)) {
            return false;
        }
        eb3 eb3Var = (eb3) obj;
        return dh3.f(this.a, eb3Var.a) && dh3.f(this.b, eb3Var.b) && this.c == eb3Var.c && dh3.f(this.d, eb3Var.d) && dh3.f(this.e, eb3Var.e) && dh3.f(this.f, eb3Var.f);
    }

    public final void f(xd4 xd4Var) {
        LocalTime localTime = xd4Var.X;
        this.a = Integer.valueOf(localTime.getHour());
        this.b = Integer.valueOf(((localTime.getHour() + 11) % 12) + 1);
        this.c = localTime.getHour() >= 12 ? a9.Y : a9.X;
        this.d = Integer.valueOf(localTime.getMinute());
        this.e = Integer.valueOf(localTime.getSecond());
        this.f = Integer.valueOf(localTime.getNano());
    }

    @Override // defpackage.ca8
    public final Integer g() {
        return this.d;
    }

    @Override // defpackage.ca8
    public final void h(Integer num) {
        this.d = num;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iIntValue = (num != null ? num.intValue() : 0) * 31;
        Integer num2 = this.b;
        int iIntValue2 = ((num2 != null ? num2.intValue() : 0) * 31) + iIntValue;
        a9 a9Var = this.c;
        int iHashCode = ((a9Var != null ? a9Var.hashCode() : 0) * 31) + iIntValue2;
        Integer num3 = this.d;
        int iIntValue3 = ((num3 != null ? num3.intValue() : 0) * 31) + iHashCode;
        Integer num4 = this.e;
        int iIntValue4 = ((num4 != null ? num4.intValue() : 0) * 31) + iIntValue3;
        Integer num5 = this.f;
        return iIntValue4 + (num5 != null ? num5.intValue() : 0);
    }

    public final xd4 i() {
        int iIntValue;
        int iIntValue2;
        Integer num = this.a;
        Integer num2 = this.b;
        a9 a9Var = a9.Y;
        Integer numValueOf = null;
        if (num != null) {
            iIntValue = num.intValue();
            if (num2 != null && ((iIntValue + 11) % 12) + 1 != (iIntValue2 = num2.intValue())) {
                em7.c(pc6.m("Inconsistent hour and hour-of-am-pm: hour is ", iIntValue, iIntValue2, ", but hour-of-am-pm is "));
                return null;
            }
            a9 a9Var2 = this.c;
            if (a9Var2 != null) {
                if ((a9Var2 == a9Var) != (iIntValue >= 12)) {
                    throw new IllegalArgumentException(("Inconsistent hour and the AM/PM marker: hour is " + iIntValue + ", but the AM/PM marker is " + a9Var2).toString());
                }
            }
        } else {
            if (num2 != null) {
                int iIntValue3 = num2.intValue();
                a9 a9Var3 = this.c;
                if (a9Var3 != null) {
                    if (iIntValue3 == 12) {
                        iIntValue3 = 0;
                    }
                    numValueOf = Integer.valueOf(iIntValue3 + (a9Var3 != a9Var ? 0 : 12));
                }
            }
            if (numValueOf == null) {
                throw new dc1("Incomplete time: missing hour");
            }
            iIntValue = numValueOf.intValue();
        }
        Integer num3 = this.d;
        d79.a(num3, "minute");
        int iIntValue4 = num3.intValue();
        Integer num4 = this.e;
        int iIntValue5 = num4 != null ? num4.intValue() : 0;
        Integer num5 = this.f;
        return new xd4(iIntValue, iIntValue4, iIntValue5, num5 != null ? num5.intValue() : 0);
    }

    @Override // defpackage.ca8
    public final Integer l() {
        return this.f;
    }

    @Override // defpackage.ca8
    public final Integer m() {
        return this.b;
    }

    @Override // defpackage.ca8
    public final void p(a9 a9Var) {
        this.c = a9Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    public final String toString() {
        String strU0;
        StringBuilder sb = new StringBuilder();
        Object obj = this.a;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append(':');
        Object obj2 = this.d;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb.append(obj2);
        sb.append(':');
        Integer num = this.e;
        sb.append(num != null ? num : "??");
        sb.append('.');
        Integer num2 = this.f;
        if (num2 != null) {
            String strValueOf = String.valueOf(num2.intValue());
            strU0 = fm7.u0(9 - strValueOf.length(), strValueOf);
            if (strU0 == null) {
                strU0 = "???";
            }
        } else {
            strU0 = "???";
        }
        sb.append(strU0);
        return sb.toString();
    }

    @Override // defpackage.ca8
    public final void u(Integer num) {
        this.a = num;
    }

    @Override // defpackage.ca8
    public final Integer v() {
        return this.a;
    }

    @Override // defpackage.ca8
    public final Integer w() {
        return this.e;
    }

    @Override // defpackage.ca8
    public final void x(Integer num) {
        this.e = num;
    }

    public /* synthetic */ eb3() {
        this(null, null, null, null, null, null);
    }
}

package defpackage;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.Month;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cb3 implements x69, rb1, h61 {
    public final hb3 a;
    public Integer b;
    public Integer c;
    public Integer d;

    public cb3(hb3 hb3Var, Integer num, Integer num2, Integer num3) {
        this.a = hb3Var;
        this.b = num;
        this.c = num2;
        this.d = num3;
    }

    @Override // defpackage.h61
    public final Object a() {
        hb3 hb3Var = this.a;
        return new cb3(new hb3(hb3Var.a, hb3Var.b), this.b, this.c, this.d);
    }

    public final void b(dd4 dd4Var) {
        LocalDate localDate = dd4Var.X;
        Integer numValueOf = Integer.valueOf(localDate.getYear());
        hb3 hb3Var = this.a;
        hb3Var.a = numValueOf;
        Month month = localDate.getMonth();
        month.getClass();
        zx4 zx4Var = (zx4) zx4.Y.get(month.getValue() - 1);
        zx4Var.getClass();
        hb3Var.b = Integer.valueOf(zx4Var.ordinal() + 1);
        this.b = Integer.valueOf(localDate.getDayOfMonth());
        uc1 uc1VarA = dd4Var.a();
        uc1VarA.getClass();
        this.c = Integer.valueOf(uc1VarA.ordinal() + 1);
        this.d = Integer.valueOf(localDate.getDayOfYear());
    }

    public final dd4 c() throws Exception {
        dd4 dd4Var;
        hb3 hb3Var = this.a;
        Integer num = hb3Var.a;
        d79.a(num, "year");
        int iIntValue = num.intValue();
        Integer num2 = this.d;
        if (num2 == null) {
            Integer num3 = hb3Var.b;
            d79.a(num3, "monthNumber");
            int iIntValue2 = num3.intValue();
            Integer num4 = this.b;
            d79.a(num4, "day");
            dd4Var = new dd4(iIntValue, iIntValue2, num4.intValue());
        } else {
            dd4 dd4Var2 = new dd4(iIntValue, 1, 1);
            int iIntValue3 = num2.intValue() - 1;
            oc1.Companion.getClass();
            jc1 jc1Var = oc1.a;
            jc1Var.getClass();
            long j = iIntValue3;
            int i = hd4.c;
            try {
                long jAddExact = Math.addExact(dd4Var2.X.toEpochDay(), Math.multiplyExact(j, jc1Var.b));
                long j2 = hd4.a;
                if (jAddExact > hd4.b || j2 > jAddExact) {
                    throw new DateTimeException("The resulting day " + jAddExact + " is out of supported LocalDate range.");
                }
                LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(jAddExact);
                localDateOfEpochDay.getClass();
                dd4 dd4Var3 = new dd4(localDateOfEpochDay);
                if (localDateOfEpochDay.getYear() != iIntValue) {
                    throw new dc1("Can not create a LocalDate from the given input: the day of year is " + num2 + ", which is not a valid day of year for the year " + iIntValue);
                }
                Integer num5 = hb3Var.b;
                n22 n22Var = zx4.Y;
                if (num5 != null) {
                    Month month = localDateOfEpochDay.getMonth();
                    month.getClass();
                    zx4 zx4Var = (zx4) n22Var.get(month.getValue() - 1);
                    zx4Var.getClass();
                    int iOrdinal = zx4Var.ordinal() + 1;
                    Integer num6 = hb3Var.b;
                    if (num6 == null || iOrdinal != num6.intValue()) {
                        StringBuilder sb = new StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                        sb.append(num2);
                        sb.append(", which is ");
                        Month month2 = localDateOfEpochDay.getMonth();
                        month2.getClass();
                        sb.append((zx4) n22Var.get(month2.getValue() - 1));
                        Integer num7 = hb3Var.b;
                        sb.append(", but ");
                        sb.append(num7);
                        sb.append(" was specified as the month number");
                        throw new dc1(sb.toString());
                    }
                }
                if (this.b != null) {
                    int dayOfMonth = localDateOfEpochDay.getDayOfMonth();
                    Integer num8 = this.b;
                    if (num8 == null || dayOfMonth != num8.intValue()) {
                        StringBuilder sb2 = new StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                        sb2.append(num2);
                        sb2.append(", which is the day ");
                        sb2.append(localDateOfEpochDay.getDayOfMonth());
                        sb2.append(" of ");
                        Month month3 = localDateOfEpochDay.getMonth();
                        month3.getClass();
                        sb2.append((zx4) n22Var.get(month3.getValue() - 1));
                        Integer num9 = this.b;
                        sb2.append(", but ");
                        sb2.append(num9);
                        sb2.append(" was specified as the day of month");
                        throw new dc1(sb2.toString());
                    }
                }
                dd4Var = dd4Var3;
            } catch (Exception e) {
                if (!(e instanceof DateTimeException) && !(e instanceof ArithmeticException)) {
                    throw e;
                }
                throw new yb1("The result of adding " + j + " of " + jc1Var + " to " + dd4Var2 + " is out of LocalDate range.", e);
            }
        }
        Integer num10 = this.c;
        if (num10 != null) {
            int iIntValue4 = num10.intValue();
            uc1 uc1VarA = dd4Var.a();
            uc1VarA.getClass();
            if (iIntValue4 != uc1VarA.ordinal() + 1) {
                StringBuilder sb3 = new StringBuilder("Can not create a LocalDate from the given input: the day of week is ");
                if (1 > iIntValue4 || iIntValue4 >= 8) {
                    em7.c(pc6.j(iIntValue4, "Expected ISO day-of-week number in 1..7, got "));
                    return null;
                }
                sb3.append((uc1) uc1.Y.get(iIntValue4 - 1));
                sb3.append(" but the date is ");
                sb3.append(dd4Var);
                sb3.append(", which is a ");
                sb3.append(dd4Var.a());
                throw new dc1(sb3.toString());
            }
        }
        return dd4Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cb3)) {
            return false;
        }
        cb3 cb3Var = (cb3) obj;
        return dh3.f(this.a, cb3Var.a) && dh3.f(this.b, cb3Var.b) && dh3.f(this.c, cb3Var.c) && dh3.f(this.d, cb3Var.d);
    }

    @Override // defpackage.x69
    public final void f(Integer num) {
        this.a.b = num;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 29791;
        Integer num = this.b;
        int iHashCode2 = ((num != null ? num.hashCode() : 0) * 961) + iHashCode;
        Integer num2 = this.c;
        int iHashCode3 = ((num2 != null ? num2.hashCode() : 0) * 31) + iHashCode2;
        Integer num3 = this.d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // defpackage.x69
    public final Integer i() {
        return this.a.a;
    }

    @Override // defpackage.rb1
    public final Integer j() {
        return this.c;
    }

    @Override // defpackage.rb1
    public final Integer n() {
        return this.b;
    }

    @Override // defpackage.rb1
    public final void o(Integer num) {
        this.b = num;
    }

    @Override // defpackage.rb1
    public final Integer q() {
        return this.d;
    }

    @Override // defpackage.x69
    public final void r(Integer num) {
        this.a.a = num;
    }

    @Override // defpackage.x69
    public final Integer s() {
        return this.a.b;
    }

    @Override // defpackage.rb1
    public final void t(Integer num) {
        this.c = num;
    }

    public final String toString() {
        Integer num = this.d;
        hb3 hb3Var = this.a;
        if (num == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(hb3Var);
            sb.append('-');
            Object obj = this.b;
            if (obj == null) {
                obj = "??";
            }
            sb.append(obj);
            sb.append(" (day of week is ");
            Integer num2 = this.c;
            sb.append(num2 != null ? num2 : "??");
            sb.append(')');
            return sb.toString();
        }
        if (this.b == null && hb3Var.b == null) {
            StringBuilder sb2 = new StringBuilder("(");
            Object obj2 = hb3Var.a;
            if (obj2 == null) {
                obj2 = "??";
            }
            sb2.append(obj2);
            sb2.append(")-");
            sb2.append(this.d);
            sb2.append(" (day of week is ");
            Integer num3 = this.c;
            sb2.append(num3 != null ? num3 : "??");
            sb2.append(')');
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(hb3Var);
        sb3.append('-');
        Object obj3 = this.b;
        if (obj3 == null) {
            obj3 = "??";
        }
        sb3.append(obj3);
        sb3.append(" (day of week is ");
        Integer num4 = this.c;
        sb3.append(num4 != null ? num4 : "??");
        sb3.append(", day of year is ");
        sb3.append(this.d);
        sb3.append(')');
        return sb3.toString();
    }

    @Override // defpackage.rb1
    public final void y(Integer num) {
        this.d = num;
    }

    public /* synthetic */ cb3() {
        this(new hb3(null, null), null, null, null);
    }
}

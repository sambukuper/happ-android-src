package defpackage;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class iq3 extends bo3 {
    public final Serializable X;

    public iq3(Boolean bool) {
        Objects.requireNonNull(bool);
        this.X = bool;
    }

    public static boolean j(iq3 iq3Var) {
        Serializable serializable = iq3Var.X;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // defpackage.bo3
    public final int a() {
        return this.X instanceof Number ? i().intValue() : Integer.parseInt(d());
    }

    @Override // defpackage.bo3
    public final String d() {
        Serializable serializable = this.X;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return i().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        om0.f(serializable.getClass(), "Unexpected value type: ");
        return null;
    }

    public final BigInteger e() {
        Serializable serializable = this.X;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (j(this)) {
            return BigInteger.valueOf(i().longValue());
        }
        String strD = d();
        z91.k(strD);
        return new BigInteger(strD);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iq3.class != obj.getClass()) {
            return false;
        }
        iq3 iq3Var = (iq3) obj;
        Serializable serializable = iq3Var.X;
        boolean zJ = j(this);
        Serializable serializable2 = this.X;
        if (zJ && j(iq3Var)) {
            if ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) {
                return e().equals(iq3Var.e());
            }
            return i().longValue() == iq3Var.i().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : z91.K(d())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : z91.K(iq3Var.d())) == 0;
        }
        double dH = h();
        double dH2 = iq3Var.h();
        if (dH != dH2) {
            return Double.isNaN(dH) && Double.isNaN(dH2);
        }
        return true;
    }

    public final boolean f() {
        Serializable serializable = this.X;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(d());
    }

    public final double h() {
        return this.X instanceof Number ? i().doubleValue() : Double.parseDouble(d());
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        if (j(this)) {
            jDoubleToLongBits = i().longValue();
        } else {
            Serializable serializable = this.X;
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(i().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public final Number i() {
        Serializable serializable = this.X;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new f44((String) serializable);
        }
        u52.k("Primitive is neither a number nor a string");
        return null;
    }

    public iq3(Number number) {
        Objects.requireNonNull(number);
        this.X = number;
    }

    public iq3(String str) {
        Objects.requireNonNull(str);
        this.X = str;
    }
}

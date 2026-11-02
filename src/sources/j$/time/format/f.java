package j$.time.format;

import j$.time.temporal.TemporalField;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Objects;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends h {
    public final boolean g;

    public f(TemporalField temporalField) {
        this(temporalField, 0, 9, true, 0);
        Objects.requireNonNull(temporalField, "field");
        j$.time.temporal.s sVarRange = temporalField.range();
        if (sVarRange.a != sVarRange.b || sVarRange.c != sVarRange.d) {
            throw new IllegalArgumentException(j$.time.c.a("Field must have a fixed set of values: ", temporalField));
        }
    }

    @Override // j$.time.format.h
    public final boolean a(o oVar) {
        return oVar.c && this.b == this.c && !this.g;
    }

    @Override // j$.time.format.h
    public final h b() {
        if (this.e == -1) {
            return this;
        }
        return new f(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.h
    public final h c(int i) {
        return new f(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.h, j$.time.format.e
    public final boolean t(q qVar, StringBuilder sb) {
        TemporalField temporalField = this.a;
        Long lA = qVar.a(temporalField);
        if (lA == null) {
            return false;
        }
        qVar.b.getClass();
        int i = t.a;
        long jLongValue = lA.longValue();
        j$.time.temporal.s sVarRange = temporalField.range();
        sVarRange.b(jLongValue, temporalField);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(sVarRange.a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(sVarRange.d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z = this.g;
        int i2 = this.b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i2), this.c), roundingMode).toPlainString().substring(2);
            if (z) {
                sb.append('.');
            }
            sb.append(strSubstring);
            return true;
        }
        if (i2 > 0) {
            if (z) {
                sb.append('.');
            }
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append('0');
            }
        }
        return true;
    }

    @Override // j$.time.format.h
    public final String toString() {
        return "Fraction(" + this.a + "," + this.b + "," + this.c + (this.g ? ",DecimalPoint" : _UrlKt.FRAGMENT_ENCODE_SET) + ")";
    }

    @Override // j$.time.format.h, j$.time.format.e
    public final int x(o oVar, CharSequence charSequence, int i) {
        int i2 = (oVar.c || a(oVar)) ? this.b : 0;
        int i3 = (oVar.c || a(oVar)) ? this.c : 9;
        int length = charSequence.length();
        if (i != length) {
            if (this.g) {
                char cCharAt = charSequence.charAt(i);
                int i4 = t.a;
                if (cCharAt == '.') {
                    i++;
                } else if (i2 > 0) {
                    return ~i;
                }
            }
            int i5 = i;
            int i6 = i2 + i5;
            if (i6 > length) {
                return ~i5;
            }
            int iMin = Math.min(i3 + i5, length);
            int i7 = 0;
            int i8 = i5;
            while (i8 < iMin) {
                int i9 = i8 + 1;
                char cCharAt2 = charSequence.charAt(i8);
                int i10 = t.a;
                int i11 = cCharAt2 - '0';
                if (i11 < 0 || i11 > 9) {
                    i11 = -1;
                }
                if (i11 < 0) {
                    if (i9 >= i6) {
                        break;
                    }
                    return ~i5;
                }
                i7 = (i7 * 10) + i11;
                i8 = i9;
            }
            BigDecimal bigDecimalMovePointLeft = new BigDecimal(i7).movePointLeft(i8 - i5);
            j$.time.temporal.s sVarRange = this.a.range();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(sVarRange.a);
            return oVar.f(this.a, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(sVarRange.d).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i5, i8);
        }
        if (i2 > 0) {
            return ~i;
        }
        return i;
    }

    public f(TemporalField temporalField, int i, int i2, boolean z, int i3) {
        super(temporalField, i, i2, SignStyle.NOT_NEGATIVE, i3);
        this.g = z;
    }
}

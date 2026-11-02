package defpackage;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ij7 extends lj7 {
    public final byte Z;

    /* JADX WARN: Multi-variable type inference failed */
    public ij7(int i, Class cls) {
        super(0, cls);
        this.Z = i;
    }

    @Override // defpackage.ar3
    public final void e(Object obj, ro3 ro3Var, t37 t37Var) {
        String strValueOf;
        switch (this.Z) {
            case 1:
                Date date = (Date) obj;
                t37Var.getClass();
                if (!t37Var.X.j(n37.o0)) {
                    ro3Var.U(t37Var.d().format(date));
                } else {
                    ro3Var.U(String.valueOf(date.getTime()));
                }
                break;
            case 2:
                long timeInMillis = ((Calendar) obj).getTimeInMillis();
                t37Var.getClass();
                if (!t37Var.X.j(n37.o0)) {
                    ro3Var.U(t37Var.d().format(new Date(timeInMillis)));
                } else {
                    ro3Var.U(String.valueOf(timeInMillis));
                }
                break;
            case 3:
                ro3Var.U(((Class) obj).getName());
                break;
            case 4:
                if (t37Var.X.j(n37.q0)) {
                    strValueOf = obj.toString();
                } else {
                    Enum r11 = (Enum) obj;
                    strValueOf = t37Var.X.j(n37.s0) ? String.valueOf(r11.ordinal()) : r11.name();
                }
                ro3Var.U(strValueOf);
                break;
            case 5:
            case 6:
                long jLongValue = ((Number) obj).longValue();
                ro3Var.getClass();
                ro3Var.U(Long.toString(jLongValue));
                break;
            case 7:
                l10 l10Var = t37Var.X.Y.i0;
                byte[] bArr = (byte[]) obj;
                char[] cArr = l10Var.Y;
                int i = l10Var.h0;
                int length = bArr.length;
                StringBuilder sb = new StringBuilder((length >> 2) + length + (length >> 3));
                int i2 = i >> 2;
                int i3 = length - 3;
                int i4 = 0;
                while (true) {
                    int i5 = i2;
                    do {
                        if (i4 > i3) {
                            int i6 = length - i4;
                            if (i6 > 0) {
                                int i7 = i4 + 1;
                                int i8 = bArr[i4] << 16;
                                if (i6 == 2) {
                                    i8 |= (bArr[i7] & 255) << 8;
                                }
                                char c = l10Var.g0;
                                sb.append(cArr[(i8 >> 18) & 63]);
                                sb.append(cArr[(i8 >> 12) & 63]);
                                if (l10Var.i0) {
                                    sb.append(i6 == 2 ? cArr[(i8 >> 6) & 63] : c);
                                    sb.append(c);
                                } else if (i6 == 2) {
                                    sb.append(cArr[(i8 >> 6) & 63]);
                                }
                            }
                            ro3Var.U(sb.toString());
                        } else {
                            int i9 = i4 + 2;
                            int i10 = ((bArr[i4 + 1] & 255) | (bArr[i4] << 8)) << 8;
                            i4 += 3;
                            int i11 = i10 | (bArr[i9] & 255);
                            sb.append(cArr[(i11 >> 18) & 63]);
                            sb.append(cArr[(i11 >> 12) & 63]);
                            sb.append(cArr[(i11 >> 6) & 63]);
                            sb.append(cArr[i11 & 63]);
                            i5--;
                        }
                        break;
                    } while (i5 > 0);
                    sb.append("\\n");
                }
                break;
            default:
                ro3Var.U(obj.toString());
                break;
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k97 implements rj2 {
    public final /* synthetic */ byte a = 0;
    public final int b;
    public final Object c;

    public k97(al5 al5Var, int i, byte b) {
        this.c = al5Var;
        this.b = i;
        if (i < 0) {
            em7.c(ie2.h("The minimum number of digits (", i, ") is negative"));
            throw null;
        }
        if (i <= 9) {
            return;
        }
        em7.c(ie2.h("The minimum number of digits (", i, ") exceeds the length of an Int"));
        throw null;
    }

    @Override // defpackage.rj2
    public final void a(Object obj, StringBuilder sb, boolean z) {
        byte b = this.a;
        int i = 0;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                int[] iArr = yn0.d;
                StringBuilder sb2 = new StringBuilder();
                int iIntValue = ((Number) ((al5) obj2).B(obj)).intValue();
                if (z && iIntValue < 0) {
                    iIntValue = -iIntValue;
                }
                if (iIntValue >= iArr[4]) {
                    sb2.append('+');
                }
                if (Math.abs(iIntValue) >= iArr[i2 - 1]) {
                    sb2.append(iIntValue);
                } else if (iIntValue >= 0) {
                    sb2.append(iIntValue + iArr[i2]);
                    sb2.deleteCharAt(0).getClass();
                } else {
                    sb2.append(iIntValue - iArr[i2]);
                    sb2.deleteCharAt(1).getClass();
                }
                sb.append((CharSequence) sb2);
                break;
            case 1:
                StringBuilder sb3 = new StringBuilder();
                ((rj2) obj2).a(obj, sb3, z);
                String string = sb3.toString();
                int length = i2 - string.length();
                while (i < length) {
                    sb.append(' ');
                    i++;
                }
                sb.append((CharSequence) string);
                break;
            default:
                String strValueOf = String.valueOf(((Number) ((al5) obj2).B(obj)).intValue());
                int length2 = i2 - strValueOf.length();
                while (i < length2) {
                    sb.append('0');
                    i++;
                }
                sb.append((CharSequence) strValueOf);
                break;
        }
    }

    public k97(rj2 rj2Var, int i) {
        this.c = rj2Var;
        this.b = i;
    }

    public k97(al5 al5Var, int i) {
        this.c = al5Var;
        this.b = i;
        if (i < 0) {
            em7.c(ie2.h("The minimum number of digits (", i, ") is negative"));
            throw null;
        }
        if (i <= 9) {
            return;
        }
        em7.c(ie2.h("The minimum number of digits (", i, ") exceeds the length of an Int"));
        throw null;
    }
}

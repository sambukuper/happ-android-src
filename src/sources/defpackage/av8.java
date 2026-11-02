package defpackage;

import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class av8 {
    public static final int[] e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
    public static final av8[] f = a();
    public final byte a;
    public final int[] b;
    public final j70[] c;
    public final int d;

    /* JADX WARN: Multi-variable type inference failed */
    public av8(int i, int[] iArr, j70... j70VarArr) {
        this.a = i;
        this.b = iArr;
        this.c = j70VarArr;
        j70 j70Var = j70VarArr[0];
        byte b = j70Var.X;
        int i2 = 0;
        for (zu8 zu8Var : (zu8[]) j70Var.Y) {
            i2 += (zu8Var.b + b) * zu8Var.a;
        }
        this.d = i2;
    }

    public static av8[] a() {
        int i = 10;
        av8 av8Var = new av8(1, new int[0], new j70(7, new zu8[]{new zu8(1, 19)}), new j70(i, new zu8[]{new zu8(1, 16)}), new j70(13, new zu8[]{new zu8(1, 13)}), new j70(17, new zu8[]{new zu8(1, 9)}));
        int i2 = 18;
        int i3 = 22;
        av8 av8Var2 = new av8(2, new int[]{6, 18}, new j70(i, new zu8[]{new zu8(1, 34)}), new j70(16, new zu8[]{new zu8(1, 28)}), new j70(i3, new zu8[]{new zu8(1, 22)}), new j70(28, new zu8[]{new zu8(1, 16)}));
        j70 j70Var = new j70(15, new zu8[]{new zu8(1, 55)});
        int i4 = 26;
        av8 av8Var3 = new av8(3, new int[]{6, 22}, j70Var, new j70(i4, new zu8[]{new zu8(1, 44)}), new j70(i2, new zu8[]{new zu8(2, 17)}), new j70(i3, new zu8[]{new zu8(2, 13)}));
        av8 av8Var4 = new av8(4, new int[]{6, 26}, new j70(20, new zu8[]{new zu8(1, 80)}), new j70(i2, new zu8[]{new zu8(2, 32)}), new j70(i4, new zu8[]{new zu8(2, 24)}), new j70(16, new zu8[]{new zu8(4, 9)}));
        av8 av8Var5 = new av8(5, new int[]{6, 30}, new j70(i4, new zu8[]{new zu8(1, 108)}), new j70(24, new zu8[]{new zu8(2, 43)}), new j70(18, new zu8[]{new zu8(2, 15), new zu8(2, 16)}), new j70(22, new zu8[]{new zu8(2, 11), new zu8(2, 12)}));
        av8 av8Var6 = new av8(6, new int[]{6, 34}, new j70(18, new zu8[]{new zu8(2, 68)}), new j70(16, new zu8[]{new zu8(4, 27)}), new j70(24, new zu8[]{new zu8(4, 19)}), new j70(28, new zu8[]{new zu8(4, 15)}));
        int i5 = 18;
        av8 av8Var7 = new av8(7, new int[]{6, 22, 38}, new j70(20, new zu8[]{new zu8(2, 78)}), new j70(i5, new zu8[]{new zu8(4, 31)}), new j70(i5, new zu8[]{new zu8(2, 14), new zu8(4, 15)}), new j70(26, new zu8[]{new zu8(4, 13), new zu8(1, 14)}));
        av8 av8Var8 = new av8(8, new int[]{6, 24, 42}, new j70(24, new zu8[]{new zu8(2, 97)}), new j70(22, new zu8[]{new zu8(2, 38), new zu8(2, 39)}), new j70(22, new zu8[]{new zu8(4, 18), new zu8(2, 19)}), new j70(26, new zu8[]{new zu8(4, 14), new zu8(2, 15)}));
        av8 av8Var9 = new av8(9, new int[]{6, 26, 46}, new j70(30, new zu8[]{new zu8(2, 116)}), new j70(22, new zu8[]{new zu8(3, 36), new zu8(2, 37)}), new j70(20, new zu8[]{new zu8(4, 16), new zu8(4, 17)}), new j70(24, new zu8[]{new zu8(4, 12), new zu8(4, 13)}));
        av8 av8Var10 = new av8(10, new int[]{6, 28, 50}, new j70(18, new zu8[]{new zu8(2, 68), new zu8(2, 69)}), new j70(26, new zu8[]{new zu8(4, 43), new zu8(1, 44)}), new j70(24, new zu8[]{new zu8(6, 19), new zu8(2, 20)}), new j70(28, new zu8[]{new zu8(6, 15), new zu8(2, 16)}));
        av8 av8Var11 = new av8(11, new int[]{6, 30, 54}, new j70(20, new zu8[]{new zu8(4, 81)}), new j70(30, new zu8[]{new zu8(1, 50), new zu8(4, 51)}), new j70(28, new zu8[]{new zu8(4, 22), new zu8(4, 23)}), new j70(24, new zu8[]{new zu8(3, 12), new zu8(8, 13)}));
        av8 av8Var12 = new av8(12, new int[]{6, 32, 58}, new j70(24, new zu8[]{new zu8(2, 92), new zu8(2, 93)}), new j70(22, new zu8[]{new zu8(6, 36), new zu8(2, 37)}), new j70(26, new zu8[]{new zu8(4, 20), new zu8(6, 21)}), new j70(28, new zu8[]{new zu8(7, 14), new zu8(4, 15)}));
        av8 av8Var13 = new av8(13, new int[]{6, 34, 62}, new j70(26, new zu8[]{new zu8(4, 107)}), new j70(22, new zu8[]{new zu8(8, 37), new zu8(1, 38)}), new j70(24, new zu8[]{new zu8(8, 20), new zu8(4, 21)}), new j70(22, new zu8[]{new zu8(12, 11), new zu8(4, 12)}));
        av8 av8Var14 = new av8(14, new int[]{6, 26, 46, 66}, new j70(30, new zu8[]{new zu8(3, 115), new zu8(1, 116)}), new j70(24, new zu8[]{new zu8(4, 40), new zu8(5, 41)}), new j70(20, new zu8[]{new zu8(11, 16), new zu8(5, 17)}), new j70(24, new zu8[]{new zu8(11, 12), new zu8(5, 13)}));
        av8 av8Var15 = new av8(15, new int[]{6, 26, 48, 70}, new j70(22, new zu8[]{new zu8(5, 87), new zu8(1, 88)}), new j70(24, new zu8[]{new zu8(5, 41), new zu8(5, 42)}), new j70(30, new zu8[]{new zu8(5, 24), new zu8(7, 25)}), new j70(24, new zu8[]{new zu8(11, 12), new zu8(7, 13)}));
        av8 av8Var16 = new av8(16, new int[]{6, 26, 50, 74}, new j70(24, new zu8[]{new zu8(5, 98), new zu8(1, 99)}), new j70(28, new zu8[]{new zu8(7, 45), new zu8(3, 46)}), new j70(24, new zu8[]{new zu8(15, 19), new zu8(2, 20)}), new j70(30, new zu8[]{new zu8(3, 15), new zu8(13, 16)}));
        int i6 = 28;
        av8 av8Var17 = new av8(17, new int[]{6, 30, 54, 78}, new j70(i6, new zu8[]{new zu8(1, 107), new zu8(5, 108)}), new j70(i6, new zu8[]{new zu8(10, 46), new zu8(1, 47)}), new j70(28, new zu8[]{new zu8(1, 22), new zu8(15, 23)}), new j70(28, new zu8[]{new zu8(2, 14), new zu8(17, 15)}));
        av8 av8Var18 = new av8(18, new int[]{6, 30, 56, 82}, new j70(30, new zu8[]{new zu8(5, 120), new zu8(1, 121)}), new j70(26, new zu8[]{new zu8(9, 43), new zu8(4, 44)}), new j70(28, new zu8[]{new zu8(17, 22), new zu8(1, 23)}), new j70(28, new zu8[]{new zu8(2, 14), new zu8(19, 15)}));
        av8 av8Var19 = new av8(19, new int[]{6, 30, 58, 86}, new j70(28, new zu8[]{new zu8(3, 113), new zu8(4, 114)}), new j70(26, new zu8[]{new zu8(3, 44), new zu8(11, 45)}), new j70(26, new zu8[]{new zu8(17, 21), new zu8(4, 22)}), new j70(26, new zu8[]{new zu8(9, 13), new zu8(16, 14)}));
        int i7 = 28;
        av8 av8Var20 = new av8(20, new int[]{6, 34, 62, 90}, new j70(28, new zu8[]{new zu8(3, 107), new zu8(5, 108)}), new j70(26, new zu8[]{new zu8(3, 41), new zu8(13, 42)}), new j70(30, new zu8[]{new zu8(15, 24), new zu8(5, 25)}), new j70(i7, new zu8[]{new zu8(15, 15), new zu8(10, 16)}));
        av8 av8Var21 = new av8(21, new int[]{6, 28, 50, 72, 94}, new j70(i7, new zu8[]{new zu8(4, 116), new zu8(4, 117)}), new j70(26, new zu8[]{new zu8(17, 42)}), new j70(28, new zu8[]{new zu8(17, 22), new zu8(6, 23)}), new j70(30, new zu8[]{new zu8(19, 16), new zu8(6, 17)}));
        int i8 = 28;
        av8 av8Var22 = new av8(22, new int[]{6, 26, 50, 74, 98}, new j70(i8, new zu8[]{new zu8(2, 111), new zu8(7, 112)}), new j70(i8, new zu8[]{new zu8(17, 46)}), new j70(30, new zu8[]{new zu8(7, 24), new zu8(16, 25)}), new j70(24, new zu8[]{new zu8(34, 13)}));
        av8 av8Var23 = new av8(23, new int[]{6, 30, 54, 78, HttpStatusCodesKt.HTTP_PROCESSING}, new j70(30, new zu8[]{new zu8(4, 121), new zu8(5, 122)}), new j70(28, new zu8[]{new zu8(4, 47), new zu8(14, 48)}), new j70(30, new zu8[]{new zu8(11, 24), new zu8(14, 25)}), new j70(30, new zu8[]{new zu8(16, 15), new zu8(14, 16)}));
        av8 av8Var24 = new av8(24, new int[]{6, 28, 54, 80, 106}, new j70(30, new zu8[]{new zu8(6, 117), new zu8(4, 118)}), new j70(28, new zu8[]{new zu8(6, 45), new zu8(14, 46)}), new j70(30, new zu8[]{new zu8(11, 24), new zu8(16, 25)}), new j70(30, new zu8[]{new zu8(30, 16), new zu8(2, 17)}));
        av8 av8Var25 = new av8(25, new int[]{6, 32, 58, 84, 110}, new j70(26, new zu8[]{new zu8(8, 106), new zu8(4, 107)}), new j70(28, new zu8[]{new zu8(8, 47), new zu8(13, 48)}), new j70(30, new zu8[]{new zu8(7, 24), new zu8(22, 25)}), new j70(30, new zu8[]{new zu8(22, 15), new zu8(13, 16)}));
        int i9 = 28;
        av8 av8Var26 = new av8(26, new int[]{6, 30, 58, 86, 114}, new j70(i9, new zu8[]{new zu8(10, 114), new zu8(2, 115)}), new j70(i9, new zu8[]{new zu8(19, 46), new zu8(4, 47)}), new j70(28, new zu8[]{new zu8(28, 22), new zu8(6, 23)}), new j70(30, new zu8[]{new zu8(33, 16), new zu8(4, 17)}));
        av8 av8Var27 = new av8(27, new int[]{6, 34, 62, 90, 118}, new j70(30, new zu8[]{new zu8(8, 122), new zu8(4, 123)}), new j70(28, new zu8[]{new zu8(22, 45), new zu8(3, 46)}), new j70(30, new zu8[]{new zu8(8, 23), new zu8(26, 24)}), new j70(30, new zu8[]{new zu8(12, 15), new zu8(28, 16)}));
        av8 av8Var28 = new av8(28, new int[]{6, 26, 50, 74, 98, 122}, new j70(30, new zu8[]{new zu8(3, 117), new zu8(10, 118)}), new j70(28, new zu8[]{new zu8(3, 45), new zu8(23, 46)}), new j70(30, new zu8[]{new zu8(4, 24), new zu8(31, 25)}), new j70(30, new zu8[]{new zu8(11, 15), new zu8(31, 16)}));
        av8 av8Var29 = new av8(29, new int[]{6, 30, 54, 78, HttpStatusCodesKt.HTTP_PROCESSING, WebSocketProtocol.PAYLOAD_SHORT}, new j70(30, new zu8[]{new zu8(7, 116), new zu8(7, 117)}), new j70(28, new zu8[]{new zu8(21, 45), new zu8(7, 46)}), new j70(30, new zu8[]{new zu8(1, 23), new zu8(37, 24)}), new j70(30, new zu8[]{new zu8(19, 15), new zu8(26, 16)}));
        int i10 = 30;
        av8 av8Var30 = new av8(30, new int[]{6, 26, 52, 78, 104, 130}, new j70(30, new zu8[]{new zu8(5, 115), new zu8(10, 116)}), new j70(28, new zu8[]{new zu8(19, 47), new zu8(10, 48)}), new j70(30, new zu8[]{new zu8(15, 24), new zu8(25, 25)}), new j70(i10, new zu8[]{new zu8(23, 15), new zu8(25, 16)}));
        int i11 = 30;
        return new av8[]{av8Var, av8Var2, av8Var3, av8Var4, av8Var5, av8Var6, av8Var7, av8Var8, av8Var9, av8Var10, av8Var11, av8Var12, av8Var13, av8Var14, av8Var15, av8Var16, av8Var17, av8Var18, av8Var19, av8Var20, av8Var21, av8Var22, av8Var23, av8Var24, av8Var25, av8Var26, av8Var27, av8Var28, av8Var29, av8Var30, new av8(31, new int[]{6, 30, 56, 82, 108, 134}, new j70(i10, new zu8[]{new zu8(13, 115), new zu8(3, 116)}), new j70(28, new zu8[]{new zu8(2, 46), new zu8(29, 47)}), new j70(30, new zu8[]{new zu8(42, 24), new zu8(1, 25)}), new j70(i11, new zu8[]{new zu8(23, 15), new zu8(28, 16)})), new av8(32, new int[]{6, 34, 60, 86, 112, 138}, new j70(i11, new zu8[]{new zu8(17, 115)}), new j70(28, new zu8[]{new zu8(10, 46), new zu8(23, 47)}), new j70(30, new zu8[]{new zu8(10, 24), new zu8(35, 25)}), new j70(30, new zu8[]{new zu8(19, 15), new zu8(35, 16)})), new av8(33, new int[]{6, 30, 58, 86, 114, 142}, new j70(30, new zu8[]{new zu8(17, 115), new zu8(1, 116)}), new j70(28, new zu8[]{new zu8(14, 46), new zu8(21, 47)}), new j70(30, new zu8[]{new zu8(29, 24), new zu8(19, 25)}), new j70(30, new zu8[]{new zu8(11, 15), new zu8(46, 16)})), new av8(34, new int[]{6, 34, 62, 90, 118, 146}, new j70(30, new zu8[]{new zu8(13, 115), new zu8(6, 116)}), new j70(28, new zu8[]{new zu8(14, 46), new zu8(23, 47)}), new j70(30, new zu8[]{new zu8(44, 24), new zu8(7, 25)}), new j70(30, new zu8[]{new zu8(59, 16), new zu8(1, 17)})), new av8(35, new int[]{6, 30, 54, 78, HttpStatusCodesKt.HTTP_PROCESSING, WebSocketProtocol.PAYLOAD_SHORT, 150}, new j70(30, new zu8[]{new zu8(12, 121), new zu8(7, 122)}), new j70(28, new zu8[]{new zu8(12, 47), new zu8(26, 48)}), new j70(30, new zu8[]{new zu8(39, 24), new zu8(14, 25)}), new j70(30, new zu8[]{new zu8(22, 15), new zu8(41, 16)})), new av8(36, new int[]{6, 24, 50, 76, HttpStatusCodesKt.HTTP_PROCESSING, 128, 154}, new j70(30, new zu8[]{new zu8(6, 121), new zu8(14, 122)}), new j70(28, new zu8[]{new zu8(6, 47), new zu8(34, 48)}), new j70(30, new zu8[]{new zu8(46, 24), new zu8(10, 25)}), new j70(30, new zu8[]{new zu8(2, 15), new zu8(64, 16)})), new av8(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new j70(30, new zu8[]{new zu8(17, 122), new zu8(4, 123)}), new j70(28, new zu8[]{new zu8(29, 46), new zu8(14, 47)}), new j70(30, new zu8[]{new zu8(49, 24), new zu8(10, 25)}), new j70(30, new zu8[]{new zu8(24, 15), new zu8(46, 16)})), new av8(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new j70(30, new zu8[]{new zu8(4, 122), new zu8(18, 123)}), new j70(28, new zu8[]{new zu8(13, 46), new zu8(32, 47)}), new j70(30, new zu8[]{new zu8(48, 24), new zu8(14, 25)}), new j70(30, new zu8[]{new zu8(42, 15), new zu8(32, 16)})), new av8(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new j70(30, new zu8[]{new zu8(20, 117), new zu8(4, 118)}), new j70(28, new zu8[]{new zu8(40, 47), new zu8(7, 48)}), new j70(30, new zu8[]{new zu8(43, 24), new zu8(22, 25)}), new j70(30, new zu8[]{new zu8(10, 15), new zu8(67, 16)})), new av8(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new j70(30, new zu8[]{new zu8(19, 118), new zu8(6, 119)}), new j70(28, new zu8[]{new zu8(18, 47), new zu8(31, 48)}), new j70(30, new zu8[]{new zu8(34, 24), new zu8(34, 25)}), new j70(30, new zu8[]{new zu8(20, 15), new zu8(61, 16)}))};
    }

    public static av8 b(int i) {
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        for (int i4 = 0; i4 < 34; i4++) {
            int i5 = e[i4];
            if (i5 == i) {
                return c(i4 + 7);
            }
            int iBitCount = Integer.bitCount(i5 ^ i);
            if (iBitCount < i2) {
                i3 = i4 + 7;
                i2 = iBitCount;
            }
        }
        if (i2 <= 3) {
            return c(i3);
        }
        return null;
    }

    public static av8 c(int i) {
        if (i >= 1 && i <= 40) {
            return f[i - 1];
        }
        kp5.e();
        return null;
    }

    public final String toString() {
        return String.valueOf((int) this.a);
    }
}

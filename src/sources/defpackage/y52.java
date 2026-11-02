package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.conscrypt.FileClientSessionCache;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class y52 {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public y52(long j, byte[] bArr, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public static y52 a(String str) {
        byte[] bytes = str.concat("\u0000").getBytes(c62.O);
        return new y52(2, bytes.length, bytes);
    }

    public static y52 b(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[c62.F[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j2 : jArr) {
            byteBufferWrap.putInt((int) j2);
        }
        return new y52(4, jArr.length, byteBufferWrap.array());
    }

    public static y52 c(a62[] a62VarArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[c62.F[5] * a62VarArr.length]);
        byteBufferWrap.order(byteOrder);
        for (a62 a62Var : a62VarArr) {
            byteBufferWrap.putInt((int) a62Var.a);
            byteBufferWrap.putInt((int) a62Var.b);
        }
        return new y52(5, a62VarArr.length, byteBufferWrap.array());
    }

    public static y52 d(int i, ByteOrder byteOrder) {
        int[] iArr = {i};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[c62.F[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i2 : iArr) {
            byteBufferWrap.putShort((short) i2);
        }
        return new y52(3, iArr.length, byteBufferWrap.array());
    }

    public final double e(ByteOrder byteOrder) throws Throwable {
        Object objH = h(byteOrder);
        if (objH == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objH instanceof String) {
            return Double.parseDouble((String) objH);
        }
        if (objH instanceof long[]) {
            long[] jArr = (long[]) objH;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objH instanceof int[]) {
            int[] iArr = (int[]) objH;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objH instanceof double[]) {
            double[] dArr = (double[]) objH;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objH instanceof a62[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        a62[] a62VarArr = (a62[]) objH;
        if (a62VarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        a62 a62Var = a62VarArr[0];
        return a62Var.a / a62Var.b;
    }

    public final int f(ByteOrder byteOrder) throws Throwable {
        Object objH = h(byteOrder);
        if (objH == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objH instanceof String) {
            return Integer.parseInt((String) objH);
        }
        if (objH instanceof long[]) {
            long[] jArr = (long[]) objH;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objH instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objH;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String g(ByteOrder byteOrder) throws Throwable {
        Object objH = h(byteOrder);
        if (objH == null) {
            return null;
        }
        if (objH instanceof String) {
            return (String) objH;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objH instanceof long[]) {
            long[] jArr = (long[]) objH;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objH instanceof int[]) {
            int[] iArr = (int[]) objH;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objH instanceof double[]) {
            double[] dArr = (double[]) objH;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objH instanceof a62[])) {
            return null;
        }
        a62[] a62VarArr = (a62[]) objH;
        while (i < a62VarArr.length) {
            sb.append(a62VarArr[i].a);
            sb.append('/');
            sb.append(a62VarArr[i].b);
            i++;
            if (i != a62VarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r11v11, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r11v13, types: [a62[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v14, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v15, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v16, types: [a62[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v17, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v18, types: [double[], java.io.Serializable] */
    public final Serializable h(ByteOrder byteOrder) throws Throwable {
        x52 x52Var;
        byte b;
        byte[] bArr = this.d;
        x52 x52Var2 = null;
        try {
            x52Var = new x52(bArr);
            try {
                x52Var.Z = byteOrder;
                int i = this.a;
                int length = 0;
                int i2 = this.b;
                switch (i) {
                    case 1:
                    case 6:
                        if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                            String str = new String(bArr, c62.O);
                            try {
                                x52Var.close();
                                break;
                            } catch (IOException unused) {
                            }
                            return str;
                        }
                        String str2 = new String(new char[]{(char) (b + 48)});
                        try {
                            x52Var.close();
                            break;
                        } catch (IOException unused2) {
                        }
                        return str2;
                    case 2:
                    case 7:
                        if (i2 >= c62.G.length) {
                            int i3 = 0;
                            while (true) {
                                byte[] bArr2 = c62.G;
                                if (i3 >= bArr2.length) {
                                    length = bArr2.length;
                                } else if (bArr[i3] == bArr2[i3]) {
                                    i3++;
                                }
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        try {
                            while (length < i2) {
                                byte b2 = bArr[length];
                                if (b2 == 0) {
                                    String string = sb.toString();
                                    x52Var.close();
                                    return string;
                                }
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                length++;
                            }
                            x52Var.close();
                            break;
                        } catch (IOException unused3) {
                        }
                        String string2 = sb.toString();
                        return string2;
                    case 3:
                        ?? r11 = new int[i2];
                        while (length < i2) {
                            r11[length] = x52Var.readUnsignedShort();
                            length++;
                        }
                        try {
                            x52Var.close();
                            break;
                        } catch (IOException unused4) {
                        }
                        return r11;
                    case 4:
                        ?? r12 = new long[i2];
                        while (length < i2) {
                            r12[length] = ((long) x52Var.readInt()) & 4294967295L;
                            length++;
                        }
                        try {
                            x52Var.close();
                            break;
                        } catch (IOException unused5) {
                        }
                        return r12;
                    case 5:
                        ?? r13 = new a62[i2];
                        while (length < i2) {
                            r13[length] = new a62(((long) x52Var.readInt()) & 4294967295L, ((long) x52Var.readInt()) & 4294967295L);
                            length++;
                        }
                        try {
                            x52Var.close();
                            break;
                        } catch (IOException unused6) {
                        }
                        return r13;
                    case 8:
                        ?? r14 = new int[i2];
                        while (length < i2) {
                            r14[length] = x52Var.readShort();
                            length++;
                        }
                        try {
                            x52Var.close();
                            break;
                        } catch (IOException unused7) {
                        }
                        return r14;
                    case 9:
                        ?? r15 = new int[i2];
                        while (length < i2) {
                            r15[length] = x52Var.readInt();
                            length++;
                        }
                        try {
                            x52Var.close();
                            break;
                        } catch (IOException unused8) {
                        }
                        return r15;
                    case 10:
                        ?? r16 = new a62[i2];
                        while (length < i2) {
                            r16[length] = new a62(x52Var.readInt(), x52Var.readInt());
                            length++;
                        }
                        try {
                            x52Var.close();
                            break;
                        } catch (IOException unused9) {
                        }
                        return r16;
                    case 11:
                        ?? r17 = new double[i2];
                        while (length < i2) {
                            r17[length] = x52Var.readFloat();
                            length++;
                        }
                        try {
                            x52Var.close();
                            break;
                        } catch (IOException unused10) {
                        }
                        return r17;
                    case FileClientSessionCache.MAX_SIZE /* 12 */:
                        ?? r18 = new double[i2];
                        while (length < i2) {
                            r18[length] = x52Var.readDouble();
                            length++;
                        }
                        try {
                            x52Var.close();
                            break;
                        } catch (IOException unused11) {
                        }
                        return r18;
                    default:
                        try {
                            x52Var.close();
                            break;
                        } catch (IOException unused12) {
                        }
                        return null;
                }
            } catch (IOException unused13) {
                if (x52Var != null) {
                    try {
                        x52Var.close();
                    } catch (IOException unused14) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                x52Var2 = x52Var;
                if (x52Var2 != null) {
                    try {
                        x52Var2.close();
                    } catch (IOException unused15) {
                    }
                }
                throw th;
            }
        } catch (IOException unused16) {
            x52Var = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(c62.E[this.a]);
        sb.append(", data length:");
        return oi0.n(sb, this.d.length, ")");
    }

    public y52(int i, int i2, byte[] bArr) {
        this(-1L, bArr, i, i2);
    }
}

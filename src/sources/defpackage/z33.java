package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;
import java.nio.charset.StandardCharsets;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z33 {
    public static final k32 n = new k32();
    public static final CharBuffer o = CharBuffer.wrap("\u0000");
    public static final yc0 p = new yc0(2);
    public static final z33 q = new z33();
    public static final byte[] r = new byte[0];
    public static final ByteBuffer s = ByteBuffer.allocate(0).asReadOnlyBuffer();
    public static final char[] t = new char[0];
    public static final int[] u = new int[0];
    public static final t33 v = new t33();
    public static final y33 w = new y33();
    public static final int[] x = {0, 1, 2, 3, 2, 2, 0, 7, 8, 8, -1, -1, -1, -1, 14, -1};
    public final ByteBuffer a;
    public final byte[] b;
    public final CharBuffer c;
    public final z33 d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final w33 m;

    public z33(ByteBuffer byteBuffer, String str, ClassLoader classLoader) throws IOException {
        int i;
        int iC;
        b33.h(byteBuffer, 1382380354, n);
        byte b = byteBuffer.get(16);
        ByteBuffer byteBufferOrder = byteBuffer.slice().order(byteBuffer.order());
        this.a = byteBufferOrder;
        int iRemaining = byteBufferOrder.remaining();
        this.e = this.a.getInt(0);
        int iC2 = c(0);
        int i2 = iC2 & 255;
        int i3 = 4;
        if (i2 <= 4) {
            throw new i33("not enough indexes");
        }
        int i4 = i2 + 1;
        int i5 = i4 << 2;
        if (iRemaining >= i5) {
            int iC3 = c(3);
            if (iRemaining >= (iC3 << 2)) {
                int i6 = iC3 - 1;
                if (b >= 3) {
                    this.g = iC2 >>> 8;
                }
                if (i2 > 5) {
                    int iC4 = c(5);
                    this.i = (iC4 & 1) != 0;
                    this.j = (iC4 & 2) != 0;
                    this.k = (iC4 & 4) != 0;
                    this.g |= (61440 & iC4) << 12;
                    this.h = iC4 >>> 16;
                }
                int iC5 = c(1);
                if (iC5 > i4) {
                    if (this.j) {
                        this.b = new byte[(iC5 - i4) << 2];
                        this.a.position(i5);
                    } else {
                        int i7 = iC5 << 2;
                        this.f = i7;
                        this.b = new byte[i7];
                    }
                    this.a.get(this.b);
                }
                CharBuffer charBuffer = o;
                if (i2 <= 6 || (iC = c(6)) <= iC5) {
                    this.c = charBuffer;
                } else {
                    int i8 = (iC - iC5) * 2;
                    this.a.position(iC5 << 2);
                    CharBuffer charBufferAsCharBuffer = this.a.asCharBuffer();
                    this.c = charBufferAsCharBuffer;
                    charBufferAsCharBuffer.limit(i8);
                    i6 |= i8 - 1;
                }
                if (i2 > 7) {
                    this.l = c(7);
                }
                if (!this.j || this.c.length() > 1) {
                    w33 w33Var = new w33();
                    w33Var.a = new int[32];
                    w33Var.b = new Object[32];
                    w33Var.d = 28;
                    while (true) {
                        i = w33Var.d;
                        if (i6 > 134217727) {
                            break;
                        }
                        i6 <<= 1;
                        w33Var.d = i - 1;
                    }
                    int i9 = i + 2;
                    if (i9 <= 7) {
                        w33Var.e = i9;
                    } else if (i9 < 10) {
                        w33Var.e = (i - 1) | 48;
                    } else {
                        w33Var.e = 7;
                        int i10 = i - 5;
                        while (true) {
                            int i11 = w33Var.e;
                            if (i10 <= 6) {
                                w33Var.e = i11 | (i10 << i3);
                                break;
                            } else if (i10 < 9) {
                                w33Var.e = i11 | (((i10 - 3) | 48) << i3);
                                break;
                            } else {
                                w33Var.e = i11 | (6 << i3);
                                i10 -= 6;
                                i3 += 4;
                            }
                        }
                    }
                    this.m = w33Var;
                }
                this.a.position(0);
                if (this.k) {
                    z33 z33VarF = f(str, "pool", classLoader);
                    this.d = z33VarF;
                    if (z33VarF == null || !z33VarF.j) {
                        bt.i("pool.res is not a pool bundle");
                        throw null;
                    }
                    if (z33VarF.l == this.l) {
                        return;
                    }
                    bt.i("pool.res has a different checksum than this bundle");
                    throw null;
                }
                return;
            }
        }
        throw new i33("not enough bytes");
    }

    public static String b(String str, String str2) {
        if (str == null || str.length() == 0) {
            return str2.length() == 0 ? sk8.d().Y : str2.concat(".res");
        }
        if (str.indexOf(46) == -1) {
            return str.charAt(str.length() + (-1)) != '/' ? oi0.m(str, "/", str2, ".res") : pc6.p(str, str2, ".res");
        }
        String strReplace = str.replace('.', '/');
        if (str2.length() == 0) {
            return pc6.o(strReplace, ".res");
        }
        return strReplace + "_" + str2 + ".res";
    }

    public static z33 f(String str, String str2, ClassLoader classLoader) {
        z33 z33Var = (z33) p.v0(new u33(str, str2), classLoader);
        if (z33Var == q) {
            return null;
        }
        return z33Var;
    }

    public static String j(int i, byte[] bArr) {
        int i2 = i;
        while (bArr[i2] != 0) {
            i2++;
        }
        return new String(bArr, i, i2 - i, StandardCharsets.ISO_8859_1);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final t33 a(int i) {
        s33 s33Var;
        int i2 = i >>> 28;
        if (i2 != 8 && i2 != 9) {
            return null;
        }
        int i3 = 268435455 & i;
        if (i3 == 0) {
            return v;
        }
        w33 w33Var = this.m;
        Object objA = w33Var.a(i);
        if (objA != null) {
            return (t33) objA;
        }
        if (i2 == 8) {
            s33Var = new s33((byte) 1);
            int i4 = i3 << 2;
            s33Var.b = this.a.getInt(i4);
            s33Var.c = i4 + 4;
        } else {
            s33Var = new s33((byte) 0);
            s33Var.b = this.c.charAt(i3);
            s33Var.c = i3 + 1;
        }
        return (t33) w33Var.c(i, 0, s33Var);
    }

    public final int c(int i) {
        return this.a.getInt((i + 1) << 2);
    }

    public final int[] d(int i) {
        int i2 = 268435455 & i;
        if ((i >>> 28) != 14) {
            return null;
        }
        if (i2 == 0) {
            return u;
        }
        int i3 = i2 << 2;
        return e(i3 + 4, this.a.getInt(i3));
    }

    public final int[] e(int i, int i2) {
        int[] iArr = new int[i2];
        ByteBuffer byteBuffer = this.a;
        if (i2 > 16) {
            IntBuffer intBufferAsIntBuffer = byteBuffer.asIntBuffer();
            intBufferAsIntBuffer.position(i / 4);
            intBufferAsIntBuffer.get(iArr);
            return iArr;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = byteBuffer.getInt(i);
            i += 4;
        }
        return iArr;
    }

    public final String g(int i) {
        int i2 = 268435455 & i;
        if (i != i2 && (i >>> 28) != 6) {
            return null;
        }
        if (i2 == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if (i != i2) {
            int i3 = this.g;
            return i2 < i3 ? this.d.h(i) : h(i - i3);
        }
        w33 w33Var = this.m;
        Object objA = w33Var.a(i);
        if (objA != null) {
            return (String) objA;
        }
        int i4 = i2 << 2;
        String strK = k(i4 + 4, this.a.getInt(i4));
        return (String) w33Var.c(i, strK.length() * 2, strK);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final String h(int i) {
        int iCharAt;
        int i2;
        String string;
        int i3 = 268435455 & i;
        w33 w33Var = this.m;
        Object objA = w33Var.a(i);
        if (objA != null) {
            return (String) objA;
        }
        CharBuffer charBuffer = this.c;
        char cCharAt = charBuffer.charAt(i3);
        if ((cCharAt & 64512) == 56320) {
            if (cCharAt < 57327) {
                iCharAt = cCharAt & 1023;
                i2 = i3 + 1;
            } else if (cCharAt < 57343) {
                iCharAt = ((cCharAt - 57327) << 16) | charBuffer.charAt(i3 + 1);
                i2 = i3 + 2;
            } else {
                iCharAt = (charBuffer.charAt(i3 + 1) << 16) | charBuffer.charAt(i3 + 2);
                i2 = i3 + 3;
            }
            string = charBuffer.subSequence(i2, iCharAt + i2).toString();
        } else {
            if (cCharAt == 0) {
                return _UrlKt.FRAGMENT_ENCODE_SET;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(cCharAt);
            while (true) {
                i3++;
                char cCharAt2 = charBuffer.charAt(i3);
                if (cCharAt2 == 0) {
                    break;
                }
                sb.append(cCharAt2);
            }
            string = sb.toString();
        }
        return (String) w33Var.c(i, string.length() * 2, string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final y33 i(int i) {
        x33 x33Var;
        int i2;
        x33 x33Var2;
        int i3 = i >>> 28;
        byte b = 2;
        if (i3 != 2 && i3 != 5 && i3 != 4) {
            return null;
        }
        int i4 = 268435455 & i;
        if (i4 == 0) {
            return w;
        }
        w33 w33Var = this.m;
        Object objA = w33Var.a(i);
        if (objA != null) {
            return (y33) objA;
        }
        ByteBuffer byteBuffer = this.a;
        char[] cArr = t;
        byte b2 = 0;
        if (i3 == 2) {
            x33Var2 = new x33(b2);
            int i5 = i4 << 2;
            int i6 = byteBuffer.getChar(i5);
            if (i6 > 0) {
                int i7 = i5 + 2;
                cArr = new char[i6];
                if (i6 <= 16) {
                    for (int i8 = 0; i8 < i6; i8++) {
                        cArr[i8] = byteBuffer.getChar(i7);
                        i7 += 2;
                    }
                } else {
                    CharBuffer charBufferAsCharBuffer = byteBuffer.asCharBuffer();
                    charBufferAsCharBuffer.position(i7 / 2);
                    charBufferAsCharBuffer.get(cArr);
                }
            }
            x33Var2.d = cArr;
            int length = cArr.length;
            x33Var2.b = length;
            x33Var2.c = (((length + 2) & (-2)) * 2) + i5;
            i2 = length * 2;
        } else {
            if (i3 == 5) {
                x33Var = new x33((byte) 1);
                int i9 = i4 + 1;
                CharBuffer charBuffer = this.c;
                int iCharAt = charBuffer.charAt(i4);
                if (iCharAt > 0) {
                    cArr = new char[iCharAt];
                    if (iCharAt <= 16) {
                        int i10 = i9;
                        while (b2 < iCharAt) {
                            cArr[b2] = charBuffer.charAt(i10);
                            i10++;
                            b2++;
                        }
                    } else {
                        CharBuffer charBufferDuplicate = charBuffer.duplicate();
                        charBufferDuplicate.position(i9);
                        charBufferDuplicate.get(cArr);
                    }
                }
                x33Var.d = cArr;
                int length2 = cArr.length;
                x33Var.b = length2;
                x33Var.c = i9 + length2;
                i2 = length2 * 2;
            } else {
                x33Var = new x33(b);
                int i11 = i4 << 2;
                int i12 = byteBuffer.getInt(i11);
                int[] iArrE = i12 > 0 ? e(i11 + 4, i12) : u;
                x33Var.e = iArrE;
                int length3 = iArrE.length;
                x33Var.b = length3;
                x33Var.c = ((length3 + 1) * 4) + i11;
                i2 = length3 * 4;
            }
            x33Var2 = x33Var;
        }
        return (y33) w33Var.c(i, i2, x33Var2);
    }

    public final String k(int i, int i2) {
        ByteBuffer byteBuffer = this.a;
        if (i2 > 16) {
            int i3 = i / 2;
            return byteBuffer.asCharBuffer().subSequence(i3, i2 + i3).toString();
        }
        StringBuilder sb = new StringBuilder(i2);
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(byteBuffer.getChar(i));
            i += 2;
        }
        return sb.toString();
    }
}

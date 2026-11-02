package defpackage;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fs3 {
    public byte a;
    public int b;
    public final int c;
    public final fs3 d;
    public z47 e;
    public fs3 f;
    public String g;
    public Object h;
    public boolean i;

    /* JADX WARN: Multi-variable type inference failed */
    public fs3(int i, fs3 fs3Var, z47 z47Var, Object obj) {
        this.a = i;
        this.d = fs3Var;
        this.c = fs3Var == null ? 0 : fs3Var.c + 1;
        this.e = z47Var;
        this.b = -1;
        this.h = obj;
    }

    public final String a() {
        byte b = this.a;
        if (b == 0) {
            return "root";
        }
        if (b != 1) {
            return b != 2 ? "?" : "Object";
        }
        return "Array";
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    public final int b(String str) {
        boolean z;
        if (this.a != 2 || this.i) {
            return 4;
        }
        this.i = true;
        this.g = str;
        z47 z47Var = this.e;
        if (z47Var != null) {
            String str2 = (String) z47Var.Y;
            if (str2 == null) {
                z47Var.Y = str;
            } else {
                if (str.equals(str2)) {
                    z = true;
                } else {
                    String str3 = (String) z47Var.f0;
                    if (str3 == null) {
                        z47Var.f0 = str;
                    } else if (str.equals(str3)) {
                        z = true;
                    } else {
                        if (((HashSet) z47Var.g0) == null) {
                            HashSet hashSet = new HashSet(16);
                            z47Var.g0 = hashSet;
                            hashSet.add((String) z47Var.Y);
                            ((HashSet) z47Var.g0).add((String) z47Var.f0);
                        }
                        z = !((HashSet) z47Var.g0).add(str);
                    }
                }
                if (z) {
                    throw new po3(pc6.p("Duplicate field '", str, "'"), (eq2) z47Var.Z);
                }
            }
            z = false;
            if (z) {
                throw new po3(pc6.p("Duplicate field '", str, "'"), (eq2) z47Var.Z);
            }
        }
        return this.b < 0 ? 0 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        byte b = this.a;
        if (b != 0) {
            if (b != 1) {
                sb.append('{');
                String str = this.g;
                if (str != null) {
                    sb.append('\"');
                    int[] iArr = fq0.f;
                    int length = iArr.length;
                    int length2 = str.length();
                    for (int i = 0; i < length2; i++) {
                        char cCharAt = str.charAt(i);
                        if (cCharAt >= length || iArr[cCharAt] == 0) {
                            sb.append(cCharAt);
                        } else {
                            sb.append('\\');
                            int i2 = iArr[cCharAt];
                            if (i2 < 0) {
                                sb.append("u00");
                                char[] cArr = fq0.a;
                                sb.append(cArr[cCharAt >> 4]);
                                sb.append(cArr[cCharAt & 15]);
                            } else {
                                sb.append((char) i2);
                            }
                        }
                    }
                    sb.append('\"');
                } else {
                    sb.append('?');
                }
                sb.append('}');
            } else {
                sb.append('[');
                int i3 = this.b;
                sb.append(i3 >= 0 ? i3 : 0);
                sb.append(']');
            }
        } else {
            sb.append("/");
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fs3(int i, fs3 fs3Var, z47 z47Var) {
        this.a = i;
        this.d = fs3Var;
        this.c = fs3Var == null ? 0 : fs3Var.c + 1;
        this.e = z47Var;
        this.b = -1;
    }
}

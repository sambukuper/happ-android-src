package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ze3 implements ow3 {
    public static final ze3 a = new ze3();
    public static final bu5 b = new bu5("kotlin.time.Instant", zt5.U);

    @Override // defpackage.ow3
    public final void a(ol7 ol7Var, Object obj) {
        te3 te3Var = (te3) obj;
        te3Var.getClass();
        ol7Var.t(te3Var.toString());
    }

    /* JADX WARN: Code duplicated, block: B:196:0x046f  */
    /* JADX WARN: Code duplicated, block: B:197:0x0485  */
    /* JADX WARN: Instruction removed from duplicated block: B:197:0x0485, please report this as an issue */
    @Override // defpackage.ow3
    public final Object b(rd1 rd1Var) {
        int i;
        ye3 ye3VarF;
        int i2;
        int i3;
        int i4;
        char cCharAt;
        char cCharAt2;
        te3 te3Var = te3.Z;
        String strS = rd1Var.s();
        strS.getClass();
        if (strS.length() == 0) {
            ye3VarF = new dq("An empty string is not a valid Instant", strS, (byte) 3);
        } else {
            char cCharAt3 = strS.charAt(0);
            if (cCharAt3 == '+' || cCharAt3 == '-') {
                i = 1;
            } else {
                i = 0;
                cCharAt3 = ' ';
            }
            int iCharAt = 0;
            int i5 = i;
            while (i5 < strS.length() && '0' <= (cCharAt2 = strS.charAt(i5)) && cCharAt2 < ':') {
                iCharAt = (iCharAt * 10) + (strS.charAt(i5) - '0');
                i5++;
            }
            int i6 = i5 - i;
            if (i6 > 10) {
                ye3VarF = jb5.G(strS, "Expected at most 10 digits for the year number, got " + i6 + " digits");
            } else if (i6 == 10 && strS.charAt(i) >= '2') {
                ye3VarF = jb5.G(strS, "Expected at most 9 digits for the year number or year 1000000000, got " + i6 + " digits");
            } else if (i6 < 4) {
                ye3VarF = jb5.G(strS, "The year number must be padded to 4 digits, got " + i6 + " digits");
            } else if (cCharAt3 == '+' && i6 == 4) {
                ye3VarF = jb5.G(strS, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (cCharAt3 != ' ' || i6 == 4) {
                if (cCharAt3 == '-') {
                    iCharAt = -iCharAt;
                }
                int i7 = i5 + 16;
                if (strS.length() < i7) {
                    ye3VarF = jb5.G(strS, "The input string is too short");
                } else {
                    dq dqVarF = jb5.F(strS, "'-'", i5, new ya2((byte) 24));
                    if (dqVarF != null) {
                        ye3VarF = dqVarF;
                    } else {
                        ye3VarF = jb5.F(strS, "'-'", i5 + 3, new ya2((byte) 25));
                        if (ye3VarF == null && (ye3VarF = jb5.F(strS, "'T' or 't'", i5 + 6, new ya2((byte) 26))) == null && (ye3VarF = jb5.F(strS, "':'", i5 + 9, new ya2((byte) 27))) == null && (ye3VarF = jb5.F(strS, "':'", i5 + 12, new ya2((byte) 28))) == null) {
                            int[] iArr = jb5.f0;
                            for (int i8 = 0; i8 < 10; i8++) {
                                dq dqVarF2 = jb5.F(strS, "an ASCII digit", i5 + iArr[i8], new ya2((byte) 29));
                                if (dqVarF2 != null) {
                                    ye3VarF = dqVarF2;
                                }
                            }
                            int iH = jb5.H(i5 + 1, strS);
                            int iH2 = jb5.H(i5 + 4, strS);
                            int iH3 = jb5.H(i5 + 7, strS);
                            int iH4 = jb5.H(i5 + 10, strS);
                            int iH5 = jb5.H(i5 + 13, strS);
                            int i9 = i5 + 15;
                            if (strS.charAt(i9) == '.') {
                                i9 = i7;
                                int iCharAt2 = 0;
                                while (i9 < strS.length() && '0' <= (cCharAt = strS.charAt(i9)) && cCharAt < ':') {
                                    iCharAt2 = (iCharAt2 * 10) + (strS.charAt(i9) - '0');
                                    i9++;
                                }
                                int i10 = i9 - i7;
                                if (1 > i10 || i10 >= 10) {
                                    ye3VarF = jb5.G(strS, "1..9 digits are supported for the fraction of the second, got " + i10 + " digits");
                                } else {
                                    i2 = iCharAt2 * jb5.Z[9 - i10];
                                }
                            } else {
                                i2 = 0;
                            }
                            if (i9 >= strS.length()) {
                                ye3VarF = jb5.G(strS, "The UTC offset at the end of the string is missing");
                            } else {
                                char cCharAt4 = strS.charAt(i9);
                                if (cCharAt4 == '+' || cCharAt4 == '-') {
                                    int length = strS.length() - i9;
                                    if (length > 9) {
                                        ye3VarF = jb5.G(strS, "The UTC offset string \"" + jb5.T(16, strS.subSequence(i9, strS.length()).toString()) + "\" is too long");
                                    } else if (length % 3 != 0) {
                                        ye3VarF = jb5.G(strS, "Invalid UTC offset string \"" + strS.subSequence(i9, strS.length()).toString() + '\"');
                                    } else {
                                        int[] iArr2 = jb5.g0;
                                        int i11 = 0;
                                        for (int i12 = 2; i11 < i12; i12 = 2) {
                                            int i13 = i9 + iArr2[i11];
                                            if (i13 >= strS.length()) {
                                                break;
                                            }
                                            if (strS.charAt(i13) != ':') {
                                                StringBuilder sbL = ie2.l("Expected ':' at index ", i13, ", got '");
                                                sbL.append(strS.charAt(i13));
                                                sbL.append('\'');
                                                ye3VarF = jb5.G(strS, sbL.toString());
                                            } else {
                                                i11++;
                                            }
                                        }
                                        int[] iArr3 = jb5.h0;
                                        int i14 = 0;
                                        while (i14 < 6 && (i4 = iArr3[i14] + i9) < strS.length()) {
                                            char cCharAt5 = strS.charAt(i4);
                                            int[] iArr4 = iArr3;
                                            if ('0' > cCharAt5 || cCharAt5 >= ':') {
                                                StringBuilder sbL2 = ie2.l("Expected an ASCII digit at index ", i4, ", got '");
                                                sbL2.append(strS.charAt(i4));
                                                sbL2.append('\'');
                                                ye3VarF = jb5.G(strS, sbL2.toString());
                                            } else {
                                                i14++;
                                                iArr3 = iArr4;
                                            }
                                        }
                                        int iH6 = jb5.H(i9 + 1, strS);
                                        int iH7 = length > 3 ? jb5.H(i9 + 4, strS) : 0;
                                        int iH8 = length > 6 ? jb5.H(i9 + 7, strS) : 0;
                                        if (iH7 > 59) {
                                            ye3VarF = jb5.G(strS, "Expected offset-minute-of-hour in 0..59, got " + iH7);
                                        } else if (iH8 > 59) {
                                            ye3VarF = jb5.G(strS, "Expected offset-second-of-minute in 0..59, got " + iH8);
                                        } else if (iH6 <= 17 || (iH6 == 18 && iH7 == 0 && iH8 == 0)) {
                                            i3 = ((iH7 * 60) + (iH6 * 3600) + iH8) * (cCharAt4 == '-' ? -1 : 1);
                                            if (1 <= iH || iH >= 13) {
                                                ye3VarF = jb5.G(strS, "Expected a month number in 1..12, got " + iH);
                                            } else if (1 > iH2) {
                                                StringBuilder sbR = oi0.r(iH, "Expected a valid day-of-month for month ", iCharAt, " of year ", ", got ");
                                                sbR.append(iH2);
                                                ye3VarF = jb5.G(strS, sbR.toString());
                                            } else {
                                                int i15 = iCharAt & 3;
                                                if (iH2 > (iH != 2 ? (iH == 4 || iH == 6 || iH == 9 || iH == 11) ? 30 : 31 : i15 == 0 && (iCharAt % 100 != 0 || iCharAt % 400 == 0) ? 29 : 28)) {
                                                    StringBuilder sbR2 = oi0.r(iH, "Expected a valid day-of-month for month ", iCharAt, " of year ", ", got ");
                                                    sbR2.append(iH2);
                                                    ye3VarF = jb5.G(strS, sbR2.toString());
                                                } else if (iH3 > 23) {
                                                    ye3VarF = jb5.G(strS, "Expected hour in 0..23, got " + iH3);
                                                } else if (iH4 > 59) {
                                                    ye3VarF = jb5.G(strS, "Expected minute-of-hour in 0..59, got " + iH4);
                                                } else if (iH5 > 59) {
                                                    ye3VarF = jb5.G(strS, "Expected second-of-minute in 0..59, got " + iH5);
                                                } else {
                                                    long j = iCharAt;
                                                    long j2 = 365 * j;
                                                    long j3 = (j >= 0 ? ((j + 399) / 400) + (((j + 3) / 4) - ((j + 99) / 100)) + j2 : j2 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + ((long) (((iH * 367) - 362) / 12)) + ((long) (iH2 - 1));
                                                    if (iH > 2) {
                                                        j3 = (i15 != 0 || (iCharAt % 100 == 0 && iCharAt % 400 != 0)) ? j3 - 2 : (-1) + j3;
                                                    }
                                                    ye3VarF = new xe3((((j3 - 719528) * 86400) + ((long) (((iH4 * 60) + (iH3 * 3600)) + iH5))) - ((long) i3), i2);
                                                }
                                            }
                                        } else {
                                            ye3VarF = jb5.G(strS, "Expected an offset in -18:00..+18:00, got " + strS.subSequence(i9, strS.length()).toString());
                                        }
                                    }
                                } else if (cCharAt4 == 'Z' || cCharAt4 == 'z') {
                                    int i16 = i9 + 1;
                                    if (strS.length() == i16) {
                                        i3 = 0;
                                        if (1 <= iH) {
                                            ye3VarF = jb5.G(strS, "Expected a month number in 1..12, got " + iH);
                                        } else {
                                            ye3VarF = jb5.G(strS, "Expected a month number in 1..12, got " + iH);
                                        }
                                    } else {
                                        ye3VarF = jb5.G(strS, "Extra text after the instant at position " + i16);
                                    }
                                } else {
                                    ye3VarF = jb5.G(strS, "Expected the UTC offset at position " + i9 + ", got '" + cCharAt4 + '\'');
                                }
                            }
                        }
                    }
                }
            } else {
                ye3VarF = jb5.G(strS, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            }
        }
        return ye3VarF.toInstant();
    }

    @Override // defpackage.ow3
    public final e37 d() {
        return b;
    }
}

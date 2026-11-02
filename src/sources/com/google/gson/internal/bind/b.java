package com.google.gson.internal.bind;

import defpackage.bo3;
import defpackage.bt;
import defpackage.f44;
import defpackage.fr3;
import defpackage.hs3;
import defpackage.ie2;
import defpackage.p61;
import defpackage.rq3;
import defpackage.uo3;
import defpackage.vg8;
import defpackage.yi8;
import defpackage.z91;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final vg8 A;
    public static final vg8 B;
    public static final vg8 C;
    public static final vg8 a = new TypeAdapters$30(Class.class, new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$1
        @Override // com.google.gson.b
        public final Object b(rq3 rq3Var) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee ".concat("https://github.com/google/gson/blob/main/Troubleshooting.md#java-lang-class-unsupported"));
        }

        @Override // com.google.gson.b
        public final void c(hs3 hs3Var, Object obj) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#java-lang-class-unsupported");
        }
    }.a());
    public static final vg8 b = new TypeAdapters$30(BitSet.class, new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$2
        @Override // com.google.gson.b
        public final Object b(rq3 rq3Var) throws IOException {
            boolean zR;
            BitSet bitSet = new BitSet();
            rq3Var.Q0();
            int iC0 = rq3Var.c0();
            int i2 = 0;
            while (iC0 != 2) {
                int iB = p61.B(iC0);
                if (iB == 5 || iB == 6) {
                    int iNextInt = rq3Var.nextInt();
                    if (iNextInt == 0) {
                        zR = false;
                    } else {
                        if (iNextInt != 1) {
                            StringBuilder sbL = ie2.l("Invalid bitset value ", iNextInt, ", expected 0 or 1; at path ");
                            sbL.append(rq3Var.C());
                            throw new fr3(sbL.toString());
                        }
                        zR = true;
                    }
                } else {
                    if (iB != 7) {
                        throw new fr3("Invalid bitset value type: " + ie2.r(iC0) + "; at path " + rq3Var.p());
                    }
                    zR = rq3Var.R();
                }
                if (zR) {
                    bitSet.set(i2);
                }
                i2++;
                iC0 = rq3Var.c0();
            }
            rq3Var.K0();
            return bitSet;
        }

        @Override // com.google.gson.b
        public final void c(hs3 hs3Var, Object obj) throws IOException {
            BitSet bitSet = (BitSet) obj;
            hs3Var.Q0();
            int length = bitSet.length();
            for (int i2 = 0; i2 < length; i2++) {
                hs3Var.X(bitSet.get(i2) ? 1L : 0L);
            }
            hs3Var.K0();
        }
    }.a());
    public static final com.google.gson.b c;
    public static final vg8 d;
    public static final vg8 e;
    public static final vg8 f;
    public static final vg8 g;
    public static final vg8 h;
    public static final vg8 i;
    public static final vg8 j;
    public static final com.google.gson.b k;
    public static final com.google.gson.b l;
    public static final com.google.gson.b m;
    public static final vg8 n;
    public static final vg8 o;
    public static final vg8 p;
    public static final vg8 q;
    public static final vg8 r;
    public static final vg8 s;
    public static final vg8 t;
    public static final vg8 u;
    public static final vg8 v;
    public static final vg8 w;
    public static final vg8 x;
    public static final vg8 y;
    public static final vg8 z;

    static {
        com.google.gson.b bVar = new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$3
            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) throws IOException {
                int iC0 = rq3Var.c0();
                if (iC0 != 9) {
                    return iC0 == 6 ? Boolean.valueOf(Boolean.parseBoolean(rq3Var.r())) : Boolean.valueOf(rq3Var.R());
                }
                rq3Var.X();
                return null;
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) throws IOException {
                hs3Var.Y((Boolean) obj);
            }
        };
        c = new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$4
            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) throws IOException {
                if (rq3Var.c0() != 9) {
                    return Boolean.valueOf(rq3Var.r());
                }
                rq3Var.X();
                return null;
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) throws IOException {
                Boolean bool = (Boolean) obj;
                hs3Var.c0(bool == null ? "null" : bool.toString());
            }
        };
        d = new TypeAdapters$31(Boolean.TYPE, Boolean.class, bVar);
        e = new TypeAdapters$31(Byte.TYPE, Byte.class, new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$5
            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) throws IOException {
                if (rq3Var.c0() == 9) {
                    rq3Var.X();
                    return null;
                }
                try {
                    int iNextInt = rq3Var.nextInt();
                    if (iNextInt <= 255 && iNextInt >= -128) {
                        return Byte.valueOf((byte) iNextInt);
                    }
                    StringBuilder sbL = ie2.l("Lossy conversion from ", iNextInt, " to byte; at path ");
                    sbL.append(rq3Var.C());
                    throw new fr3(sbL.toString());
                } catch (NumberFormatException e2) {
                    throw new fr3(e2);
                }
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) throws IOException {
                Number number = (Number) obj;
                if (number == null) {
                    hs3Var.u();
                } else {
                    hs3Var.X(number.byteValue());
                }
            }
        });
        f = new TypeAdapters$31(Short.TYPE, Short.class, new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$6
            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) throws IOException {
                if (rq3Var.c0() == 9) {
                    rq3Var.X();
                    return null;
                }
                try {
                    int iNextInt = rq3Var.nextInt();
                    if (iNextInt <= 65535 && iNextInt >= -32768) {
                        return Short.valueOf((short) iNextInt);
                    }
                    StringBuilder sbL = ie2.l("Lossy conversion from ", iNextInt, " to short; at path ");
                    sbL.append(rq3Var.C());
                    throw new fr3(sbL.toString());
                } catch (NumberFormatException e2) {
                    throw new fr3(e2);
                }
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) throws IOException {
                Number number = (Number) obj;
                if (number == null) {
                    hs3Var.u();
                } else {
                    hs3Var.X(number.shortValue());
                }
            }
        });
        g = new TypeAdapters$31(Integer.TYPE, Integer.class, new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$7
            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) throws IOException {
                if (rq3Var.c0() == 9) {
                    rq3Var.X();
                    return null;
                }
                try {
                    return Integer.valueOf(rq3Var.nextInt());
                } catch (NumberFormatException e2) {
                    throw new fr3(e2);
                }
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) throws IOException {
                Number number = (Number) obj;
                if (number == null) {
                    hs3Var.u();
                } else {
                    hs3Var.X(number.intValue());
                }
            }
        });
        h = new TypeAdapters$30(AtomicInteger.class, new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$8
            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) {
                try {
                    return new AtomicInteger(rq3Var.nextInt());
                } catch (NumberFormatException e2) {
                    throw new fr3(e2);
                }
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) throws IOException {
                hs3Var.X(((AtomicInteger) obj).get());
            }
        }.a());
        i = new TypeAdapters$30(AtomicBoolean.class, new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$10
            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) {
                return new AtomicBoolean(rq3Var.R());
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) throws IOException {
                hs3Var.u0(((AtomicBoolean) obj).get());
            }
        }.a());
        j = new TypeAdapters$30(AtomicIntegerArray.class, new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$11
            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) throws IOException {
                ArrayList arrayList = new ArrayList();
                rq3Var.Q0();
                while (rq3Var.hasNext()) {
                    try {
                        arrayList.add(Integer.valueOf(rq3Var.nextInt()));
                    } catch (NumberFormatException e2) {
                        throw new fr3(e2);
                    }
                }
                rq3Var.K0();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) throws IOException {
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
                hs3Var.Q0();
                int length = atomicIntegerArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    hs3Var.X(atomicIntegerArray.get(i2));
                }
                hs3Var.K0();
            }
        }.a());
        k = new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$13
            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) throws IOException {
                if (rq3Var.c0() == 9) {
                    rq3Var.X();
                    return null;
                }
                try {
                    return Long.valueOf(rq3Var.nextLong());
                } catch (NumberFormatException e2) {
                    throw new fr3(e2);
                }
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) throws IOException {
                Number number = (Number) obj;
                if (number == null) {
                    hs3Var.u();
                } else {
                    hs3Var.X(number.longValue());
                }
            }
        };
        new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$14
            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) throws IOException {
                if (rq3Var.c0() != 9) {
                    return Long.valueOf(rq3Var.nextLong());
                }
                rq3Var.X();
                return null;
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) throws IOException {
                Number number = (Number) obj;
                if (number == null) {
                    hs3Var.u();
                } else {
                    hs3Var.c0(number.toString());
                }
            }
        };
        final boolean z2 = true;
        l = new com.google.gson.b(z2) { // from class: com.google.gson.internal.bind.TypeAdapters$FloatAdapter
            public final boolean a;

            {
                this.a = z2;
            }

            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) throws IOException {
                if (rq3Var.c0() != 9) {
                    return Float.valueOf((float) rq3Var.nextDouble());
                }
                rq3Var.X();
                return null;
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) throws IOException {
                Number numberValueOf = (Number) obj;
                if (numberValueOf == null) {
                    hs3Var.u();
                    return;
                }
                float fFloatValue = numberValueOf.floatValue();
                if (this.a) {
                    b.c(fFloatValue);
                }
                if (!(numberValueOf instanceof Float)) {
                    numberValueOf = Float.valueOf(fFloatValue);
                }
                hs3Var.a0(numberValueOf);
            }
        };
        m = new com.google.gson.b(z2) { // from class: com.google.gson.internal.bind.TypeAdapters$DoubleAdapter
            public final boolean a;

            {
                this.a = z2;
            }

            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) throws IOException {
                if (rq3Var.c0() != 9) {
                    return Double.valueOf(rq3Var.nextDouble());
                }
                rq3Var.X();
                return null;
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) throws IOException {
                Number number = (Number) obj;
                if (number == null) {
                    hs3Var.u();
                    return;
                }
                double dDoubleValue = number.doubleValue();
                if (this.a) {
                    b.c(dDoubleValue);
                }
                hs3Var.U(dDoubleValue);
            }
        };
        n = new TypeAdapters$31(Character.TYPE, Character.class, new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$15
            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) throws IOException {
                if (rq3Var.c0() == 9) {
                    rq3Var.X();
                    return null;
                }
                String strR = rq3Var.r();
                if (strR.length() == 1) {
                    return Character.valueOf(strR.charAt(0));
                }
                StringBuilder sbP = p61.p("Expecting character, got: ", strR, "; at ");
                sbP.append(rq3Var.C());
                throw new fr3(sbP.toString());
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) throws IOException {
                Character ch = (Character) obj;
                hs3Var.c0(ch == null ? null : String.valueOf(ch));
            }
        });
        com.google.gson.b bVar2 = new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$16
            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) throws IOException {
                int iC0 = rq3Var.c0();
                if (iC0 != 9) {
                    return iC0 == 8 ? Boolean.toString(rq3Var.R()) : rq3Var.r();
                }
                rq3Var.X();
                return null;
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) throws IOException {
                hs3Var.c0((String) obj);
            }
        };
        o = new TypeAdapters$30(BigDecimal.class, new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$17
            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) throws IOException {
                if (rq3Var.c0() == 9) {
                    rq3Var.X();
                    return null;
                }
                String strR = rq3Var.r();
                try {
                    return z91.K(strR);
                } catch (NumberFormatException e2) {
                    StringBuilder sbP = p61.p("Failed parsing '", strR, "' as BigDecimal; at path ");
                    sbP.append(rq3Var.C());
                    throw new fr3(sbP.toString(), e2);
                }
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) throws IOException {
                hs3Var.a0((BigDecimal) obj);
            }
        });
        p = new TypeAdapters$30(BigInteger.class, new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$18
            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) throws IOException {
                if (rq3Var.c0() == 9) {
                    rq3Var.X();
                    return null;
                }
                String strR = rq3Var.r();
                try {
                    z91.k(strR);
                    return new BigInteger(strR);
                } catch (NumberFormatException e2) {
                    StringBuilder sbP = p61.p("Failed parsing '", strR, "' as BigInteger; at path ");
                    sbP.append(rq3Var.C());
                    throw new fr3(sbP.toString(), e2);
                }
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) throws IOException {
                hs3Var.a0((BigInteger) obj);
            }
        });
        q = new TypeAdapters$30(f44.class, new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$19
            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) throws IOException {
                if (rq3Var.c0() != 9) {
                    return new f44(rq3Var.r());
                }
                rq3Var.X();
                return null;
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) throws IOException {
                hs3Var.a0((f44) obj);
            }
        });
        r = new TypeAdapters$30(String.class, bVar2);
        s = new TypeAdapters$30(StringBuilder.class, new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$20
            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) throws IOException {
                if (rq3Var.c0() != 9) {
                    return new StringBuilder(rq3Var.r());
                }
                rq3Var.X();
                return null;
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) throws IOException {
                StringBuilder sb = (StringBuilder) obj;
                hs3Var.c0(sb == null ? null : sb.toString());
            }
        });
        t = new TypeAdapters$30(StringBuffer.class, new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$21
            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) throws IOException {
                if (rq3Var.c0() != 9) {
                    return new StringBuffer(rq3Var.r());
                }
                rq3Var.X();
                return null;
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) throws IOException {
                StringBuffer stringBuffer = (StringBuffer) obj;
                hs3Var.c0(stringBuffer == null ? null : stringBuffer.toString());
            }
        });
        u = new TypeAdapters$30(URL.class, new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$22
            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) throws IOException {
                if (rq3Var.c0() == 9) {
                    rq3Var.X();
                    return null;
                }
                String strR = rq3Var.r();
                if (strR.equals("null")) {
                    return null;
                }
                return new URL(strR);
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) throws IOException {
                URL url = (URL) obj;
                hs3Var.c0(url == null ? null : url.toExternalForm());
            }
        });
        v = new TypeAdapters$30(URI.class, new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$23
            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) throws IOException {
                if (rq3Var.c0() == 9) {
                    rq3Var.X();
                    return null;
                }
                try {
                    String strR = rq3Var.r();
                    if (strR.equals("null")) {
                        return null;
                    }
                    return new URI(strR);
                } catch (URISyntaxException e2) {
                    throw new uo3(e2);
                }
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) throws IOException {
                URI uri = (URI) obj;
                hs3Var.c0(uri == null ? null : uri.toASCIIString());
            }
        });
        final com.google.gson.b bVar3 = new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$24
            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) throws IOException {
                if (rq3Var.c0() != 9) {
                    return InetAddress.getByName(rq3Var.r());
                }
                rq3Var.X();
                return null;
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) throws IOException {
                InetAddress inetAddress = (InetAddress) obj;
                hs3Var.c0(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        final Class<InetAddress> cls = InetAddress.class;
        w = new vg8() { // from class: com.google.gson.internal.bind.TypeAdapters$33
            @Override // defpackage.vg8
            public final com.google.gson.b a(com.google.gson.a aVar, yi8 yi8Var) {
                final Class<?> cls2 = yi8Var.a;
                if (cls.isAssignableFrom(cls2)) {
                    return new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$33.1
                        @Override // com.google.gson.b
                        public final Object b(rq3 rq3Var) {
                            Object objB = bVar3.b(rq3Var);
                            if (objB != null) {
                                Class cls3 = cls2;
                                if (!cls3.isInstance(objB)) {
                                    throw new fr3("Expected a " + cls3.getName() + " but was " + objB.getClass().getName() + "; at path " + rq3Var.C());
                                }
                            }
                            return objB;
                        }

                        @Override // com.google.gson.b
                        public final void c(hs3 hs3Var, Object obj) {
                            bVar3.c(hs3Var, obj);
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + bVar3 + "]";
            }
        };
        x = new TypeAdapters$30(UUID.class, new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$25
            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) throws IOException {
                if (rq3Var.c0() == 9) {
                    rq3Var.X();
                    return null;
                }
                String strR = rq3Var.r();
                try {
                    return UUID.fromString(strR);
                } catch (IllegalArgumentException e2) {
                    StringBuilder sbP = p61.p("Failed parsing '", strR, "' as UUID; at path ");
                    sbP.append(rq3Var.C());
                    throw new fr3(sbP.toString(), e2);
                }
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) throws IOException {
                UUID uuid = (UUID) obj;
                hs3Var.c0(uuid == null ? null : uuid.toString());
            }
        });
        y = new TypeAdapters$30(Currency.class, new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$26
            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) {
                String strR = rq3Var.r();
                try {
                    return Currency.getInstance(strR);
                } catch (IllegalArgumentException e2) {
                    StringBuilder sbP = p61.p("Failed parsing '", strR, "' as Currency; at path ");
                    sbP.append(rq3Var.C());
                    throw new fr3(sbP.toString(), e2);
                }
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) throws IOException {
                hs3Var.c0(((Currency) obj).getCurrencyCode());
            }
        }.a());
        final TypeAdapters$27 typeAdapters$27 = new TypeAdapters$27("year", "month", "dayOfMonth", "hourOfDay", "minute", "second");
        z = new vg8() { // from class: com.google.gson.internal.bind.TypeAdapters$32
            @Override // defpackage.vg8
            public final com.google.gson.b a(com.google.gson.a aVar, yi8 yi8Var) {
                Class cls2 = yi8Var.a;
                if (cls2 == Calendar.class || cls2 == GregorianCalendar.class) {
                    return typeAdapters$27;
                }
                return null;
            }

            public final String toString() {
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + typeAdapters$27 + "]";
            }
        };
        A = new TypeAdapters$30(Locale.class, new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$28
            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) throws IOException {
                if (rq3Var.c0() == 9) {
                    rq3Var.X();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(rq3Var.r(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (strNextToken2 == null && strNextToken3 == null) {
                    return new Locale(strNextToken);
                }
                return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) throws IOException {
                Locale locale = (Locale) obj;
                hs3Var.c0(locale == null ? null : locale.toString());
            }
        });
        final JsonElementTypeAdapter jsonElementTypeAdapter = JsonElementTypeAdapter.a;
        final Class<bo3> cls2 = bo3.class;
        B = new vg8() { // from class: com.google.gson.internal.bind.TypeAdapters$33
            @Override // defpackage.vg8
            public final com.google.gson.b a(com.google.gson.a aVar, yi8 yi8Var) {
                final Class cls3 = yi8Var.a;
                if (cls2.isAssignableFrom(cls3)) {
                    return new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$33.1
                        @Override // com.google.gson.b
                        public final Object b(rq3 rq3Var) {
                            Object objB = jsonElementTypeAdapter.b(rq3Var);
                            if (objB != null) {
                                Class cls4 = cls3;
                                if (!cls4.isInstance(objB)) {
                                    throw new fr3("Expected a " + cls4.getName() + " but was " + objB.getClass().getName() + "; at path " + rq3Var.C());
                                }
                            }
                            return objB;
                        }

                        @Override // com.google.gson.b
                        public final void c(hs3 hs3Var, Object obj) {
                            jsonElementTypeAdapter.c(hs3Var, obj);
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls2.getName() + ",adapter=" + jsonElementTypeAdapter + "]";
            }
        };
        C = EnumTypeAdapter.d;
    }

    public static com.google.gson.b a(final com.google.gson.b bVar) {
        Objects.requireNonNull(bVar);
        return new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$9
            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) {
                return new AtomicLong(((Number) bVar.b(rq3Var)).longValue());
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) {
                bVar.c(hs3Var, Long.valueOf(((AtomicLong) obj).get()));
            }
        }.a();
    }

    public static com.google.gson.b b(final com.google.gson.b bVar) {
        return new com.google.gson.b() { // from class: com.google.gson.internal.bind.TypeAdapters$12
            @Override // com.google.gson.b
            public final Object b(rq3 rq3Var) throws IOException {
                ArrayList arrayList = new ArrayList();
                rq3Var.Q0();
                while (rq3Var.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) bVar.b(rq3Var)).longValue()));
                }
                rq3Var.K0();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.b
            public final void c(hs3 hs3Var, Object obj) throws IOException {
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                hs3Var.Q0();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    bVar.c(hs3Var, Long.valueOf(atomicLongArray.get(i2)));
                }
                hs3Var.K0();
            }
        }.a();
    }

    public static void c(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public static vg8 d(final yi8 yi8Var, final com.google.gson.b bVar) {
        return new vg8() { // from class: com.google.gson.internal.bind.TypeAdapters$29
            @Override // defpackage.vg8
            public final com.google.gson.b a(com.google.gson.a aVar, yi8 yi8Var2) {
                if (yi8Var2.equals(yi8Var)) {
                    return bVar;
                }
                return null;
            }
        };
    }

    public static vg8 e(Class cls, com.google.gson.b bVar) {
        return new TypeAdapters$30(cls, bVar);
    }

    public static vg8 f(Class cls, Class cls2, com.google.gson.b bVar) {
        return new TypeAdapters$31(cls, cls2, bVar);
    }

    public static int g(long j2) {
        int i2 = (int) j2;
        if (i2 == j2) {
            return i2;
        }
        bt.q(ie2.f(j2, "Too big for an int: "));
        return 0;
    }
}

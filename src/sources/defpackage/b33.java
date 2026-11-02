package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b33 {
    public static final ArrayList a = new ArrayList();

    static {
        String strA = e33.a(b33.class.getName().concat(".dataPath"), null);
        if (strA != null) {
            int i = 0;
            while (i < strA.length()) {
                int iIndexOf = strA.indexOf(File.pathSeparatorChar, i);
                String strTrim = strA.substring(i, iIndexOf >= 0 ? iIndexOf : strA.length()).trim();
                if (strTrim.endsWith(File.separator)) {
                    strTrim = strTrim.substring(0, strTrim.length() - 1);
                }
                if (strTrim.length() != 0) {
                    a(new File(strTrim), new StringBuilder(), a);
                }
                if (iIndexOf < 0) {
                    return;
                } else {
                    i = iIndexOf + 1;
                }
            }
        }
    }

    public static void a(File file, StringBuilder sb, List list) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        int length = sb.length();
        if (length > 0) {
            sb.append('/');
            length++;
        }
        for (File file2 : fileArrListFiles) {
            String name = file2.getName();
            if (!name.endsWith(".txt")) {
                sb.append(name);
                if (file2.isDirectory()) {
                    a(file2, sb, list);
                } else if (name.endsWith(".dat")) {
                    MappedByteBuffer mappedByteBufferG = g(file2);
                    if (mappedByteBufferG != null) {
                        try {
                            h(mappedByteBufferG, 1131245124, z23.a);
                            int i = mappedByteBufferG.getInt(mappedByteBufferG.position());
                            if (i > 0) {
                                if ((i * 24) + mappedByteBufferG.position() + 4 <= mappedByteBufferG.capacity() && z23.b(mappedByteBufferG, z23.a(mappedByteBufferG, 0)) && z23.b(mappedByteBufferG, z23.a(mappedByteBufferG, i - 1))) {
                                    list.add(new a33(sb.toString(), mappedByteBufferG, (byte) 0));
                                }
                            }
                        } catch (IOException unused) {
                        }
                    }
                } else {
                    list.add(new a33(sb.toString(), file2, (byte) 1));
                }
                sb.setLength(length);
            }
        }
    }

    public static int b(CharSequence charSequence, byte[] bArr, int i) {
        int i2 = 0;
        while (true) {
            byte b = bArr[i];
            if (b == 0) {
                return i2 == charSequence.length() ? 0 : 1;
            }
            if (i2 == charSequence.length()) {
                return -1;
            }
            int iCharAt = charSequence.charAt(i2) - b;
            if (iCharAt != 0) {
                return iCharAt;
            }
            i2++;
            i++;
        }
    }

    public static ByteBuffer c(InputStream inputStream) {
        try {
            int iAvailable = inputStream.available();
            byte[] bArrCopyOf = iAvailable > 32 ? new byte[iAvailable] : new byte[128];
            int i = 0;
            while (true) {
                if (i < bArrCopyOf.length) {
                    int i2 = inputStream.read(bArrCopyOf, i, bArrCopyOf.length - i);
                    if (i2 < 0) {
                        break;
                    }
                    i += i2;
                } else {
                    int i3 = inputStream.read();
                    if (i3 < 0) {
                        break;
                    }
                    int length = bArrCopyOf.length;
                    int i4 = length * 2;
                    if (i4 < 128) {
                        i4 = 128;
                    } else if (i4 < 16384) {
                        i4 = length * 4;
                    }
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i4);
                    int i5 = i + 1;
                    bArrCopyOf[i] = (byte) i3;
                    i = i5;
                }
            }
            return ByteBuffer.wrap(bArrCopyOf, 0, i);
        } finally {
            inputStream.close();
        }
    }

    public static char[] d(int i, ByteBuffer byteBuffer) {
        char[] cArr = new char[i];
        byteBuffer.asCharBuffer().get(cArr);
        i(i * 2, byteBuffer);
        return cArr;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e5 A[Catch: IOException -> 0x00ea, TRY_LEAVE, TryCatch #0 {IOException -> 0x00ea, blocks: (B:52:0x00de, B:55:0x00e5), top: B:60:0x00de }] */
    public static ByteBuffer e(ClassLoader classLoader, String str, String str2, boolean z) {
        ByteBuffer byteBufferOrder;
        InputStream inputStreamA;
        int i;
        Iterator it = a.iterator();
        do {
            if (it.hasNext()) {
                a33 a33Var = (a33) it.next();
                switch (a33Var.b) {
                    case 0:
                        MappedByteBuffer mappedByteBuffer = (MappedByteBuffer) a33Var.c;
                        int i2 = mappedByteBuffer.getInt(mappedByteBuffer.position());
                        int i3 = 0;
                        while (true) {
                            if (i3 < i2) {
                                int i4 = 1;
                                i = (i3 + i2) >>> 1;
                                int iA = z23.a(mappedByteBuffer, i) + 9;
                                int i5 = 0;
                                while (true) {
                                    byte b = mappedByteBuffer.get(iA);
                                    if (b == 0) {
                                        if (i5 == str2.length()) {
                                            i4 = 0;
                                        }
                                    } else if (i5 == str2.length()) {
                                        i4 = -1;
                                    } else {
                                        int iCharAt = str2.charAt(i5) - b;
                                        if (iCharAt != 0) {
                                            i4 = iCharAt;
                                        } else {
                                            i5++;
                                            iA++;
                                        }
                                    }
                                }
                                if (i4 < 0) {
                                    i2 = i;
                                } else if (i4 > 0) {
                                    i3 = i + 1;
                                }
                            } else {
                                i = ~i3;
                            }
                        }
                        if (i < 0) {
                            byteBufferOrder = null;
                        } else {
                            ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
                            int iPosition = mappedByteBuffer.position();
                            byteBufferDuplicate.position(i == mappedByteBuffer.getInt(iPosition) ? mappedByteBuffer.capacity() : iPosition + mappedByteBuffer.getInt((i * 8) + iPosition + 8));
                            int i6 = i + 1;
                            int iPosition2 = mappedByteBuffer.position();
                            byteBufferDuplicate.limit(i6 == mappedByteBuffer.getInt(iPosition2) ? mappedByteBuffer.capacity() : mappedByteBuffer.getInt((i6 * 8) + iPosition2 + 8) + iPosition2);
                            byteBufferOrder = byteBufferDuplicate.slice().order(byteBufferDuplicate.order());
                        }
                        break;
                    default:
                        if (!str2.equals(a33Var.a)) {
                            byteBufferOrder = null;
                        } else {
                            byteBufferOrder = g((File) a33Var.c);
                        }
                        break;
                }
            } else {
                byteBufferOrder = null;
            }
            if (byteBufferOrder != null) {
                return byteBufferOrder;
            }
            if (classLoader == null && (classLoader = g33.class.getClassLoader()) == null) {
                classLoader = ys0.v();
            }
            if (str == null) {
                str = "com/ibm/icu/impl/data/icudata/".concat(str2);
            }
            try {
                inputStreamA = g33.A(classLoader, str, z);
                if (inputStreamA == null) {
                    return null;
                }
                return c(inputStreamA);
            } catch (IOException e) {
                throw new a43(e);
            }
        } while (byteBufferOrder == null);
        if (byteBufferOrder != null) {
            return byteBufferOrder;
        }
        if (classLoader == null) {
            classLoader = ys0.v();
        }
        if (str == null) {
            str = "com/ibm/icu/impl/data/icudata/".concat(str2);
        }
        inputStreamA = g33.A(classLoader, str, z);
        if (inputStreamA == null) {
            return null;
        }
        return c(inputStreamA);
    }

    public static int[] f(int i, ByteBuffer byteBuffer) {
        int[] iArr = new int[i];
        byteBuffer.asIntBuffer().get(iArr);
        i(i * 4, byteBuffer);
        return iArr;
    }

    public static MappedByteBuffer g(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileChannel channel = fileInputStream.getChannel();
            try {
                return channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
            } finally {
                fileInputStream.close();
            }
        } catch (FileNotFoundException e) {
            System.err.println(e);
            return null;
        } catch (IOException e2) {
            System.err.println(e2);
            return null;
        }
    }

    public static int h(ByteBuffer byteBuffer, int i, y23 y23Var) throws IOException {
        byte b = byteBuffer.get(2);
        byte b2 = byteBuffer.get(3);
        if (b != -38 || b2 != 39) {
            u52.s("ICU data file error: Not an ICU data file");
            return 0;
        }
        byte b3 = byteBuffer.get(8);
        byte b4 = byteBuffer.get(9);
        byte b5 = byteBuffer.get(10);
        if (b3 < 0 || 1 < b3 || b4 != 0 || b5 != 2) {
            u52.s("ICU data file error: Header authentication failed, please check if you have a valid ICU data file");
            return 0;
        }
        byteBuffer.order(b3 != 0 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        char c = byteBuffer.getChar(0);
        char c2 = byteBuffer.getChar(4);
        if (c2 < 20 || c < c2 + 4) {
            u52.s("Internal Error: Header size error");
            return 0;
        }
        byte[] bArr = {byteBuffer.get(16), byteBuffer.get(17), byteBuffer.get(18), byteBuffer.get(19)};
        if (byteBuffer.get(12) == ((byte) (i >> 24)) && byteBuffer.get(13) == ((byte) (i >> 16)) && byteBuffer.get(14) == ((byte) (i >> 8)) && byteBuffer.get(15) == ((byte) i) && y23Var.h(bArr)) {
            byteBuffer.position(c);
            return (byteBuffer.get(23) & 255) | (byteBuffer.get(20) << 24) | ((byteBuffer.get(21) & 255) << 16) | ((byteBuffer.get(22) & 255) << 8);
        }
        u52.s("ICU data file error: Header authentication failed, please check if you have a valid ICU data file".concat(String.format("; data format %02x%02x%02x%02x, format version %d.%d.%d.%d", Byte.valueOf(byteBuffer.get(12)), Byte.valueOf(byteBuffer.get(13)), Byte.valueOf(byteBuffer.get(14)), Byte.valueOf(byteBuffer.get(15)), Integer.valueOf(bArr[0] & 255), Integer.valueOf(bArr[1] & 255), Integer.valueOf(bArr[2] & 255), Integer.valueOf(bArr[3] & 255))));
        return 0;
    }

    public static void i(int i, ByteBuffer byteBuffer) {
        if (i > 0) {
            byteBuffer.position(byteBuffer.position() + i);
        }
    }
}

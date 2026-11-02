package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.nio.file.FileSystem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s92 implements Closeable {
    public static final r92 Companion = new r92();
    public static final s92 RESOURCES;
    public static final s92 SYSTEM;
    public static final oi5 SYSTEM_TEMPORARY_DIRECTORY;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v0, types: [gn2, java.lang.Object] */
    /* JADX INFO: renamed from: -write$default, reason: not valid java name */
    public static Object m179write$default(s92 s92Var, oi5 oi5Var, boolean z, gn2 gn2Var, int i, Object obj) throws IOException {
        ?? r3;
        Object th = null;
        if (obj != null) {
            u52.k("Super calls with default arguments not supported in this target, function: write");
            return null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        oi5Var.getClass();
        gn2Var.getClass();
        i76 i76VarH = vr3.h(s92Var.sink(oi5Var, z));
        try {
            Object objB = gn2Var.B(i76VarH);
            try {
                i76VarH.close();
            } catch (Throwable th2) {
                th = th2;
            }
            Object obj2 = th;
            th = objB;
            r3 = obj2;
        } catch (Throwable th3) {
            try {
                i76VarH.close();
                r3 = th3;
            } catch (Throwable th4) {
                gv3.g(th3, th4);
                r3 = th3;
            }
        }
        if (r3 == 0) {
            return th;
        }
        throw r3;
    }

    static {
        s92 ou3Var;
        try {
            Class.forName("java.nio.file.Files");
            ou3Var = new v45();
        } catch (ClassNotFoundException unused) {
            ou3Var = new ou3();
        }
        SYSTEM = ou3Var;
        String str = oi5.Y;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        SYSTEM_TEMPORARY_DIRECTORY = g55.r(property);
        ClassLoader classLoader = of6.class.getClassLoader();
        classLoader.getClass();
        RESOURCES = new of6(classLoader);
    }

    public static /* synthetic */ sa7 appendingSink$default(s92 s92Var, oi5 oi5Var, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            u52.k("Super calls with default arguments not supported in this target, function: appendingSink");
            return null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return s92Var.appendingSink(oi5Var, z);
    }

    public static /* synthetic */ void createDirectories$default(s92 s92Var, oi5 oi5Var, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            u52.k("Super calls with default arguments not supported in this target, function: createDirectories");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        s92Var.createDirectories(oi5Var, z);
    }

    public static /* synthetic */ void createDirectory$default(s92 s92Var, oi5 oi5Var, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            u52.k("Super calls with default arguments not supported in this target, function: createDirectory");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        s92Var.createDirectory(oi5Var, z);
    }

    public static /* synthetic */ void delete$default(s92 s92Var, oi5 oi5Var, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            u52.k("Super calls with default arguments not supported in this target, function: delete");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        s92Var.delete(oi5Var, z);
    }

    public static /* synthetic */ void deleteRecursively$default(s92 s92Var, oi5 oi5Var, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            u52.k("Super calls with default arguments not supported in this target, function: deleteRecursively");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        s92Var.deleteRecursively(oi5Var, z);
    }

    public static final s92 get(FileSystem fileSystem) {
        Companion.getClass();
        fileSystem.getClass();
        return new t45(fileSystem);
    }

    public static /* synthetic */ u27 listRecursively$default(s92 s92Var, oi5 oi5Var, boolean z, int i, Object obj) {
        if (obj != null) {
            u52.k("Super calls with default arguments not supported in this target, function: listRecursively");
            return null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return s92Var.listRecursively(oi5Var, z);
    }

    public static /* synthetic */ g92 openReadWrite$default(s92 s92Var, oi5 oi5Var, boolean z, boolean z2, int i, Object obj) throws IOException {
        if (obj != null) {
            u52.k("Super calls with default arguments not supported in this target, function: openReadWrite");
            return null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return s92Var.openReadWrite(oi5Var, z, z2);
    }

    public static /* synthetic */ sa7 sink$default(s92 s92Var, oi5 oi5Var, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            u52.k("Super calls with default arguments not supported in this target, function: sink");
            return null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return s92Var.sink(oi5Var, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [gn2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX INFO: renamed from: -read, reason: not valid java name */
    public final <T> T m180read(oi5 oi5Var, gn2 gn2Var) throws IOException {
        ?? r3;
        oi5Var.getClass();
        gn2Var.getClass();
        j76 j76VarI = vr3.i(source(oi5Var));
        T t = null;
        try {
            Object objB = gn2Var.B(j76VarI);
            try {
                j76VarI.close();
            } catch (Throwable 
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:372)
                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:335)
                	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                */
            /*
                this = this;
                r2.getClass()
                r3.getClass()
                je7 r1 = r1.source(r2)
                j76 r1 = defpackage.vr3.i(r1)
                r2 = 0
                java.lang.Object r3 = r3.B(r1)     // Catch: java.lang.Throwable -> L1c
                r1.close()     // Catch: java.lang.Throwable -> L17
                goto L18
            L17:
                r2 = move-exception
            L18:
                r0 = r3
                r3 = r2
                r2 = r0
                goto L25
            L1c:
                r3 = move-exception
                r1.close()     // Catch: java.lang.Throwable -> L21
                goto L25
            L21:
                r1 = move-exception
                defpackage.gv3.g(r3, r1)
            L25:
                if (r3 != 0) goto L28
                return r2
            L28:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.s92.m180read(oi5, gn2):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r4v0, types: [gn2, java.lang.Object] */
        /* JADX INFO: renamed from: -write, reason: not valid java name */
        public final <T> T m181write(oi5 oi5Var, boolean z, gn2 gn2Var) throws IOException {
            ?? r3;
            oi5Var.getClass();
            gn2Var.getClass();
            i76 i76VarH = vr3.h(sink(oi5Var, z));
            T t = null;
            try {
                Object objB = gn2Var.B(i76VarH);
                try {
                    i76VarH.close();
                } catch (Throwable 
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                    	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:372)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:335)
                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    */
                /*
                    this = this;
                    r2.getClass()
                    r4.getClass()
                    sa7 r1 = r1.sink(r2, r3)
                    i76 r1 = defpackage.vr3.h(r1)
                    r2 = 0
                    java.lang.Object r3 = r4.B(r1)     // Catch: java.lang.Throwable -> L1c
                    r1.close()     // Catch: java.lang.Throwable -> L17
                    goto L18
                L17:
                    r2 = move-exception
                L18:
                    r0 = r3
                    r3 = r2
                    r2 = r0
                    goto L25
                L1c:
                    r3 = move-exception
                    r1.close()     // Catch: java.lang.Throwable -> L21
                    goto L25
                L21:
                    r1 = move-exception
                    defpackage.gv3.g(r3, r1)
                L25:
                    if (r3 != 0) goto L28
                    return r2
                L28:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.s92.m181write(oi5, boolean, gn2):java.lang.Object");
            }

            public sa7 appendingSink(oi5 oi5Var, boolean z) throws IOException {
                oi5Var.getClass();
                if (z && !exists(oi5Var)) {
                    u52.i(oi5Var, " doesn't exist.");
                    return null;
                }
                return new lv(new FileOutputStream(oi5Var.toFile(), true), new ta8(), (byte) 1);
            }

            public void atomicMove(oi5 oi5Var, oi5 oi5Var2) throws IOException {
                oi5Var.getClass();
                oi5Var2.getClass();
                if (oi5Var.toFile().renameTo(oi5Var2.toFile())) {
                    return;
                }
                throw new IOException("failed to move " + oi5Var + " to " + oi5Var2);
            }

            public oi5 canonicalize(oi5 oi5Var) throws IOException {
                oi5Var.getClass();
                File canonicalFile = oi5Var.toFile().getCanonicalFile();
                if (!canonicalFile.exists()) {
                    throw new FileNotFoundException("no such file");
                }
                String str = oi5.Y;
                return g55.s(canonicalFile);
            }

            public void copy(oi5 oi5Var, oi5 oi5Var2) throws Throwable {
                Throwable th;
                Long lValueOf;
                oi5Var.getClass();
                oi5Var2.getClass();
                je7 je7VarSource = source(oi5Var);
                Throwable th2 = null;
                try {
                    i76 i76VarH = vr3.h(sink$default(this, oi5Var2, false, 2, null));
                    try {
                        lValueOf = Long.valueOf(i76VarH.M(je7VarSource));
                        try {
                            i76VarH.close();
                            th = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        try {
                            i76VarH.close();
                        } catch (Throwable th5) {
                            gv3.g(th4, th5);
                        }
                        th = th4;
                        lValueOf = null;
                    }
                    if (th != null) {
                        throw th;
                    }
                    lValueOf.getClass();
                    if (je7VarSource != null) {
                        try {
                            je7VarSource.close();
                        } catch (Throwable th6) {
                            th2 = th6;
                        }
                    }
                    if (th2 != null) {
                        throw th2;
                    }
                } catch (Throwable th7) {
                    th2 = th7;
                    if (je7VarSource != null) {
                        try {
                            je7VarSource.close();
                        } catch (Throwable th8) {
                            gv3.g(th2, th8);
                        }
                    }
                }
            }

            public final void createDirectories(oi5 oi5Var, boolean z) throws IOException {
                oi5Var.getClass();
                kt ktVar = new kt();
                for (oi5 oi5VarC = oi5Var; oi5VarC != null && !exists(oi5VarC); oi5VarC = oi5VarC.c()) {
                    ktVar.addFirst(oi5VarC);
                }
                if (z && ktVar.isEmpty()) {
                    u52.i(oi5Var, " already exists.");
                    return;
                }
                Iterator<E> it = ktVar.iterator();
                while (it.hasNext()) {
                    createDirectory$default(this, (oi5) it.next(), false, 2, null);
                }
            }

            public void createDirectory(oi5 oi5Var, boolean z) throws IOException {
                oi5Var.getClass();
                throw new IOException(this + " is read-only");
            }

            public void createSymlink(oi5 oi5Var, oi5 oi5Var2) throws IOException {
                oi5Var.getClass();
                oi5Var2.getClass();
                throw new IOException("unsupported");
            }

            public void delete(oi5 oi5Var, boolean z) throws IOException {
                oi5Var.getClass();
                if (Thread.interrupted()) {
                    throw new InterruptedIOException("interrupted");
                }
                File file = oi5Var.toFile();
                if (file.delete()) {
                    return;
                }
                if (file.exists()) {
                    u52.s(oi0.i(oi5Var, "failed to delete "));
                } else if (z) {
                    throw new FileNotFoundException(oi0.i(oi5Var, "no such file: "));
                }
            }

            public void deleteRecursively(oi5 oi5Var, boolean z) throws IOException {
                oi5Var.getClass();
                v27 v27VarP = jm4.P(new d(this, oi5Var, null));
                while (v27VarP.hasNext()) {
                    delete((oi5) v27VarP.next(), z && !v27VarP.hasNext());
                }
            }

            public final boolean exists(oi5 oi5Var) throws IOException {
                oi5Var.getClass();
                return metadataOrNull(oi5Var) != null;
            }

            public List list(oi5 oi5Var) {
                oi5Var.getClass();
                ArrayList arrayListG = ou3.g(oi5Var, true);
                arrayListG.getClass();
                return arrayListG;
            }

            public List listOrNull(oi5 oi5Var) {
                oi5Var.getClass();
                return ou3.g(oi5Var, false);
            }

            public u27 listRecursively(oi5 oi5Var, boolean z) {
                oi5Var.getClass();
                return new hu(new e(oi5Var, this, z, null), (byte) 3);
            }

            public final i92 metadata(oi5 oi5Var) throws IOException {
                oi5Var.getClass();
                i92 i92VarMetadataOrNull = metadataOrNull(oi5Var);
                if (i92VarMetadataOrNull != null) {
                    return i92VarMetadataOrNull;
                }
                throw new FileNotFoundException(oi0.i(oi5Var, "no such file: "));
            }

            public i92 metadataOrNull(oi5 oi5Var) {
                oi5Var.getClass();
                File file = oi5Var.toFile();
                boolean zIsFile = file.isFile();
                boolean zIsDirectory = file.isDirectory();
                long jLastModified = file.lastModified();
                long length = file.length();
                if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
                    return null;
                }
                return new i92(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
            }

            public g92 openReadOnly(oi5 oi5Var) {
                oi5Var.getClass();
                return new ct3(new RandomAccessFile(oi5Var.toFile(), "r"), (byte) 0);
            }

            public g92 openReadWrite(oi5 oi5Var, boolean z, boolean z2) throws IOException {
                oi5Var.getClass();
                if (z && z2) {
                    bt.q("Cannot require mustCreate and mustExist at the same time.");
                    return null;
                }
                if (z && exists(oi5Var)) {
                    u52.i(oi5Var, " already exists.");
                    return null;
                }
                if (!z2 || exists(oi5Var)) {
                    return new ct3(new RandomAccessFile(oi5Var.toFile(), "rw"), (byte) 0);
                }
                u52.i(oi5Var, " doesn't exist.");
                return null;
            }

            public sa7 sink(oi5 oi5Var, boolean z) throws IOException {
                oi5Var.getClass();
                if (!z || !exists(oi5Var)) {
                    return new lv(new FileOutputStream(oi5Var.toFile(), false), new ta8(), (byte) 1);
                }
                u52.i(oi5Var, " already exists.");
                return null;
            }

            public je7 source(oi5 oi5Var) {
                oi5Var.getClass();
                return new mv(new FileInputStream(oi5Var.toFile()), ta8.NONE);
            }

            public final u27 listRecursively(oi5 oi5Var) {
                oi5Var.getClass();
                return listRecursively(oi5Var, false);
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            public final void createDirectory(oi5 oi5Var) throws IOException {
                oi5Var.getClass();
                createDirectory(oi5Var, false);
            }

            public final sa7 appendingSink(oi5 oi5Var) throws IOException {
                oi5Var.getClass();
                return appendingSink(oi5Var, false);
            }

            public final void deleteRecursively(oi5 oi5Var) throws IOException {
                oi5Var.getClass();
                deleteRecursively(oi5Var, false);
            }

            public final sa7 sink(oi5 oi5Var) throws IOException {
                oi5Var.getClass();
                return sink(oi5Var, false);
            }

            public final void delete(oi5 oi5Var) throws IOException {
                oi5Var.getClass();
                delete(oi5Var, false);
            }

            public final g92 openReadWrite(oi5 oi5Var) throws IOException {
                oi5Var.getClass();
                return openReadWrite(oi5Var, false, false);
            }

            public final void createDirectories(oi5 oi5Var) throws IOException {
                oi5Var.getClass();
                createDirectories(oi5Var, false);
            }
        }

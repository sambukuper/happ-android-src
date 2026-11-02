.class public final Lo98;
.super Lgm3;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final synthetic i0:J


# instance fields
.field private volatile synthetic _state$volatile:I

.field public final g0:Ljava/lang/Thread;

.field public h0:Lgq1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Liu;->a:Lsun/misc/Unsafe;

    .line 2
    .line 3
    const-class v1, Lo98;

    .line 4
    .line 5
    const-string v2, "_state$volatile"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    sput-wide v0, Lo98;->i0:J

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lwe4;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lo98;->g0:Ljava/lang/Thread;

    .line 9
    .line 10
    return-void
.end method

.method public static p(I)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Illegal state "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0
.end method


# virtual methods
.method public final m()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final n(Ljava/lang/Throwable;)V
    .locals 8

    .line 1
    :goto_0
    sget-object v0, Liu;->a:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v6, Lo98;->i0:J

    .line 4
    .line 5
    invoke-virtual {v0, p0, v6, v7}, Lsun/misc/Unsafe;->getIntVolatile(Ljava/lang/Object;J)I

    .line 6
    .line 7
    .line 8
    move-result v4

    .line 9
    const/4 p1, 0x3

    .line 10
    if-eqz v4, :cond_2

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    if-eq v4, p0, :cond_1

    .line 14
    .line 15
    const/4 p0, 0x2

    .line 16
    if-eq v4, p0, :cond_1

    .line 17
    .line 18
    if-ne v4, p1, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    invoke-static {v4}, Lo98;->p(I)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    throw p0

    .line 26
    :cond_1
    :goto_1
    return-void

    .line 27
    :cond_2
    const/4 v5, 0x2

    .line 28
    sget-wide v2, Lo98;->i0:J

    .line 29
    .line 30
    move-object v1, p0

    .line 31
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_3

    .line 36
    .line 37
    iget-object p0, v1, Lo98;->g0:Ljava/lang/Thread;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1, v6, v7, p1}, Lsun/misc/Unsafe;->putIntVolatile(Ljava/lang/Object;JI)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_3
    move-object p0, v1

    .line 47
    goto :goto_0
.end method

.method public final o()V
    .locals 6

    .line 1
    :goto_0
    sget-object v0, Liu;->a:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v2, Lo98;->i0:J

    .line 4
    .line 5
    invoke-virtual {v0, p0, v2, v3}, Lsun/misc/Unsafe;->getIntVolatile(Ljava/lang/Object;J)I

    .line 6
    .line 7
    .line 8
    move-result v4

    .line 9
    if-eqz v4, :cond_2

    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    if-eq v4, v0, :cond_1

    .line 13
    .line 14
    const/4 p0, 0x3

    .line 15
    if-ne v4, p0, :cond_0

    .line 16
    .line 17
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-static {v4}, Lo98;->p(I)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    throw p0

    .line 26
    :cond_1
    move-object v1, p0

    .line 27
    goto :goto_1

    .line 28
    :cond_2
    const/4 v5, 0x1

    .line 29
    move-object v1, p0

    .line 30
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_4

    .line 35
    .line 36
    iget-object p0, v1, Lo98;->h0:Lgq1;

    .line 37
    .line 38
    if-eqz p0, :cond_3

    .line 39
    .line 40
    invoke-interface {p0}, Lgq1;->a()V

    .line 41
    .line 42
    .line 43
    :cond_3
    return-void

    .line 44
    :cond_4
    :goto_1
    move-object p0, v1

    .line 45
    goto :goto_0
.end method

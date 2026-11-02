.class public final Lan0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lme6;
.implements Ldt2;


# instance fields
.field public final X:J

.field public final Y:Lsv;

.field public Z:Lht2;


# direct methods
.method public constructor <init>(J)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lan0;->X:J

    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    cmp-long p1, p1, v0

    .line 9
    .line 10
    if-lez p1, :cond_0

    .line 11
    .line 12
    new-instance p1, Lsv;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-wide v0, p1, Lsv;->a:J

    .line 18
    .line 19
    iput-object p1, p0, Lan0;->Y:Lsv;

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-string p0, "Failed requirement."

    .line 23
    .line 24
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    throw p0
.end method


# virtual methods
.method public final Y(Lte6;JLde;)V
    .locals 8

    .line 1
    iget-object v1, p0, Lan0;->Y:Lsv;

    .line 2
    .line 3
    :cond_0
    iget-wide v4, v1, Lsv;->a:J

    .line 4
    .line 5
    const-wide/16 p1, -0x1

    .line 6
    .line 7
    cmp-long p3, v4, p1

    .line 8
    .line 9
    if-nez p3, :cond_1

    .line 10
    .line 11
    :goto_0
    move-wide v6, p1

    .line 12
    goto :goto_1

    .line 13
    :cond_1
    const-wide/16 p1, 0x1

    .line 14
    .line 15
    add-long/2addr p1, v4

    .line 16
    goto :goto_0

    .line 17
    :goto_1
    sget-object v0, Liu;->a:Lsun/misc/Unsafe;

    .line 18
    .line 19
    sget-wide v2, Lsv;->c:J

    .line 20
    .line 21
    invoke-virtual/range {v0 .. v7}, Lsun/misc/Unsafe;->compareAndSwapLong(Ljava/lang/Object;JJJ)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    iget-wide p1, p0, Lan0;->X:J

    .line 28
    .line 29
    cmp-long p1, v6, p1

    .line 30
    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    iget-object p1, p0, Lan0;->Z:Lht2;

    .line 34
    .line 35
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lan0;->Z:Lht2;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    invoke-virtual {p0, p1}, Lht2;->U(Z)V

    .line 45
    .line 46
    .line 47
    :cond_2
    return-void
.end method

.method public final a()V
    .locals 8

    .line 1
    iget-object v1, p0, Lan0;->Y:Lsv;

    .line 2
    .line 3
    :cond_0
    iget-wide v4, v1, Lsv;->a:J

    .line 4
    .line 5
    const-wide/16 v2, -0x1

    .line 6
    .line 7
    cmp-long v0, v4, v2

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    :goto_0
    move-wide v6, v2

    .line 12
    goto :goto_1

    .line 13
    :cond_1
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :goto_1
    sget-object v0, Liu;->a:Lsun/misc/Unsafe;

    .line 17
    .line 18
    sget-wide v2, Lsv;->c:J

    .line 19
    .line 20
    invoke-virtual/range {v0 .. v7}, Lsun/misc/Unsafe;->compareAndSwapLong(Ljava/lang/Object;JJJ)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lan0;->Z:Lht2;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-virtual {v0, v1}, Lht2;->U(Z)V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, Lan0;->Z:Lht2;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lht2;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lan0;->Y:Lsv;

    .line 2
    .line 3
    const-wide/16 v1, -0x1

    .line 4
    .line 5
    iput-wide v1, v0, Lsv;->a:J

    .line 6
    .line 7
    iget-object p0, p0, Lan0;->Z:Lht2;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0}, Lht2;->U(Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final c()V
    .locals 0

    .line 1
    return-void
.end method

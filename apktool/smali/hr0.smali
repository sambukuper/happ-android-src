.class public final Lhr0;
.super Lgm3;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final g0:Lmm0;


# direct methods
.method public constructor <init>(Lmm0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lwe4;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhr0;->g0:Lmm0;

    .line 5
    .line 6
    return-void
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
    .locals 14

    .line 1
    invoke-virtual {p0}, Lgm3;->j()Lrm3;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, Lhr0;->g0:Lmm0;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lmm0;->p(Lrm3;)Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object v5

    .line 11
    invoke-virtual {p0}, Lmm0;->x()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-object p1, p0, Lmm0;->f0:Lq51;

    .line 19
    .line 20
    move-object v1, p1

    .line 21
    check-cast v1, Lnp1;

    .line 22
    .line 23
    sget-wide v12, Lnp1;->j0:J

    .line 24
    .line 25
    :goto_0
    sget-object p1, Liu;->a:Lsun/misc/Unsafe;

    .line 26
    .line 27
    invoke-virtual {p1, v1, v12, v13}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v10

    .line 31
    sget-object v4, Lop1;->b:Lz31;

    .line 32
    .line 33
    invoke-static {v10, v4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    :cond_1
    sget-object v0, Liu;->a:Lsun/misc/Unsafe;

    .line 40
    .line 41
    sget-wide v2, Lnp1;->j0:J

    .line 42
    .line 43
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    invoke-virtual {v0, v1, v12, v13}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-eq p1, v4, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    instance-of p1, v10, Ljava/lang/Throwable;

    .line 58
    .line 59
    if-eqz p1, :cond_4

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_4
    sget-object v6, Liu;->a:Lsun/misc/Unsafe;

    .line 63
    .line 64
    sget-wide v8, Lnp1;->j0:J

    .line 65
    .line 66
    const/4 v11, 0x0

    .line 67
    move-object v7, v1

    .line 68
    invoke-virtual/range {v6 .. v11}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_6

    .line 73
    .line 74
    :goto_1
    invoke-virtual {p0, v5}, Lmm0;->z(Ljava/lang/Throwable;)Z

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lmm0;->x()Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-nez p1, :cond_5

    .line 82
    .line 83
    invoke-virtual {p0}, Lmm0;->n()V

    .line 84
    .line 85
    .line 86
    :cond_5
    :goto_2
    return-void

    .line 87
    :cond_6
    invoke-virtual {v6, v1, v12, v13}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-eq p1, v10, :cond_4

    .line 92
    .line 93
    goto :goto_0
.end method

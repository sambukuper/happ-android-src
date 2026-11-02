.class public final Lbz7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lfi1;
.implements Lq51;


# instance fields
.field public final synthetic X:Lcz7;

.field public final Y:Lmm0;

.field public Z:Lmm0;

.field public f0:Lbq5;

.field public final synthetic g0:Lcz7;


# direct methods
.method public constructor <init>(Lcz7;Lmm0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbz7;->g0:Lcz7;

    .line 5
    .line 6
    iput-object p1, p0, Lbz7;->X:Lcz7;

    .line 7
    .line 8
    iput-object p2, p0, Lbz7;->Y:Lmm0;

    .line 9
    .line 10
    sget-object p1, Lbq5;->Y:Lbq5;

    .line 11
    .line 12
    iput-object p1, p0, Lbz7;->f0:Lbq5;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final A(J)F
    .locals 0

    .line 1
    iget-object p0, p0, Lbz7;->X:Lcz7;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lfi1;->A(J)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final D0(J)J
    .locals 0

    .line 1
    iget-object p0, p0, Lbz7;->X:Lcz7;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lfi1;->D0(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final G0(J)F
    .locals 0

    .line 1
    iget-object p0, p0, Lbz7;->X:Lcz7;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lfi1;->G0(J)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final M(F)J
    .locals 0

    .line 1
    iget-object p0, p0, Lbz7;->X:Lcz7;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lfi1;->M(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final R(I)F
    .locals 0

    .line 1
    iget-object p0, p0, Lbz7;->X:Lcz7;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lfi1;->R(I)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final W(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Lbz7;->X:Lcz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcz7;->getDensity()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    div-float/2addr p1, p0

    .line 8
    return p1
.end method

.method public final a(Lbq5;Lr10;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lmm0;

    .line 2
    .line 3
    invoke-static {p2}, Lmb6;->H(Lq51;)Lq51;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p2}, Lmm0;-><init>(ILq51;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lmm0;->s()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lbz7;->f0:Lbq5;

    .line 15
    .line 16
    iput-object v0, p0, Lbz7;->Z:Lmm0;

    .line 17
    .line 18
    invoke-virtual {v0}, Lmm0;->q()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final b()J
    .locals 9

    .line 1
    iget-object p0, p0, Lbz7;->g0:Lcz7;

    .line 2
    .line 3
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Landroidx/compose/ui/node/LayoutNode;->C0:Lfw8;

    .line 8
    .line 9
    invoke-interface {v0}, Lfw8;->d()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-interface {p0, v0, v1}, Lfi1;->D0(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iget-wide v2, p0, Lcz7;->z0:J

    .line 18
    .line 19
    const/16 p0, 0x20

    .line 20
    .line 21
    shr-long v4, v0, p0

    .line 22
    .line 23
    long-to-int v4, v4

    .line 24
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    shr-long v5, v2, p0

    .line 29
    .line 30
    long-to-int v5, v5

    .line 31
    int-to-float v5, v5

    .line 32
    sub-float/2addr v4, v5

    .line 33
    const/4 v5, 0x0

    .line 34
    invoke-static {v5, v4}, Ljava/lang/Math;->max(FF)F

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const/high16 v6, 0x40000000    # 2.0f

    .line 39
    .line 40
    div-float/2addr v4, v6

    .line 41
    const-wide v7, 0xffffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long/2addr v0, v7

    .line 47
    long-to-int v0, v0

    .line 48
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    and-long v1, v2, v7

    .line 53
    .line 54
    long-to-int v1, v1

    .line 55
    int-to-float v1, v1

    .line 56
    sub-float/2addr v0, v1

    .line 57
    invoke-static {v5, v0}, Ljava/lang/Math;->max(FF)F

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    div-float/2addr v0, v6

    .line 62
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    int-to-long v1, v1

    .line 67
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    int-to-long v3, v0

    .line 72
    shl-long v0, v1, p0

    .line 73
    .line 74
    and-long v2, v3, v7

    .line 75
    .line 76
    or-long/2addr v0, v2

    .line 77
    return-wide v0
.end method

.method public final b0()F
    .locals 0

    .line 1
    iget-object p0, p0, Lbz7;->X:Lcz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcz7;->b0()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final c()Lfw8;
    .locals 0

    .line 1
    iget-object p0, p0, Lbz7;->g0:Lcz7;

    .line 2
    .line 3
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Landroidx/compose/ui/node/LayoutNode;->C0:Lfw8;

    .line 8
    .line 9
    return-object p0
.end method

.method public final d(JLrn2;Lr10;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p4, Lzy7;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lzy7;

    .line 7
    .line 8
    iget v1, v0, Lzy7;->i0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lzy7;->i0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lzy7;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lzy7;-><init>(Lbz7;Lr10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lzy7;->g0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lzy7;->i0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    iget-object p0, v0, Lzy7;->f0:Log7;

    .line 36
    .line 37
    :try_start_0
    invoke-static {p4}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v2

    .line 49
    :cond_2
    invoke-static {p4}, Lw39;->n0(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const-wide/16 v4, 0x0

    .line 53
    .line 54
    cmp-long p4, p1, v4

    .line 55
    .line 56
    if-gtz p4, :cond_3

    .line 57
    .line 58
    iget-object p4, p0, Lbz7;->Z:Lmm0;

    .line 59
    .line 60
    if-eqz p4, :cond_3

    .line 61
    .line 62
    new-instance v1, Lcq5;

    .line 63
    .line 64
    invoke-direct {v1, p1, p2}, Lcq5;-><init>(J)V

    .line 65
    .line 66
    .line 67
    new-instance v4, Lrj6;

    .line 68
    .line 69
    invoke-direct {v4, v1}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p4, v4}, Lmm0;->f(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    iget-object p4, p0, Lbz7;->g0:Lcz7;

    .line 76
    .line 77
    invoke-virtual {p4}, Ljx4;->M0()Lb71;

    .line 78
    .line 79
    .line 80
    move-result-object p4

    .line 81
    new-instance v1, Lgf2;

    .line 82
    .line 83
    invoke-direct {v1, p1, p2, p0, v2}, Lgf2;-><init>(JLbz7;Lq51;)V

    .line 84
    .line 85
    .line 86
    const/4 p1, 0x3

    .line 87
    invoke-static {p4, v2, v2, v1, p1}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    :try_start_1
    iput-object p1, v0, Lzy7;->f0:Log7;

    .line 92
    .line 93
    iput v3, v0, Lzy7;->i0:I

    .line 94
    .line 95
    invoke-interface {p3, p0, v0}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 99
    sget-object p0, Lc71;->X:Lc71;

    .line 100
    .line 101
    if-ne p4, p0, :cond_4

    .line 102
    .line 103
    return-object p0

    .line 104
    :cond_4
    move-object p0, p1

    .line 105
    :goto_1
    sget-object p1, Lgm0;->X:Lgm0;

    .line 106
    .line 107
    invoke-interface {p0, p1}, Lbm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 108
    .line 109
    .line 110
    return-object p4

    .line 111
    :catchall_1
    move-exception p0

    .line 112
    move-object v6, p1

    .line 113
    move-object p1, p0

    .line 114
    move-object p0, v6

    .line 115
    :goto_2
    sget-object p2, Lgm0;->X:Lgm0;

    .line 116
    .line 117
    invoke-interface {p0, p2}, Lbm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 118
    .line 119
    .line 120
    throw p1
.end method

.method public final f(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lbz7;->g0:Lcz7;

    .line 2
    .line 3
    iget-object v1, v0, Lcz7;->w0:Lc15;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget-object v0, v0, Lcz7;->v0:Lc15;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lc15;->j(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit v1

    .line 12
    iget-object p0, p0, Lbz7;->Y:Lmm0;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lmm0;->f(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    monitor-exit v1

    .line 20
    throw p0
.end method

.method public final g(JLrn2;Ls51;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p4, Laz7;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Laz7;

    .line 7
    .line 8
    iget v1, v0, Laz7;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Laz7;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Laz7;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Laz7;-><init>(Lbz7;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Laz7;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Laz7;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    :try_start_0
    invoke-static {p4}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcq5; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    return-object p4

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    invoke-static {p4}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :try_start_1
    iput v3, v0, Laz7;->h0:I

    .line 49
    .line 50
    invoke-virtual {p0, p1, p2, p3, v0}, Lbz7;->d(JLrn2;Lr10;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0
    :try_end_1
    .catch Lcq5; {:try_start_1 .. :try_end_1} :catch_0

    .line 54
    sget-object p1, Lc71;->X:Lc71;

    .line 55
    .line 56
    if-ne p0, p1, :cond_3

    .line 57
    .line 58
    return-object p1

    .line 59
    :cond_3
    return-object p0

    .line 60
    :catch_0
    return-object v2
.end method

.method public final getDensity()F
    .locals 0

    .line 1
    iget-object p0, p0, Lbz7;->X:Lcz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcz7;->getDensity()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final h0(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Lbz7;->X:Lcz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcz7;->getDensity()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-float/2addr p0, p1

    .line 8
    return p0
.end method

.method public final q(F)J
    .locals 0

    .line 1
    iget-object p0, p0, Lbz7;->X:Lcz7;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lfi1;->q(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final r(J)J
    .locals 0

    .line 1
    iget-object p0, p0, Lbz7;->X:Lcz7;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lfi1;->r(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final w()Ls61;
    .locals 0

    .line 1
    sget-object p0, Lb02;->X:Lb02;

    .line 2
    .line 3
    return-object p0
.end method

.method public final x0(F)I
    .locals 0

    .line 1
    iget-object p0, p0, Lbz7;->X:Lcz7;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lfi1;->x0(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

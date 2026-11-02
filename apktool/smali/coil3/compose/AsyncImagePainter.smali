.class public final Lcoil3/compose/AsyncImagePainter;
.super Log5;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lvc6;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcoil3/compose/AsyncImagePainter;",
        "Log5;",
        "Lvc6;",
        "yu",
        "av",
        "io.coil-kt.coil3_coil-compose-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final v0:Ly2;


# instance fields
.field public final h0:Lrh5;

.field public i0:F

.field public j0:Lg60;

.field public k0:Z

.field public l0:Lbm3;

.field public m0:J

.field public n0:Lb71;

.field public o0:Lgn2;

.field public p0:Lz41;

.field public q0:Lev;

.field public r0:Lyu;

.field public final s0:Loh7;

.field public final t0:Loh7;

.field public final u0:Lh76;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ly2;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ly2;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcoil3/compose/AsyncImagePainter;->v0:Ly2;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lyu;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Log5;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {v0}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcoil3/compose/AsyncImagePainter;->h0:Lrh5;

    .line 10
    .line 11
    const/high16 v0, 0x3f800000    # 1.0f

    .line 12
    .line 13
    iput v0, p0, Lcoil3/compose/AsyncImagePainter;->i0:F

    .line 14
    .line 15
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    iput-wide v0, p0, Lcoil3/compose/AsyncImagePainter;->m0:J

    .line 21
    .line 22
    sget-object v0, Lcoil3/compose/AsyncImagePainter;->v0:Ly2;

    .line 23
    .line 24
    iput-object v0, p0, Lcoil3/compose/AsyncImagePainter;->o0:Lgn2;

    .line 25
    .line 26
    sget-object v0, Ly41;->a:Lbe;

    .line 27
    .line 28
    iput-object v0, p0, Lcoil3/compose/AsyncImagePainter;->p0:Lz41;

    .line 29
    .line 30
    iput-object p1, p0, Lcoil3/compose/AsyncImagePainter;->r0:Lyu;

    .line 31
    .line 32
    invoke-static {p1}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lcoil3/compose/AsyncImagePainter;->s0:Loh7;

    .line 37
    .line 38
    sget-object p1, Lzu;->a:Lzu;

    .line 39
    .line 40
    invoke-static {p1}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, Lcoil3/compose/AsyncImagePainter;->t0:Loh7;

    .line 45
    .line 46
    invoke-static {p1}, Ljm4;->n(Loh7;)Lh76;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, Lcoil3/compose/AsyncImagePainter;->u0:Lh76;

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter;->l0:Lbm3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0, v1}, Lbm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iput-object v1, p0, Lcoil3/compose/AsyncImagePainter;->l0:Lbm3;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcoil3/compose/AsyncImagePainter;->j()Log5;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    instance-of v2, v0, Lvc6;

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    move-object v1, v0

    .line 20
    check-cast v1, Lvc6;

    .line 21
    .line 22
    :cond_1
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-interface {v1}, Lvc6;->a()V

    .line 25
    .line 26
    .line 27
    :cond_2
    const/4 v0, 0x0

    .line 28
    iput-boolean v0, p0, Lcoil3/compose/AsyncImagePainter;->k0:Z

    .line 29
    .line 30
    return-void
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter;->l0:Lbm3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0, v1}, Lbm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iput-object v1, p0, Lcoil3/compose/AsyncImagePainter;->l0:Lbm3;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcoil3/compose/AsyncImagePainter;->j()Log5;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    instance-of v2, v0, Lvc6;

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    move-object v1, v0

    .line 20
    check-cast v1, Lvc6;

    .line 21
    .line 22
    :cond_1
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-interface {v1}, Lvc6;->b()V

    .line 25
    .line 26
    .line 27
    :cond_2
    const/4 v0, 0x0

    .line 28
    iput-boolean v0, p0, Lcoil3/compose/AsyncImagePainter;->k0:Z

    .line 29
    .line 30
    return-void
.end method

.method public final c()V
    .locals 2

    .line 1
    const-string v0, "AsyncImagePainter.onRemembered"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0}, Lcoil3/compose/AsyncImagePainter;->j()Log5;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    instance-of v1, v0, Lvc6;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    check-cast v0, Lvc6;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-interface {v0}, Lvc6;->c()V

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-virtual {p0}, Lcoil3/compose/AsyncImagePainter;->k()V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p0, Lcoil3/compose/AsyncImagePainter;->k0:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 35
    .line 36
    .line 37
    throw p0
.end method

.method public final d(F)Z
    .locals 0

    .line 1
    iput p1, p0, Lcoil3/compose/AsyncImagePainter;->i0:F

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0
.end method

.method public final e(Lg60;)Z
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/compose/AsyncImagePainter;->j0:Lg60;

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0
.end method

.method public final h()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcoil3/compose/AsyncImagePainter;->j()Log5;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Log5;->h()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0

    .line 12
    :cond_0
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    return-wide v0
.end method

.method public final i(Lsv1;)V
    .locals 9

    .line 1
    invoke-interface {p1}, Lsv1;->e()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lcoil3/compose/AsyncImagePainter;->m0:J

    .line 6
    .line 7
    invoke-static {v2, v3, v0, v1}, Lua7;->a(JJ)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    iput-wide v0, p0, Lcoil3/compose/AsyncImagePainter;->m0:J

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Lcoil3/compose/AsyncImagePainter;->j()Log5;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    invoke-interface {p1}, Lsv1;->e()J

    .line 22
    .line 23
    .line 24
    move-result-wide v5

    .line 25
    iget v7, p0, Lcoil3/compose/AsyncImagePainter;->i0:F

    .line 26
    .line 27
    iget-object v8, p0, Lcoil3/compose/AsyncImagePainter;->j0:Lg60;

    .line 28
    .line 29
    move-object v4, p1

    .line 30
    invoke-virtual/range {v3 .. v8}, Log5;->g(Lsv1;JFLg60;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public final j()Log5;
    .locals 0

    .line 1
    iget-object p0, p0, Lcoil3/compose/AsyncImagePainter;->h0:Lrh5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Log5;

    .line 8
    .line 9
    return-object p0
.end method

.method public final k()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter;->r0:Lyu;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, p0, Lcoil3/compose/AsyncImagePainter;->n0:Lb71;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_5

    .line 10
    .line 11
    new-instance v3, Lbv;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    invoke-direct {v3, p0, v0, v2, v4}, Lbv;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v1}, Lb71;->getCoroutineContext()Ls61;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget v4, Lxs8;->b:I

    .line 22
    .line 23
    sget-object v4, Lpz2;->E0:Lpz2;

    .line 24
    .line 25
    invoke-interface {v0, v4}, Ls61;->H0(Lr61;)Lq61;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    instance-of v4, v0, Lu61;

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    check-cast v0, Lu61;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object v0, v2

    .line 37
    :goto_0
    sget-object v4, Le71;->f0:Le71;

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    sget-object v5, Ltp1;->b:Lvl8;

    .line 42
    .line 43
    invoke-virtual {v0, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    new-instance v5, Lzg1;

    .line 51
    .line 52
    invoke-interface {v1}, Lb71;->getCoroutineContext()Ls61;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-direct {v5, v1}, Lzg1;-><init>(Ls61;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v5}, Lgv3;->c(Ls61;)Lm51;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    new-instance v5, Lah1;

    .line 64
    .line 65
    invoke-direct {v5, v0}, Lah1;-><init>(Lu61;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v1, v5, v4, v3}, Lw51;->F(Lb71;Ls61;Le71;Lrn2;)Log7;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    :goto_1
    sget-object v0, Ltp1;->b:Lvl8;

    .line 74
    .line 75
    invoke-static {v1, v0, v4, v3}, Lw51;->F(Lb71;Ls61;Le71;Lrn2;)Log7;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    :goto_2
    iget-object v1, p0, Lcoil3/compose/AsyncImagePainter;->l0:Lbm3;

    .line 80
    .line 81
    if-eqz v1, :cond_4

    .line 82
    .line 83
    invoke-interface {v1, v2}, Lbm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 84
    .line 85
    .line 86
    :cond_4
    iput-object v0, p0, Lcoil3/compose/AsyncImagePainter;->l0:Lbm3;

    .line 87
    .line 88
    return-void

    .line 89
    :cond_5
    const-string p0, "scope"

    .line 90
    .line 91
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw v2
.end method

.method public final l(Lyu;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter;->r0:Lyu;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    iput-object p1, p0, Lcoil3/compose/AsyncImagePainter;->r0:Lyu;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-nez p1, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, Lcoil3/compose/AsyncImagePainter;->l0:Lbm3;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v1, v0}, Lbm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iput-object v0, p0, Lcoil3/compose/AsyncImagePainter;->l0:Lbm3;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-boolean v1, p0, Lcoil3/compose/AsyncImagePainter;->k0:Z

    .line 25
    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    invoke-virtual {p0}, Lcoil3/compose/AsyncImagePainter;->k()V

    .line 29
    .line 30
    .line 31
    :cond_2
    :goto_0
    if-eqz p1, :cond_3

    .line 32
    .line 33
    iget-object p0, p0, Lcoil3/compose/AsyncImagePainter;->s0:Loh7;

    .line 34
    .line 35
    invoke-virtual {p0, v0, p1}, Loh7;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    :cond_3
    return-void
.end method

.method public final m(Lv63;Z)Lv63;
    .locals 3

    .line 1
    invoke-static {p1}, Lv63;->a(Lv63;)Ls63;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ldq;

    .line 6
    .line 7
    const/16 v2, 0x14

    .line 8
    .line 9
    invoke-direct {v1, p1, p0, v2}, Ldq;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    iput-object v1, v0, Ls63;->d:Lr18;

    .line 13
    .line 14
    iget-object p1, p1, Lv63;->s:Lu63;

    .line 15
    .line 16
    iget-object v1, p1, Lu63;->d:Lab7;

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    sget-object v1, Lab7;->F:Lc86;

    .line 21
    .line 22
    iput-object v1, v0, Ls63;->i:Lab7;

    .line 23
    .line 24
    :cond_0
    iget-object v1, p1, Lu63;->e:Lpw6;

    .line 25
    .line 26
    if-nez v1, :cond_3

    .line 27
    .line 28
    iget-object p0, p0, Lcoil3/compose/AsyncImagePainter;->p0:Lz41;

    .line 29
    .line 30
    sget v1, Lxs8;->b:I

    .line 31
    .line 32
    sget-object v1, Ly41;->a:Lbe;

    .line 33
    .line 34
    invoke-static {p0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    sget-object v1, Ly41;->b:Lra;

    .line 41
    .line 42
    invoke-static {p0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    sget-object p0, Lpw6;->X:Lpw6;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    :goto_0
    sget-object p0, Lpw6;->Y:Lpw6;

    .line 53
    .line 54
    :goto_1
    iput-object p0, v0, Ls63;->j:Lpw6;

    .line 55
    .line 56
    :cond_3
    iget-object p0, p1, Lu63;->f:Ltr5;

    .line 57
    .line 58
    if-nez p0, :cond_4

    .line 59
    .line 60
    sget-object p0, Ltr5;->Y:Ltr5;

    .line 61
    .line 62
    iput-object p0, v0, Ls63;->k:Ltr5;

    .line 63
    .line 64
    :cond_4
    if-eqz p2, :cond_5

    .line 65
    .line 66
    sget-object p0, Lb02;->X:Lb02;

    .line 67
    .line 68
    iput-object p0, v0, Ls63;->f:Ls61;

    .line 69
    .line 70
    iput-object p0, v0, Ls63;->g:Ls61;

    .line 71
    .line 72
    iput-object p0, v0, Ls63;->h:Ls61;

    .line 73
    .line 74
    :cond_5
    invoke-virtual {v0}, Ls63;->a()Lv63;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
.end method

.method public final n(Lav;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter;->t0:Loh7;

    .line 2
    .line 3
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lav;

    .line 8
    .line 9
    iget-object v2, p0, Lcoil3/compose/AsyncImagePainter;->o0:Lgn2;

    .line 10
    .line 11
    invoke-interface {v2, p1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lav;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Loh7;->m(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v5, p0, Lcoil3/compose/AsyncImagePainter;->p0:Lz41;

    .line 21
    .line 22
    instance-of v0, p1, Lcoil3/compose/AsyncImagePainter$State$Success;

    .line 23
    .line 24
    const/4 v10, 0x0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    move-object v0, p1

    .line 28
    check-cast v0, Lcoil3/compose/AsyncImagePainter$State$Success;

    .line 29
    .line 30
    iget-object v0, v0, Lcoil3/compose/AsyncImagePainter$State$Success;->a:Ljw7;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    instance-of v0, p1, Lcoil3/compose/AsyncImagePainter$State$Error;

    .line 34
    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    move-object v0, p1

    .line 38
    check-cast v0, Lcoil3/compose/AsyncImagePainter$State$Error;

    .line 39
    .line 40
    iget-object v0, v0, Lcoil3/compose/AsyncImagePainter$State$Error;->a:Lm32;

    .line 41
    .line 42
    :goto_0
    invoke-interface {v0}, Lc73;->getRequest()Lv63;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    sget-object v3, Lb73;->a:Lf4;

    .line 47
    .line 48
    invoke-static {v2, v3}, Lz68;->F(Lv63;Lf4;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, Ltd8;

    .line 53
    .line 54
    sget-object v3, Los4;->X:Lcv;

    .line 55
    .line 56
    invoke-interface {v2, v3, v0}, Ltd8;->a(Lke8;Lc73;)Lae8;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    instance-of v3, v2, Lv71;

    .line 61
    .line 62
    if-eqz v3, :cond_4

    .line 63
    .line 64
    invoke-interface {v1}, Lav;->a()Log5;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    instance-of v4, v1, Lcoil3/compose/AsyncImagePainter$State$Loading;

    .line 69
    .line 70
    if-eqz v4, :cond_1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    move-object v3, v10

    .line 74
    :goto_1
    invoke-interface {p1}, Lav;->a()Log5;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    sget-object v6, Lgx1;->Y:Lbe;

    .line 79
    .line 80
    check-cast v2, Lv71;

    .line 81
    .line 82
    iget v2, v2, Lv71;->c:I

    .line 83
    .line 84
    sget-object v6, Llx1;->Z:Llx1;

    .line 85
    .line 86
    invoke-static {v2, v6}, Lvj8;->l0(ILlx1;)J

    .line 87
    .line 88
    .line 89
    move-result-wide v6

    .line 90
    instance-of v2, v0, Ljw7;

    .line 91
    .line 92
    if-eqz v2, :cond_3

    .line 93
    .line 94
    move-object v2, v0

    .line 95
    check-cast v2, Ljw7;

    .line 96
    .line 97
    iget-boolean v2, v2, Ljw7;->g:Z

    .line 98
    .line 99
    if-nez v2, :cond_2

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_2
    const/4 v2, 0x0

    .line 103
    :goto_2
    move v8, v2

    .line 104
    goto :goto_4

    .line 105
    :cond_3
    :goto_3
    const/4 v2, 0x1

    .line 106
    goto :goto_2

    .line 107
    :goto_4
    invoke-interface {v0}, Lc73;->getRequest()Lv63;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    sget-object v2, Lz63;->b:Lf4;

    .line 112
    .line 113
    invoke-static {v0, v2}, Lz68;->F(Lv63;Lf4;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, Ljava/lang/Boolean;

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 120
    .line 121
    .line 122
    move-result v9

    .line 123
    new-instance v2, Lcoil3/compose/CrossfadePainter;

    .line 124
    .line 125
    invoke-direct/range {v2 .. v9}, Lcoil3/compose/CrossfadePainter;-><init>(Log5;Log5;Lz41;JZZ)V

    .line 126
    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_4
    move-object v2, v10

    .line 130
    :goto_5
    if-eqz v2, :cond_5

    .line 131
    .line 132
    goto :goto_6

    .line 133
    :cond_5
    invoke-interface {p1}, Lav;->a()Log5;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    :goto_6
    iget-object p0, p0, Lcoil3/compose/AsyncImagePainter;->h0:Lrh5;

    .line 138
    .line 139
    invoke-virtual {p0, v2}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-interface {v1}, Lav;->a()Log5;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-interface {p1}, Lav;->a()Log5;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    if-eq p0, v0, :cond_9

    .line 151
    .line 152
    invoke-interface {v1}, Lav;->a()Log5;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    instance-of v0, p0, Lvc6;

    .line 157
    .line 158
    if-eqz v0, :cond_6

    .line 159
    .line 160
    check-cast p0, Lvc6;

    .line 161
    .line 162
    goto :goto_7

    .line 163
    :cond_6
    move-object p0, v10

    .line 164
    :goto_7
    if-eqz p0, :cond_7

    .line 165
    .line 166
    invoke-interface {p0}, Lvc6;->b()V

    .line 167
    .line 168
    .line 169
    :cond_7
    invoke-interface {p1}, Lav;->a()Log5;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    instance-of p1, p0, Lvc6;

    .line 174
    .line 175
    if-eqz p1, :cond_8

    .line 176
    .line 177
    move-object v10, p0

    .line 178
    check-cast v10, Lvc6;

    .line 179
    .line 180
    :cond_8
    if-eqz v10, :cond_9

    .line 181
    .line 182
    invoke-interface {v10}, Lvc6;->c()V

    .line 183
    .line 184
    .line 185
    :cond_9
    return-void
.end method

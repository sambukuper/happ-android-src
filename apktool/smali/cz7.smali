.class public final Lcz7;
.super Ljx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lmq5;
.implements Lfi1;
.implements Lkq5;


# instance fields
.field public q0:Ljava/lang/Object;

.field public r0:Ljava/lang/Object;

.field public s0:Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

.field public t0:Log7;

.field public u0:Laq5;

.field public final v0:Lc15;

.field public final w0:Lc15;

.field public final x0:Lc15;

.field public y0:Laq5;

.field public z0:J


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljx4;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcz7;->q0:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lcz7;->r0:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lcz7;->s0:Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 9
    .line 10
    sget-object p1, Lyy7;->a:Laq5;

    .line 11
    .line 12
    iput-object p1, p0, Lcz7;->u0:Laq5;

    .line 13
    .line 14
    new-instance p1, Lc15;

    .line 15
    .line 16
    const/16 p2, 0x10

    .line 17
    .line 18
    new-array p3, p2, [Lbz7;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-direct {p1, v0, p3}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcz7;->v0:Lc15;

    .line 25
    .line 26
    iput-object p1, p0, Lcz7;->w0:Lc15;

    .line 27
    .line 28
    new-instance p1, Lc15;

    .line 29
    .line 30
    new-array p2, p2, [Lbz7;

    .line 31
    .line 32
    invoke-direct {p1, v0, p2}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lcz7;->x0:Lc15;

    .line 36
    .line 37
    const-wide/16 p1, 0x0

    .line 38
    .line 39
    iput-wide p1, p0, Lcz7;->z0:J

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final F0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcz7;->a1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final I()V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcz7;->y0:Laq5;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v1, v1, Laq5;->a:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    move v4, v3

    .line 16
    :goto_0
    if-ge v4, v2, :cond_3

    .line 17
    .line 18
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    check-cast v5, Lhq5;

    .line 23
    .line 24
    iget-boolean v5, v5, Lhq5;->d:Z

    .line 25
    .line 26
    if-eqz v5, :cond_2

    .line 27
    .line 28
    new-instance v2, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    :goto_1
    if-ge v3, v4, :cond_1

    .line 42
    .line 43
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    check-cast v5, Lhq5;

    .line 48
    .line 49
    iget-wide v7, v5, Lhq5;->a:J

    .line 50
    .line 51
    iget-wide v11, v5, Lhq5;->c:J

    .line 52
    .line 53
    iget-wide v9, v5, Lhq5;->b:J

    .line 54
    .line 55
    iget v14, v5, Lhq5;->e:F

    .line 56
    .line 57
    iget-boolean v6, v5, Lhq5;->d:Z

    .line 58
    .line 59
    iget v5, v5, Lhq5;->i:I

    .line 60
    .line 61
    move/from16 v19, v6

    .line 62
    .line 63
    new-instance v6, Lhq5;

    .line 64
    .line 65
    const/high16 v24, 0x3f800000    # 1.0f

    .line 66
    .line 67
    const-wide/16 v25, 0x0

    .line 68
    .line 69
    const/4 v13, 0x0

    .line 70
    const-wide/16 v22, 0x0

    .line 71
    .line 72
    move-wide v15, v9

    .line 73
    move-wide/from16 v17, v11

    .line 74
    .line 75
    move/from16 v20, v19

    .line 76
    .line 77
    move/from16 v21, v5

    .line 78
    .line 79
    invoke-direct/range {v6 .. v26}, Lhq5;-><init>(JJJZFJJZZIJFJ)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    add-int/lit8 v3, v3, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    new-instance v1, Laq5;

    .line 89
    .line 90
    const/4 v3, 0x0

    .line 91
    invoke-direct {v1, v2, v3}, Laq5;-><init>(Ljava/util/List;Lzz2;)V

    .line 92
    .line 93
    .line 94
    iput-object v1, v0, Lcz7;->u0:Laq5;

    .line 95
    .line 96
    sget-object v2, Lbq5;->X:Lbq5;

    .line 97
    .line 98
    invoke-virtual {v0, v1, v2}, Lcz7;->Z0(Laq5;Lbq5;)V

    .line 99
    .line 100
    .line 101
    sget-object v2, Lbq5;->Y:Lbq5;

    .line 102
    .line 103
    invoke-virtual {v0, v1, v2}, Lcz7;->Z0(Laq5;Lbq5;)V

    .line 104
    .line 105
    .line 106
    sget-object v2, Lbq5;->Z:Lbq5;

    .line 107
    .line 108
    invoke-virtual {v0, v1, v2}, Lcz7;->Z0(Laq5;Lbq5;)V

    .line 109
    .line 110
    .line 111
    iput-object v3, v0, Lcz7;->y0:Laq5;

    .line 112
    .line 113
    return-void

    .line 114
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_3
    return-void
.end method

.method public final R0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcz7;->a1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final Y0(Lrn2;Lq51;)Ljava/lang/Object;
    .locals 3

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
    new-instance p2, Lbz7;

    .line 15
    .line 16
    invoke-direct {p2, p0, v0}, Lbz7;-><init>(Lcz7;Lmm0;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lcz7;->w0:Lc15;

    .line 20
    .line 21
    monitor-enter v1

    .line 22
    :try_start_0
    iget-object p0, p0, Lcz7;->v0:Lc15;

    .line 23
    .line 24
    invoke-virtual {p0, p2}, Lc15;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance p0, Ltu6;

    .line 28
    .line 29
    invoke-static {p2, p2, p1}, Lmb6;->w(Lq51;Lq51;Lrn2;)Lq51;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1}, Lmb6;->H(Lq51;)Lq51;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    sget-object v2, Lc71;->X:Lc71;

    .line 38
    .line 39
    invoke-direct {p0, p1, v2}, Ltu6;-><init>(Lq51;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    sget-object p1, Ldn8;->a:Ldn8;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Ltu6;->f(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    monitor-exit v1

    .line 48
    new-instance p0, Lzo6;

    .line 49
    .line 50
    const/4 p1, 0x3

    .line 51
    invoke-direct {p0, p2, p1}, Lzo6;-><init>(Ljava/lang/Object;B)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p0}, Lmm0;->u(Lgn2;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Lmm0;->q()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :catchall_0
    move-exception p0

    .line 63
    monitor-exit v1

    .line 64
    throw p0
.end method

.method public final Z0(Laq5;Lbq5;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcz7;->w0:Lc15;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcz7;->x0:Lc15;

    .line 5
    .line 6
    iget-object v2, p0, Lcz7;->v0:Lc15;

    .line 7
    .line 8
    iget v3, v1, Lc15;->Z:I

    .line 9
    .line 10
    invoke-virtual {v1, v3, v2}, Lc15;->c(ILc15;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    .line 12
    .line 13
    monitor-exit v0

    .line 14
    :try_start_1
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    if-eq v0, v2, :cond_1

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    if-ne v0, v2, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    new-instance p1, Lb55;

    .line 29
    .line 30
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_3

    .line 36
    :cond_1
    iget-object v0, p0, Lcz7;->x0:Lc15;

    .line 37
    .line 38
    iget v3, v0, Lc15;->Z:I

    .line 39
    .line 40
    sub-int/2addr v3, v2

    .line 41
    iget-object v0, v0, Lc15;->X:[Ljava/lang/Object;

    .line 42
    .line 43
    array-length v2, v0

    .line 44
    if-ge v3, v2, :cond_5

    .line 45
    .line 46
    :goto_0
    if-ltz v3, :cond_5

    .line 47
    .line 48
    aget-object v2, v0, v3

    .line 49
    .line 50
    check-cast v2, Lbz7;

    .line 51
    .line 52
    iget-object v4, v2, Lbz7;->f0:Lbq5;

    .line 53
    .line 54
    if-ne p2, v4, :cond_2

    .line 55
    .line 56
    iget-object v4, v2, Lbz7;->Z:Lmm0;

    .line 57
    .line 58
    if-eqz v4, :cond_2

    .line 59
    .line 60
    iput-object v1, v2, Lbz7;->Z:Lmm0;

    .line 61
    .line 62
    invoke-virtual {v4, p1}, Lmm0;->f(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    add-int/lit8 v3, v3, -0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    :goto_1
    iget-object v0, p0, Lcz7;->x0:Lc15;

    .line 69
    .line 70
    iget-object v2, v0, Lc15;->X:[Ljava/lang/Object;

    .line 71
    .line 72
    iget v0, v0, Lc15;->Z:I

    .line 73
    .line 74
    const/4 v3, 0x0

    .line 75
    :goto_2
    if-ge v3, v0, :cond_5

    .line 76
    .line 77
    aget-object v4, v2, v3

    .line 78
    .line 79
    check-cast v4, Lbz7;

    .line 80
    .line 81
    iget-object v5, v4, Lbz7;->f0:Lbq5;

    .line 82
    .line 83
    if-ne p2, v5, :cond_4

    .line 84
    .line 85
    iget-object v5, v4, Lbz7;->Z:Lmm0;

    .line 86
    .line 87
    if-eqz v5, :cond_4

    .line 88
    .line 89
    iput-object v1, v4, Lbz7;->Z:Lmm0;

    .line 90
    .line 91
    invoke-virtual {v5, p1}, Lmm0;->f(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    .line 93
    .line 94
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    iget-object p0, p0, Lcz7;->x0:Lc15;

    .line 98
    .line 99
    invoke-virtual {p0}, Lc15;->g()V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :goto_3
    iget-object p0, p0, Lcz7;->x0:Lc15;

    .line 104
    .line 105
    invoke-virtual {p0}, Lc15;->g()V

    .line 106
    .line 107
    .line 108
    throw p1

    .line 109
    :catchall_1
    move-exception p0

    .line 110
    monitor-exit v0

    .line 111
    throw p0
.end method

.method public final a1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcz7;->t0:Log7;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Llq5;

    .line 6
    .line 7
    const-string v2, "Pointer input was reset"

    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lrm3;->l(Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lcz7;->t0:Log7;

    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final b0()F
    .locals 0

    .line 1
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Landroidx/compose/ui/node/LayoutNode;->A0:Lfi1;

    .line 6
    .line 7
    invoke-interface {p0}, Lfi1;->b0()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final c()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcz7;->a1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final getDensity()F
    .locals 0

    .line 1
    invoke-static {p0}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Landroidx/compose/ui/node/LayoutNode;->A0:Lfi1;

    .line 6
    .line 7
    invoke-interface {p0}, Lfi1;->getDensity()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final z(Laq5;Lbq5;J)V
    .locals 3

    .line 1
    iput-wide p3, p0, Lcz7;->z0:J

    .line 2
    .line 3
    sget-object p3, Lbq5;->X:Lbq5;

    .line 4
    .line 5
    if-ne p2, p3, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, Lcz7;->u0:Laq5;

    .line 8
    .line 9
    :cond_0
    iget-object p3, p0, Lcz7;->t0:Log7;

    .line 10
    .line 11
    const/4 p4, 0x0

    .line 12
    if-nez p3, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Ljx4;->M0()Lb71;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    new-instance v0, Ltk0;

    .line 19
    .line 20
    const/4 v1, 0x7

    .line 21
    invoke-direct {v0, p0, p4, v1}, Ltk0;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 22
    .line 23
    .line 24
    sget-object v1, Le71;->f0:Le71;

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    invoke-static {p3, p4, v1, v0, v2}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    iput-object p3, p0, Lcz7;->t0:Log7;

    .line 32
    .line 33
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcz7;->Z0(Laq5;Lbq5;)V

    .line 34
    .line 35
    .line 36
    iget-object p2, p1, Laq5;->a:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    const/4 v0, 0x0

    .line 43
    :goto_0
    if-ge v0, p3, :cond_3

    .line 44
    .line 45
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Lhq5;

    .line 50
    .line 51
    invoke-static {v1}, Lvr3;->m(Lhq5;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-nez v1, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    move-object p1, p4

    .line 62
    :goto_1
    iput-object p1, p0, Lcz7;->y0:Laq5;

    .line 63
    .line 64
    return-void
.end method

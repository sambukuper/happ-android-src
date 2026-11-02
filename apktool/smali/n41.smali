.class public final Ln41;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:Z

.field public synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Lo41;

.field public final synthetic j0:Lqo8;

.field public final synthetic k0:Lw80;

.field public final synthetic l0:J


# direct methods
.method public constructor <init>(Lo41;Lqo8;Lw80;JLq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln41;->i0:Lo41;

    .line 2
    .line 3
    iput-object p2, p0, Ln41;->j0:Lqo8;

    .line 4
    .line 5
    iput-object p3, p0, Ln41;->k0:Lw80;

    .line 6
    .line 7
    iput-wide p4, p0, Ln41;->l0:J

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p6}, Luy7;-><init>(ILq51;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lb71;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Ln41;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ln41;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ln41;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 7

    .line 1
    new-instance v0, Ln41;

    .line 2
    .line 3
    iget-object v3, p0, Ln41;->k0:Lw80;

    .line 4
    .line 5
    iget-wide v4, p0, Ln41;->l0:J

    .line 6
    .line 7
    iget-object v1, p0, Ln41;->i0:Lo41;

    .line 8
    .line 9
    iget-object v2, p0, Ln41;->j0:Lqo8;

    .line 10
    .line 11
    move-object v6, p1

    .line 12
    invoke-direct/range {v0 .. v6}, Ln41;-><init>(Lo41;Lqo8;Lw80;JLq51;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, v0, Ln41;->h0:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v2, p0, Ln41;->i0:Lo41;

    .line 2
    .line 3
    iget-object v8, v2, Lo41;->v0:Lyr2;

    .line 4
    .line 5
    iget-boolean v0, p0, Ln41;->g0:Z

    .line 6
    .line 7
    const/4 v9, 0x1

    .line 8
    const/4 v10, 0x0

    .line 9
    const/4 v11, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    if-ne v0, v9, :cond_0

    .line 13
    .line 14
    :try_start_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    move-object p0, v0

    .line 20
    goto :goto_2

    .line 21
    :catch_0
    move-exception v0

    .line 22
    move-object p0, v0

    .line 23
    move-object v11, p0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object v11

    .line 31
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Ln41;->h0:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Lb71;

    .line 37
    .line 38
    invoke-interface {p1}, Lb71;->getCoroutineContext()Ls61;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1}, Lu70;->Q(Ls61;)Lbm3;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    :try_start_1
    iput-boolean v9, v2, Lo41;->y0:Z

    .line 47
    .line 48
    iget-object p1, v2, Lo41;->r0:Lsy6;

    .line 49
    .line 50
    sget-object v12, Lf15;->X:Lf15;

    .line 51
    .line 52
    new-instance v0, Lm41;

    .line 53
    .line 54
    iget-object v1, p0, Ln41;->j0:Lqo8;

    .line 55
    .line 56
    iget-object v3, p0, Ln41;->k0:Lw80;

    .line 57
    .line 58
    iget-wide v4, p0, Ln41;->l0:J

    .line 59
    .line 60
    const/4 v7, 0x0

    .line 61
    invoke-direct/range {v0 .. v7}, Lm41;-><init>(Lqo8;Lo41;Lw80;JLbm3;Lq51;)V

    .line 62
    .line 63
    .line 64
    iput-boolean v9, p0, Ln41;->g0:Z

    .line 65
    .line 66
    invoke-virtual {p1, v12, v0, p0}, Lsy6;->g(Lf15;Lrn2;Ls51;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    sget-object p1, Lc71;->X:Lc71;

    .line 71
    .line 72
    if-ne p0, p1, :cond_2

    .line 73
    .line 74
    return-object p1

    .line 75
    :cond_2
    :goto_0
    :try_start_2
    invoke-virtual {v8}, Lyr2;->t()V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 76
    .line 77
    .line 78
    iput-boolean v10, v2, Lo41;->y0:Z

    .line 79
    .line 80
    invoke-virtual {v8, v11}, Lyr2;->i(Ljava/util/concurrent/CancellationException;)V

    .line 81
    .line 82
    .line 83
    iput-boolean v10, v2, Lo41;->w0:Z

    .line 84
    .line 85
    sget-object p0, Ldn8;->a:Ldn8;

    .line 86
    .line 87
    return-object p0

    .line 88
    :goto_1
    :try_start_3
    throw v11
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 89
    :goto_2
    iput-boolean v10, v2, Lo41;->y0:Z

    .line 90
    .line 91
    invoke-virtual {v8, v11}, Lyr2;->i(Ljava/util/concurrent/CancellationException;)V

    .line 92
    .line 93
    .line 94
    iput-boolean v10, v2, Lo41;->w0:Z

    .line 95
    .line 96
    throw p0
.end method

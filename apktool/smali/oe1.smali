.class public final Loe1;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:Lba6;

.field public h0:Lqk;

.field public i0:Z

.field public final synthetic j0:F

.field public final synthetic k0:Lpe1;

.field public final synthetic l0:Lxx6;


# direct methods
.method public constructor <init>(FLpe1;Lxx6;Lq51;)V
    .locals 0

    .line 1
    iput p1, p0, Loe1;->j0:F

    .line 2
    .line 3
    iput-object p2, p0, Loe1;->k0:Lpe1;

    .line 4
    .line 5
    iput-object p3, p0, Loe1;->l0:Lxx6;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    .line 9
    .line 10
    .line 11
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
    invoke-virtual {p0, p2, p1}, Loe1;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Loe1;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Loe1;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 2

    .line 1
    new-instance p2, Loe1;

    .line 2
    .line 3
    iget-object v0, p0, Loe1;->k0:Lpe1;

    .line 4
    .line 5
    iget-object v1, p0, Loe1;->l0:Lxx6;

    .line 6
    .line 7
    iget p0, p0, Loe1;->j0:F

    .line 8
    .line 9
    invoke-direct {p2, p0, v0, v1, p1}, Loe1;-><init>(FLpe1;Lxx6;Lq51;)V

    .line 10
    .line 11
    .line 12
    return-object p2
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-boolean v0, p0, Loe1;->i0:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Loe1;->h0:Lqk;

    .line 9
    .line 10
    iget-object p0, p0, Loe1;->g0:Lba6;

    .line 11
    .line 12
    :try_start_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0

    .line 23
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget p1, p0, Loe1;->j0:F

    .line 27
    .line 28
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/high16 v2, 0x3f800000    # 1.0f

    .line 33
    .line 34
    cmpl-float v0, v0, v2

    .line 35
    .line 36
    if-lez v0, :cond_3

    .line 37
    .line 38
    new-instance v0, Lba6;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    iput p1, v0, Lba6;->X:F

    .line 44
    .line 45
    new-instance v2, Lba6;

    .line 46
    .line 47
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 48
    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    const/16 v4, 0x1c

    .line 52
    .line 53
    invoke-static {v3, p1, v4}, Lz68;->b(FFI)Lqk;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    :try_start_1
    iget-object v3, p0, Loe1;->k0:Lpe1;

    .line 58
    .line 59
    iget-object v4, v3, Lpe1;->a:Lbd1;

    .line 60
    .line 61
    iget-object v5, p0, Loe1;->l0:Lxx6;

    .line 62
    .line 63
    new-instance v6, Lsn;

    .line 64
    .line 65
    invoke-direct {v6, v2, v5, v0, v3}, Lsn;-><init>(Lba6;Lxx6;Lba6;Lpe1;)V

    .line 66
    .line 67
    .line 68
    iput-object v0, p0, Loe1;->g0:Lba6;

    .line 69
    .line 70
    iput-object p1, p0, Loe1;->h0:Lqk;

    .line 71
    .line 72
    iput-boolean v1, p0, Loe1;->i0:Z

    .line 73
    .line 74
    const/4 v1, 0x0

    .line 75
    invoke-static {p1, v4, v1, v6, p0}, Lry7;->c(Lqk;Lbd1;ZLgn2;Ls51;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 79
    sget-object p1, Lc71;->X:Lc71;

    .line 80
    .line 81
    if-ne p0, p1, :cond_2

    .line 82
    .line 83
    return-object p1

    .line 84
    :cond_2
    move-object p0, v0

    .line 85
    goto :goto_0

    .line 86
    :catch_0
    move-object p0, v0

    .line 87
    move-object v0, p1

    .line 88
    :catch_1
    invoke-virtual {v0}, Lqk;->a()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    check-cast p1, Ljava/lang/Number;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    iput p1, p0, Lba6;->X:F

    .line 99
    .line 100
    :goto_0
    iget p1, p0, Lba6;->X:F

    .line 101
    .line 102
    :cond_3
    new-instance p0, Ljava/lang/Float;

    .line 103
    .line 104
    invoke-direct {p0, p1}, Ljava/lang/Float;-><init>(F)V

    .line 105
    .line 106
    .line 107
    return-object p0
.end method
